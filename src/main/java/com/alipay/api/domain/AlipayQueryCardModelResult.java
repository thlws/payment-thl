package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息查询结果
 *
 * @author auto create
 * @since 1.0, 2018-04-13 11:00:57
 */
public class AlipayQueryCardModelResult extends AlipayObject {

	private static final long serialVersionUID = 6654593686978751175L;

	/**
	 * 卡余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 卡公司自定义卡数据
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 卡号。和卡类型一起，唯一确定一张卡。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 卡类型。每种虚拟卡都有对应的卡类型，该值由支付宝分配给商户。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 最后更新时间
	 */
	@ApiField("last_update_time")
	private String lastUpdateTime;

	/**
	 * 商户卡状态
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 商户卡状态信息，与status_code对应，用于描述status_code处于某个状态的原因。
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/**
	 * 用户授权信息
	 */
	@ApiField("user_auth_info")
	private String userAuthInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets card data.
     *
     * @return the card data
     */
    public String getCardData() {
		return this.cardData;
	}

    /**
     * Sets card data.
     *
     * @param cardData the card data
     */
    public void setCardData(String cardData) {
		this.cardData = cardData;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card status.
     *
     * @return the card status
     */
    public String getCardStatus() {
		return this.cardStatus;
	}

    /**
     * Sets card status.
     *
     * @param cardStatus the card status
     */
    public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets last update time.
     *
     * @return the last update time
     */
    public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}

    /**
     * Sets last update time.
     *
     * @param lastUpdateTime the last update time
     */
    public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

    /**
     * Gets status code.
     *
     * @return the status code
     */
    public String getStatusCode() {
		return this.statusCode;
	}

    /**
     * Sets status code.
     *
     * @param statusCode the status code
     */
    public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

    /**
     * Gets status msg.
     *
     * @return the status msg
     */
    public String getStatusMsg() {
		return this.statusMsg;
	}

    /**
     * Sets status msg.
     *
     * @param statusMsg the status msg
     */
    public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

    /**
     * Gets user auth info.
     *
     * @return the user auth info
     */
    public String getUserAuthInfo() {
		return this.userAuthInfo;
	}

    /**
     * Sets user auth info.
     *
     * @param userAuthInfo the user auth info
     */
    public void setUserAuthInfo(String userAuthInfo) {
		this.userAuthInfo = userAuthInfo;
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
