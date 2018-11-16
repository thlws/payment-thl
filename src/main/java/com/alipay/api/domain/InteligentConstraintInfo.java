package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能活动限制信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:29:05
 */
public class InteligentConstraintInfo extends AlipayObject {

	private static final long serialVersionUID = 3125972853534592965L;

	/**
	 * 人群组id，目前只支持返回时带出。
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 单品码列表
仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码
	 */
	@ApiField("item_ids")
	private String itemIds;

	/**
	 * 最低消费金额，单位元
仅在创建消费送礼包活动时设置
	 */
	@ApiField("min_cost")
	private String minCost;

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
     * Gets item ids.
     *
     * @return the item ids
     */
    public String getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(String itemIds) {
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
