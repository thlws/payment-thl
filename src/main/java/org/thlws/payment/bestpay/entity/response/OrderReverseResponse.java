package org.thlws.payment.bestpay.entity.response;


/**
 * 查询结果对象.
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley@thlws.com]
 * @version 1.0
 */
public class OrderReverseResponse {

	/**是否成功 true|false*/
	private boolean success;

	/**当 success为true时， result为下单详情，success为false时,result为null）*/
	private Result result;

	/**错误码,success=true，为null，success=false 为错误码*/
	private String errorCode;

	/**错误描述,success=true，为null，success=false 为错误描述*/
	private String errorMsg;

	/**
	 * The type Result.
	 */
	public static class Result{

		/**签名串*/
		private String sign;

		/**退款 请求流水号*/
		private String refundReqNo;

		/**原订单号*/
		private String oldOrderNo;

		/**交易金额*/
		private String transAmt;


		/**
		 * Gets sign.
		 *
		 * @return the sign
		 */
		public String getSign() {
			return sign;
		}

		/**
		 * Gets refund req no.
		 *
		 * @return the refund req no
		 */
		public String getRefundReqNo() {
			return refundReqNo;
		}

		/**
		 * Gets old order no.
		 *
		 * @return the old order no
		 */
		public String getOldOrderNo() {
			return oldOrderNo;
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
		 * Sets sign.
		 *
		 * @param sign the sign
		 */
		public void setSign(String sign) {
			this.sign = sign;
		}

		/**
		 * Sets refund req no.
		 *
		 * @param refundReqNo the refund req no
		 */
		public void setRefundReqNo(String refundReqNo) {
			this.refundReqNo = refundReqNo;
		}

		/**
		 * Sets old order no.
		 *
		 * @param oldOrderNo the old order no
		 */
		public void setOldOrderNo(String oldOrderNo) {
			this.oldOrderNo = oldOrderNo;
		}

		/**
		 * Sets trans amt.
		 *
		 * @param transAmt the trans amt
		 */
		public void setTransAmt(String transAmt) {
			this.transAmt = transAmt;
		}
		
		@Override
		public String toString() {
			return "Result [sign=" + sign + ", refundReqNo=" + refundReqNo + ", oldOrderNo=" + oldOrderNo
					+ ", transAmt=" + transAmt + "]";
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
	 * Gets result.
	 *
	 * @return the result
	 */
	public Result getResult() {
		return result;
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
	 * Sets success.
	 *
	 * @param success the success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Sets result.
	 *
	 * @param result the result
	 */
	public void setResult(Result result) {
		this.result = result;
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

	@Override
	public String toString() {
		return "OrderReverseResponse [success=" + success + ", result=" + result + ", errorCode=" + errorCode
				+ ", errorMsg=" + errorMsg + "]";
	}
	
}
