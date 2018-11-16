package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类分级信息
 *
 * @author auto create
 * @since 1.0, 2017-09-25 12:16:20
 */
public class CategoryLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 5274281696674145128L;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 品类级别
	 */
	@ApiField("category_level")
	private Long categoryLevel;

	/**
	 * 品类名称
	 */
	@ApiField("category_name")
	private String categoryName;

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode() {
		return this.categoryCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets category level.
     *
     * @return the category level
     */
    public Long getCategoryLevel() {
		return this.categoryLevel;
	}

    /**
     * Sets category level.
     *
     * @param categoryLevel the category level
     */
    public void setCategoryLevel(Long categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

    /**
     * Gets category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
		return this.categoryName;
	}

    /**
     * Sets category name.
     *
     * @param categoryName the category name
     */
    public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
