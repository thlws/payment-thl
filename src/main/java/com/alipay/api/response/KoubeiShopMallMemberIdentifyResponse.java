package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.member.identify response.
 *
 * @author auto create
 * @since 1.0, 2018-06-19 15:55:00
 */
public class KoubeiShopMallMemberIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8537779383368972947L;

	/** 
	 * 会员卡编号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 用户是否开通会员卡
	 */
	@ApiField("has_card")
	private Boolean hasCard;

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo( ) {
		return this.cardNo;
	}

    /**
     * Sets has card.
     *
     * @param hasCard the has card
     */
    public void setHasCard(Boolean hasCard) {
		this.hasCard = hasCard;
	}

    /**
     * Gets has card.
     *
     * @return the has card
     */
    public Boolean getHasCard( ) {
		return this.hasCard;
	}

}
