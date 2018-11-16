package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户还款
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:32:15
 */
public class AlipayPcreditLoanRefundCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5827117447541954132L;

	/**
	 * 蚂蚁借呗贷款申请编号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 商户还款订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户还款金额
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/**
	 * 请求流水号，用于控制幂等
	 */
	@ApiField("req_id")
	private String reqId;

    /**
     * Gets loan apply no.
     *
     * @return the loan apply no
     */
    public String getLoanApplyNo() {
		return this.loanApplyNo;
	}

    /**
     * Sets loan apply no.
     *
     * @param loanApplyNo the loan apply no
     */
    public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
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
     * Gets repay amt.
     *
     * @return the repay amt
     */
    public String getRepayAmt() {
		return this.repayAmt;
	}

    /**
     * Sets repay amt.
     *
     * @param repayAmt the repay amt
     */
    public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

    /**
     * Gets req id.
     *
     * @return the req id
     */
    public String getReqId() {
		return this.reqId;
	}

    /**
     * Sets req id.
     *
     * @param reqId the req id
     */
    public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
