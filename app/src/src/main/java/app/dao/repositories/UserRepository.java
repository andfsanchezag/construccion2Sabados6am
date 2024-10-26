/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao.repositories;

import app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ESTUDIANTE
 */

@Repository
public interface UserRepository extends JpaRepository <User,Long> {

    public User findByUserName(String userName);

    public boolean existsByUserName(String userName);
    
}
