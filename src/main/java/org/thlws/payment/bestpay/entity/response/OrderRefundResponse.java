package org.thlws.payment.bestpay.entity.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 退款结果对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRefundResponse {

	/**是否成功 true|false*/
	private boolean success;

	/**错误码,success=true，为null，success=false 为错误码*/
	private String errorCode;

	/**错误描述,success=true，为null，success=false 为错误描述*/
	private String errorMsg;

	/**当 success为true时， result为下单详情，success为false时,result为null）*/
	private Result result;

    /**
     * The type Result.
     */
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
    public static class Result{

		/**签名串*/
		private String sign;

		/**退款 请求流水号*/
		private String refundReqNo;

		/**原订单号*/
		private String oldOrderNo;

		/**交易金额*/
		private String transAmt;

	}
	
}
