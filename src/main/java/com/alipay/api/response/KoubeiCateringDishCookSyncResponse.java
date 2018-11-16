package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishCookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:44:51
 */
public class KoubeiCateringDishCookSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3199356698144269956L;

	/** 
	 * 操作后返回整个模型
	 */
	@ApiField("kb_dish_cook")
	private KbdishCookInfo kbDishCook;

    /**
     * Sets kb dish cook.
     *
     * @param kbDishCook the kb dish cook
     */
    public void setKbDishCook(KbdishCookInfo kbDishCook) {
		this.kbDishCook = kbDishCook;
	}

    /**
     * Gets kb dish cook.
     *
     * @return the kb dish cook
     */
    public KbdishCookInfo getKbDishCook( ) {
		return this.kbDishCook;
	}

}
