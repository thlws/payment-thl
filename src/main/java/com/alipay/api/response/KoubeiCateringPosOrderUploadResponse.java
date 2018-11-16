package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.order.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-05-13 11:25:00
 */
public class KoubeiCateringPosOrderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3352344111991279318L;

	/** 
	 * 生成序列号标记每次上传
	 */
	@ApiField("flow_id")
	private String flowId;

    /**
     * Sets flow id.
     *
     * @param flowId the flow id
     */
    public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

    /**
     * Gets flow id.
     *
     * @return the flow id
     */
    public String getFlowId( ) {
		return this.flowId;
	}

}
