package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺分类结构
 *
 * @author auto create
 * @since 1.0, 2018-07-04 21:31:07
 */
public class Category extends AlipayObject {

	private static final long serialVersionUID = 8212384185581518629L;

	/**
	 * 店铺分类ID集合
	 */
	@ApiListField("shop_cate_ids")
	@ApiField("string")
	private List<String> shopCateIds;

	/**
	 * 美食/娱乐等分类条目
	 */
	@ApiField("shop_cate_name")
	private String shopCateName;

    /**
     * Gets shop cate ids.
     *
     * @return the shop cate ids
     */
    public List<String> getShopCateIds() {
		return this.shopCateIds;
	}

    /**
     * Sets shop cate ids.
     *
     * @param shopCateIds the shop cate ids
     */
    public void setShopCateIds(List<String> shopCateIds) {
		this.shopCateIds = shopCateIds;
	}

    /**
     * Gets shop cate name.
     *
     * @return the shop cate name
     */
    public String getShopCateName() {
		return this.shopCateName;
	}

    /**
     * Sets shop cate name.
     *
     * @param shopCateName the shop cate name
     */
    public void setShopCateName(String shopCateName) {
		this.shopCateName = shopCateName;
	}

}
