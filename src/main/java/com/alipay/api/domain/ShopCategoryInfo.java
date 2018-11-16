package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店类目信息
 *
 * @author auto create
 * @since 1.0, 2017-02-15 10:04:25
 */
public class ShopCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 2493597369196467579L;

	/**
	 * 类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目层级,目前最多支持1、2、3三级
	 */
	@ApiField("category_level")
	private String categoryLevel;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    /**
     * Gets category level.
     *
     * @return the category level
     */
    public String getCategoryLevel() {
		return this.categoryLevel;
	}

    /**
     * Sets category level.
     *
     * @param categoryLevel the category level
     */
    public void setCategoryLevel(String categoryLevel) {
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
