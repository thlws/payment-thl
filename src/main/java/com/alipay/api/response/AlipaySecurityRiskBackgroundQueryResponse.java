package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.background.query response.
 *
 * @author auto create
 * @since 1.0, 2017-05-31 19:27:57
 */
public class AlipaySecurityRiskBackgroundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332284396495339921L;

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
