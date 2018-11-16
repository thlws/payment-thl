package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.category.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:47:52
 */
public class KoubeiItemExtitemCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6824113953911745446L;

	/** 
	 * 品类信息列表
	 */
	@ApiListField("category_list")
	@ApiField("ext_category")
	private List<ExtCategory> categoryList;

    /**
     * Sets category list.
     *
     * @param categoryList the category list
     */
    public void setCategoryList(List<ExtCategory> categoryList) {
		this.categoryList = categoryList;
	}

    /**
     * Gets category list.
     *
     * @return the category list
     */
    public List<ExtCategory> getCategoryList( ) {
		return this.categoryList;
	}

}
