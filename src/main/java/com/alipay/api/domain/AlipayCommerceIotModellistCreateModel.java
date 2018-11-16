package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备型号列表创建
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:34
 */
public class AlipayCommerceIotModellistCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4464761441891448119L;

	/**
	 * 型号列表+不唯一+协议服务商用于在支付宝智能设备中心创建支持的设备型号+协议服务商指定
	 */
	@ApiListField("model_list")
	@ApiField("iot_device_model")
	private List<IotDeviceModel> modelList;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

    /**
     * Gets entity list.
     *
     * @return the entity list
     */
    public List<IotDeviceModel> getModelList() {
		return this.modelList;
	}

    /**
     * Sets entity list.
     *
     * @param modelList the entity list
     */
    public void setModelList(List<IotDeviceModel> modelList) {
		this.modelList = modelList;
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
