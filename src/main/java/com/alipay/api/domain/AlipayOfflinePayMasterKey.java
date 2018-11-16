package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述支付宝脱机交易主秘钥
 *
 * @author auto create
 * @since 1.0, 2017-09-20 18:07:50
 */
public class AlipayOfflinePayMasterKey extends AlipayObject {

	private static final long serialVersionUID = 6387491814913194214L;

	/**
	 * 秘钥id
	 */
	@ApiField("key_id")
	private Long keyId;

	/**
	 * 支付宝脱机服务公钥
	 */
	@ApiField("public_key")
	private String publicKey;

    /**
     * Gets key id.
     *
     * @return the key id
     */
    public Long getKeyId() {
		return this.keyId;
	}

    /**
     * Sets key id.
     *
     * @param keyId the key id
     */
    public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

    /**
     * Gets public key.
     *
     * @return the public key
     */
    public String getPublicKey() {
		return this.publicKey;
	}

    /**
     * Sets public key.
     *
     * @param publicKey the public key
     */
    public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

}
