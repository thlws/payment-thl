package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店类目配置信息
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:47:06
 */
public class ShopCategoryConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 2474797481711876652L;

	/**
	 * 类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否是叶子节点
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 类目层级路径
	 */
	@ApiField("link")
	private String link;

	/**
	 * 类目名称
	 */
	@ApiField("nm")
	private String nm;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
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
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
		return this.link;
	}

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
		this.link = link;
	}

    /**
     * Gets nm.
     *
     * @return the nm
     */
    public String getNm() {
		return this.nm;
	}

    /**
     * Sets nm.
     *
     * @param nm the nm
     */
    public void setNm(String nm) {
		this.nm = nm;
	}

}
