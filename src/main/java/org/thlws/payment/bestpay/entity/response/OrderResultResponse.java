package org.thlws.payment.bestpay.entity.response;

/**
 * 支付和查询 结果对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley@thlws.com]
 * @version 1.0
 */
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

		/**
		 * Gets merchant id.
		 *
		 * @return the merchant id
		 */
		public String getMerchantId() {
			return merchantId;
		}

		/**
		 * Gets order no.
		 *
		 * @return the order no
		 */
		public String getOrderNo() {
			return orderNo;
		}

		/**
		 * Gets order req no.
		 *
		 * @return the order req no
		 */
		public String getOrderReqNo() {
			return orderReqNo;
		}

		/**
		 * Gets order date.
		 *
		 * @return the order date
		 */
		public String getOrderDate() {
			return orderDate;
		}

		/**
		 * Gets our trans no.
		 *
		 * @return the our trans no
		 */
		public String getOurTransNo() {
			return ourTransNo;
		}

		/**
		 * Gets trans amt.
		 *
		 * @return the trans amt
		 */
		public String getTransAmt() {
			return transAmt;
		}

		/**
		 * Gets trans status.
		 *
		 * @return the trans status
		 */
		public String getTransStatus() {
			return transStatus;
		}

		/**
		 * Gets encode type.
		 *
		 * @return the encode type
		 */
		public String getEncodeType() {
			return encodeType;
		}

		/**
		 * Gets sign.
		 *
		 * @return the sign
		 */
		public String getSign() {
			return sign;
		}

		/**
		 * Gets coupon.
		 *
		 * @return the coupon
		 */
		public String getCoupon() {
			return coupon;
		}

		/**
		 * Gets sc value.
		 *
		 * @return the sc value
		 */
		public String getScValue() {
			return scValue;
		}

		/**
		 * Gets payer account.
		 *
		 * @return the payer account
		 */
		public String getPayerAccount() {
			return payerAccount;
		}

		/**
		 * Gets payee account.
		 *
		 * @return the payee account
		 */
		public String getPayeeAccount() {
			return payeeAccount;
		}

		/**
		 * Gets pay channel.
		 *
		 * @return the pay channel
		 */
		public String getPayChannel() {
			return payChannel;
		}

		/**
		 * Gets product desc.
		 *
		 * @return the product desc
		 */
		public String getProductDesc() {
			return productDesc;
		}

		/**
		 * Gets refund flag.
		 *
		 * @return the refund flag
		 */
		public String getRefundFlag() {
			return refundFlag;
		}

		/**
		 * Gets customer id.
		 *
		 * @return the customer id
		 */
		public String getCustomerId() {
			return customerId;
		}

		/**
		 * Gets mchnt tm num.
		 *
		 * @return the mchnt tm num
		 */
		public String getMchntTmNum() {
			return mchntTmNum;
		}

		/**
		 * Gets device tm num.
		 *
		 * @return the device tm num
		 */
		public String getDeviceTmNum() {
			return deviceTmNum;
		}

		/**
		 * Gets attach.
		 *
		 * @return the attach
		 */
		public String getAttach() {
			return attach;
		}

		/**
		 * Gets trans phone.
		 *
		 * @return the trans phone
		 */
		public String getTransPhone() {
			return transPhone;
		}

		/**
		 * Gets resp code.
		 *
		 * @return the resp code
		 */
		public String getRespCode() {
			return respCode;
		}

		/**
		 * Gets resp desc.
		 *
		 * @return the resp desc
		 */
		public String getRespDesc() {
			return respDesc;
		}

		/**
		 * Sets merchant id.
		 *
		 * @param merchantId the merchant id
		 */
		public void setMerchantId(String merchantId) {
			this.merchantId = merchantId;
		}

		/**
		 * Sets order no.
		 *
		 * @param orderNo the order no
		 */
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

		/**
		 * Sets order req no.
		 *
		 * @param orderReqNo the order req no
		 */
		public void setOrderReqNo(String orderReqNo) {
			this.orderReqNo = orderReqNo;
		}

		/**
		 * Sets order date.
		 *
		 * @param orderDate the order date
		 */
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		/**
		 * Sets our trans no.
		 *
		 * @param ourTransNo the our trans no
		 */
		public void setOurTransNo(String ourTransNo) {
			this.ourTransNo = ourTransNo;
		}

		/**
		 * Sets trans amt.
		 *
		 * @param transAmt the trans amt
		 */
		public void setTransAmt(String transAmt) {
			this.transAmt = transAmt;
		}

		/**
		 * Sets trans status.
		 *
		 * @param transStatus the trans status
		 */
		public void setTransStatus(String transStatus) {
			this.transStatus = transStatus;
		}

		/**
		 * Sets encode type.
		 *
		 * @param encodeType the encode type
		 */
		public void setEncodeType(String encodeType) {
			this.encodeType = encodeType;
		}

		/**
		 * Sets sign.
		 *
		 * @param sign the sign
		 */
		public void setSign(String sign) {
			this.sign = sign;
		}

		/**
		 * Sets coupon.
		 *
		 * @param coupon the coupon
		 */
		public void setCoupon(String coupon) {
			this.coupon = coupon;
		}

		/**
		 * Sets sc value.
		 *
		 * @param scValue the sc value
		 */
		public void setScValue(String scValue) {
			this.scValue = scValue;
		}

		/**
		 * Sets payer account.
		 *
		 * @param payerAccount the payer account
		 */
		public void setPayerAccount(String payerAccount) {
			this.payerAccount = payerAccount;
		}

		/**
		 * Sets payee account.
		 *
		 * @param payeeAccount the payee account
		 */
		public void setPayeeAccount(String payeeAccount) {
			this.payeeAccount = payeeAccount;
		}

		/**
		 * Sets pay channel.
		 *
		 * @param payChannel the pay channel
		 */
		public void setPayChannel(String payChannel) {
			this.payChannel = payChannel;
		}

		/**
		 * Sets product desc.
		 *
		 * @param productDesc the product desc
		 */
		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		/**
		 * Sets refund flag.
		 *
		 * @param refundFlag the refund flag
		 */
		public void setRefundFlag(String refundFlag) {
			this.refundFlag = refundFlag;
		}

		/**
		 * Sets customer id.
		 *
		 * @param customerId the customer id
		 */
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		/**
		 * Sets mchnt tm num.
		 *
		 * @param mchntTmNum the mchnt tm num
		 */
		public void setMchntTmNum(String mchntTmNum) {
			this.mchntTmNum = mchntTmNum;
		}

		/**
		 * Sets device tm num.
		 *
		 * @param deviceTmNum the device tm num
		 */
		public void setDeviceTmNum(String deviceTmNum) {
			this.deviceTmNum = deviceTmNum;
		}

		/**
		 * Sets attach.
		 *
		 * @param attach the attach
		 */
		public void setAttach(String attach) {
			this.attach = attach;
		}

		/**
		 * Sets trans phone.
		 *
		 * @param transPhone the trans phone
		 */
		public void setTransPhone(String transPhone) {
			this.transPhone = transPhone;
		}

		/**
		 * Sets resp code.
		 *
		 * @param respCode the resp code
		 */
		public void setRespCode(String respCode) {
			this.respCode = respCode;
		}

		/**
		 * Sets resp desc.
		 *
		 * @param respDesc the resp desc
		 */
		public void setRespDesc(String respDesc) {
			this.respDesc = respDesc;
		}
		@Override
		public String toString() {
			return "Result [merchantId=" + merchantId + ", orderNo=" + orderNo + ", orderReqNo=" + orderReqNo
					+ ", orderDate=" + orderDate + ", ourTransNo=" + ourTransNo + ", transAmt=" + transAmt
					+ ", transStatus=" + transStatus + ", encodeType=" + encodeType + ", sign=" + sign + ", coupon="
					+ coupon + ", scValue=" + scValue + ", payerAccount=" + payerAccount + ", payeeAccount="
					+ payeeAccount + ", payChannel=" + payChannel + ", productDesc=" + productDesc + ", refundFlag="
					+ refundFlag + ", customerId=" + customerId + ", mchntTmNum=" + mchntTmNum + ", deviceTmNum="
					+ deviceTmNum + ", attach=" + attach + ", transPhone=" + transPhone + ", respCode=" + respCode
					+ ", respDesc=" + respDesc + "]";
		}
		
	}

	/**
	 * Is success boolean.
	 *
	 * @return the boolean
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Gets error code.
	 *
	 * @return the error code
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Gets error msg.
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * Gets result.
	 *
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * Sets success.
	 *
	 * @param success the success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Sets error code.
	 *
	 * @param errorCode the error code
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Sets error msg.
	 *
	 * @param errorMsg the error msg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * Sets result.
	 *
	 * @param result the result
	 */
	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "BarcodePayOutput [success=" + success + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg
				+ ", result=" + result + "]";
	}

	/***
	 * transStatus
	 * @return boolean
	 */
	public boolean isPaySuccess() {
		if(success == true && null != result && result.getTransStatus().equalsIgnoreCase("B")){
			return true;
		}else {
			return false;
		}
	}
	
}


