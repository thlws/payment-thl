package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账号绑定关系创建
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:10
 */
public class AlipayCommerceIotAccountbindingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8273463779261658163L;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

	/**
	 * 用户在协议服务商的用户id+唯一+用于建立与支付宝账号的绑定关系+用户在协议服务商注册
	 */
	@ApiField("protocol_user_id")
	private String protocolUserId;

	/**
	 * 用户在协议服务商的用户名(显示名称)+不唯一+用于支付宝智能设备中心中显示用户名+用户在协议服务商注册时指定
	 */
	@ApiField("protocol_user_name")
	private String protocolUserName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets protocol supplier id.
     *
     * @return the protocol supplier id
     */
    public String getProtocolSupplierId() {
		return this.protocolSupplierId;
	}

    /**
     * Sets protocol supplier id.
     *
     * @param protocolSupplierId the protocol supplier id
     */
    public void setProtocolSupplierId(String protocolSupplierId) {
		this.protocolSupplierId = protocolSupplierId;
	}

    /**
     * Gets protocol user id.
     *
     * @return the protocol user id
     */
    public String getProtocolUserId() {
		return this.protocolUserId;
	}

    /**
     * Sets protocol user id.
     *
     * @param protocolUserId the protocol user id
     */
    public void setProtocolUserId(String protocolUserId) {
		this.protocolUserId = protocolUserId;
	}

    /**
     * Gets protocol user name.
     *
     * @return the protocol user name
     */
    public String getProtocolUserName() {
		return this.protocolUserName;
	}

    /**
     * Sets protocol user name.
     *
     * @param protocolUserName the protocol user name
     */
    public void setProtocolUserName(String protocolUserName) {
		this.protocolUserName = protocolUserName;
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
