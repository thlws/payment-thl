package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MallCardBo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.card.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-22 11:26:57
 */
public class KoubeiShopMallCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5313558623662218546L;

	/** 
	 * 商圈发行的会员卡信息
	 */
	@ApiListField("cards")
	@ApiField("mall_card_bo")
	private List<MallCardBo> cards;

	/** 
	 * 是否开通会员系统功能
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 商圈会员开卡链接
	 */
	@ApiField("open_card_url")
	private String openCardUrl;

    /**
     * Sets cards.
     *
     * @param cards the cards
     */
    public void setCards(List<MallCardBo> cards) {
		this.cards = cards;
	}

    /**
     * Gets cards.
     *
     * @return the cards
     */
    public List<MallCardBo> getCards( ) {
		return this.cards;
	}

    /**
     * Sets open.
     *
     * @param open the open
     */
    public void setOpen(Boolean open) {
		this.open = open;
	}

    /**
     * Gets open.
     *
     * @return the open
     */
    public Boolean getOpen( ) {
		return this.open;
	}

    /**
     * Sets open card url.
     *
     * @param openCardUrl the open card url
     */
    public void setOpenCardUrl(String openCardUrl) {
		this.openCardUrl = openCardUrl;
	}

    /**
     * Gets open card url.
     *
     * @return the open card url
     */
    public String getOpenCardUrl( ) {
		return this.openCardUrl;
	}

}
