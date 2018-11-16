package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StandardCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.category.children.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:25:00
 */
public class KoubeiItemCategoryChildrenBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351516885439458151L;

	/** 
	 * 口碑标准后台类目信息列表
	 */
	@ApiListField("category_list")
	@ApiField("standard_category_info")
	private List<StandardCategoryInfo> categoryList;

    /**
     * Sets category list.
     *
     * @param categoryList the category list
     */
    public void setCategoryList(List<StandardCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}

    /**
     * Gets category list.
     *
     * @return the category list
     */
    public List<StandardCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
