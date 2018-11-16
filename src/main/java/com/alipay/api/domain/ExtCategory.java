package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ExtCategory extends AlipayObject {

	private static final long serialVersionUID = 4654659822221564944L;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 品类名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父品类编码。顶级类目此值为0
	 */
	@ApiField("parent_id")
	private String parentId;

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets parent id.
     *
     * @return the parent id
     */
    public String getParentId() {
		return this.parentId;
	}

    /**
     * Sets parent id.
     *
     * @param parentId the parent id
     */
    public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
