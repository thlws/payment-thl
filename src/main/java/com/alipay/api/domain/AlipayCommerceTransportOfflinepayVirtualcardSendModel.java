package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息同步
 *
 * @author auto create
 * @since 1.0, 2018-07-30 16:23:55
 */
public class AlipayCommerceTransportOfflinepayVirtualcardSendModel extends AlipayObject {

	private static final long serialVersionUID = 8722243162824978769L;

	/**
	 * 虚拟卡信息同步动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户虚拟卡余额，单位元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * hex格式表示的虚拟卡数据，卡数据将在虚拟卡二维码中透传。
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 用户虚拟卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 表示虚拟卡是否可用
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 卡状态不可用时，标示卡的具体不可用状态。
CARD_OVERDUE ---- 欠费，CARD_REVOKING ---- 退卡中
	 */
	@ApiField("disabled_code")
	private String disabledCode;

	/**
	 * 当虚拟卡不可用时，提示用户不可用原因。
	 */
	@ApiField("disabled_tips")
	private String disabledTips;

	/**
	 * json格式字符串，存放扩展信息。discount_type ---- 优惠标识
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 虚拟卡最后更新时间 使用标准java时间格式
	 */
	@ApiField("last_update_time")
	private String lastUpdateTime;

	/**
	 * 交易场景，标示卡当前的支付模式，如为空，则默认PCREDIT。
PCREDIT ---- 先享后付
EXTRA_PREPAY ---- 域外储值卡
	 */
	@ApiField("trade_scene")
	private String tradeScene;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

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
     * Gets disabled code.
     *
     * @return the disabled code
     */
    public String getDisabledCode() {
		return this.disabledCode;
	}

    /**
     * Sets disabled code.
     *
     * @param disabledCode the disabled code
     */
    public void setDisabledCode(String disabledCode) {
		this.disabledCode = disabledCode;
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
     * Gets trade scene.
     *
     * @return the trade scene
     */
    public String getTradeScene() {
		return this.tradeScene;
	}

    /**
     * Sets trade scene.
     *
     * @param tradeScene the trade scene
     */
    public void setTradeScene(String tradeScene) {
		this.tradeScene = tradeScene;
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
