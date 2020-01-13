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
	 * 火车票的专属字段，是放在主类里面，还是单独拆分一个新的类好？
	 */
	private String trainNum;
	private String passengerName;
	/**
	 * 飞机票专属字段。
	 */
	private String electronicTicketNum;
	private String customerIdentityNum;


}
