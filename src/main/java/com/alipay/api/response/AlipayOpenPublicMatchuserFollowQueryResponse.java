package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.follow.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-07 14:06:28
 */
public class AlipayOpenPublicMatchuserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6495582733153137983L;

	/** 
	 * 用户是否关注，T代表已关注，F代表未关注
	 */
	@ApiField("is_follow")
	private String isFollow;

	/** 
	 * 支付宝用户id，2088开头的16位长度字符串
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets is follow.
     *
     * @param isFollow the is follow
     */
    public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}

    /**
     * Gets is follow.
     *
     * @return the is follow
     */
    public String getIsFollow( ) {
		return this.isFollow;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
