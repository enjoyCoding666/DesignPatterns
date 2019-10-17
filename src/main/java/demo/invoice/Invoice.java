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
public class Invoice {
	private String invoiceNo;
	private String invoiceCode;
	private Integer invoiceType;

	private BigDecimal invoiceAmount;
	private BigDecimal taxAmount;
	private BigDecimal totalAmount;

	/**
	 * 火车票的专属字段，这个是否要抽到另一个对象里面?
	 */
	private String trainNum;
	private String passengerName;
	/**
	 * 飞机票专属字段。
	 */
	private String electronicTicketNum;
	private String customerIdentityNum;

}
