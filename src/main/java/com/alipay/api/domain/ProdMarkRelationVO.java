package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品外标关系
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ProdMarkRelationVO extends AlipayObject {

	private static final long serialVersionUID = 3225516186115466462L;

	/**
	 * 产品外标编码
	 */
	@ApiField("mark_code")
	private String markCode;

	/**
	 * 产品外标类型
	 */
	@ApiField("mark_type")
	private String markType;

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
     * Gets mark code.
     *
     * @return the mark code
     */
    public String getMarkCode() {
		return this.markCode;
	}

    /**
     * Sets mark code.
     *
     * @param markCode the mark code
     */
    public void setMarkCode(String markCode) {
		this.markCode = markCode;
	}

    /**
     * Gets mark type.
     *
     * @return the mark type
     */
    public String getMarkType() {
		return this.markType;
	}

    /**
     * Sets mark type.
     *
     * @param markType the mark type
     */
    public void setMarkType(String markType) {
		this.markType = markType;
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
