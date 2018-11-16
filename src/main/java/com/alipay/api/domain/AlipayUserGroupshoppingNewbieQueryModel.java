package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝拼团查询是否有一元拼资格
 *
 * @author auto create
 * @since 1.0, 2018-08-24 11:23:47
 */
public class AlipayUserGroupshoppingNewbieQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5691332215735752617L;

	/**
	 * 支付宝淘宝拼团的组团id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 淘宝支付宝拼团的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
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
