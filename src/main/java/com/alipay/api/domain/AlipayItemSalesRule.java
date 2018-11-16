package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品销售规则
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:55
 */
public class AlipayItemSalesRule extends AlipayObject {

	private static final long serialVersionUID = 7637516811379899361L;

	/**
	 * 购买人群限制集合，开放平台暂时不支持此字段，如果需要使用，需要评估
	 */
	@ApiListField("buyer_crowd_limit")
	@ApiField("string")
	private List<String> buyerCrowdLimit;

	/**
	 * 可限制商品单日销售上限
	 */
	@ApiField("daily_sales_limit")
	private Long dailySalesLimit;

	/**
	 * 用户购买策略如不填，则默认值为一个用户一天可以领取三次。
可限制DAY、WEEK、MONTH中n天领取m次，格式为DAY|n|m；
同时也可限制券的1次生命周期中可被领取x次，如ALL|1|x，两个规则可组合使用
	 */
	@ApiField("user_sales_limit")
	private String userSalesLimit;

    /**
     * Gets buyer crowd limit.
     *
     * @return the buyer crowd limit
     */
    public List<String> getBuyerCrowdLimit() {
		return this.buyerCrowdLimit;
	}

    /**
     * Sets buyer crowd limit.
     *
     * @param buyerCrowdLimit the buyer crowd limit
     */
    public void setBuyerCrowdLimit(List<String> buyerCrowdLimit) {
		this.buyerCrowdLimit = buyerCrowdLimit;
	}

    /**
     * Gets daily sales limit.
     *
     * @return the daily sales limit
     */
    public Long getDailySalesLimit() {
		return this.dailySalesLimit;
	}

    /**
     * Sets daily sales limit.
     *
     * @param dailySalesLimit the daily sales limit
     */
    public void setDailySalesLimit(Long dailySalesLimit) {
		this.dailySalesLimit = dailySalesLimit;
	}

    /**
     * Gets user sales limit.
     *
     * @return the user sales limit
     */
    public String getUserSalesLimit() {
		return this.userSalesLimit;
	}

    /**
     * Sets user sales limit.
     *
     * @param userSalesLimit the user sales limit
     */
    public void setUserSalesLimit(String userSalesLimit) {
		this.userSalesLimit = userSalesLimit;
	}

}
