package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动限制信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 21:53:19
 */
public class ConstraintInfo extends AlipayObject {

	private static final long serialVersionUID = 7768486462526728958L;

	/**
	 * 资金池ID
（数据来源：需要ISV自己去口碑销售中台创建资金池，拿到对应的资金池ID，此参数仅适用ISV接入口福业务场景时使用，其他场景不需要传递此参数）
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 人群规则组ID
仅直发奖类型活动设置有效，通过调用营销活动人群组规则创建接口参数返回
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 针对指定人群的约束条件
	 */
	@ApiField("crowd_restriction")
	private String crowdRestriction;

	/**
	 * 根据crowd_restriction的值不同，设置相应的值，如果crowd_restriction是“MEMBER_CARD”，crowd_restriction_value就是关联会员卡模版ID集合，用逗号拼接
	 */
	@ApiField("crowd_restriction_value")
	private String crowdRestrictionValue;

	/**
	 * 单品码列表
仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 最低消费金额，单位元
仅在创建消费送礼包活动时设置
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 补贴百分比,95表示 95%，支持两位小数
（参数说明：补贴比例95%，表示ISV出资95%，商户出资5%，此参数仅适用ISV接入口福业务场景时使用，其他场景不需要传递此参数）
	 */
	@ApiField("subsidy_percent")
	private String subsidyPercent;

	/**
	 * 活动适用的门店列表
仅品牌商发起的招商活动可为空
最多支持10w家门店
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	/**
	 * 活动期间用户能够参与的次数限制
如果不设置则不限制参与次数
	 */
	@ApiField("user_win_count")
	private String userWinCount;

	/**
	 * 活动期间用户能够参与的频率限制
如果不设置则不限制参与频率
每日中奖1次: D||1 
每周中奖2次: W||2 
每月中奖3次: M||3
	 */
	@ApiField("user_win_frequency")
	private String userWinFrequency;

    /**
     * Gets cash pool id.
     *
     * @return the cash pool id
     */
    public String getCashPoolId() {
		return this.cashPoolId;
	}

    /**
     * Sets cash pool id.
     *
     * @param cashPoolId the cash pool id
     */
    public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

    /**
     * Gets crowd group id.
     *
     * @return the crowd group id
     */
    public String getCrowdGroupId() {
		return this.crowdGroupId;
	}

    /**
     * Sets crowd group id.
     *
     * @param crowdGroupId the crowd group id
     */
    public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

    /**
     * Gets crowd restriction.
     *
     * @return the crowd restriction
     */
    public String getCrowdRestriction() {
		return this.crowdRestriction;
	}

    /**
     * Sets crowd restriction.
     *
     * @param crowdRestriction the crowd restriction
     */
    public void setCrowdRestriction(String crowdRestriction) {
		this.crowdRestriction = crowdRestriction;
	}

    /**
     * Gets crowd restriction value.
     *
     * @return the crowd restriction value
     */
    public String getCrowdRestrictionValue() {
		return this.crowdRestrictionValue;
	}

    /**
     * Sets crowd restriction value.
     *
     * @param crowdRestrictionValue the crowd restriction value
     */
    public void setCrowdRestrictionValue(String crowdRestrictionValue) {
		this.crowdRestrictionValue = crowdRestrictionValue;
	}

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets min cost.
     *
     * @return the min cost
     */
    public String getMinCost() {
		return this.minCost;
	}

    /**
     * Sets min cost.
     *
     * @param minCost the min cost
     */
    public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

    /**
     * Gets subsidy percent.
     *
     * @return the subsidy percent
     */
    public String getSubsidyPercent() {
		return this.subsidyPercent;
	}

    /**
     * Sets subsidy percent.
     *
     * @param subsidyPercent the subsidy percent
     */
    public void setSubsidyPercent(String subsidyPercent) {
		this.subsidyPercent = subsidyPercent;
	}

    /**
     * Gets suit shops.
     *
     * @return the suit shops
     */
    public List<String> getSuitShops() {
		return this.suitShops;
	}

    /**
     * Sets suit shops.
     *
     * @param suitShops the suit shops
     */
    public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

    /**
     * Gets user win count.
     *
     * @return the user win count
     */
    public String getUserWinCount() {
		return this.userWinCount;
	}

    /**
     * Sets user win count.
     *
     * @param userWinCount the user win count
     */
    public void setUserWinCount(String userWinCount) {
		this.userWinCount = userWinCount;
	}

    /**
     * Gets user win frequency.
     *
     * @return the user win frequency
     */
    public String getUserWinFrequency() {
		return this.userWinFrequency;
	}

    /**
     * Sets user win frequency.
     *
     * @param userWinFrequency the user win frequency
     */
    public void setUserWinFrequency(String userWinFrequency) {
		this.userWinFrequency = userWinFrequency;
	}

}
