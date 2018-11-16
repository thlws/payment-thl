package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云凤蝶空间详情
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:16:53
 */
public class AlipayMarketingToolFengdieSpaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8462378119159785295L;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲查询的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets space id.
     *
     * @return the space id
     */
    public String getSpaceId() {
		return this.spaceId;
	}

    /**
     * Sets space id.
     *
     * @param spaceId the space id
     */
    public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
