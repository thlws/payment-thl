package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改设备个性化信息
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:43
 */
public class AlipayCommerceIotDevicePersonalinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1728524225663937772L;

	/**
	 * 需更新的设备个性化信息+不唯一+用于更新支付宝智能设备中心中的设备个性化信息+协议服务商指定+设备个性化信息对象整体都需传入，而不能仅传入部分发生变更的属性
	 */
	@ApiField("device_personal_info")
	private IotDevicePersonalInfo devicePersonalInfo;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets device personal info.
     *
     * @return the device personal info
     */
    public IotDevicePersonalInfo getDevicePersonalInfo() {
		return this.devicePersonalInfo;
	}

    /**
     * Sets device personal info.
     *
     * @param devicePersonalInfo the device personal info
     */
    public void setDevicePersonalInfo(IotDevicePersonalInfo devicePersonalInfo) {
		this.devicePersonalInfo = devicePersonalInfo;
	}

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
