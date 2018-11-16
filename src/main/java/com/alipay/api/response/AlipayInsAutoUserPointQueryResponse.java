package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.point.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:54
 */
public class AlipayInsAutoUserPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898929233113983799L;

	/** 
	 * 用户当前积分是否可兑换
	 */
	@ApiField("can_exchange")
	private Boolean canExchange;

	/** 
	 * 用户可用于兑换的积分值
攒油活动则表示用户可提取油量，单位为ml，例如可提取500ml
	 */
	@ApiField("can_exchange_amount")
	private Long canExchangeAmount;

	/** 
	 * 用户剩余积分额度，可继续积攒的值
攒油活动则表示用户油桶剩余大小，单位为ml
	 */
	@ApiField("can_save_amount")
	private Long canSaveAmount;

	/** 
	 * 用户有效积分。
攒油活动则表示可以使用的用户有效油量，单位为ml
	 */
	@ApiField("can_use_amount")
	private Long canUseAmount;

	/** 
	 * 是否推荐用户兑换
	 */
	@ApiField("recommend_exchange")
	private Boolean recommendExchange;

	/** 
	 * 用户积分总额度
攒油活动则表示用户油桶总大小，单位为ml，例如3000ml
	 */
	@ApiField("total_limit")
	private Long totalLimit;

	/** 
	 * 用户总共积攒量。
攒油活动则表示积攒油量，单位为ml，例如2000ml
	 */
	@ApiField("total_save_amount")
	private Long totalSaveAmount;

    /**
     * Sets can exchange.
     *
     * @param canExchange the can exchange
     */
    public void setCanExchange(Boolean canExchange) {
		this.canExchange = canExchange;
	}

    /**
     * Gets can exchange.
     *
     * @return the can exchange
     */
    public Boolean getCanExchange( ) {
		return this.canExchange;
	}

    /**
     * Sets can exchange amount.
     *
     * @param canExchangeAmount the can exchange amount
     */
    public void setCanExchangeAmount(Long canExchangeAmount) {
		this.canExchangeAmount = canExchangeAmount;
	}

    /**
     * Gets can exchange amount.
     *
     * @return the can exchange amount
     */
    public Long getCanExchangeAmount( ) {
		return this.canExchangeAmount;
	}

    /**
     * Sets can save amount.
     *
     * @param canSaveAmount the can save amount
     */
    public void setCanSaveAmount(Long canSaveAmount) {
		this.canSaveAmount = canSaveAmount;
	}

    /**
     * Gets can save amount.
     *
     * @return the can save amount
     */
    public Long getCanSaveAmount( ) {
		return this.canSaveAmount;
	}

    /**
     * Sets can use amount.
     *
     * @param canUseAmount the can use amount
     */
    public void setCanUseAmount(Long canUseAmount) {
		this.canUseAmount = canUseAmount;
	}

    /**
     * Gets can use amount.
     *
     * @return the can use amount
     */
    public Long getCanUseAmount( ) {
		return this.canUseAmount;
	}

    /**
     * Sets recommend exchange.
     *
     * @param recommendExchange the recommend exchange
     */
    public void setRecommendExchange(Boolean recommendExchange) {
		this.recommendExchange = recommendExchange;
	}

    /**
     * Gets recommend exchange.
     *
     * @return the recommend exchange
     */
    public Boolean getRecommendExchange( ) {
		return this.recommendExchange;
	}

    /**
     * Sets total limit.
     *
     * @param totalLimit the total limit
     */
    public void setTotalLimit(Long totalLimit) {
		this.totalLimit = totalLimit;
	}

    /**
     * Gets total limit.
     *
     * @return the total limit
     */
    public Long getTotalLimit( ) {
		return this.totalLimit;
	}

    /**
     * Sets total save amount.
     *
     * @param totalSaveAmount the total save amount
     */
    public void setTotalSaveAmount(Long totalSaveAmount) {
		this.totalSaveAmount = totalSaveAmount;
	}

    /**
     * Gets total save amount.
     *
     * @return the total save amount
     */
    public Long getTotalSaveAmount( ) {
		return this.totalSaveAmount;
	}

}
