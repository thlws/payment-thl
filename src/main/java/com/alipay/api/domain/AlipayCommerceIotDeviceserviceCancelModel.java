package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销指定的设备服务
 *
 * @author auto create
 * @since 1.0, 2017-11-24 15:18:01
 */
public class AlipayCommerceIotDeviceserviceCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1718161431578438476L;

	/**
	 * 协议服务商定义的设备服务id+不唯一+用于指定要撤销的服务+协议服务商在创建该服务时指定的该服务的id+该字段不是必填字段，如果不指定，则会撤销该协议服务商的默认设备服务实例
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets service id.
     *
     * @return the service id
     */
    public String getServiceId() {
		return this.serviceId;
	}

    /**
     * Sets service id.
     *
     * @param serviceId the service id
     */
    public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
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
