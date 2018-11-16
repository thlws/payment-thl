package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.area.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:50:00
 */
public class KoubeiCateringDishAreaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3627759269633354838L;

	/** 
	 * 返回餐区大模型列表
	 */
	@ApiListField("kb_dish_area_list")
	@ApiField("kbdish_area_info")
	private List<KbdishAreaInfo> kbDishAreaList;

    /**
     * Sets kb dish area list.
     *
     * @param kbDishAreaList the kb dish area list
     */
    public void setKbDishAreaList(List<KbdishAreaInfo> kbDishAreaList) {
		this.kbDishAreaList = kbDishAreaList;
	}

    /**
     * Gets kb dish area list.
     *
     * @return the kb dish area list
     */
    public List<KbdishAreaInfo> getKbDishAreaList( ) {
		return this.kbDishAreaList;
	}

}
