package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取关注者列表
 *
 * @author auto create
 * @since 1.0, 2016-12-20 10:26:41
 */
public class AlipayOpenPublicFollowBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1851286481165992481L;

	/**
	 * 当关注者数量超过10000时使用，本次拉取数据中第一个用户的userId，从上次接口调用返回值中获取。第一次调用置空
	 */
	@ApiField("next_user_id")
	private String nextUserId;

    /**
     * Gets next user id.
     *
     * @return the next user id
     */
    public String getNextUserId() {
		return this.nextUserId;
	}

    /**
     * Sets next user id.
     *
     * @param nextUserId the next user id
     */
    public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}

}
