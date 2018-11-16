package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员识别
 *
 * @author auto create
 * @since 1.0, 2018-06-19 15:49:06
 */
public class KoubeiShopMallMemberIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8552714665846352964L;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
