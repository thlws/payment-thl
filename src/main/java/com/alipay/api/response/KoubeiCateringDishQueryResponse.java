package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:52:11
 */
public class KoubeiCateringDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8667622326696823632L;

	/** 
	 * 口碑菜品模型列表
	 */
	@ApiListField("kb_dish_info_list")
	@ApiField("kbdish_info")
	private List<KbdishInfo> kbDishInfoList;

    /**
     * Sets kb dish info list.
     *
     * @param kbDishInfoList the kb dish info list
     */
    public void setKbDishInfoList(List<KbdishInfo> kbDishInfoList) {
		this.kbDishInfoList = kbDishInfoList;
	}

    /**
     * Gets kb dish info list.
     *
     * @return the kb dish info list
     */
    public List<KbdishInfo> getKbDishInfoList( ) {
		return this.kbDishInfoList;
	}

}
