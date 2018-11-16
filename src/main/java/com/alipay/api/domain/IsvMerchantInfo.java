package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户信息列表
 *
 * @author auto create
 * @since 1.0, 2017-08-04 15:15:46
 */
public class IsvMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4746194397198299154L;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
