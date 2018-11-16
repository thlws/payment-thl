package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.score.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditEpScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8778138679197551621L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业评分的打分时间，格式为yyyyMMdd
	 */
	@ApiField("eval_date")
	private String evalDate;

	/** 
	 * 该企业无企业信用评分的原因。枚举值： STATUS_UNNORMAL（企业状态异常）；NOT_JURIDICAL_ENTITY（非法人实体）；USER_CLOSED（用户已经关闭）；CAN_NOT_GET_INFO（无法查询到信息）
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 被查询企业的芝麻信用评分，分值在[1000,2000]之间。如果无分则返回N/A。
	 */
	@ApiField("zm_score")
	private String zmScore;

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
     * Sets eval date.
     *
     * @param evalDate the eval date
     */
    public void setEvalDate(String evalDate) {
		this.evalDate = evalDate;
	}

    /**
     * Gets eval date.
     *
     * @return the eval date
     */
    public String getEvalDate( ) {
		return this.evalDate;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason( ) {
		return this.reason;
	}

    /**
     * Sets zm score.
     *
     * @param zmScore the zm score
     */
    public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}

    /**
     * Gets zm score.
     *
     * @return the zm score
     */
    public String getZmScore( ) {
		return this.zmScore;
	}

}
