package app;

import app.controller.ControllerInterface;
import app.controller.SellerController;

public class App {

	public static void main(String[] args) {
		ControllerInterface controller = new SellerController();
		try {
		controller.session();}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
