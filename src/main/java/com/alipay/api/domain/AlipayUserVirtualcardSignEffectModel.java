package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人虚拟卡生效接口
 *
 * @author auto create
 * @since 1.0, 2018-07-17 18:53:23
 */
public class AlipayUserVirtualcardSignEffectModel extends AlipayObject {

	private static final long serialVersionUID = 6611429123948729982L;

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
	 * 卡不可用时引导用户的链接
	 */
	@ApiField("disabled_url")
	private String disabledUrl;

	/**
	 * json格式字符串，存放扩展信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

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
