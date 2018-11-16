package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板创建
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:24
 */
public class AlipayOfflineMarketingVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4433585228644718184L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 券码池编号。该值调用：alipay.offline.marketing.voucher.code.upload接口生成
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放规则信息
	 */
	@ApiField("get_rule")
	private GetRuleInfo getRule;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板信息
	 */
	@ApiField("voucher_info")
	private VoucherInfo voucherInfo;

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
     * Gets code inventory id.
     *
     * @return the code inventory id
     */
    public String getCodeInventoryId() {
		return this.codeInventoryId;
	}

    /**
     * Sets code inventory id.
     *
     * @param codeInventoryId the code inventory id
     */
    public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
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
     * Gets get rule.
     *
     * @return the get rule
     */
    public GetRuleInfo getGetRule() {
		return this.getRule;
	}

    /**
     * Sets get rule.
     *
     * @param getRule the get rule
     */
    public void setGetRule(GetRuleInfo getRule) {
		this.getRule = getRule;
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
    public VoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}

    /**
     * Sets voucher info.
     *
     * @param voucherInfo the voucher info
     */
    public void setVoucherInfo(VoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
