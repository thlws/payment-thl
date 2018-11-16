package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息
 *
 * @author auto create
 * @since 1.0, 2018-03-07 11:49:38
 */
public class FaceSearchAnonymousUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2896963585696985144L;

	/**
	 * 商户标识
	 */
	@ApiField("merchantid")
	private String merchantid;

	/**
	 * 商户uid
	 */
	@ApiField("merchantuid")
	private String merchantuid;

    /**
     * Gets merchantid.
     *
     * @return the merchantid
     */
    public String getMerchantid() {
		return this.merchantid;
	}

    /**
     * Sets merchantid.
     *
     * @param merchantid the merchantid
     */
    public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

    /**
     * Gets merchantuid.
     *
     * @return the merchantuid
     */
    public String getMerchantuid() {
		return this.merchantuid;
	}

    /**
     * Sets merchantuid.
     *
     * @param merchantuid the merchantuid
     */
    public void setMerchantuid(String merchantuid) {
		this.merchantuid = merchantuid;
	}

}
