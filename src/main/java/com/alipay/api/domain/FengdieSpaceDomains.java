package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶空间域名信息
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:01:04
 */
public class FengdieSpaceDomains extends AlipayObject {

	private static final long serialVersionUID = 3822454479975632785L;

	/**
	 * 发布的域名，在云凤蝶上创建的站点发布时采用的 url 域名
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 是否是当前云凤蝶空间的默认发布域名，Y 则表示该空间下的站点默认以此域名生成站点url
	 */
	@ApiField("is_default")
	private String isDefault;

	/**
	 * 当前域名状态，是否可用，值为 OPEN 或 DISCARDED
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets domain.
     *
     * @return the domain
     */
    public String getDomain() {
		return this.domain;
	}

    /**
     * Sets domain.
     *
     * @param domain the domain
     */
    public void setDomain(String domain) {
		this.domain = domain;
	}

    /**
     * Gets is default.
     *
     * @return the is default
     */
    public String getIsDefault() {
		return this.isDefault;
	}

    /**
     * Sets is default.
     *
     * @param isDefault the is default
     */
    public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
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

}
