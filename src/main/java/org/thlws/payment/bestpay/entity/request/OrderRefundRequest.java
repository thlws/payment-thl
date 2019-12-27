package org.thlws.payment.bestpay.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 退款参数对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRefundRequest {

	/**商户号	(必填)	length=30*/
	private String merchantId;
	
	/**子商户号	length=30*/
	private String subMerchantId;
	
	/**商户调用密码（必填），商户执行时需填入相应密码 ，又称：交易key*/
	private String merchantPwd;
	
	/**原扣款订单号(必填) length=30*/
	private String oldOrderNo;
	
	/**原订单请求支付 流水号(必填)*/
	private String oldOrderReqNo;
	
	/**退款流水号(必填)*/
	private String refundReqNo;
	
	/**退款请求日期(必填),yyyyMMDD*/
	private String refundReqDate;
	
	/**退款交易金额(必填)*/
	private String transAmt;
	
	/**分账明细*/
	private String ledgerDetail;
	
	/**渠道(必填)*/
	private String channel = "05";
	
	/**Mac校验域(必填),MD5加密获得32位大写字符,无需调用者设值,依赖库会自动设置*/
	private String mac;
	
	/**退款回调地址*/
	private String bgUrl;

	
	
}
