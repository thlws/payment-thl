package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.member.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-19 11:35:00
 */
public class KoubeiShopMallMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3583748829385887239L;

	/** 
	 * 会员等级
	 */
	@ApiField("card_level")
	private String cardLevel;

	/** 
	 * 会员卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/** 
	 * 会员积分
	 */
	@ApiField("card_point")
	private String cardPoint;

	/** 
	 * 用户是否开通会员卡
	 */
	@ApiField("has_card")
	private Boolean hasCard;

	/** 
	 * 用户是否授权过商圈交易
	 */
	@ApiField("trade_authed")
	private Boolean tradeAuthed;

    /**
     * Sets card level.
     *
     * @param cardLevel the card level
     */
    public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}

    /**
     * Gets card level.
     *
     * @return the card level
     */
    public String getCardLevel( ) {
		return this.cardLevel;
	}

    /**
     * Sets card name.
     *
     * @param cardName the card name
     */
    public void setCardName(String cardName) {
		this.cardName = cardName;
	}

    /**
     * Gets card name.
     *
     * @return the card name
     */
    public String getCardName( ) {
		return this.cardName;
	}

    /**
     * Sets card point.
     *
     * @param cardPoint the card point
     */
    public void setCardPoint(String cardPoint) {
		this.cardPoint = cardPoint;
	}

    /**
     * Gets card point.
     *
     * @return the card point
     */
    public String getCardPoint( ) {
		return this.cardPoint;
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

    /**
     * Sets trade authed.
     *
     * @param tradeAuthed the trade authed
     */
    public void setTradeAuthed(Boolean tradeAuthed) {
		this.tradeAuthed = tradeAuthed;
	}

    /**
     * Gets trade authed.
     *
     * @return the trade authed
     */
    public Boolean getTradeAuthed( ) {
		return this.tradeAuthed;
	}

}
