package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户档案信息
 *
 * @author auto create
 * @since 1.0, 2018-05-08 11:28:59
 */
public class PartnerVO extends AlipayObject {

	private static final long serialVersionUID = 4718226516689113273L;

	/**
	 * 生效状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 商户简码
	 */
	@ApiField("short_code")
	private String shortCode;

    /**
     * Gets biz status.
     *
     * @return the biz status
     */
    public String getBizStatus() {
		return this.bizStatus;
	}

    /**
     * Sets biz status.
     *
     * @param bizStatus the biz status
     */
    public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets partner name.
     *
     * @return the partner name
     */
    public String getPartnerName() {
		return this.partnerName;
	}

    /**
     * Sets partner name.
     *
     * @param partnerName the partner name
     */
    public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

    /**
     * Gets short code.
     *
     * @return the short code
     */
    public String getShortCode() {
		return this.shortCode;
	}

    /**
     * Sets short code.
     *
     * @param shortCode the short code
     */
    public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

}
