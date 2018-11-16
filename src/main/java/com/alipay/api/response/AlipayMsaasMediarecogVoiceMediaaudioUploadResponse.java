package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.voice.mediaaudio.upload response.
 *
 * @author auto create
 * @since 1.0, 2016-05-28 22:41:09
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825453233441691256L;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/** 
	 * 结果memo
	 */
	@ApiField("result_memo")
	private String resultMemo;

	/** 
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

    /**
     * Sets extinfo a.
     *
     * @param extinfoA the extinfo a
     */
    public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}

    /**
     * Gets extinfo a.
     *
     * @return the extinfo a
     */
    public String getExtinfoA( ) {
		return this.extinfoA;
	}

    /**
     * Sets extinfo b.
     *
     * @param extinfoB the extinfo b
     */
    public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}

    /**
     * Gets extinfo b.
     *
     * @return the extinfo b
     */
    public String getExtinfoB( ) {
		return this.extinfoB;
	}

    /**
     * Sets result memo.
     *
     * @param resultMemo the result memo
     */
    public void setResultMemo(String resultMemo) {
		this.resultMemo = resultMemo;
	}

    /**
     * Gets result memo.
     *
     * @return the result memo
     */
    public String getResultMemo( ) {
		return this.resultMemo;
	}

    /**
     * Sets result status.
     *
     * @param resultStatus the result status
     */
    public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

    /**
     * Gets result status.
     *
     * @return the result status
     */
    public String getResultStatus( ) {
		return this.resultStatus;
	}

}
