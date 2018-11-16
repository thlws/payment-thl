package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSpaceMemberCreateModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.member.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:16:09
 */
public class AlipayMarketingToolFengdieMemberCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576837418633456375L;

	/** 
	 * 凤蝶业务空间创建成功后，返回该成员的基本信息
	 */
	@ApiField("data")
	private FengdieSpaceMemberCreateModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieSpaceMemberCreateModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieSpaceMemberCreateModel getData( ) {
		return this.data;
	}

}
