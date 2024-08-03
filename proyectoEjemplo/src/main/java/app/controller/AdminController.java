package app.controller;

import app.controller.validator.PersonValidator;
import app.controller.validator.UserValidator;
import app.dto.PersonDto;
import app.dto.UserDto;


public class AdminController implements ControllerInterface{
	private PersonValidator personValidator;
	private UserValidator userValidator;
	
	public AdminController() {
		this.personValidator=new PersonValidator();
		this.userValidator=new UserValidator();
	}

	@Override
	public void session() throws Exception {
		//esto es una herramienta misteriosa que nos ayudara mas tarde.
	}
	
	public void createVeterinarian() throws Exception{
		System.out.println("ingrese el nombre del veterinario");
		String name = Utils.getReader().nextLine();
		personValidator.validName(name);
		System.out.println("ingrese la cedula del veterinario");
		long document = personValidator.validDocument(Utils.getReader().nextLine());
		System.out.println("ingrese la edad del veterinario");
		int age = personValidator.validAge(Utils.getReader().nextLine());
		System.out.println("ingrese el nombre de usuario del veterinario");
		String userName = Utils.getReader().nextLine();
		userValidator.validUserName(userName);
		System.out.println("ingrese la contraseña del veterinario");
		String password = Utils.getReader().nextLine();
		userValidator.validPassword(password);
		PersonDto personDto= new PersonDto();
		personDto.setName(name);
		personDto.setDocument(document);
		personDto.setAge(age);
		UserDto userDto = new UserDto();
		userDto.setPersonid(personDto);
		userDto.setUserName(userName);
		userDto.setPassword(password);
		userDto.setRole("veterinarian");
		System.out.println("se ha creado el usuario exitosamente");
	}
	
	public void createSeller() throws Exception{
		System.out.println("ingrese el nombre del vendedor");
		String name = Utils.getReader().nextLine();
		personValidator.validName(name);
		System.out.println("ingrese la cedula del vendedor");
		long document = personValidator.validDocument(Utils.getReader().nextLine());
		System.out.println("ingrese la edad del vendedor");
		int age = personValidator.validAge(Utils.getReader().nextLine());
		System.out.println("ingrese el nombre de usuario del vendedor");
		String userName = Utils.getReader().nextLine();
		userValidator.validUserName(userName);
		System.out.println("ingrese la contraseña del vendedor");
		String password = Utils.getReader().nextLine();
		userValidator.validPassword(password);
		PersonDto personDto= new PersonDto();
		personDto.setName(name);
		personDto.setDocument(document);
		personDto.setAge(age);
		UserDto userDto = new UserDto();
		userDto.setPersonid(personDto);
		userDto.setUserName(userName);
		userDto.setPassword(password);
		userDto.setRole("seller");
		System.out.println("se ha creado el usuario exitosamente");
	}
	

}
