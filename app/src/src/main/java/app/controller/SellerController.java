package app.controller;

import java.sql.Date;

import app.controller.validator.InvoiceValidator;
import app.controller.validator.OrderValidator;
import app.controller.validator.PersonValidator;
import app.controller.validator.PetValidator;
import app.dto.InvoiceDetailDto;
import app.dto.InvoiceDto;
import app.dto.OrderDto;
import app.dto.PersonDto;
import app.dto.PetDto;
import app.service.interfaces.SellerService;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@NoArgsConstructor
@Getter
@Setter
public class SellerController implements ControllerInterface {

    @Autowired
    private PersonValidator personValidator;
    @Autowired
    private PetValidator petValidator;
    @Autowired
    private OrderValidator orderValidator;
    @Autowired
    private InvoiceValidator invoiceValidator;
    @Autowired
    private SellerService service;
    private static final String MENU = "Ingrese la opcion la accion que desea hacer \n 1. para crear factura. \n 2. para cerrar sesion";

    @Override
    public void session() throws Exception {
        boolean session = true;
        while (session) {
            session = sellerSession();
        }

    }

    private boolean sellerSession() {
        try {
            System.out.println(MENU);
            String option = Utils.getReader().nextLine();
            return menu(option);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    private boolean menu(String option) throws Exception {
        switch (option) {
            case "1": {
                this.createInvoice();
                return true;
            }
            case "2": {
                System.out.println("se ha cerrado sesion");
                return false;
            }
            default: {
                System.out.println("opcion invalida");
                return true;
            }
        }

    }

    private void createInvoice() throws Exception {
        /*System.out.println("ingrese la cedula del dueño de la mascota");
        long document = personValidator.validDocument(Utils.getReader().nextLine());
        System.out.println("ingrese el id de la mascota");
        long petId = petValidator.validId(Utils.getReader().nextLine());
        System.out.println("ingrese el id de la orden");
        long orderId = orderValidator.validId(Utils.getReader().nextLine());
        System.out.println("ingrese el monto de la factura");
        double amount = invoiceValidator.validAmount(Utils.getReader().nextLine());
        System.out.println("ingrese los items de la factura");
        String items = Utils.getReader().nextLine();
        invoiceValidator.validItems(items);
        InvoiceDto invoiceDto = new InvoiceDto();
        OrderDto orderDto = new OrderDto();
        PetDto petDto = new PetDto();
        PersonDto personDto = new PersonDto();
        personDto.setDocument(document);
        petDto.setId(petId);
        orderDto.setId(orderId);
        invoiceDto.setAmount(amount);
        invoiceDto.setDate(new Date(System.currentTimeMillis()));
        invoiceDto.setItems(items);
        invoiceDto.setOrderId(orderDto);
        invoiceDto.setPetId(petDto);
        invoiceDto.setOwnerId(personDto);
        System.out.println("se creo la factura");*/
        System.out.println("ingrese el numero de elmentos");
        int items = invoiceValidator.validItem(Utils.getReader().nextLine());
        List<InvoiceDetailDto> invoices = new ArrayList<InvoiceDetailDto>();
        System.out.println("ingrese el id de la orden");
        long orderid = orderValidator.validId(Utils.getReader().nextLine());
        InvoiceDto invoiceDto = new InvoiceDto();
        OrderDto orderDto = new OrderDto();
        orderDto.setId(orderid);
        invoiceDto.setOrderId(orderDto);
        invoiceDto.setItems(String.valueOf(items));
        invoiceDto.setDate(new Date(System.currentTimeMillis()));
        double total =0;
        for (int i = 0; i < items; i++) {
            InvoiceDetailDto invoiceDetailDto = new InvoiceDetailDto();
            invoiceDetailDto.setInvoiceId(invoiceDto);
            invoiceDetailDto.setItem((i + 1));
            System.out.println("ingree el monto del itel " + invoiceDto.getItems());
            invoiceDetailDto.setAmount(invoiceValidator.validAmount(Utils.getReader().nextLine()));
            total+= invoiceDetailDto.getAmount();
            invoices.add(invoiceDetailDto);
        }
        invoiceDto.setAmount(total);
        this.service.createInvoice(invoices);
        
    }

}
