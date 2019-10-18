package demo.invoice;

public interface InvoiceService {

	Invoice queryInvoice(String invoiceNo,String invoiceCode);

	int saveInvoice();

	int updateInvoice();

}
