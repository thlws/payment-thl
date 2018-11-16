package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSpaceDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.space.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:16:53
 */
public class AlipayMarketingToolFengdieSpaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1563727479891285891L;

	/** 
	 * 空间详情信息，比如空间名称、空间管理员等信息
	 */
	@ApiField("data")
	private FengdieSpaceDetailModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieSpaceDetailModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieSpaceDetailModel getData( ) {
		return this.data;
	}

}
