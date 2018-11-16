package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品基本信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProductBaseVO extends AlipayObject {

	private static final long serialVersionUID = 2524448615481977713L;

	/**
	 * 产品业务状态,产品中心目前暂时不消费该业务状态，由外围业务消费
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 是否是组合产品,默认为false,填02
	 */
	@ApiField("is_combinate")
	private String isCombinate;

	/**
	 * 产品环境类型，默认是线上
	 */
	@ApiField("prod_env")
	private String prodEnv;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品模板编码
	 */
	@ApiField("prod_template_code")
	private String prodTemplateCode;

	/**
	 * 产品模板版本
	 */
	@ApiField("prod_template_version")
	private String prodTemplateVersion;

	/**
	 * 产品类型 :01: 普通产品；02：标准产品
	 */
	@ApiField("prod_type")
	private String prodType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品管理状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 标准产品编码
	 */
	@ApiField("std_prod_code")
	private String stdProdCode;

	/**
	 * 标准产品版本
	 */
	@ApiField("std_prod_version")
	private String stdProdVersion;

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
     * Gets is combinate.
     *
     * @return the is combinate
     */
    public String getIsCombinate() {
		return this.isCombinate;
	}

    /**
     * Sets is combinate.
     *
     * @param isCombinate the is combinate
     */
    public void setIsCombinate(String isCombinate) {
		this.isCombinate = isCombinate;
	}

    /**
     * Gets prod env.
     *
     * @return the prod env
     */
    public String getProdEnv() {
		return this.prodEnv;
	}

    /**
     * Sets prod env.
     *
     * @param prodEnv the prod env
     */
    public void setProdEnv(String prodEnv) {
		this.prodEnv = prodEnv;
	}

    /**
     * Gets prod name.
     *
     * @return the prod name
     */
    public String getProdName() {
		return this.prodName;
	}

    /**
     * Sets prod name.
     *
     * @param prodName the prod name
     */
    public void setProdName(String prodName) {
		this.prodName = prodName;
	}

    /**
     * Gets prod template code.
     *
     * @return the prod template code
     */
    public String getProdTemplateCode() {
		return this.prodTemplateCode;
	}

    /**
     * Sets prod template code.
     *
     * @param prodTemplateCode the prod template code
     */
    public void setProdTemplateCode(String prodTemplateCode) {
		this.prodTemplateCode = prodTemplateCode;
	}

    /**
     * Gets prod template version.
     *
     * @return the prod template version
     */
    public String getProdTemplateVersion() {
		return this.prodTemplateVersion;
	}

    /**
     * Sets prod template version.
     *
     * @param prodTemplateVersion the prod template version
     */
    public void setProdTemplateVersion(String prodTemplateVersion) {
		this.prodTemplateVersion = prodTemplateVersion;
	}

    /**
     * Gets prod type.
     *
     * @return the prod type
     */
    public String getProdType() {
		return this.prodType;
	}

    /**
     * Sets prod type.
     *
     * @param prodType the prod type
     */
    public void setProdType(String prodType) {
		this.prodType = prodType;
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
     * Gets std prod code.
     *
     * @return the std prod code
     */
    public String getStdProdCode() {
		return this.stdProdCode;
	}

    /**
     * Sets std prod code.
     *
     * @param stdProdCode the std prod code
     */
    public void setStdProdCode(String stdProdCode) {
		this.stdProdCode = stdProdCode;
	}

    /**
     * Gets std prod version.
     *
     * @return the std prod version
     */
    public String getStdProdVersion() {
		return this.stdProdVersion;
	}

    /**
     * Sets std prod version.
     *
     * @param stdProdVersion the std prod version
     */
    public void setStdProdVersion(String stdProdVersion) {
		this.stdProdVersion = stdProdVersion;
	}

}
