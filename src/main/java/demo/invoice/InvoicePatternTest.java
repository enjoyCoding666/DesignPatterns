package demo.invoice;

/**
 *
 */
public class InvoicePatternTest {
	public static void main(String[] args) {
		String invoiceNo="invoiceNo";
		String invoiceCode="invoiceCode";
		Invoice invoice=Invoice.builder().invoiceCode(invoiceCode).invoiceNo(invoiceNo).build();
		InvoiceOperation.updateInvoice(invoice);
	}

}
