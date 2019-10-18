package demo.invoice;

public class InvoiceServiceAir implements InvoiceService{


	@Override
	public Invoice queryInvoice(String invoiceNo, String invoiceCode) {
		System.out.println("查询飞机票");
		return null;
	}

	@Override
	public int saveInvoice() {
		System.out.println("保存飞机票");
		return 0;
	}

	@Override
	public int updateInvoice() {
		System.out.println("更新飞机票");
		return 0;
	}

}
