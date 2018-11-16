package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.background.interface.query response.
 *
 * @author auto create
 * @since 1.0, 2017-05-31 19:27:48
 */
public class AlipaySecurityRiskBackgroundInterfaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5654613266493282725L;

	/** 
	 * 背景详细信息：查询到的人物背景信息，包括学历信息、是否涉及诉讼、商业冲突等。
	 */
	@ApiField("detail_info")
	private String detailInfo;

    /**
     * Sets detail info.
     *
     * @param detailInfo the detail info
     */
    public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

    /**
     * Gets detail info.
     *
     * @return the detail info
     */
    public String getDetailInfo( ) {
		return this.detailInfo;
	}

}
