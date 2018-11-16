package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbExtItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-27 17:56:42
 */
public class KoubeiItemExtitemInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3411399986857711754L;

	/** 
	 * 外部商品信息
	 */
	@ApiField("kb_ext_item_info")
	private KbExtItemInfo kbExtItemInfo;

    /**
     * Sets kb ext item info.
     *
     * @param kbExtItemInfo the kb ext item info
     */
    public void setKbExtItemInfo(KbExtItemInfo kbExtItemInfo) {
		this.kbExtItemInfo = kbExtItemInfo;
	}

    /**
     * Gets kb ext item info.
     *
     * @return the kb ext item info
     */
    public KbExtItemInfo getKbExtItemInfo( ) {
		return this.kbExtItemInfo;
	}

}
