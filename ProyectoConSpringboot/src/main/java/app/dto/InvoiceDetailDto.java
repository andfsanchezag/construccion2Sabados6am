/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ESTUDIANTE
 */
@NoArgsConstructor
@Getter
@Setter
public class InvoiceDetailDto {
      private long id;
    private InvoiceDto invoiceId;
    private int item;
    private double amount;
    
}
