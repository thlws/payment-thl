package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发票申请项目明细
 *
 * @author auto create
 * @since 1.0, 2017-03-30 11:59:29
 */
public class InsInvoiceApplyItem extends AlipayObject {

	private static final long serialVersionUID = 2279769352737535513L;

	/**
	 * 申请发票开票维度;BUSINESS_ORDER:业务单;
	 */
	@ApiField("apply_scope")
	private String applyScope;

	/**
	 * 费用类型;PREMIUM:保费;
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 业务单号;apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_no")
	private String insBizNo;

	/**
	 * 业务单类型;APPLICATION:投保订单;POLICY:保单;ENDORSEMENT:批单;RECOVERY;追偿单.
apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_type")
	private String insBizType;

    /**
     * Gets apply scope.
     *
     * @return the apply scope
     */
    public String getApplyScope() {
		return this.applyScope;
	}

    /**
     * Sets apply scope.
     *
     * @param applyScope the apply scope
     */
    public void setApplyScope(String applyScope) {
		this.applyScope = applyScope;
	}

    /**
     * Gets expense type.
     *
     * @return the expense type
     */
    public String getExpenseType() {
		return this.expenseType;
	}

    /**
     * Sets expense type.
     *
     * @param expenseType the expense type
     */
    public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

    /**
     * Gets ins biz no.
     *
     * @return the ins biz no
     */
    public String getInsBizNo() {
		return this.insBizNo;
	}

    /**
     * Sets ins biz no.
     *
     * @param insBizNo the ins biz no
     */
    public void setInsBizNo(String insBizNo) {
		this.insBizNo = insBizNo;
	}

    /**
     * Gets ins biz type.
     *
     * @return the ins biz type
     */
    public String getInsBizType() {
		return this.insBizType;
	}

    /**
     * Sets ins biz type.
     *
     * @param insBizType the ins biz type
     */
    public void setInsBizType(String insBizType) {
		this.insBizType = insBizType;
	}

}
