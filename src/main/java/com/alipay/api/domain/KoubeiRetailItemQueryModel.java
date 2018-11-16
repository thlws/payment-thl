package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询快消行业商品详情
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:18:27
 */
public class KoubeiRetailItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4592752872369548486L;

	/**
	 * 城市编码，6位国际码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 支付宝商品ID，即展示的券
	 */
	@ApiField("item_id")
	private String itemId;

    /**
     * Gets city id.
     *
     * @return the city id
     */
    public String getCityId() {
		return this.cityId;
	}

    /**
     * Sets city id.
     *
     * @param cityId the city id
     */
    public void setCityId(String cityId) {
		this.cityId = cityId;
	}

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
