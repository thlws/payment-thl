package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:17
 */
public class AlipaySocialBaseChatGmemberDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7264639319353465345L;

	/** 
	 * 删除结果
	 */
	@ApiField("result_delete")
	private Boolean resultDelete;

    /**
     * Sets result delete.
     *
     * @param resultDelete the result delete
     */
    public void setResultDelete(Boolean resultDelete) {
		this.resultDelete = resultDelete;
	}

    /**
     * Gets result delete.
     *
     * @return the result delete
     */
    public Boolean getResultDelete( ) {
		return this.resultDelete;
	}

}
