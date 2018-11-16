package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.material.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-09-05 19:48:21
 */
public class KoubeiCateringDishMaterialDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2453521297319982375L;

	/** 
	 * 菜品加料通用模型返回
	 */
	@ApiField("kb_dish_material_info")
	private KbdishMaterialInfo kbDishMaterialInfo;

    /**
     * Sets kb dish material info.
     *
     * @param kbDishMaterialInfo the kb dish material info
     */
    public void setKbDishMaterialInfo(KbdishMaterialInfo kbDishMaterialInfo) {
		this.kbDishMaterialInfo = kbDishMaterialInfo;
	}

    /**
     * Gets kb dish material info.
     *
     * @return the kb dish material info
     */
    public KbdishMaterialInfo getKbDishMaterialInfo( ) {
		return this.kbDishMaterialInfo;
	}

}
