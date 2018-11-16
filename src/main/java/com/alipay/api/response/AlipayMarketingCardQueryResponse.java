package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8353284282187642464L;

	/** 
	 * 商户卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/** 
	 * 商户会员卡页面跳转到支付宝卡券详情页面的schema地址
	 */
	@ApiField("schema_url")
	private String schemaUrl;

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

    /**
     * Sets schema url.
     *
     * @param schemaUrl the schema url
     */
    public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}

    /**
     * Gets schema url.
     *
     * @return the schema url
     */
    public String getSchemaUrl( ) {
		return this.schemaUrl;
	}

}
