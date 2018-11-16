package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益详情
 *
 * @author auto create
 * @since 1.0, 2017-12-26 14:06:28
 */
public class EquityInfo extends AlipayObject {

	private static final long serialVersionUID = 8158892399831563662L;

	/**
	 * ‘杰克琼斯’
	 */
	@ApiField("description")
	private String description;

	/**
	 * ext_info
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 天猫优惠券
	 */
	@ApiField("name")
	private String name;

	/**
	 * APPLIED：已申领；UNAPPLIED：未申领；DELETED：已过期
	 */
	@ApiField("status")
	private String status;

	/**
	 * url
	 */
	@ApiField("url")
	private String url;

	/**
	 * 优惠价值
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
