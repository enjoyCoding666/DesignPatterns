package demo.invoice;

public class InvoiceServiceAir extends InvoiceOperation implements InvoiceService {

	/**
	 * 此处的参数类型，应该是Invoice还是InvoiceAir?
	 * @param invoice
	 * @return
	 */
	@Override
	public Invoice queryInvoice(Invoice invoice) {
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
