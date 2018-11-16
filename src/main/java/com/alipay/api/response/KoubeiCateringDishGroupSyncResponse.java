package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.group.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 16:55:00
 */
public class KoubeiCateringDishGroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4755419585735388576L;

	/** 
	 * 组模型
	 */
	@ApiField("kb_dish_group")
	private KbdishGroupInfo kbDishGroup;

    /**
     * Sets kb dish group.
     *
     * @param kbDishGroup the kb dish group
     */
    public void setKbDishGroup(KbdishGroupInfo kbDishGroup) {
		this.kbDishGroup = kbDishGroup;
	}

    /**
     * Gets kb dish group.
     *
     * @return the kb dish group
     */
    public KbdishGroupInfo getKbDishGroup( ) {
		return this.kbDishGroup;
	}

}
