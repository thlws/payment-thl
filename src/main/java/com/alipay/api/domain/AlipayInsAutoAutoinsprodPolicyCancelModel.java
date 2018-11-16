package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单撤销接口
 *
 * @author auto create
 * @since 1.0, 2017-12-13 11:31:43
 */
public class AlipayInsAutoAutoinsprodPolicyCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7877918523492745949L;

	/**
	 * 车险订单号
	 */
	@ApiField("trade_biz_id")
	private String tradeBizId;

    /**
     * Gets trade biz id.
     *
     * @return the trade biz id
     */
    public String getTradeBizId() {
		return this.tradeBizId;
	}

    /**
     * Sets trade biz id.
     *
     * @param tradeBizId the trade biz id
     */
    public void setTradeBizId(String tradeBizId) {
		this.tradeBizId = tradeBizId;
	}

}
