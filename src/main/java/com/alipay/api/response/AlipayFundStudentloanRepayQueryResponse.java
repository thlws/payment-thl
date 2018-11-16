package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.studentloan.repay.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-21 18:03:40
 */
public class AlipayFundStudentloanRepayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8368885675777111771L;

	/** 
	 * 业务类型 A生源地 B高校
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 学生所在分行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 学生所在区县或高校
	 */
	@ApiField("org_name")
	private String orgName;

	/** 
	 * 还款日期，格式yyyy-MM-dd
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 还款明细列表
	 */
	@ApiListField("repay_list")
	@ApiField("repay_detail")
	private List<RepayDetail> repayList;

	/** 
	 * 学生当前应还金额汇总
	 */
	@ApiField("should_amount")
	private String shouldAmount;

	/** 
	 * 李某
	 */
	@ApiField("student_name")
	private String studentName;

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets branch name.
     *
     * @param branchName the branch name
     */
    public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

    /**
     * Gets branch name.
     *
     * @return the branch name
     */
    public String getBranchName( ) {
		return this.branchName;
	}

    /**
     * Sets org name.
     *
     * @param orgName the org name
     */
    public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

    /**
     * Gets org name.
     *
     * @return the org name
     */
    public String getOrgName( ) {
		return this.orgName;
	}

    /**
     * Sets repay date.
     *
     * @param repayDate the repay date
     */
    public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

    /**
     * Gets repay date.
     *
     * @return the repay date
     */
    public String getRepayDate( ) {
		return this.repayDate;
	}

    /**
     * Sets repay list.
     *
     * @param repayList the repay list
     */
    public void setRepayList(List<RepayDetail> repayList) {
		this.repayList = repayList;
	}

    /**
     * Gets repay list.
     *
     * @return the repay list
     */
    public List<RepayDetail> getRepayList( ) {
		return this.repayList;
	}

    /**
     * Sets should amount.
     *
     * @param shouldAmount the should amount
     */
    public void setShouldAmount(String shouldAmount) {
		this.shouldAmount = shouldAmount;
	}

    /**
     * Gets should amount.
     *
     * @return the should amount
     */
    public String getShouldAmount( ) {
		return this.shouldAmount;
	}

    /**
     * Sets student name.
     *
     * @param studentName the student name
     */
    public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

    /**
     * Gets student name.
     *
     * @return the student name
     */
    public String getStudentName( ) {
		return this.studentName;
	}

}
