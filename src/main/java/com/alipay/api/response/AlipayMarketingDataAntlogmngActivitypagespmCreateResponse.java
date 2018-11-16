package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.antlogmng.activitypagespm.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:07
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5639173678265911756L;

	/** 
	 * 申请是否成功
	 */
	@ApiField("issuc")
	private Boolean issuc;

	/** 
	 * 描述业务状态
	 */
	@ApiField("message")
	private String message;

    /**
     * Sets issuc.
     *
     * @param issuc the issuc
     */
    public void setIssuc(Boolean issuc) {
		this.issuc = issuc;
	}

    /**
     * Gets issuc.
     *
     * @return the issuc
     */
    public Boolean getIssuc( ) {
		return this.issuc;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage( ) {
		return this.message;
	}

}
