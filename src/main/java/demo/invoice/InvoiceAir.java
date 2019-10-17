package demo.invoice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceAir {
	private String invoiceNo;
	private String invoiceCode;
	private Integer invoiceType;

	private BigDecimal invoiceAmount;
	private BigDecimal taxAmount;
	private BigDecimal totalAmount;

	private String electronicTicketNum;
	private String customerIdentityNum;
}
