package app.controller.validator;

public class OrderValidator extends CommonsValidator{
	public OrderValidator() {
		super();
	}
	
	public long validId(String id) throws Exception{
		return super.isValidLong("el id de la orden ", id);
	}
	public void validMedicine(String id) throws Exception{
		 super.isValidString("el id de la orden ", id);
	}
	public void validDose(String id) throws Exception{
		 super.isValidString("el id de la orden ", id);
	}
}
