package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发券授权
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:06
 */
public class KoubeiMarketingToolPrizesendAuthModel extends AlipayObject {

	private static final long serialVersionUID = 2528728342763497755L;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 外部流水号，保证业务幂等性
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 发奖用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets prize id.
     *
     * @return the prize id
     */
    public String getPrizeId() {
		return this.prizeId;
	}

    /**
     * Sets prize id.
     *
     * @param prizeId the prize id
     */
    public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

    /**
     * Gets req id.
     *
     * @return the req id
     */
    public String getReqId() {
		return this.reqId;
	}

    /**
     * Sets req id.
     *
     * @param reqId the req id
     */
    public void setReqId(String reqId) {
		this.reqId = reqId;
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
