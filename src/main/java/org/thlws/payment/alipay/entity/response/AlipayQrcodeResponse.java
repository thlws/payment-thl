package org.thlws.payment.alipay.entity.response;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * 支付宝扫码支付Response Bean,用户打开支付宝APP扫描Qrcode
 *
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

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
		return msg;
	}

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
		this.msg = msg;
	}

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
		return isSuccess;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
		isSuccess = success;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets qr code.
     *
     * @return the qr code
     */
    public String getQrCode() {
		return qrCode;
	}

    /**
     * Sets qr code.
     *
     * @param qrCode the qr code
     */
    public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

    /**
     * Gets sub code.
     *
     * @return the sub code
     */
    public String getSubCode() {
		return subCode;
	}

    /**
     * Sets sub code.
     *
     * @param subCode the sub code
     */
    public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

    /**
     * Gets sub msg.
     *
     * @return the sub msg
     */
    public String getSubMsg() {
		return subMsg;
	}

    /**
     * Sets sub msg.
     *
     * @param subMsg the sub msg
     */
    public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
