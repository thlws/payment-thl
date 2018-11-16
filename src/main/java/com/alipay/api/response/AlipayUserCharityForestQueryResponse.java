package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forest.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 16:55:00
 */
public class AlipayUserCharityForestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8791993127228839526L;

	/** 
	 * 是否开通了蚂蚁森林
	 */
	@ApiField("forest_user")
	private Boolean forestUser;

    /**
     * Sets forest user.
     *
     * @param forestUser the forest user
     */
    public void setForestUser(Boolean forestUser) {
		this.forestUser = forestUser;
	}

    /**
     * Gets forest user.
     *
     * @return the forest user
     */
    public Boolean getForestUser( ) {
		return this.forestUser;
	}

}
