package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单关闭
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:27
 */
public class KoubeiCateringOrderInfoCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2532681815943175914L;

	/**
	 * 关单时间,格式yyyy-mm-dd
	 */
	@ApiField("close_time")
	private Date closeTime;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

    /**
     * Gets close time.
     *
     * @return the close time
     */
    public Date getCloseTime() {
		return this.closeTime;
	}

    /**
     * Sets close time.
     *
     * @param closeTime the close time
     */
    public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
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
