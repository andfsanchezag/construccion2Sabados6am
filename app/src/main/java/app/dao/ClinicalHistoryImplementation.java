/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.dao.interfaces.ClinicalHistoryDao;
import app.dto.ClinicalHistoryDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 *
 * @author ESTUDIANTE
 */
@Service
@Getter
@Setter
@NoArgsConstructor
public class ClinicalHistoryImplementation implements ClinicalHistoryDao {

    @Override
    public void createClinicalHistory(ClinicalHistoryDto clinicalHistoryDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
