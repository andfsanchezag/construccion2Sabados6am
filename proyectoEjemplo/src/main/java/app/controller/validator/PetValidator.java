package app.controller.validator;

public class PetValidator extends CommonsValidator{
	public PetValidator() {
		super();
	}
	
	public void validName(String name)throws Exception{
		super.isValidString("nombre de la mascota ", name);
	}
	public void validRace(String race)throws Exception{
		super.isValidString("la raza de la mascota ", race);
	}
	public void validSpice(String spice)throws Exception{
		super.isValidString("la especie de la mascota ", spice);
	}
	public void validFeatures(String features)throws Exception{
		super.isValidString("las caracteristicas de la mascota ", features);
	}
	
	public int validAge(String age) throws Exception{
		return super.isValidInteger("edad de la mascota ", age);
	}
	
	public long validId(String id) throws Exception{
		return super.isValidLong("el id de la mascota ", id);
	}
	
	public double validWeigth(String age) throws Exception{
		return super.isValidDouble("el peso de la mascota ", age);
	}
	

}
