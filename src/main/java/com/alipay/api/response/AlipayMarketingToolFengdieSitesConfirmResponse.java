package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSuccessRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:01
 */
public class AlipayMarketingToolFengdieSitesConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2819622917998223395L;

	/** 
	 * 返回执行云凤蝶站点审核操作的成功失败状态
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
