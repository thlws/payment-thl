package org.thlws.payment.bestpay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付和查询 结果对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderResultResponse {

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

		/**商户号*/
		private String merchantId;

		/**订单号*/
		private String orderNo;

		/**订单请求 流水号*/
		private String orderReqNo;

		/**预留字段,始终为null*/
		private String orderDate;

		/**翼支付交易号,翼支付生成的内部流水号（用 户支付后生成）*/
		private String ourTransNo;

		/**订单金额*/
		private String transAmt;

		/**交易状态,A：请求（支付中）B：成功（支付成功）C：失败（订单状态结果）*/
		private String transStatus;

		/**签名方式,1代表MD5；3代表RSA；9代表CA；*/
		private String encodeType;

		/**sign校验 域*/
		private String sign;

		/**优惠金额 ,订单优惠金额，用户使用代金 券或立减的金额，金额为分*/
		private String coupon;

		/**商户营销 优惠成本*/
		private String scValue;

		/**付款人账号*/
		private String payerAccount;

		/**收款人账号*/
		private String payeeAccount;

		/**付款明细*/
		private String payChannel;

		/**备注*/
		private String productDesc;

		/**0 代表没有退款，1 已退款 2 部分退款 3 已冲正*/
		private String refundFlag;

		/**客户登陆账号*/
		private String customerId;

		/**商户自定义终端号*/
		private String mchntTmNum;

		/**设备终端号*/
		private String deviceTmNum;

		private String attach;

		private String transPhone;

		private String respCode;

		private String respDesc;

		
	}


    /***
     * transStatus
     * @return boolean boolean
     */
    public boolean isPaySuccess() {
		if(success == true && null != result && result.getTransStatus().equalsIgnoreCase("B")){
			return true;
		}else {
			return false;
		}
	}
	
}


