package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贴子发布接口职位供应商信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:20
 */
public class EduSourceInfo extends AlipayObject {

	private static final long serialVersionUID = 4794993744416385456L;

	/**
	 * 供应商的LOGO
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 供应商电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 供应商名字
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}
