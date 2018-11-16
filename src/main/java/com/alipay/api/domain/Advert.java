package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位
 *
 * @author auto create
 * @since 1.0, 2017-11-02 16:07:18
 */
public class Advert extends AlipayObject {

	private static final long serialVersionUID = 6548128328373624235L;

	/**
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	/**
	 * 广告位轮播内容列表
	 */
	@ApiListField("advert_items")
	@ApiField("advert_item")
	private List<AdvertItem> advertItems;

    /**
     * Gets advert id.
     *
     * @return the advert id
     */
    public String getAdvertId() {
		return this.advertId;
	}

    /**
     * Sets advert id.
     *
     * @param advertId the advert id
     */
    public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

    /**
     * Gets advert items.
     *
     * @return the advert items
     */
    public List<AdvertItem> getAdvertItems() {
		return this.advertItems;
	}

    /**
     * Sets advert items.
     *
     * @param advertItems the advert items
     */
    public void setAdvertItems(List<AdvertItem> advertItems) {
		this.advertItems = advertItems;
	}

}
