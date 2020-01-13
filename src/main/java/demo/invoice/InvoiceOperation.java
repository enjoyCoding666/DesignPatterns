package demo.invoice;

public class InvoiceOperation {

	/**
	 * 计算发票类型。
	 * 根据发票代码、发票号码计算得到发票类型。
	 * @param invoiceNo
	 * @param invoiceCode
	 * @return
	 */
	public static int calculateInvoiceType(String invoiceNo,String invoiceCode){
		int invoiceType=(int)(Math.random()*2+8);
		System.out.println("发票类型为："+invoiceType);
		return invoiceType;
	}

	/**
	 * 根据不同的发票类型生成不同的发票服务
	 * @param invoice
	 */
	public static void updateInvoice(Invoice invoice){
		String invoiceNo=invoice.getInvoiceNo();
		String invoiceCode=invoice.getInvoiceCode();
		int invoiceType=calculateInvoiceType(invoiceNo,invoiceCode);
		InvoiceService invoiceService;
		if(invoiceType==InvoiceConstant.INVOICE_TRAIN) {
			invoiceService=new InvoiceServiceAir();
		}else if(invoiceType==InvoiceConstant.INVOICE_AIR){
			invoiceService=new InvoiceServiceTrain();
		}else {
			invoiceService=new InvoiceServiceOther();
		}
		invoiceService.updateInvoice();
	}

}
