package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡域模型
 *
 * @author auto create
 * @since 1.0, 2015-09-22 11:07:41
 */
public class CardDomainVO extends AlipayObject {

	private static final long serialVersionUID = 2756745664414734289L;

	/**
	 * 值域域名的描述值，固定为”金融”
	 */
	@ApiField("description")
	private String description;

	/**
	 * 值域域名，固定为“FINANCE”
	 */
	@ApiField("domain_name")
	private String domainName;

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
     * Gets domain name.
     *
     * @return the domain name
     */
    public String getDomainName() {
		return this.domainName;
	}

    /**
     * Sets domain name.
     *
     * @param domainName the domain name
     */
    public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}
