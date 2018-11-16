package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.follow.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8797692318444153475L;

	/** 
	 * 本次调用获取的userId个数，最大值为10000
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	/** 
	 * 用户的userId列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

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

    /**
     * Sets user id list.
     *
     * @param userIdList the user id list
     */
    public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

    /**
     * Gets user id list.
     *
     * @return the user id list
     */
    public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
