package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随机立减奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class RandomDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 8164866267362299813L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 随机立减折扣幅度列表
	 */
	@ApiListField("discount_random_model_list")
	@ApiField("discount_random_model")
	private List<DiscountRandomModel> discountRandomModelList;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 最高优惠金额=订单金额X(1-封顶折扣)
折扣幅度必须为0.3到1之间的小数(保留小数点后2位)
	 */
	@ApiField("max_random_discount_rate")
	private String maxRandomDiscountRate;

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
     * Gets discount random entity list.
     *
     * @return the discount random entity list
     */
    public List<DiscountRandomModel> getDiscountRandomModelList() {
		return this.discountRandomModelList;
	}

    /**
     * Sets discount random entity list.
     *
     * @param discountRandomModelList the discount random entity list
     */
    public void setDiscountRandomModelList(List<DiscountRandomModel> discountRandomModelList) {
		this.discountRandomModelList = discountRandomModelList;
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
     * Gets max random discount rate.
     *
     * @return the max random discount rate
     */
    public String getMaxRandomDiscountRate() {
		return this.maxRandomDiscountRate;
	}

    /**
     * Sets max random discount rate.
     *
     * @param maxRandomDiscountRate the max random discount rate
     */
    public void setMaxRandomDiscountRate(String maxRandomDiscountRate) {
		this.maxRandomDiscountRate = maxRandomDiscountRate;
	}

}
