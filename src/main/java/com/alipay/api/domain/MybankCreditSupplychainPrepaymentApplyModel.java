package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-预付申请单创建
 *
 * @author auto create
 * @since 1.0, 2018-07-28 01:10:56
 */
public class MybankCreditSupplychainPrepaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3531652948686877246L;

	/**
	 * 买家身份信息。
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 贷款支付金额，单位人民币元。
	 */
	@ApiField("loan_pay_amount")
	private String loanPayAmount;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 客户自付金额，一般为订单首付，单位人民币元。
	 */
	@ApiField("self_pay_amount")
	private String selfPayAmount;

    /**
     * Gets buyer.
     *
     * @return the buyer
     */
    public Member getBuyer() {
		return this.buyer;
	}

    /**
     * Sets buyer.
     *
     * @param buyer the buyer
     */
    public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

    /**
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
	}

    /**
     * Gets loan pay amount.
     *
     * @return the loan pay amount
     */
    public String getLoanPayAmount() {
		return this.loanPayAmount;
	}

    /**
     * Sets loan pay amount.
     *
     * @param loanPayAmount the loan pay amount
     */
    public void setLoanPayAmount(String loanPayAmount) {
		this.loanPayAmount = loanPayAmount;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets self pay amount.
     *
     * @return the self pay amount
     */
    public String getSelfPayAmount() {
		return this.selfPayAmount;
	}

    /**
     * Sets self pay amount.
     *
     * @param selfPayAmount the self pay amount
     */
    public void setSelfPayAmount(String selfPayAmount) {
		this.selfPayAmount = selfPayAmount;
	}

}
