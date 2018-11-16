package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件欺诈调查结果同步
 *
 * @author auto create
 * @since 1.0, 2018-04-02 15:23:43
 */
public class AlipayInsDataAutoFraudSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3892245718638659358L;

	/**
	 * 减损金额，单位：元
	 */
	@ApiField("avoid_loss_amount")
	private String avoidLossAmount;

	/**
	 * 减损类型，见码表《反欺诈减损类型V1》
	 */
	@ApiField("avoid_loss_type")
	private String avoidLossType;

	/**
	 * 结案金额，单位：元
	 */
	@ApiField("case_end_amount")
	private String caseEndAmount;

	/**
	 * 保司在案件调查时最终使用的欺诈分结果对应的查询请求号。
如果该案件未使用蚂蚁车险欺诈分查询结果，可以不传该字段。
	 */
	@ApiField("fraud_query_request_no")
	private String fraudQueryRequestNo;

	/**
	 * 案件欺诈结果，枚举值如下
FRAUD:欺诈
NON_FRAUD:非欺诈
	 */
	@ApiField("fraud_result")
	private String fraudResult;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求号，每次请求需唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 同步类型，新增或修改，目前只允许修改一次

NEW:新增
MODIFY:修改
	 */
	@ApiField("syn_type")
	private String synType;

    /**
     * Gets avoid loss amount.
     *
     * @return the avoid loss amount
     */
    public String getAvoidLossAmount() {
		return this.avoidLossAmount;
	}

    /**
     * Sets avoid loss amount.
     *
     * @param avoidLossAmount the avoid loss amount
     */
    public void setAvoidLossAmount(String avoidLossAmount) {
		this.avoidLossAmount = avoidLossAmount;
	}

    /**
     * Gets avoid loss type.
     *
     * @return the avoid loss type
     */
    public String getAvoidLossType() {
		return this.avoidLossType;
	}

    /**
     * Sets avoid loss type.
     *
     * @param avoidLossType the avoid loss type
     */
    public void setAvoidLossType(String avoidLossType) {
		this.avoidLossType = avoidLossType;
	}

    /**
     * Gets case end amount.
     *
     * @return the case end amount
     */
    public String getCaseEndAmount() {
		return this.caseEndAmount;
	}

    /**
     * Sets case end amount.
     *
     * @param caseEndAmount the case end amount
     */
    public void setCaseEndAmount(String caseEndAmount) {
		this.caseEndAmount = caseEndAmount;
	}

    /**
     * Gets fraud query request no.
     *
     * @return the fraud query request no
     */
    public String getFraudQueryRequestNo() {
		return this.fraudQueryRequestNo;
	}

    /**
     * Sets fraud query request no.
     *
     * @param fraudQueryRequestNo the fraud query request no
     */
    public void setFraudQueryRequestNo(String fraudQueryRequestNo) {
		this.fraudQueryRequestNo = fraudQueryRequestNo;
	}

    /**
     * Gets fraud result.
     *
     * @return the fraud result
     */
    public String getFraudResult() {
		return this.fraudResult;
	}

    /**
     * Sets fraud result.
     *
     * @param fraudResult the fraud result
     */
    public void setFraudResult(String fraudResult) {
		this.fraudResult = fraudResult;
	}

    /**
     * Gets report no.
     *
     * @return the report no
     */
    public String getReportNo() {
		return this.reportNo;
	}

    /**
     * Sets report no.
     *
     * @param reportNo the report no
     */
    public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

    /**
     * Gets request no.
     *
     * @return the request no
     */
    public String getRequestNo() {
		return this.requestNo;
	}

    /**
     * Sets request no.
     *
     * @param requestNo the request no
     */
    public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

    /**
     * Gets syn type.
     *
     * @return the syn type
     */
    public String getSynType() {
		return this.synType;
	}

    /**
     * Sets syn type.
     *
     * @param synType the syn type
     */
    public void setSynType(String synType) {
		this.synType = synType;
	}

}
