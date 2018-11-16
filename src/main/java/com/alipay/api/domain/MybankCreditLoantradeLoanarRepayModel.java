package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构代客户还款
 *
 * @author auto create
 * @since 1.0, 2017-09-19 14:04:54
 */
public class MybankCreditLoantradeLoanarRepayModel extends AlipayObject {

	private static final long serialVersionUID = 1569922264716333589L;

	/**
	 * 贷款客户在网商的会员ID
	 */
	@ApiField("cust_iprole_id")
	private String custIproleId;

	/**
	 * 还款日，精确到日，格式为yyyyMMdd，必须是当天
	 */
	@ApiField("date")
	private String date;

	/**
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款本金金额，单位默认为元，支持小数点两位，为了便于传输用合作方将数值型转换为字符串型
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/**
	 * 外部流水号格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets cust iprole id.
     *
     * @return the cust iprole id
     */
    public String getCustIproleId() {
		return this.custIproleId;
	}

    /**
     * Sets cust iprole id.
     *
     * @param custIproleId the cust iprole id
     */
    public void setCustIproleId(String custIproleId) {
		this.custIproleId = custIproleId;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets loan ar no.
     *
     * @return the loan ar no
     */
    public String getLoanArNo() {
		return this.loanArNo;
	}

    /**
     * Sets loan ar no.
     *
     * @param loanArNo the loan ar no
     */
    public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

    /**
     * Gets prin amt.
     *
     * @return the prin amt
     */
    public String getPrinAmt() {
		return this.prinAmt;
	}

    /**
     * Sets prin amt.
     *
     * @param prinAmt the prin amt
     */
    public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
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

}
