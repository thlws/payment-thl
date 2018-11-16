package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.activateurl.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardActivateurlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3198442996623165347L;

	/** 
	 * 会员卡领卡链接(使用时需URLDecode解码)。商户获取此链接后可投放到服务窗消息、店铺二维码等。
	 */
	@ApiField("apply_card_url")
	private String applyCardUrl;

    /**
     * Sets apply card url.
     *
     * @param applyCardUrl the apply card url
     */
    public void setApplyCardUrl(String applyCardUrl) {
		this.applyCardUrl = applyCardUrl;
	}

    /**
     * Gets apply card url.
     *
     * @return the apply card url
     */
    public String getApplyCardUrl( ) {
		return this.applyCardUrl;
	}

}
