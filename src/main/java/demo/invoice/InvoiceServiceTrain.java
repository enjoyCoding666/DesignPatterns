package demo.invoice;

public class InvoiceServiceTrain  extends InvoiceOperation implements InvoiceService {
	@Override
	public Invoice queryInvoice(Invoice invoice) {
		System.out.println("查询火车票");
		return null;
	}

	@Override
	public int saveInvoice() {
		System.out.println("保存火车票");
		return 0;
	}

	@Override
	public int updateInvoice() {
		System.out.println("更新火车票");
		return 0;
	}

}
