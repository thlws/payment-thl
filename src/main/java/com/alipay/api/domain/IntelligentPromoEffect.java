package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动效果
 *
 * @author auto create
 * @since 1.0, 2017-10-10 18:45:21
 */
public class IntelligentPromoEffect extends AlipayObject {

	private static final long serialVersionUID = 3829598412639619826L;

	/**
	 * 平均客单价提升比例
	 */
	@ApiField("avg_prize_increase")
	private String avgPrizeIncrease;

	/**
	 * 成本
	 */
	@ApiField("cost")
	private String cost;

	/**
	 * 当前效益
	 */
	@ApiField("current_total_amount")
	private String currentTotalAmount;

	/**
	 * 营销活动的预期效果id
	 */
	@ApiField("effect_id")
	private String effectId;

	/**
	 * 时间范围左值
	 */
	@ApiField("gmt_from")
	private Date gmtFrom;

	/**
	 * 时间范围右值
	 */
	@ApiField("gmt_to")
	private Date gmtTo;

	/**
	 * 成交额
	 */
	@ApiField("gmv")
	private String gmv;

	/**
	 * 剩余库存数
	 */
	@ApiField("remain_stock_num")
	private Long remainStockNum;

	/**
	 * 复购率提升比例
	 */
	@ApiField("repay_rate_increase")
	private String repayRateIncrease;

	/**
	 * 发券量提升比例
	 */
	@ApiField("send_count_increase")
	private String sendCountIncrease;

	/**
	 * 发券数量
	 */
	@ApiField("take_count")
	private Long takeCount;

	/**
	 * 营销活动效果类型。FORECAST：预估；STATISTICS：统计
	 */
	@ApiField("type")
	private String type;

	/**
	 * 核销量
	 */
	@ApiField("use_count")
	private Long useCount;

    /**
     * Gets avg prize increase.
     *
     * @return the avg prize increase
     */
    public String getAvgPrizeIncrease() {
		return this.avgPrizeIncrease;
	}

    /**
     * Sets avg prize increase.
     *
     * @param avgPrizeIncrease the avg prize increase
     */
    public void setAvgPrizeIncrease(String avgPrizeIncrease) {
		this.avgPrizeIncrease = avgPrizeIncrease;
	}

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public String getCost() {
		return this.cost;
	}

    /**
     * Sets cost.
     *
     * @param cost the cost
     */
    public void setCost(String cost) {
		this.cost = cost;
	}

    /**
     * Gets current total amount.
     *
     * @return the current total amount
     */
    public String getCurrentTotalAmount() {
		return this.currentTotalAmount;
	}

    /**
     * Sets current total amount.
     *
     * @param currentTotalAmount the current total amount
     */
    public void setCurrentTotalAmount(String currentTotalAmount) {
		this.currentTotalAmount = currentTotalAmount;
	}

    /**
     * Gets effect id.
     *
     * @return the effect id
     */
    public String getEffectId() {
		return this.effectId;
	}

    /**
     * Sets effect id.
     *
     * @param effectId the effect id
     */
    public void setEffectId(String effectId) {
		this.effectId = effectId;
	}

    /**
     * Gets gmt from.
     *
     * @return the gmt from
     */
    public Date getGmtFrom() {
		return this.gmtFrom;
	}

    /**
     * Sets gmt from.
     *
     * @param gmtFrom the gmt from
     */
    public void setGmtFrom(Date gmtFrom) {
		this.gmtFrom = gmtFrom;
	}

    /**
     * Gets gmt to.
     *
     * @return the gmt to
     */
    public Date getGmtTo() {
		return this.gmtTo;
	}

    /**
     * Sets gmt to.
     *
     * @param gmtTo the gmt to
     */
    public void setGmtTo(Date gmtTo) {
		this.gmtTo = gmtTo;
	}

    /**
     * Gets gmv.
     *
     * @return the gmv
     */
    public String getGmv() {
		return this.gmv;
	}

    /**
     * Sets gmv.
     *
     * @param gmv the gmv
     */
    public void setGmv(String gmv) {
		this.gmv = gmv;
	}

    /**
     * Gets remain stock num.
     *
     * @return the remain stock num
     */
    public Long getRemainStockNum() {
		return this.remainStockNum;
	}

    /**
     * Sets remain stock num.
     *
     * @param remainStockNum the remain stock num
     */
    public void setRemainStockNum(Long remainStockNum) {
		this.remainStockNum = remainStockNum;
	}

    /**
     * Gets repay rate increase.
     *
     * @return the repay rate increase
     */
    public String getRepayRateIncrease() {
		return this.repayRateIncrease;
	}

    /**
     * Sets repay rate increase.
     *
     * @param repayRateIncrease the repay rate increase
     */
    public void setRepayRateIncrease(String repayRateIncrease) {
		this.repayRateIncrease = repayRateIncrease;
	}

    /**
     * Gets send count increase.
     *
     * @return the send count increase
     */
    public String getSendCountIncrease() {
		return this.sendCountIncrease;
	}

    /**
     * Sets send count increase.
     *
     * @param sendCountIncrease the send count increase
     */
    public void setSendCountIncrease(String sendCountIncrease) {
		this.sendCountIncrease = sendCountIncrease;
	}

    /**
     * Gets take count.
     *
     * @return the take count
     */
    public Long getTakeCount() {
		return this.takeCount;
	}

    /**
     * Sets take count.
     *
     * @param takeCount the take count
     */
    public void setTakeCount(Long takeCount) {
		this.takeCount = takeCount;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets use count.
     *
     * @return the use count
     */
    public Long getUseCount() {
		return this.useCount;
	}

    /**
     * Sets use count.
     *
     * @param useCount the use count
     */
    public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

}
