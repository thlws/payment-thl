package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁设备信息
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:48:06
 */
public class MachineInfo extends AlipayObject {

	private static final long serialVersionUID = 1581741681432196572L;

	/**
	 * 设备数量
	 */
	@ApiField("machine_count")
	private Long machineCount;

	/**
	 * 设备型号
	 */
	@ApiField("machine_model")
	private String machineModel;

	/**
	 * 设备类型，由商户定义
	 */
	@ApiField("machine_type")
	private String machineType;

    /**
     * Gets machine count.
     *
     * @return the machine count
     */
    public Long getMachineCount() {
		return this.machineCount;
	}

    /**
     * Sets machine count.
     *
     * @param machineCount the machine count
     */
    public void setMachineCount(Long machineCount) {
		this.machineCount = machineCount;
	}

    /**
     * Gets machine entity.
     *
     * @return the machine entity
     */
    public String getMachineModel() {
		return this.machineModel;
	}

    /**
     * Sets machine entity.
     *
     * @param machineModel the machine entity
     */
    public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}

    /**
     * Gets machine type.
     *
     * @return the machine type
     */
    public String getMachineType() {
		return this.machineType;
	}

    /**
     * Sets machine type.
     *
     * @param machineType the machine type
     */
    public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

}
