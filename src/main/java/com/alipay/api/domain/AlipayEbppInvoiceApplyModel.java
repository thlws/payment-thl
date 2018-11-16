package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请开具发票
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:29:40
 */
public class AlipayEbppInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2615322598182614558L;

	/**
	 * 执行动作：申请开票/申请红冲
可选取值：
BLUE:申请开票;RED:申请红冲
	 */
	@ApiField("action")
	private String action;

	/**
	 * 申请发起方，描述开票申请的发起角色，
可选取值：
PAYEE:销售方;PAYER:购买方
	 */
	@ApiField("apply_from")
	private String applyFrom;

	/**
	 * 发票申请内容
	 */
	@ApiField("invoice_apply_model")
	private InvoiceApplyOpenModel invoiceApplyModel;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。
如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003
要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets apply from.
     *
     * @return the apply from
     */
    public String getApplyFrom() {
		return this.applyFrom;
	}

    /**
     * Sets apply from.
     *
     * @param applyFrom the apply from
     */
    public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
	}

    /**
     * Gets invoice apply entity.
     *
     * @return the invoice apply entity
     */
    public InvoiceApplyOpenModel getInvoiceApplyModel() {
		return this.invoiceApplyModel;
	}

    /**
     * Sets invoice apply entity.
     *
     * @param invoiceApplyModel the invoice apply entity
     */
    public void setInvoiceApplyModel(InvoiceApplyOpenModel invoiceApplyModel) {
		this.invoiceApplyModel = invoiceApplyModel;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

    /**
     * Gets sub m short name.
     *
     * @return the sub m short name
     */
    public String getSubMShortName() {
		return this.subMShortName;
	}

    /**
     * Sets sub m short name.
     *
     * @param subMShortName the sub m short name
     */
    public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
