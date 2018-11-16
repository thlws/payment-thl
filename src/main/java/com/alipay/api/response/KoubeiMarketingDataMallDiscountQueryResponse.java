package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardInfo;
import com.alipay.api.domain.CodeCouponInfo;
import com.alipay.api.domain.ConsumeInfo;
import com.alipay.api.domain.ReduceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.discount.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:20
 */
public class KoubeiMarketingDataMallDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7462794967312895626L;

	/** 
	 * 集卡信息列表（最多50条）
	 */
	@ApiListField("card_list")
	@ApiField("card_info")
	private List<CardInfo> cardList;

	/** 
	 * 口令信息列表（最多50条）
	 */
	@ApiListField("code_coupon_list")
	@ApiField("code_coupon_info")
	private List<CodeCouponInfo> codeCouponList;

	/** 
	 * 消费送信息列表（最多50条）
	 */
	@ApiListField("consume_list")
	@ApiField("consume_info")
	private List<ConsumeInfo> consumeList;

	/** 
	 * 订单优惠信息列表（最多50条）
	 */
	@ApiListField("reduce_list")
	@ApiField("reduce_info")
	private List<ReduceInfo> reduceList;

    /**
     * Sets card list.
     *
     * @param cardList the card list
     */
    public void setCardList(List<CardInfo> cardList) {
		this.cardList = cardList;
	}

    /**
     * Gets card list.
     *
     * @return the card list
     */
    public List<CardInfo> getCardList( ) {
		return this.cardList;
	}

    /**
     * Sets code coupon list.
     *
     * @param codeCouponList the code coupon list
     */
    public void setCodeCouponList(List<CodeCouponInfo> codeCouponList) {
		this.codeCouponList = codeCouponList;
	}

    /**
     * Gets code coupon list.
     *
     * @return the code coupon list
     */
    public List<CodeCouponInfo> getCodeCouponList( ) {
		return this.codeCouponList;
	}

    /**
     * Sets consume list.
     *
     * @param consumeList the consume list
     */
    public void setConsumeList(List<ConsumeInfo> consumeList) {
		this.consumeList = consumeList;
	}

    /**
     * Gets consume list.
     *
     * @return the consume list
     */
    public List<ConsumeInfo> getConsumeList( ) {
		return this.consumeList;
	}

    /**
     * Sets reduce list.
     *
     * @param reduceList the reduce list
     */
    public void setReduceList(List<ReduceInfo> reduceList) {
		this.reduceList = reduceList;
	}

    /**
     * Gets reduce list.
     *
     * @return the reduce list
     */
    public List<ReduceInfo> getReduceList( ) {
		return this.reduceList;
	}

}
