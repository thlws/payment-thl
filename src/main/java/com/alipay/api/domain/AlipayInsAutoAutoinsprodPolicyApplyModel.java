package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单请求接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:40:18
 */
public class AlipayInsAutoAutoinsprodPolicyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3815677515674471974L;

	/**
	 * 邮寄信息
	 */
	@ApiField("deliver_info")
	private DeliverInfo deliverInfo;

	/**
	 * 询价申请ID
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 指定保险公司支付宝收款账户,一般为保险公司收款账号登录ID
	 */
	@ApiField("income_account_no")
	private String incomeAccountNo;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/**
	 * 付费方式,1-代理人付款，2-投保人付款
	 */
	@ApiField("who_payed")
	private String whoPayed;

    /**
     * Gets deliver info.
     *
     * @return the deliver info
     */
    public DeliverInfo getDeliverInfo() {
		return this.deliverInfo;
	}

    /**
     * Sets deliver info.
     *
     * @param deliverInfo the deliver info
     */
    public void setDeliverInfo(DeliverInfo deliverInfo) {
		this.deliverInfo = deliverInfo;
	}

    /**
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId() {
		return this.enquiryBizId;
	}

    /**
     * Sets enquiry biz id.
     *
     * @param enquiryBizId the enquiry biz id
     */
    public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

    /**
     * Gets income account no.
     *
     * @return the income account no
     */
    public String getIncomeAccountNo() {
		return this.incomeAccountNo;
	}

    /**
     * Sets income account no.
     *
     * @param incomeAccountNo the income account no
     */
    public void setIncomeAccountNo(String incomeAccountNo) {
		this.incomeAccountNo = incomeAccountNo;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId() {
		return this.quoteBizId;
	}

    /**
     * Sets quote biz id.
     *
     * @param quoteBizId the quote biz id
     */
    public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

    /**
     * Gets who payed.
     *
     * @return the who payed
     */
    public String getWhoPayed() {
		return this.whoPayed;
	}

    /**
     * Sets who payed.
     *
     * @param whoPayed the who payed
     */
    public void setWhoPayed(String whoPayed) {
		this.whoPayed = whoPayed;
	}

}
