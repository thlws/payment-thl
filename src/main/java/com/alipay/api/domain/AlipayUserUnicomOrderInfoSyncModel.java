package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户联通开卡订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:23:33
 */
public class AlipayUserUnicomOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1694632337168156999L;

	/**
	 * 订单变更时间，返回自January 1, 1970, 00:00:00 GMT至订单变更时刻的毫秒数, java代码获取示例：new Date().getTime()
	 */
	@ApiField("gmt_order_change")
	private String gmtOrderChange;

	/**
	 * 用户在联通开卡创建的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单变更类型，包括创建(ORDER_CREATE)、撤销(ORDER_CANCEL)、支付(ORDER_PAID)等
	 */
	@ApiField("order_operate_type")
	private String orderOperateType;

	/**
	 * 用户在创建开卡订单时选择的联通号码（11位，不带国家码）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 联通资费产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 参数校验值
	 */
	@ApiField("sec_key")
	private String secKey;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets gmt order change.
     *
     * @return the gmt order change
     */
    public String getGmtOrderChange() {
		return this.gmtOrderChange;
	}

    /**
     * Sets gmt order change.
     *
     * @param gmtOrderChange the gmt order change
     */
    public void setGmtOrderChange(String gmtOrderChange) {
		this.gmtOrderChange = gmtOrderChange;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order operate type.
     *
     * @return the order operate type
     */
    public String getOrderOperateType() {
		return this.orderOperateType;
	}

    /**
     * Sets order operate type.
     *
     * @param orderOperateType the order operate type
     */
    public void setOrderOperateType(String orderOperateType) {
		this.orderOperateType = orderOperateType;
	}

    /**
     * Gets phone no.
     *
     * @return the phone no
     */
    public String getPhoneNo() {
		return this.phoneNo;
	}

    /**
     * Sets phone no.
     *
     * @param phoneNo the phone no
     */
    public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
		return this.productName;
	}

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
		this.productName = productName;
	}

    /**
     * Gets sec key.
     *
     * @return the sec key
     */
    public String getSecKey() {
		return this.secKey;
	}

    /**
     * Sets sec key.
     *
     * @param secKey the sec key
     */
    public void setSecKey(String secKey) {
		this.secKey = secKey;
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
