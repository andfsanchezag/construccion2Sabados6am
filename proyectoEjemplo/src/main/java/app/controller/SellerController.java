package app.controller;

import java.sql.Date;

import app.controller.validator.InvoiceValidator;
import app.controller.validator.OrderValidator;
import app.controller.validator.PersonValidator;
import app.controller.validator.PetValidator;
import app.dto.InvoiceDto;
import app.dto.OrderDto;
import app.dto.PersonDto;
import app.dto.PetDto;

public class SellerController implements ControllerInterface {
	private PersonValidator personValidator;
	private PetValidator petValidator;
	private OrderValidator orderValidator;
	private InvoiceValidator invoiceValidator;
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

	public SellerController() {
		this.personValidator = new PersonValidator();
		this.invoiceValidator = new InvoiceValidator();
		this.orderValidator = new OrderValidator();
		this.petValidator = new PetValidator();
	}

	private void createInvoice() throws Exception {
		System.out.println("ingrese la cedula del dueño de la mascota");
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
		System.out.println("se creo la factura");
	}

}
