package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsSellerActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.seller.activity.query response.
 *
 * @author auto create
 * @since 1.0, 2017-10-27 18:12:30
 */
public class AlipayInsSceneSellerActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2561317123555596312L;

	/** 
	 * 关于签约查询结果的告知
	 */
	@ApiField("ins_seller_activity")
	private InsSellerActivity insSellerActivity;

    /**
     * Sets ins seller activity.
     *
     * @param insSellerActivity the ins seller activity
     */
    public void setInsSellerActivity(InsSellerActivity insSellerActivity) {
		this.insSellerActivity = insSellerActivity;
	}

    /**
     * Gets ins seller activity.
     *
     * @return the ins seller activity
     */
    public InsSellerActivity getInsSellerActivity( ) {
		return this.insSellerActivity;
	}

}
