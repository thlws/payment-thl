package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ceshi moxing
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:05:41
 */
public class AlipayKeyanClass extends AlipayObject {

	private static final long serialVersionUID = 4786132611763762645L;

	/**
	 * 1
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}
