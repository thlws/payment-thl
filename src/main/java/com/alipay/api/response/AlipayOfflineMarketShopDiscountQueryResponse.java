package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampDetailInfo;
import com.alipay.api.domain.ShopDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.discount.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 10:50:38
 */
public class AlipayOfflineMarketShopDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8594443647618929152L;

	/** 
	 * 返回商户正在进行中的活动摘要列表数据，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。
	 */
	@ApiListField("camp_list")
	@ApiField("camp_detail_info")
	private List<CampDetailInfo> campList;

	/** 
	 * 返回商户正在进行中的活动记录数，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。
	 */
	@ApiField("camp_num")
	private Long campNum;

	/** 
	 * 优惠信息列表，最大20条，按生效时间排序，注意：如果入参query_type传递了指定的值，该参数将不会返回。只有当query_type不传递时方可返回数据
	 */
	@ApiListField("discount_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> discountList;

	/** 
	 * 商品列表，最大20条，按申领数量排序，注意：如果入参query_type传递了指定的值，该参数将不会返回。只有当query_type不传递时方可返回数据
	 */
	@ApiListField("item_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> itemList;

    /**
     * Sets camp list.
     *
     * @param campList the camp list
     */
    public void setCampList(List<CampDetailInfo> campList) {
		this.campList = campList;
	}

    /**
     * Gets camp list.
     *
     * @return the camp list
     */
    public List<CampDetailInfo> getCampList( ) {
		return this.campList;
	}

    /**
     * Sets camp num.
     *
     * @param campNum the camp num
     */
    public void setCampNum(Long campNum) {
		this.campNum = campNum;
	}

    /**
     * Gets camp num.
     *
     * @return the camp num
     */
    public Long getCampNum( ) {
		return this.campNum;
	}

    /**
     * Sets discount list.
     *
     * @param discountList the discount list
     */
    public void setDiscountList(List<ShopDiscountInfo> discountList) {
		this.discountList = discountList;
	}

    /**
     * Gets discount list.
     *
     * @return the discount list
     */
    public List<ShopDiscountInfo> getDiscountList( ) {
		return this.discountList;
	}

    /**
     * Sets item list.
     *
     * @param itemList the item list
     */
    public void setItemList(List<ShopDiscountInfo> itemList) {
		this.itemList = itemList;
	}

    /**
     * Gets item list.
     *
     * @return the item list
     */
    public List<ShopDiscountInfo> getItemList( ) {
		return this.itemList;
	}

}
