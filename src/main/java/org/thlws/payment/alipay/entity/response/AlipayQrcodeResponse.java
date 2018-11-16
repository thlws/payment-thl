package org.thlws.payment.alipay.entity.response;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * 支付宝扫码支付Response Bean,用户打开支付宝APP扫描Qrcode
 * @author Hanley Tang
 * @version 1.0
 */
public class AlipayQrcodeResponse implements Serializable{

	private String outTradeNo;
	private String qrCode;
	private boolean isSuccess;
	private String desc;
	private String              subCode;
	private String              subMsg;
	private String              code;
	private String              msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean success) {
		isSuccess = success;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
