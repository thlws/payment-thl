package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.category.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:55
 */
public class KoubeiRetailWmsCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4334794479685482131L;

	/** 
	 * 类目信息
	 */
	@ApiField("category")
	private CategoryVO category;

	/** 
	 * 子类目信息
	 */
	@ApiListField("sub_categories")
	@ApiField("category_v_o")
	private List<CategoryVO> subCategories;

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(CategoryVO category) {
		this.category = category;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public CategoryVO getCategory( ) {
		return this.category;
	}

    /**
     * Sets sub categories.
     *
     * @param subCategories the sub categories
     */
    public void setSubCategories(List<CategoryVO> subCategories) {
		this.subCategories = subCategories;
	}

    /**
     * Gets sub categories.
     *
     * @return the sub categories
     */
    public List<CategoryVO> getSubCategories( ) {
		return this.subCategories;
	}

}
