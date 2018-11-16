package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.open.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-06-13 19:07:11
 */
public class AlipayMarketingCardOpenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2614331625921233836L;

	/** 
	 * 商户卡信息（包括支付宝分配的业务卡号）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

    /**
     * Sets card info.
     *
     * @param cardInfo the card info
     */
    public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

    /**
     * Gets card info.
     *
     * @return the card info
     */
    public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

}
