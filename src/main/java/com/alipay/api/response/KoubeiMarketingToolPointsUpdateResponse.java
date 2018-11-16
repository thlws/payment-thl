package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2836964373297499396L;

	/** 
	 * 集点变更流水号
	 */
	@ApiField("point_log_no")
	private String pointLogNo;

    /**
     * Sets point log no.
     *
     * @param pointLogNo the point log no
     */
    public void setPointLogNo(String pointLogNo) {
		this.pointLogNo = pointLogNo;
	}

    /**
     * Gets point log no.
     *
     * @return the point log no
     */
    public String getPointLogNo( ) {
		return this.pointLogNo;
	}

}
