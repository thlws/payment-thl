package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.prodarrangement.contracttext.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-23 18:58:45
 */
public class MybankCreditProdarrangementContracttextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2369916518398754828L;

	/** 
	 * 合同内容
	 */
	@ApiField("text")
	private String text;

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText( ) {
		return this.text;
	}

}
