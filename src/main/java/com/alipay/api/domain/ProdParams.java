package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约产品属性
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:07
 */
public class ProdParams extends AlipayObject {

	private static final long serialVersionUID = 4161954437391268266L;

	/**
	 * 预授权业务信息
	 */
	@ApiField("auth_biz_params")
	private String authBizParams;

    /**
     * Gets auth biz params.
     *
     * @return the auth biz params
     */
    public String getAuthBizParams() {
		return this.authBizParams;
	}

    /**
     * Sets auth biz params.
     *
     * @param authBizParams the auth biz params
     */
    public void setAuthBizParams(String authBizParams) {
		this.authBizParams = authBizParams;
	}

}
