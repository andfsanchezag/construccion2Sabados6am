package app;

import app.controller.LoginController;

public class App {

	public static void main(String[] args) throws Exception {
		LoginController veterinarianController = new LoginController();
		try {
			veterinarianController.session();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
