package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作的店铺对象信息
 *
 * @author auto create
 * @since 1.0, 2017-03-07 22:15:22
 */
public class OuterShopDO extends AlipayObject {

	private static final long serialVersionUID = 2813447161775952824L;

	/**
	 * 合作商户ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 支付宝店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 合作商户类型 （mike、_2dFire）
iSV自己定义自己的类型，推荐使用自己的域名
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets outer id.
     *
     * @return the outer id
     */
    public String getOuterId() {
		return this.outerId;
	}

    /**
     * Sets outer id.
     *
     * @param outerId the outer id
     */
    public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
