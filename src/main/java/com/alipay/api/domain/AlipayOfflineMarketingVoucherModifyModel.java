package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券修改
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class AlipayOfflineMarketingVoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5853714863575828443L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private VoucherModifyInfo voucherInfo;

    /**
     * Gets budget info.
     *
     * @return the budget info
     */
    public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}

    /**
     * Sets budget info.
     *
     * @param budgetInfo the budget info
     */
    public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets get count limit.
     *
     * @return the get count limit
     */
    public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}

    /**
     * Sets get count limit.
     *
     * @param getCountLimit the get count limit
     */
    public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets voucher info.
     *
     * @return the voucher info
     */
    public VoucherModifyInfo getVoucherInfo() {
		return this.voucherInfo;
	}

    /**
     * Sets voucher info.
     *
     * @param voucherInfo the voucher info
     */
    public void setVoucherInfo(VoucherModifyInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
