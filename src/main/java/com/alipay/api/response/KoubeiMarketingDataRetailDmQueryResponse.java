package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DmActivityShopData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.retail.dm.query response.
 *
 * @author auto create
 * @since 1.0, 2017-05-16 17:02:42
 */
public class KoubeiMarketingDataRetailDmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3571288925296753422L;

	/** 
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 店面DM营销数据，包括商品的PV、UV、曝光。
	 */
	@ApiListField("dm_marketing_datas")
	@ApiField("dm_activity_shop_data")
	private List<DmActivityShopData> dmMarketingDatas;

	/** 
	 * 商品码
	 */
	@ApiField("item_code")
	private String itemCode;

	/** 
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

    /**
     * Sets content id.
     *
     * @param contentId the content id
     */
    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

    /**
     * Gets content id.
     *
     * @return the content id
     */
    public String getContentId( ) {
		return this.contentId;
	}

    /**
     * Sets dm marketing datas.
     *
     * @param dmMarketingDatas the dm marketing datas
     */
    public void setDmMarketingDatas(List<DmActivityShopData> dmMarketingDatas) {
		this.dmMarketingDatas = dmMarketingDatas;
	}

    /**
     * Gets dm marketing datas.
     *
     * @return the dm marketing datas
     */
    public List<DmActivityShopData> getDmMarketingDatas( ) {
		return this.dmMarketingDatas;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode( ) {
		return this.itemCode;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName( ) {
		return this.itemName;
	}

}
