package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员标签查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-24 18:43:10
 */
public class KoubeiMemberDataTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4129781216549681224L;

	/**
	 * isv的pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
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
