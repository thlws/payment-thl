package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gname.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:05
 */
public class AlipaySocialBaseChatGnameModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1778135991336716695L;

	/** 
	 * 修改结果
	 */
	@ApiField("result_modify")
	private Boolean resultModify;

    /**
     * Sets result modify.
     *
     * @param resultModify the result modify
     */
    public void setResultModify(Boolean resultModify) {
		this.resultModify = resultModify;
	}

    /**
     * Gets result modify.
     *
     * @return the result modify
     */
    public Boolean getResultModify( ) {
		return this.resultModify;
	}

}
