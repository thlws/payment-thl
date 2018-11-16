package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送支付宝手机充值超时提醒与补偿
 *
 * @author auto create
 * @since 1.0, 2017-06-06 15:12:19
 */
public class AlipayEbppRechargeNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 1747177819551562659L;

	/**
	 * 充值面额或者优惠面额
	 */
	@ApiField("face_price")
	private String facePrice;

	/**
	 * 充值时间或者话费券有效时间
	 */
	@ApiField("gmt_charge")
	private String gmtCharge;

	/**
	 * 充值的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 阿里通信通知类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 充值交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets face price.
     *
     * @return the face price
     */
    public String getFacePrice() {
		return this.facePrice;
	}

    /**
     * Sets face price.
     *
     * @param facePrice the face price
     */
    public void setFacePrice(String facePrice) {
		this.facePrice = facePrice;
	}

    /**
     * Gets gmt charge.
     *
     * @return the gmt charge
     */
    public String getGmtCharge() {
		return this.gmtCharge;
	}

    /**
     * Sets gmt charge.
     *
     * @param gmtCharge the gmt charge
     */
    public void setGmtCharge(String gmtCharge) {
		this.gmtCharge = gmtCharge;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets notify type.
     *
     * @return the notify type
     */
    public String getNotifyType() {
		return this.notifyType;
	}

    /**
     * Sets notify type.
     *
     * @param notifyType the notify type
     */
    public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

    /**
     * Gets out user id.
     *
     * @return the out user id
     */
    public String getOutUserId() {
		return this.outUserId;
	}

    /**
     * Sets out user id.
     *
     * @param outUserId the out user id
     */
    public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
