package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Data;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.follow.list response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 20:38:32
 */
public class AlipayMobileStdPublicFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 8548283635776431238L;

	/** 
	 * 当前组的值
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 用户数据
	 */
	@ApiField("data")
	private Data data;

	/** 
	 * 与nextUserId对应，标准Alipay UserId
	 */
	@ApiField("next_alipay_user_id")
	private String nextAlipayUserId;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount( ) {
		return this.count;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Data data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public Data getData( ) {
		return this.data;
	}

    /**
     * Sets next alipay user id.
     *
     * @param nextAlipayUserId the next alipay user id
     */
    public void setNextAlipayUserId(String nextAlipayUserId) {
		this.nextAlipayUserId = nextAlipayUserId;
	}

    /**
     * Gets next alipay user id.
     *
     * @return the next alipay user id
     */
    public String getNextAlipayUserId( ) {
		return this.nextAlipayUserId;
	}

    /**
     * Sets next user id.
     *
     * @param nextUserId the next user id
     */
    public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}

    /**
     * Gets next user id.
     *
     * @return the next user id
     */
    public String getNextUserId( ) {
		return this.nextUserId;
	}

}
