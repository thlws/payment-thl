package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.brandowner.name.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:20
 */
public class KoubeiMemberBrandownerNameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2651348615282461229L;

	/** 
	 * 品牌商名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

}
