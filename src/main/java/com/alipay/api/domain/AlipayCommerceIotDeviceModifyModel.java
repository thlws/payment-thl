package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改某个设备型号数据
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:47
 */
public class AlipayCommerceIotDeviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4464677586355667195L;

	/**
	 * 更新后的设备对象+不唯一+用于更新支付宝智能设备中心中的设备信息+协议服务商指定+设备对象整体都需传入，而不能仅传入部分发生变更的属性
	 */
	@ApiField("device")
	private IotDevice device;

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
     * Gets device.
     *
     * @return the device
     */
    public IotDevice getDevice() {
		return this.device;
	}

    /**
     * Sets device.
     *
     * @param device the device
     */
    public void setDevice(IotDevice device) {
		this.device = device;
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
