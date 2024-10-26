/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.dao.interfaces.InvoiceDetailDao;
import app.dao.repositories.InvoiceDetailRepository;
import app.dto.InvoiceDetailDto;
import app.helpers.Helper;
import app.model.InvoiceDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ESTUDIANTE
 */

@Setter
@Getter
@NoArgsConstructor
@Service
public class InvoiceDetailDaoImplementation implements InvoiceDetailDao {
    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    @Override
    public void createInvoiceDetail(InvoiceDetailDto invoiceDetailDto) {
        InvoiceDetail invoiceDetail = Helper.parse(invoiceDetailDto);
        invoiceDetailRepository.save(invoiceDetail);
    }
    
}
