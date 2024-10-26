/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.service.interfaces;

import app.dto.InvoiceDetailDto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface SellerService {
   public void createInvoice(List<InvoiceDetailDto> invoices)throws Exception; 
}
