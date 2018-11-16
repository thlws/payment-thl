package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.create response.
 *
 * @author auto create
 * @since 1.0, 2017-12-21 11:09:50
 */
public class AlipayOverseasTravelContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2117115271554887383L;

	/** 
	 * 可选，仅当请求中的modified_date等于已落地内容的modified_date并且内容状态一致，认为幂等成功，返回Success
	 */
	@ApiField("result_msg")
	private String resultMsg;

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg( ) {
		return this.resultMsg;
	}

}
