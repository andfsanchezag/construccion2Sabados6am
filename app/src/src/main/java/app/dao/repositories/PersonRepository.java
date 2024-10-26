/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao.repositories;

import app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ESTUDIANTE
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    public boolean existsByDocument(Long document);
    public Person findByDocument(Long document);
    
    
}
