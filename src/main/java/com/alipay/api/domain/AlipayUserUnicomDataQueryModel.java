package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁宝卡联通流量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-03 12:25:27
 */
public class AlipayUserUnicomDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6713647366723575285L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
