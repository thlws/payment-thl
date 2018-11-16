package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucherprod.charge.send response.
 *
 * @author auto create
 * @since 1.0, 2018-05-19 08:40:00
 */
public class AlipayAssetVoucherprodChargeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7832115436834626113L;

	/** 
	 * 资产id编号
	 */
	@ApiField("asset_instance_id")
	private String assetInstanceId;

	/** 
	 * 支付宝充值订单号
	 */
	@ApiField("order_no")
	private String orderNo;

    /**
     * Sets asset instance id.
     *
     * @param assetInstanceId the asset instance id
     */
    public void setAssetInstanceId(String assetInstanceId) {
		this.assetInstanceId = assetInstanceId;
	}

    /**
     * Gets asset instance id.
     *
     * @return the asset instance id
     */
    public String getAssetInstanceId( ) {
		return this.assetInstanceId;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

}
