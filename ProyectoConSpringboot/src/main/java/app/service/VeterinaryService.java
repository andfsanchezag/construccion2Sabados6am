package app.service;

import java.sql.Date;
import java.sql.SQLException;

import app.dao.PersonDaoImplementation;
import app.dao.UserDaoImplementation;
import app.dao.interfaces.ClinicalHistoryDao;
import app.dao.interfaces.InvoiceDao;
import app.dao.interfaces.InvoiceDetailDao;
import app.dao.interfaces.OrderDao;
import app.dao.interfaces.PersonDao;
import app.dao.interfaces.PetDao;
import app.dao.interfaces.UserDao;
import app.dto.ClinicalHistoryDto;
import app.dto.InvoiceDetailDto;
import app.dto.InvoiceDto;
import app.dto.OrderDto;
import app.dto.PersonDto;
import app.dto.PetDto;
import app.dto.UserDto;
import app.service.interfaces.AdminService;
import app.service.interfaces.LoginService;
import app.service.interfaces.SellerService;
import app.service.interfaces.VeterinarianService;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Getter
@Setter
public class VeterinaryService implements LoginService, AdminService, VeterinarianService, SellerService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private PersonDao personDao;
    private PetDao petDao;
    private ClinicalHistoryDao clinicalHistoryDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private OrderDao orderDao;
     @Autowired
    private InvoiceDetailDao invoiceDetailDao;

    public static UserDto user;

  
    @Override
    public void createClinicalHistory(ClinicalHistoryDto clinicalHistoryDto) throws Exception {
        PetDto petDto = petDao.findById(clinicalHistoryDto.getPetId());
        if (petDto == null) {
            throw new Exception("no existe una mascota con ese id");
        }
        clinicalHistoryDto.setPetId(petDto);
        clinicalHistoryDto.setVeterinarian(user);
        OrderDto orderDto = this.createOrder(clinicalHistoryDto);
        clinicalHistoryDto.setOrderId(orderDto);
        clinicalHistoryDao.createClinicalHistory(clinicalHistoryDto);
    }

    @Override
    public void createPet(PetDto petDto) throws Exception {
        PersonDto personDto = personDao.findByDocument(petDto.getOwnerId());
        if (personDto == null) {
            throw new Exception("no existe un dueño registrado con esa cedula");
        }
        petDto.setOwnerId(personDto);
        petDao.createPet(petDto);
    }

    @Override
    public void createOwner(PersonDto personDto) throws Exception {
        this.createPerson(personDto);
    }

    @Override
    public void createSeller(UserDto userDto) throws Exception {
        this.createUser(userDto);
    }

    @Override
    public void createVeterinarian(UserDto userDto) throws Exception {
        this.createUser(userDto);
    }

    @Override
    public void login(UserDto userDto) throws Exception {
        UserDto validateDto = userDao.findByUserName(userDto);
        if (validateDto == null) {
            throw new Exception("no existe usuario registrado");
        }
        if (!userDto.getPassword().equals(validateDto.getPassword())) {
            throw new Exception("usuario o contraseña incorrecto");
        }
        userDto.setRole(validateDto.getRole());
        user = validateDto;
    }

    @Override
    public void logout() {
        user = null;
        System.out.println("se ha cerrado sesion");
    }

    private void createUser(UserDto userDto) throws Exception {
        this.createPerson(userDto.getPersonid());
       if (this.userDao.existsByUserName(userDto)) {
            this.personDao.deletePerson(userDto.getPersonid());
            throw new Exception("ya existe un usuario con ese user name");
        }
        try {
            this.userDao.createUser(userDto);
        } catch (SQLException e) {
            this.personDao.deletePerson(userDto.getPersonid());
        }
    }

    private void createPerson(PersonDto personDto) throws Exception {
        if (this.personDao.existsByDocument(personDto)) {
            throw new Exception("ya existe una persona con ese documento");
        }
        this.personDao.createPerson(personDto);
    }

    private OrderDto createOrder(ClinicalHistoryDto clinicalHistoryDto) throws Exception {
        OrderDto orderDto = new OrderDto();
        orderDto.setDate(new Date(clinicalHistoryDto.getDate()));
        orderDto.setPetId(clinicalHistoryDto.getPetId());
        orderDto.setOwnerId(clinicalHistoryDto.getPetId().getOwnerId());
        orderDto.setMedicine(clinicalHistoryDto.getMedicine());
        orderDto.setDose(clinicalHistoryDto.getDose());
        orderDto.setVeterinarian(clinicalHistoryDto.getVeterinarian());
        orderDao.createOrder(orderDto);
        return orderDto;
    }

    @Override
    public void createInvoice(List<InvoiceDetailDto> invoices) throws Exception {
        OrderDto orderDto = orderDao.findById(invoices.get(0).getInvoiceId().getOrderId());
        if (orderDto==null){
            throw new Exception("la orden no existe");
        }
        InvoiceDto invoiceDto=invoices.get(0).getInvoiceId();
        invoiceDto.setOrderId(orderDto);
        invoiceDto.setOwnerId(orderDto.getOwnerId());
        invoiceDto.setPetId(orderDto.getPetId());
        invoiceDao.createInvoice(invoiceDto);
        for (InvoiceDetailDto invoiceDetailDto : invoices){
            invoiceDetailDto.setInvoiceId(invoiceDto);
            invoiceDetailDao.createInvoiceDetail(invoiceDetailDto);
        }
    }

}
