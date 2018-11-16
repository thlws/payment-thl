package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品间关系
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProdRelationVO extends AlipayObject {

	private static final long serialVersionUID = 3873419464199291668L;

	/**
	 * 数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 数量类型
	 */
	@ApiField("num_type")
	private String numType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 关联的产品编码
	 */
	@ApiField("prod_rel_code")
	private String prodRelCode;

	/**
	 * 关联的产品名称
	 */
	@ApiField("prod_rel_name")
	private String prodRelName;

	/**
	 * 产品关联类型
	 */
	@ApiField("prod_rel_type")
	private String prodRelType;

	/**
	 * 关联的产品版本
	 */
	@ApiField("prod_rel_version")
	private String prodRelVersion;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品关联子类型
	 */
	@ApiField("sub_prod_rel_type")
	private String subProdRelType;

    /**
     * Gets num.
     *
     * @return the num
     */
    public Long getNum() {
		return this.num;
	}

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(Long num) {
		this.num = num;
	}

    /**
     * Gets num type.
     *
     * @return the num type
     */
    public String getNumType() {
		return this.numType;
	}

    /**
     * Sets num type.
     *
     * @param numType the num type
     */
    public void setNumType(String numType) {
		this.numType = numType;
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
     * Gets prod rel code.
     *
     * @return the prod rel code
     */
    public String getProdRelCode() {
		return this.prodRelCode;
	}

    /**
     * Sets prod rel code.
     *
     * @param prodRelCode the prod rel code
     */
    public void setProdRelCode(String prodRelCode) {
		this.prodRelCode = prodRelCode;
	}

    /**
     * Gets prod rel name.
     *
     * @return the prod rel name
     */
    public String getProdRelName() {
		return this.prodRelName;
	}

    /**
     * Sets prod rel name.
     *
     * @param prodRelName the prod rel name
     */
    public void setProdRelName(String prodRelName) {
		this.prodRelName = prodRelName;
	}

    /**
     * Gets prod rel type.
     *
     * @return the prod rel type
     */
    public String getProdRelType() {
		return this.prodRelType;
	}

    /**
     * Sets prod rel type.
     *
     * @param prodRelType the prod rel type
     */
    public void setProdRelType(String prodRelType) {
		this.prodRelType = prodRelType;
	}

    /**
     * Gets prod rel version.
     *
     * @return the prod rel version
     */
    public String getProdRelVersion() {
		return this.prodRelVersion;
	}

    /**
     * Sets prod rel version.
     *
     * @param prodRelVersion the prod rel version
     */
    public void setProdRelVersion(String prodRelVersion) {
		this.prodRelVersion = prodRelVersion;
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

    /**
     * Gets sub prod rel type.
     *
     * @return the sub prod rel type
     */
    public String getSubProdRelType() {
		return this.subProdRelType;
	}

    /**
     * Sets sub prod rel type.
     *
     * @param subProdRelType the sub prod rel type
     */
    public void setSubProdRelType(String subProdRelType) {
		this.subProdRelType = subProdRelType;
	}

}
