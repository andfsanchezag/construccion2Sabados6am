package app.controller.validator;

public class PersonValidator extends CommonsValidator {
	
	public PersonValidator() {
		super();
	}
	
	public void validName(String name) throws Exception{
		super.isValidString("el nombre de la persona ", name);
	}
	
	public long validDocument(String document) throws Exception{
		return super.isValidLong("la cedula de la persona ", document);
	}
	
	public int validAge(String age) throws Exception{
		return super.isValidInteger("la edad de la persona ", age);
	}
	

}
