package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishCookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 14:15:56
 */
public class KoubeiCateringDishCookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7529821699741478928L;

	/** 
	 * 菜谱list
	 */
	@ApiListField("kb_cook_list")
	@ApiField("kbdish_cook_info")
	private List<KbdishCookInfo> kbCookList;

    /**
     * Sets kb cook list.
     *
     * @param kbCookList the kb cook list
     */
    public void setKbCookList(List<KbdishCookInfo> kbCookList) {
		this.kbCookList = kbCookList;
	}

    /**
     * Gets kb cook list.
     *
     * @return the kb cook list
     */
    public List<KbdishCookInfo> getKbCookList( ) {
		return this.kbCookList;
	}

}
