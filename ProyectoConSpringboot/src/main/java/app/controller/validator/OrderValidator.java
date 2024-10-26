package app.controller.validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class OrderValidator extends CommonsValidator{

	
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
