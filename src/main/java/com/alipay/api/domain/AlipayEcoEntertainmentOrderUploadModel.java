package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值平台ISV订单回流接口
 *
 * @author auto create
 * @since 1.0, 2017-11-02 10:19:49
 */
public class AlipayEcoEntertainmentOrderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3336387716938229738L;

	/**
	 * 数娱充值ISV订单回流模型
	 */
	@ApiField("entertainment_order_info")
	private EntertainmentOrderInfo entertainmentOrderInfo;

    /**
     * Gets entertainment order info.
     *
     * @return the entertainment order info
     */
    public EntertainmentOrderInfo getEntertainmentOrderInfo() {
		return this.entertainmentOrderInfo;
	}

    /**
     * Sets entertainment order info.
     *
     * @param entertainmentOrderInfo the entertainment order info
     */
    public void setEntertainmentOrderInfo(EntertainmentOrderInfo entertainmentOrderInfo) {
		this.entertainmentOrderInfo = entertainmentOrderInfo;
	}

}
