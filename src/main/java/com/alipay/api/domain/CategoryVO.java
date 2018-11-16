package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目信息
 *
 * @author auto create
 * @since 1.0, 2018-04-25 11:00:54
 */
public class CategoryVO extends AlipayObject {

	private static final long serialVersionUID = 3752459848985317554L;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 1表示有效，0表示无效
	 */
	@ApiField("enable")
	private Long enable;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 父类目ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 根类目ID
	 */
	@ApiField("root_id")
	private String rootId;

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

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets enable.
     *
     * @return the enable
     */
    public Long getEnable() {
		return this.enable;
	}

    /**
     * Sets enable.
     *
     * @param enable the enable
     */
    public void setEnable(Long enable) {
		this.enable = enable;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
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

    /**
     * Gets root id.
     *
     * @return the root id
     */
    public String getRootId() {
		return this.rootId;
	}

    /**
     * Sets root id.
     *
     * @param rootId the root id
     */
    public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
