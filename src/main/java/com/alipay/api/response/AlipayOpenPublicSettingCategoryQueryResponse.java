package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.setting.category.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicSettingCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612347357533389256L;

	/** 
	 * 返回已设置的一级行业分类名称
	 */
	@ApiField("primary_category")
	private String primaryCategory;

	/** 
	 * 返回已设置的二级行业分类名称
	 */
	@ApiField("secondary_category")
	private String secondaryCategory;

    /**
     * Sets primary category.
     *
     * @param primaryCategory the primary category
     */
    public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

    /**
     * Gets primary category.
     *
     * @return the primary category
     */
    public String getPrimaryCategory( ) {
		return this.primaryCategory;
	}

    /**
     * Sets secondary category.
     *
     * @param secondaryCategory the secondary category
     */
    public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

    /**
     * Gets secondary category.
     *
     * @return the secondary category
     */
    public String getSecondaryCategory( ) {
		return this.secondaryCategory;
	}

}
