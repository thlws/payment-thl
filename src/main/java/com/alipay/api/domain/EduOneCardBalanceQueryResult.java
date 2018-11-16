package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园一卡通余额查询结果对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class EduOneCardBalanceQueryResult extends AlipayObject {

	private static final long serialVersionUID = 7211564549743839816L;

	/**
	 * 校园一卡通机构
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 校园一卡通可用余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 校园一卡通姓名
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 校园一卡通卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 余额最后更新时间
	 */
	@ApiField("last_update_time")
	private Date lastUpdateTime;

	/**
	 * 校园一卡通待领金额
	 */
	@ApiField("pound_amount")
	private String poundAmount;

    /**
     * Gets agent code.
     *
     * @return the agent code
     */
    public String getAgentCode() {
		return this.agentCode;
	}

    /**
     * Sets agent code.
     *
     * @param agentCode the agent code
     */
    public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
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
     * Gets card name.
     *
     * @return the card name
     */
    public String getCardName() {
		return this.cardName;
	}

    /**
     * Sets card name.
     *
     * @param cardName the card name
     */
    public void setCardName(String cardName) {
		this.cardName = cardName;
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
     * Gets last update time.
     *
     * @return the last update time
     */
    public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

    /**
     * Sets last update time.
     *
     * @param lastUpdateTime the last update time
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

    /**
     * Gets pound amount.
     *
     * @return the pound amount
     */
    public String getPoundAmount() {
		return this.poundAmount;
	}

    /**
     * Sets pound amount.
     *
     * @param poundAmount the pound amount
     */
    public void setPoundAmount(String poundAmount) {
		this.poundAmount = poundAmount;
	}

}
