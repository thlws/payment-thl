package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountInfo;
import com.alipay.api.domain.KbAdvertIdentifyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:38
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6467212827716132818L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("discount_info")
	private List<DiscountInfo> discounts;

	/** 
	 * 券领取结果
	 */
	@ApiField("purchase_datas")
	private KbAdvertIdentifyResponse purchaseDatas;

	/** 
	 * 本次推荐的唯一标识
	 */
	@ApiField("recommend_id")
	private String recommendId;

    /**
     * Sets discounts.
     *
     * @param discounts the discounts
     */
    public void setDiscounts(List<DiscountInfo> discounts) {
		this.discounts = discounts;
	}

    /**
     * Gets discounts.
     *
     * @return the discounts
     */
    public List<DiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

    /**
     * Sets purchase datas.
     *
     * @param purchaseDatas the purchase datas
     */
    public void setPurchaseDatas(KbAdvertIdentifyResponse purchaseDatas) {
		this.purchaseDatas = purchaseDatas;
	}

    /**
     * Gets purchase datas.
     *
     * @return the purchase datas
     */
    public KbAdvertIdentifyResponse getPurchaseDatas( ) {
		return this.purchaseDatas;
	}

    /**
     * Sets recommend id.
     *
     * @param recommendId the recommend id
     */
    public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}

    /**
     * Gets recommend id.
     *
     * @return the recommend id
     */
    public String getRecommendId( ) {
		return this.recommendId;
	}

}
