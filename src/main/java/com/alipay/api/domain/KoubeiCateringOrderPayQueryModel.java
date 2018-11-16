package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付结果查询
 *
 * @author auto create
 * @since 1.0, 2018-04-14 17:41:14
 */
public class KoubeiCateringOrderPayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8541816415356745881L;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

    /**
     * Gets out pay no.
     *
     * @return the out pay no
     */
    public String getOutPayNo() {
		return this.outPayNo;
	}

    /**
     * Sets out pay no.
     *
     * @param outPayNo the out pay no
     */
    public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

    /**
     * Gets pos order key.
     *
     * @return the pos order key
     */
    public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}

    /**
     * Sets pos order key.
     *
     * @param posOrderKey the pos order key
     */
    public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

}
