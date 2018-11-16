package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvMerchantInfo;
import com.alipay.api.domain.ShopSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.isv.merchant.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-04 15:15:46
 */
public class KoubeiMarketingToolIsvMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725928554723688383L;

	/** 
	 * 商户信息列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("isv_merchant_info")
	private List<IsvMerchantInfo> merchantInfos;

	/** 
	 * 门店总量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/** 
	 * 门店详情列表信息
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_info")
	private List<ShopSummaryInfo> shopSummaryInfos;

    /**
     * Sets merchant infos.
     *
     * @param merchantInfos the merchant infos
     */
    public void setMerchantInfos(List<IsvMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}

    /**
     * Gets merchant infos.
     *
     * @return the merchant infos
     */
    public List<IsvMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
	}

    /**
     * Sets shop count.
     *
     * @param shopCount the shop count
     */
    public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}

    /**
     * Gets shop count.
     *
     * @return the shop count
     */
    public String getShopCount( ) {
		return this.shopCount;
	}

    /**
     * Sets shop summary infos.
     *
     * @param shopSummaryInfos the shop summary infos
     */
    public void setShopSummaryInfos(List<ShopSummaryInfo> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}

    /**
     * Gets shop summary infos.
     *
     * @return the shop summary infos
     */
    public List<ShopSummaryInfo> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

}
