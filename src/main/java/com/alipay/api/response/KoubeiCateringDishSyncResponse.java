package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-09-07 13:20:00
 */
public class KoubeiCateringDishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5542168215976457329L;

	/** 
	 * 返回的菜品模型
	 */
	@ApiField("kb_dish_info")
	private KbdishInfo kbDishInfo;

    /**
     * Sets kb dish info.
     *
     * @param kbDishInfo the kb dish info
     */
    public void setKbDishInfo(KbdishInfo kbDishInfo) {
		this.kbDishInfo = kbDishInfo;
	}

    /**
     * Gets kb dish info.
     *
     * @return the kb dish info
     */
    public KbdishInfo getKbDishInfo( ) {
		return this.kbDishInfo;
	}

}
