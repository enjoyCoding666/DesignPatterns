package demo.invoice;


/**
 * 变化的部分，使用接口实现。相同的部分，使用继承复用。
 */
public interface InvoiceService {
	Invoice queryInvoice(Invoice invoice);

	int saveInvoice();

	int updateInvoice();

}
