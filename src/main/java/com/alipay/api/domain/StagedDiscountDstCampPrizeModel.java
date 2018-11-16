package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阶梯优惠
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class StagedDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 8383598458636751269L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 折扣幅度列表.
	 */
	@ApiListField("discount_rate_model_list")
	@ApiField("discount_rate_model")
	private List<DiscountRateModel> discountRateModelList;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

    /**
     * Gets budget id.
     *
     * @return the budget id
     */
    public String getBudgetId() {
		return this.budgetId;
	}

    /**
     * Sets budget id.
     *
     * @param budgetId the budget id
     */
    public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

    /**
     * Gets discount rate entity list.
     *
     * @return the discount rate entity list
     */
    public List<DiscountRateModel> getDiscountRateModelList() {
		return this.discountRateModelList;
	}

    /**
     * Sets discount rate entity list.
     *
     * @param discountRateModelList the discount rate entity list
     */
    public void setDiscountRateModelList(List<DiscountRateModel> discountRateModelList) {
		this.discountRateModelList = discountRateModelList;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets max discount amt.
     *
     * @return the max discount amt
     */
    public String getMaxDiscountAmt() {
		return this.maxDiscountAmt;
	}

    /**
     * Sets max discount amt.
     *
     * @param maxDiscountAmt the max discount amt
     */
    public void setMaxDiscountAmt(String maxDiscountAmt) {
		this.maxDiscountAmt = maxDiscountAmt;
	}

}
