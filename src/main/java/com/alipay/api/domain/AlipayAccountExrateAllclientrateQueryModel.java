package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客户的所有币种对最新有效汇率
 *
 * @author auto create
 * @since 1.0, 2018-04-12 19:07:12
 */
public class AlipayAccountExrateAllclientrateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5121382868576891921L;

	/**
	 * 客户id，客户和报价中心签约时约定的信息
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 子协议扩展号，同一个客户不同业务场景下需要不同的客户报价，通过profile_id区分。正常情况下可能每个客户只有一个默认的profile_id
	 */
	@ApiField("profile_id")
	private String profileId;

    /**
     * Gets client id.
     *
     * @return the client id
     */
    public String getClientId() {
		return this.clientId;
	}

    /**
     * Sets client id.
     *
     * @param clientId the client id
     */
    public void setClientId(String clientId) {
		this.clientId = clientId;
	}

    /**
     * Gets profile id.
     *
     * @return the profile id
     */
    public String getProfileId() {
		return this.profileId;
	}

    /**
     * Sets profile id.
     *
     * @param profileId the profile id
     */
    public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

}
