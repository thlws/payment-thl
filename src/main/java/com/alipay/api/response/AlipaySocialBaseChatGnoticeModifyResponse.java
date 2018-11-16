package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gnotice.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:55
 */
public class AlipaySocialBaseChatGnoticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4834484456646556131L;

	/** 
	 * 修改结果
	 */
	@ApiField("result_modify")
	private String resultModify;

    /**
     * Sets result modify.
     *
     * @param resultModify the result modify
     */
    public void setResultModify(String resultModify) {
		this.resultModify = resultModify;
	}

    /**
     * Gets result modify.
     *
     * @return the result modify
     */
    public String getResultModify( ) {
		return this.resultModify;
	}

}
