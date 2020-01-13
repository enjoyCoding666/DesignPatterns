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
public class InvoiceTrain {
	private String invoiceNo;
	private String invoiceCode;
	private Integer invoiceType;

	private BigDecimal invoiceAmount;
	private BigDecimal taxAmount;
	private BigDecimal totalAmount;

	private String trainNum;
	private String passengerName;
}
