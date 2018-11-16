package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.verify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditAntifraudVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5247788815755391815L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 决策结果，可空，取值当前为REJECT\REVIEW\PASS，产品定制使用。根据产品定制配置，对结果进行决策返回
	 */
	@ApiField("decision_result")
	private String decisionResult;

	/** 
	 * 方案ID，可空，产品定制使用。在线可能会存在多个方案并行，方案ID标识当前请求使用的在线方案
	 */
	@ApiField("solution_id")
	private String solutionId;

	/** 
	 * <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=272&articleId=105917&docType=1">验证code列表</a>
	 */
	@ApiListField("verify_code")
	@ApiField("string")
	private List<String> verifyCode;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets decision result.
     *
     * @param decisionResult the decision result
     */
    public void setDecisionResult(String decisionResult) {
		this.decisionResult = decisionResult;
	}

    /**
     * Gets decision result.
     *
     * @return the decision result
     */
    public String getDecisionResult( ) {
		return this.decisionResult;
	}

    /**
     * Sets solution id.
     *
     * @param solutionId the solution id
     */
    public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

    /**
     * Gets solution id.
     *
     * @return the solution id
     */
    public String getSolutionId( ) {
		return this.solutionId;
	}

    /**
     * Sets verify code.
     *
     * @param verifyCode the verify code
     */
    public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}

    /**
     * Gets verify code.
     *
     * @return the verify code
     */
    public List<String> getVerifyCode( ) {
		return this.verifyCode;
	}

}
