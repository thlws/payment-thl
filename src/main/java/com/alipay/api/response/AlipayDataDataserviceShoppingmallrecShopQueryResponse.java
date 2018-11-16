package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopRec;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.shoppingmallrec.shop.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class AlipayDataDataserviceShoppingmallrecShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3827424328362152822L;

	/** 
	 * 本次推荐的id, 开发者埋点需带入此参数
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 本次请求的全局唯一标识, 支持英文字母和数字, 由开发者自行定义,和入参request_id一致
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 推荐的商铺列表, 有序
	 */
	@ApiListField("shop_recommend_list")
	@ApiField("shop_rec")
	private List<ShopRec> shopRecommendList;

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

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

    /**
     * Sets shop recommend list.
     *
     * @param shopRecommendList the shop recommend list
     */
    public void setShopRecommendList(List<ShopRec> shopRecommendList) {
		this.shopRecommendList = shopRecommendList;
	}

    /**
     * Gets shop recommend list.
     *
     * @return the shop recommend list
     */
    public List<ShopRec> getShopRecommendList( ) {
		return this.shopRecommendList;
	}

}
