package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人虚拟卡页面签约接口
 *
 * @author auto create
 * @since 1.0, 2018-07-17 18:53:38
 */
public class AlipayUserVirtualcardPageSignModel extends AlipayObject {

	private static final long serialVersionUID = 5164759773131279588L;

	/**
	 * 用户虚拟卡余额信息，单位为元，可精确到分。后付费卡不需要。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * hex格式表示的虚拟卡数据，卡数据将在虚拟卡二维码中透传。
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 商户定义的卡号，card_type+card_no要控制唯一性
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡的开通方式，分为直接开通DIRECT，二阶段开通TWO_PHASE
	 */
	@ApiField("card_sign_mode")
	private String cardSignMode;

	/**
	 * 卡类型，由支付宝指定。目前每个商户都有自己的卡类型，一家商户还可能有多个卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 表示虚拟卡是否可用
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 当虚拟卡不可用时，提示用户不可用原因
	 */
	@ApiField("disabled_tips")
	private String disabledTips;

	/**
	 * 卡不可用时引导用户的链接。无此需求则无需关注
	 */
	@ApiField("disabled_url")
	private String disabledUrl;

	/**
	 * json格式字符串，存放扩展信息。整个值作为字符串，请注意转义问题。
	 */
	@ApiField("ext_info")
	private String extInfo;

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
     * Gets card sign mode.
     *
     * @return the card sign mode
     */
    public String getCardSignMode() {
		return this.cardSignMode;
	}

    /**
     * Sets card sign mode.
     *
     * @param cardSignMode the card sign mode
     */
    public void setCardSignMode(String cardSignMode) {
		this.cardSignMode = cardSignMode;
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
     * Gets disabled.
     *
     * @return the disabled
     */
    public String getDisabled() {
		return this.disabled;
	}

    /**
     * Sets disabled.
     *
     * @param disabled the disabled
     */
    public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

    /**
     * Gets disabled tips.
     *
     * @return the disabled tips
     */
    public String getDisabledTips() {
		return this.disabledTips;
	}

    /**
     * Sets disabled tips.
     *
     * @param disabledTips the disabled tips
     */
    public void setDisabledTips(String disabledTips) {
		this.disabledTips = disabledTips;
	}

    /**
     * Gets disabled url.
     *
     * @return the disabled url
     */
    public String getDisabledUrl() {
		return this.disabledUrl;
	}

    /**
     * Sets disabled url.
     *
     * @param disabledUrl the disabled url
     */
    public void setDisabledUrl(String disabledUrl) {
		this.disabledUrl = disabledUrl;
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

}
