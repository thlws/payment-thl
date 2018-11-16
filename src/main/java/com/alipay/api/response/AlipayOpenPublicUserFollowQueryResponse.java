package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.follow.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicUserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536576392382533693L;

	/** 
	 * 用户是否关注，T代表已关注，F代表未关注
	 */
	@ApiField("is_follow")
	private String isFollow;

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

}
