package app;


import app.controller.LoginController;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Getter
@Setter
public class AppApplication implements CommandLineRunner {
    @Autowired
    private LoginController controller;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            controller.session();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
