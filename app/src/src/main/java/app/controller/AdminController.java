package app.controller;

import app.controller.requests.CreateUserRequest;
import app.controller.validator.PersonValidator;
import app.controller.validator.UserValidator;
import app.dto.PersonDto;
import app.dto.UserDto;
import app.service.VeterinaryService;
import app.service.interfaces.AdminService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@NoArgsConstructor
@RestController
public class AdminController implements ControllerInterface {

    @Autowired
    private PersonValidator personValidator;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private AdminService service;
    private static final String MENU = "ingrese la opcion que desea \n 1.para crear veterinario \n 2. para crear vendedor \n 3. para cerrar sesion \n";

    @Override
    public void session() throws Exception {

    }

    @PostMapping("/veterinarian")
    private ResponseEntity createVeterinarian(@RequestBody CreateUserRequest request) throws Exception {
        try {
            String name = request.getName();
            personValidator.validName(name);
            long document = personValidator.validDocument(request.getDocument());
            int age = personValidator.validAge(request.getAge());
            String userName = request.getUserName();
            userValidator.validUserName(userName);
            String password = request.getPassword();
            userValidator.validPassword(password);

            PersonDto personDto = new PersonDto();
            personDto.setName(name);
            personDto.setDocument(document);
            personDto.setAge(age);
            UserDto userDto = new UserDto();
            userDto.setPersonid(personDto);
            userDto.setUserName(userName);
            userDto.setPassword(password);
            userDto.setRole("veterinarian");

            this.service.createVeterinarian(userDto);
            return new ResponseEntity<>("se ha creado el usuario exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/seller")
    private ResponseEntity createSeller(@RequestBody CreateUserRequest request) throws Exception {
         try {
        String name = request.getName();
        personValidator.validName(name);
        long document = personValidator.validDocument(request.getDocument());
        int age = personValidator.validAge(request.getAge());
        String userName = request.getUserName();
        userValidator.validUserName(userName);
        String password = request.getPassword();
        userValidator.validPassword(password);

        PersonDto personDto = new PersonDto();
        personDto.setName(name);
        personDto.setDocument(document);
        personDto.setAge(age);
        UserDto userDto = new UserDto();
        userDto.setPersonid(personDto);
        userDto.setUserName(userName);
        userDto.setPassword(password);
        userDto.setRole("seller");
        this.service.createSeller(userDto);
        return new ResponseEntity<>("se ha creado el usuario exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/")
    public String vive() {
        return "vive";
    }

}
