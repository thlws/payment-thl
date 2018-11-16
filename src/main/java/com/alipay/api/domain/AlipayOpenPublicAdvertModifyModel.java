package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位修改接口
 *
 * @author auto create
 * @since 1.0, 2018-04-09 10:46:35
 */
public class AlipayOpenPublicAdvertModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3563334485996236217L;

	/**
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	/**
	 * 广告位轮播内容列表，数量限制：大于1个，小于3个，广告位轮播内容顺序，根据接口传入的顺序排列
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
