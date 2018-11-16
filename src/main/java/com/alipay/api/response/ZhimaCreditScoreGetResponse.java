package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.score.get response.
 *
 * @author auto create
 * @since 1.0, 2018-03-14 21:31:44
 */
public class ZhimaCreditScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7882111884835197132L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻分。分值范围[350,950]。如果用户数据不足，无法评分时，返回字符串"N/A"。
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
