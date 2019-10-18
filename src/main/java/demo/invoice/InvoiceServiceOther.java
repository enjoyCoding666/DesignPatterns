package demo.invoice;

public class InvoiceServiceOther implements InvoiceService {
	@Override
	public Invoice queryInvoice(String invoiceNo, String invoiceCode) {
		System.out.println("查询其他发票");
		return null;
	}

	@Override
	public int saveInvoice() {
		System.out.println("保存其他发票");
		return 0;
	}

	@Override
	public int updateInvoice() {
		System.out.println("更新其他发票");
		return 0;
	}

}
