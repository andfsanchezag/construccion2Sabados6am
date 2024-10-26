package app.dao.interfaces;

import app.dto.InvoiceDto;

public interface InvoiceDao {

    public void createInvoice(InvoiceDto invoice) throws Exception;

}
