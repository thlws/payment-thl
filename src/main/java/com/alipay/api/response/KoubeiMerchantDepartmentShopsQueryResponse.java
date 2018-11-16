package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.shops.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-23 15:01:42
 */
public class KoubeiMerchantDepartmentShopsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5268355232786193371L;

	/** 
	 * 根据部门id查询返回的门店模型列表
	 */
	@ApiListField("city_shop_models")
	@ApiField("city_shop_model")
	private List<CityShopModel> cityShopModels;

	/** 
	 * 部门id
	 */
	@ApiField("dept_id")
	private String deptId;

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

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId( ) {
		return this.deptId;
	}

}
