package demo.invoice;

public interface InvoiceService {

	Invoice queryInvoice();

	int saveInvoice();

	int updateInvoice();

	int insertInvoice();
}
