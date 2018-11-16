package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Category;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.shop.category.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-04 21:35:00
 */
public class KoubeiMarketingDataShopCategoryGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4742589711822199435L;

	/** 
	 * 指定数量的店铺分类信息
	 */
	@ApiListField("category_list")
	@ApiField("category")
	private List<Category> categoryList;

	/** 
	 * 剩余的店铺分类
	 */
	@ApiField("other")
	private Category other;

    /**
     * Sets category list.
     *
     * @param categoryList the category list
     */
    public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

    /**
     * Gets category list.
     *
     * @return the category list
     */
    public List<Category> getCategoryList( ) {
		return this.categoryList;
	}

    /**
     * Sets other.
     *
     * @param other the other
     */
    public void setOther(Category other) {
		this.other = other;
	}

    /**
     * Gets other.
     *
     * @return the other
     */
    public Category getOther( ) {
		return this.other;
	}

}
