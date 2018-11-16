package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满立减奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 6685943138968391242L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id, 修改必输，新增不输入
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 满的金额只能填写正整数字，大于0，必须小于9位
	 */
	@ApiField("reduce_amt_pre")
	private String reduceAmtPre;

	/**
	 * 减的金额只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt_suf")
	private String reduceAmtSuf;

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

    /**
     * Gets reduce amt pre.
     *
     * @return the reduce amt pre
     */
    public String getReduceAmtPre() {
		return this.reduceAmtPre;
	}

    /**
     * Sets reduce amt pre.
     *
     * @param reduceAmtPre the reduce amt pre
     */
    public void setReduceAmtPre(String reduceAmtPre) {
		this.reduceAmtPre = reduceAmtPre;
	}

    /**
     * Gets reduce amt suf.
     *
     * @return the reduce amt suf
     */
    public String getReduceAmtSuf() {
		return this.reduceAmtSuf;
	}

    /**
     * Sets reduce amt suf.
     *
     * @param reduceAmtSuf the reduce amt suf
     */
    public void setReduceAmtSuf(String reduceAmtSuf) {
		this.reduceAmtSuf = reduceAmtSuf;
	}

}
