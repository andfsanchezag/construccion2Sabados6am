package app.controller.validator;

public class ClinicalHistoryValidator extends CommonsValidator {
	public ClinicalHistoryValidator() {
		super();
	}
	
	public void validReason(String reason)throws Exception {
		super.isValidString("la razon de consuta ", reason);
	}
	public void validDiagnosis(String diagnosis)throws Exception {
		super.isValidString("el diagnostico de consuta ", diagnosis);
	}
	public void validMedicine(String medicine)throws Exception {
		super.isValidString("la medicina asignada ", medicine);
	}
	public void validDose(String dose)throws Exception {
		super.isValidString("la dosis de la medicina ", dose);
	}
	public void validProcedureName(String procedureName)throws Exception {
		super.isValidString("nombre del procedimiento ", procedureName);
	}
	public void validProcedureDetail(String procedureDetail)throws Exception {
		super.isValidString("el detalle del procedimiento ", procedureDetail);
	}
	public void validVaccunation(String vaccunation)throws Exception {
		super.isValidString("el historial de vacunacion ", vaccunation);
	}
	public void validAlergies(String alergies)throws Exception {
		super.isValidString("las alergias de la mascota ", alergies);
	}
}
