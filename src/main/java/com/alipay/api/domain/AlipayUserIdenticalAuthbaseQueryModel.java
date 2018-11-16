package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账号实名同人校验
 *
 * @author auto create
 * @since 1.0, 2018-06-13 17:51:49
 */
public class AlipayUserIdenticalAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6749426424942243281L;

	/**
	 * 需要校验的userId，该参数需要用作请求路由
	 */
	@ApiField("base_user_id")
	private String baseUserId;

	/**
	 * 另一个需要校验的用户的支付宝账户ID
	 */
	@ApiField("comparator_user_id")
	private String comparatorUserId;

    /**
     * Gets base user id.
     *
     * @return the base user id
     */
    public String getBaseUserId() {
		return this.baseUserId;
	}

    /**
     * Sets base user id.
     *
     * @param baseUserId the base user id
     */
    public void setBaseUserId(String baseUserId) {
		this.baseUserId = baseUserId;
	}

    /**
     * Gets comparator user id.
     *
     * @return the comparator user id
     */
    public String getComparatorUserId() {
		return this.comparatorUserId;
	}

    /**
     * Sets comparator user id.
     *
     * @param comparatorUserId the comparator user id
     */
    public void setComparatorUserId(String comparatorUserId) {
		this.comparatorUserId = comparatorUserId;
	}

}
