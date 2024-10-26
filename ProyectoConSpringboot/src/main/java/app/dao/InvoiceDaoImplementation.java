/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.dao.interfaces.InvoiceDao;
import app.dao.repositories.InvoiceRepository;
import app.dto.InvoiceDto;
import app.helpers.Helper;
import app.model.Invoice;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ESTUDIANTE
 */
@Service
@Getter
@Setter
@NoArgsConstructor
public class InvoiceDaoImplementation implements InvoiceDao{
    @Autowired
    public  InvoiceRepository invoiceRepository;
    @Override
    public void createInvoice(InvoiceDto invoiceDto) throws Exception {
        Invoice invoice = Helper.parse(invoiceDto);
        invoiceRepository.save(invoice);
        invoiceDto.setId(invoice.getId());
    }
    
}
