package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养门店查询
 *
 * @author auto create
 * @since 1.0, 2017-07-13 14:23:31
 */
public class AlipayEcoMycarMaintainShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4824458981737361345L;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

    /**
     * Gets out shop id.
     *
     * @return the out shop id
     */
    public String getOutShopId() {
		return this.outShopId;
	}

    /**
     * Sets out shop id.
     *
     * @param outShopId the out shop id
     */
    public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
