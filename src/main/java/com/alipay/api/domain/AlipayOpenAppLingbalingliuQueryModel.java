package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * yufayanzheng
 *
 * @author auto create
 * @since 1.0, 2018-08-16 12:02:08
 */
public class AlipayOpenAppLingbalingliuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2722482151611976649L;

	/**
	 * 12
	 */
	@ApiField("canshu")
	private String canshu;

    /**
     * Gets canshu.
     *
     * @return the canshu
     */
    public String getCanshu() {
		return this.canshu;
	}

    /**
     * Sets canshu.
     *
     * @param canshu the canshu
     */
    public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

}
