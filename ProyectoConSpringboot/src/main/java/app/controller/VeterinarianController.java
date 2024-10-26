package app.controller;

import app.controller.validator.ClinicalHistoryValidator;
import app.controller.validator.PetValidator;
import app.dto.ClinicalHistoryDto;
import app.dto.PetDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@NoArgsConstructor
@Getter
@Setter
public class VeterinarianController implements ControllerInterface {

    @Autowired
    private PetValidator petValidator;
    @Autowired
    private ClinicalHistoryValidator clinicalHistoryValidator;
    private static final String MENU = "ingrese la opcion que desea ejecutar: \n 1. para crear mascota. \n 2. para crear dueño de mascota. \n 3. para realizar consulta. \n 4. para anular orden. \n 5. para cerrar sesion.";

    @Override
    public void session() throws Exception {
        boolean session = true;
        while (session) {
            session = menu();
        }

    }

    private boolean menu() {
        try {
            System.out.println(MENU);
            String option = Utils.getReader().nextLine();
            return options(option);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    private boolean options(String option) throws Exception {
        switch (option) {
            case "1": {
                this.createPet();
                return true;
            }
            case "2": {
                this.createOwner();
                return true;
            }
            case "3": {
                this.clinicalConsultation();
                return true;
            }
            case "4": {
                this.cancelateOrder();
                return true;
            }
            case "5": {
                System.out.println("Se ha cerrado sesion");
                return false;
            }
            default: {
                System.out.println("ingrese una opcion valida");
                return true;
            }
        }
    }

    private void createOwner() throws Exception {
    }

    private void createPet() throws Exception {
    }

    private void cancelateOrder() throws Exception {
    }

    private void clinicalConsultation() throws Exception {
        System.out.println("ingrese el id de la mascota");
        long id = petValidator.validId(Utils.getReader().nextLine());
        System.out.println("ingrese el motivo de consulta");
        String reason = Utils.getReader().nextLine();
        clinicalHistoryValidator.validReason(reason);

        System.out.println("ingrese el diagnostico");
        String diagnosis = Utils.getReader().nextLine();
        clinicalHistoryValidator.validDiagnosis(diagnosis);

        System.out.println("ingrese la medicina asignada");
        String medicine = Utils.getReader().nextLine();
        clinicalHistoryValidator.validMedicine(medicine);

        System.out.println("ingrese la dosis del medicamento");
        String dose = Utils.getReader().nextLine();
        clinicalHistoryValidator.validDose(dose);

        System.out.println("ingrese el nombre del procedimiento");
        String procedureName = Utils.getReader().nextLine();
        clinicalHistoryValidator.validProcedureName(procedureName);

        System.out.println("ingrese el detalle del procedimiento");
        String procedureDetail = Utils.getReader().nextLine();
        clinicalHistoryValidator.validProcedureDetail(procedureDetail);

        System.out.println("ingrese el historial de vacunacion");
        String vaccunation = Utils.getReader().nextLine();
        clinicalHistoryValidator.validVaccunation(vaccunation);

        System.out.println("ingrese las alergias de la mascota");
        String alergies = Utils.getReader().nextLine();
        clinicalHistoryValidator.validAlergies(alergies);

        PetDto petDto = new PetDto();
        petDto.setId(id);
        ClinicalHistoryDto clinicalHistoryDto = new ClinicalHistoryDto();
        clinicalHistoryDto.setDate(System.currentTimeMillis());
        clinicalHistoryDto.setAlergies(alergies);
        clinicalHistoryDto.setDiagnosis(diagnosis);
        clinicalHistoryDto.setDose(dose);
        clinicalHistoryDto.setMedicine(medicine);
        clinicalHistoryDto.setPetId(petDto);
        clinicalHistoryDto.setProcedureDetail(procedureDetail);
        clinicalHistoryDto.setProcedureName(procedureName);
        clinicalHistoryDto.setReason(reason);
        clinicalHistoryDto.setStatus("active");
        clinicalHistoryDto.setVaccunation(vaccunation);

        System.out.println("se ha creado la historia clinica");
    }

}
