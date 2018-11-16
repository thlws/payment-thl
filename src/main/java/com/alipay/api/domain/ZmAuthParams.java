package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻授权参数
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:21
 */
public class ZmAuthParams extends AlipayObject {

	private static final long serialVersionUID = 7297488788471535856L;

	/**
	 * 商户在芝麻端申请的appId
	 */
	@ApiField("buckle_app_id")
	private String buckleAppId;

	/**
	 * 商户在芝麻端申请的merchantId
	 */
	@ApiField("buckle_merchant_id")
	private String buckleMerchantId;

    /**
     * Gets buckle app id.
     *
     * @return the buckle app id
     */
    public String getBuckleAppId() {
		return this.buckleAppId;
	}

    /**
     * Sets buckle app id.
     *
     * @param buckleAppId the buckle app id
     */
    public void setBuckleAppId(String buckleAppId) {
		this.buckleAppId = buckleAppId;
	}

    /**
     * Gets buckle merchant id.
     *
     * @return the buckle merchant id
     */
    public String getBuckleMerchantId() {
		return this.buckleMerchantId;
	}

    /**
     * Sets buckle merchant id.
     *
     * @param buckleMerchantId the buckle merchant id
     */
    public void setBuckleMerchantId(String buckleMerchantId) {
		this.buckleMerchantId = buckleMerchantId;
	}

}
