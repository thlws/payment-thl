package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放优惠信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:52
 */
public class KoubeiAdvertDeliveryDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2279572661217792554L;

	/**
	 * 优惠id，调用优惠查询接口时，需要提供“优惠id”
	 */
	@ApiField("item_id")
	private String itemId;

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
