/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ESTUDIANTE
 */

@Getter
@Setter
@NoArgsConstructor
public class CreateUserRequest {
    public String name;
    public String age;
    public String userName;
    public String document;
    public String password;
}
