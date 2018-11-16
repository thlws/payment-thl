package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品区域关联信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProdLORelationVO extends AlipayObject {

	private static final long serialVersionUID = 8693285315558724476L;

	/**
	 * 区域编码
	 */
	@ApiField("lo_code")
	private String loCode;

	/**
	 * 区域类型
	 */
	@ApiField("lo_type")
	private String loType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

    /**
     * Gets lo code.
     *
     * @return the lo code
     */
    public String getLoCode() {
		return this.loCode;
	}

    /**
     * Sets lo code.
     *
     * @param loCode the lo code
     */
    public void setLoCode(String loCode) {
		this.loCode = loCode;
	}

    /**
     * Gets lo type.
     *
     * @return the lo type
     */
    public String getLoType() {
		return this.loType;
	}

    /**
     * Sets lo type.
     *
     * @param loType the lo type
     */
    public void setLoType(String loType) {
		this.loType = loType;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod version.
     *
     * @return the prod version
     */
    public String getProdVersion() {
		return this.prodVersion;
	}

    /**
     * Sets prod version.
     *
     * @param prodVersion the prod version
     */
    public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

}
