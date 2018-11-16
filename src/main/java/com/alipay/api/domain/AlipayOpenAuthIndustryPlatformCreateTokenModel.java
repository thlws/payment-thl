package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台获取授权码
 *
 * @author auto create
 * @since 1.0, 2018-02-09 11:39:27
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenModel extends AlipayObject {

	private static final long serialVersionUID = 7299593626394822512L;

	/**
	 * isv的appid
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * auth_mycar_violation
	 */
	@ApiField("scope")
	private String scope;

    /**
     * Gets isv appid.
     *
     * @return the isv appid
     */
    public String getIsvAppid() {
		return this.isvAppid;
	}

    /**
     * Sets isv appid.
     *
     * @param isvAppid the isv appid
     */
    public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

    /**
     * Gets scope.
     *
     * @return the scope
     */
    public String getScope() {
		return this.scope;
	}

    /**
     * Sets scope.
     *
     * @param scope the scope
     */
    public void setScope(String scope) {
		this.scope = scope;
	}

}
