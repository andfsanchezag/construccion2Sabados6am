/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao.repositories;

import app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ESTUDIANTE
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    public boolean existsByDocument(long document);

    public Person findByDocument(long document);
    
}
