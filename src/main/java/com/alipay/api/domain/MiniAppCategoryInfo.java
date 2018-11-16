package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目模型
 *
 * @author auto create
 * @since 1.0, 2017-12-20 10:42:45
 */
public class MiniAppCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 2686531136132376356L;

	/**
	 * 一级类目id
	 */
	@ApiField("first_category_id")
	private String firstCategoryId;

	/**
	 * 一级类目名称
	 */
	@ApiField("first_category_name")
	private String firstCategoryName;

	/**
	 * 二级类目id
	 */
	@ApiField("second_category_id")
	private String secondCategoryId;

	/**
	 * 二级类目名称
	 */
	@ApiField("second_category_name")
	private String secondCategoryName;

    /**
     * Gets first category id.
     *
     * @return the first category id
     */
    public String getFirstCategoryId() {
		return this.firstCategoryId;
	}

    /**
     * Sets first category id.
     *
     * @param firstCategoryId the first category id
     */
    public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}

    /**
     * Gets first category name.
     *
     * @return the first category name
     */
    public String getFirstCategoryName() {
		return this.firstCategoryName;
	}

    /**
     * Sets first category name.
     *
     * @param firstCategoryName the first category name
     */
    public void setFirstCategoryName(String firstCategoryName) {
		this.firstCategoryName = firstCategoryName;
	}

    /**
     * Gets second category id.
     *
     * @return the second category id
     */
    public String getSecondCategoryId() {
		return this.secondCategoryId;
	}

    /**
     * Sets second category id.
     *
     * @param secondCategoryId the second category id
     */
    public void setSecondCategoryId(String secondCategoryId) {
		this.secondCategoryId = secondCategoryId;
	}

    /**
     * Gets second category name.
     *
     * @return the second category name
     */
    public String getSecondCategoryName() {
		return this.secondCategoryName;
	}

    /**
     * Sets second category name.
     *
     * @param secondCategoryName the second category name
     */
    public void setSecondCategoryName(String secondCategoryName) {
		this.secondCategoryName = secondCategoryName;
	}

}
