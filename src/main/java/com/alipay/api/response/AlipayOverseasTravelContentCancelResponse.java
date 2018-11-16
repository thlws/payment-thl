package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.cancel response.
 *
 * @author auto create
 * @since 1.0, 2017-12-21 11:13:23
 */
public class AlipayOverseasTravelContentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664958149485321164L;

	/** 
	 * 结果描述，仅当撤回已处于撤回状态的内容，且请求中的modified_date等于已落地内容的modified_date，认为幂等成功，返回Success
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
