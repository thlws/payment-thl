package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请第三方app与蚂蚁通行证免登token
 *
 * @author auto create
 * @since 1.0, 2016-10-14 16:41:55
 */
public class AlipayUserAntpaasTokenThirdTrustLoginModel extends AlipayObject {

	private static final long serialVersionUID = 2817616619436884741L;

	/**
	 * 登录的目标业务，目前已经分配的有autoins，代表车险业务
	 */
	@ApiField("login_target")
	private String loginTarget;

    /**
     * Gets login target.
     *
     * @return the login target
     */
    public String getLoginTarget() {
		return this.loginTarget;
	}

    /**
     * Sets login target.
     *
     * @param loginTarget the login target
     */
    public void setLoginTarget(String loginTarget) {
		this.loginTarget = loginTarget;
	}

}
