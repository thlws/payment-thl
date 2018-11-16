package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单账单取消
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:20
 */
public class KoubeiCateringOrderBillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8528931812855863888L;

	/**
	 * 取消类型：RENEW-退款并重新生成新订单（反结场景），REFUND-仅退款不生成新订单（先付撤销、外卖退款场景）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets cancel time.
     *
     * @return the cancel time
     */
    public Date getCancelTime() {
		return this.cancelTime;
	}

    /**
     * Sets cancel time.
     *
     * @param cancelTime the cancel time
     */
    public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
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
