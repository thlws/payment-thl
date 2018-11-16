package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务基础信息
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class CommodityBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 3131623427851258245L;

	/**
	 * 服务logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务地址
	 */
	@ApiField("service_url")
	private String serviceUrl;

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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
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

    /**
     * Gets service url.
     *
     * @return the service url
     */
    public String getServiceUrl() {
		return this.serviceUrl;
	}

    /**
     * Sets service url.
     *
     * @param serviceUrl the service url
     */
    public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
