package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:05
 */
public class SupplierVO extends AlipayObject {

	private static final long serialVersionUID = 3795188494315393742L;

	/**
	 * 生效状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 快餐
	 */
	@ApiField("business_desc")
	private String businessDesc;

	/**
	 * 供应商附加信息，LICENSE_NO:许可证号,LICENSE_DATE:营业执照有效期,PAYMENT_DAYS:账期
	 */
	@ApiField("certificate_desc")
	private String certificateDesc;

	/**
	 * 供货商简码
	 */
	@ApiField("short_code")
	private String shortCode;

	/**
	 * 供货商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 张三
	 */
	@ApiField("supplier_name")
	private String supplierName;

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
     * Gets business desc.
     *
     * @return the business desc
     */
    public String getBusinessDesc() {
		return this.businessDesc;
	}

    /**
     * Sets business desc.
     *
     * @param businessDesc the business desc
     */
    public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

    /**
     * Gets certificate desc.
     *
     * @return the certificate desc
     */
    public String getCertificateDesc() {
		return this.certificateDesc;
	}

    /**
     * Sets certificate desc.
     *
     * @param certificateDesc the certificate desc
     */
    public void setCertificateDesc(String certificateDesc) {
		this.certificateDesc = certificateDesc;
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

    /**
     * Gets supplier id.
     *
     * @return the supplier id
     */
    public String getSupplierId() {
		return this.supplierId;
	}

    /**
     * Sets supplier id.
     *
     * @param supplierId the supplier id
     */
    public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

    /**
     * Gets supplier name.
     *
     * @return the supplier name
     */
    public String getSupplierName() {
		return this.supplierName;
	}

    /**
     * Sets supplier name.
     *
     * @param supplierName the supplier name
     */
    public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
