package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑标准后台类目
 *
 * @author auto create
 * @since 1.0, 2017-06-06 11:40:51
 */
public class StandardCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 6273224278164725484L;

	/**
	 * 后台类目ID，类目信息的主键；商品类目ID，发布/修改商品的时候，需要填写商品所属的类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 是否为叶子类目，商品只能够发布在叶子类目下
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本类目的上一级类目ID，如果本类目是一级类目，上一级类目ID为空
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 类目路径，递归父一级类目ID的列表，依次按照一级、二级、三级...顺序排列
	 */
	@ApiField("path")
	private String path;

	/**
	 * 类目所属一级类目的ID，若本类目是一级类目，值为本类目的ID
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
     * Gets is leaf.
     *
     * @return the is leaf
     */
    public String getIsLeaf() {
		return this.isLeaf;
	}

    /**
     * Sets is leaf.
     *
     * @param isLeaf the is leaf
     */
    public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
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

    /**
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
		return this.path;
	}

    /**
     * Sets path.
     *
     * @param path the path
     */
    public void setPath(String path) {
		this.path = path;
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
