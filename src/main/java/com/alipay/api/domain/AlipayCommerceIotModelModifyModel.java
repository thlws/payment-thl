package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改某一设备型号数据
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:37
 */
public class AlipayCommerceIotModelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2689565332331996249L;

	/**
	 * 型号对象+不唯一+用于更新已存在的设备型号记录+由协议服务商指定+设备型号对象整体都需传入，而不能仅传入部分发生变更的属性
	 */
	@ApiField("entity")
	private IotDeviceModel model;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

    /**
     * Gets entity.
     *
     * @return the entity
     */
    public IotDeviceModel getModel() {
		return this.model;
	}

    /**
     * Sets entity.
     *
     * @param model the entity
     */
    public void setModel(IotDeviceModel model) {
		this.model = model;
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

}
