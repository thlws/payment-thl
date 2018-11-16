package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能机具监控对接质量中心
 *
 * @author auto create
 * @since 1.0, 2018-04-11 10:35:40
 */
public class AlipayCommerceDataMonitordeviceQualitycenterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2546827617224832596L;

	/**
	 * device_id, 唯一标识设备，由openmonitor传递到质量中心。
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * fault_type，标识设备故障类型，由openmonitor传递到质量中心。
	 */
	@ApiField("fault_type")
	private String faultType;

	/**
	 * invoke_id, 用来回溯监控中心的调用方id，监控中心生成
	 */
	@ApiField("invoke_id")
	private Long invokeId;

	/**
	 * quality_center_id，唯一，用于问题追踪去重，质量中心生成的唯一id。
	 */
	@ApiField("quality_center_id")
	private String qualityCenterId;

	/**
	 * result, 机具处理结果，由质量中心生成。
	 */
	@ApiField("result")
	private String result;

	/**
	 * result_date, 处理结果的时间，质量中心生成。
	 */
	@ApiField("result_date")
	private Date resultDate;

	/**
	 * result_msg，处理结果的描述，质量中心生成。
	 */
	@ApiField("result_msg")
	private String resultMsg;

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId() {
		return this.assetId;
	}

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

    /**
     * Gets fault type.
     *
     * @return the fault type
     */
    public String getFaultType() {
		return this.faultType;
	}

    /**
     * Sets fault type.
     *
     * @param faultType the fault type
     */
    public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

    /**
     * Gets invoke id.
     *
     * @return the invoke id
     */
    public Long getInvokeId() {
		return this.invokeId;
	}

    /**
     * Sets invoke id.
     *
     * @param invokeId the invoke id
     */
    public void setInvokeId(Long invokeId) {
		this.invokeId = invokeId;
	}

    /**
     * Gets quality center id.
     *
     * @return the quality center id
     */
    public String getQualityCenterId() {
		return this.qualityCenterId;
	}

    /**
     * Sets quality center id.
     *
     * @param qualityCenterId the quality center id
     */
    public void setQualityCenterId(String qualityCenterId) {
		this.qualityCenterId = qualityCenterId;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result date.
     *
     * @return the result date
     */
    public Date getResultDate() {
		return this.resultDate;
	}

    /**
     * Sets result date.
     *
     * @param resultDate the result date
     */
    public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg() {
		return this.resultMsg;
	}

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
