package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.shop.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:42:55
 */
public class KoubeiMerchantOperatorShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4856592861494741325L;

	/** 
	 * 操作员关联的门店模型列表
	 */
	@ApiListField("city_shop_models")
	@ApiField("city_shop_model")
	private List<CityShopModel> cityShopModels;

    /**
     * Sets city shop models.
     *
     * @param cityShopModels the city shop models
     */
    public void setCityShopModels(List<CityShopModel> cityShopModels) {
		this.cityShopModels = cityShopModels;
	}

    /**
     * Gets city shop models.
     *
     * @return the city shop models
     */
    public List<CityShopModel> getCityShopModels( ) {
		return this.cityShopModels;
	}

}
