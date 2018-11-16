package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单外部主键信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:28:54
 */
public class PosOrderKey extends AlipayObject {

	private static final long serialVersionUID = 5411324777421559958L;

	/**
	 * pos设备序列号
	 */
	@ApiField("dv_sn")
	private String dvSn;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 订单版本号
	 */
	@ApiField("order_version")
	private Long orderVersion;

	/**
	 * pos本地的订单号,同一个商户下唯一标识一笔订单的编号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Gets dv sn.
     *
     * @return the dv sn
     */
    public String getDvSn() {
		return this.dvSn;
	}

    /**
     * Sets dv sn.
     *
     * @param dvSn the dv sn
     */
    public void setDvSn(String dvSn) {
		this.dvSn = dvSn;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets order version.
     *
     * @return the order version
     */
    public Long getOrderVersion() {
		return this.orderVersion;
	}

    /**
     * Sets order version.
     *
     * @param orderVersion the order version
     */
    public void setOrderVersion(Long orderVersion) {
		this.orderVersion = orderVersion;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
