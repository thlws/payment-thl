package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款强扣申请
 *
 * @author auto create
 * @since 1.0, 2018-07-27 23:08:17
 */
public class AlipayPcreditLoanDeductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4613364753344162225L;

	/**
	 * 贷款申请单号，客户申请贷款时借呗系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 备注信息，机构填写的发起强扣申请的原因，要求尽量详细
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人名称，机构操作发起强扣人员姓名，用于信息追溯
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部请求幂等流水号，请求的幂等字段，申请用户贷款强扣时由机构生成的唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
