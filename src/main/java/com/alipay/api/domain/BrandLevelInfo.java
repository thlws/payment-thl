package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌分级信息
 *
 * @author auto create
 * @since 1.0, 2017-09-25 12:16:26
 */
public class BrandLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 5763198132432448976L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 当前品牌所属级别
	 */
	@ApiField("brand_level")
	private Long brandLevel;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

    /**
     * Gets brand code.
     *
     * @return the brand code
     */
    public String getBrandCode() {
		return this.brandCode;
	}

    /**
     * Sets brand code.
     *
     * @param brandCode the brand code
     */
    public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

    /**
     * Gets brand level.
     *
     * @return the brand level
     */
    public Long getBrandLevel() {
		return this.brandLevel;
	}

    /**
     * Sets brand level.
     *
     * @param brandLevel the brand level
     */
    public void setBrandLevel(Long brandLevel) {
		this.brandLevel = brandLevel;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
