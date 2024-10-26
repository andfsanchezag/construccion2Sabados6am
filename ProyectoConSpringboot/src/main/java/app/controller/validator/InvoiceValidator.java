package app.controller.validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class InvoiceValidator extends CommonsValidator{
	

	
	public void validItems(String items)throws Exception {
		super.isValidString("items de la factura", items);
	}
	
	public double validAmount(String amount) throws Exception{
		return super.isValidDouble("el monto de la factura ", amount);
	}
        
        public int validItem(String items)throws Exception {
		return super.isValidInteger("items de la factura", items);
	}
	

}
