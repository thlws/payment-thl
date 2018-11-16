package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询产品平台产品信息接口
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:32
 */
public class AntProdpaasProductCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6113531893594199457L;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品查询维度，主要分为基础信息，条件信息和产品关联关系信息等
	 */
	@ApiField("product_options")
	private ProductVOOptions productOptions;

	/**
	 * 产品版本
	 */
	@ApiField("product_version")
	private String productVersion;

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets product options.
     *
     * @return the product options
     */
    public ProductVOOptions getProductOptions() {
		return this.productOptions;
	}

    /**
     * Sets product options.
     *
     * @param productOptions the product options
     */
    public void setProductOptions(ProductVOOptions productOptions) {
		this.productOptions = productOptions;
	}

    /**
     * Gets product version.
     *
     * @return the product version
     */
    public String getProductVersion() {
		return this.productVersion;
	}

    /**
     * Sets product version.
     *
     * @param productVersion the product version
     */
    public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
