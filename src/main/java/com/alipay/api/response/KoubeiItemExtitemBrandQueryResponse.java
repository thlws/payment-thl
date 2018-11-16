package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtBrand;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.brand.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:03
 */
public class KoubeiItemExtitemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2291153823147787113L;

	/** 
	 * 品牌列表信息
	 */
	@ApiListField("brand_list")
	@ApiField("ext_brand")
	private List<ExtBrand> brandList;

    /**
     * Sets brand list.
     *
     * @param brandList the brand list
     */
    public void setBrandList(List<ExtBrand> brandList) {
		this.brandList = brandList;
	}

    /**
     * Gets brand list.
     *
     * @return the brand list
     */
    public List<ExtBrand> getBrandList( ) {
		return this.brandList;
	}

}
