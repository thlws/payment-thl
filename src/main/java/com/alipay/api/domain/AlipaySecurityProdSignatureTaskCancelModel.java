package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝可信电子签名任务撤销
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:25:04
 */
public class AlipaySecurityProdSignatureTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2416792637624377918L;

	/**
	 * 业务流水号，与初始化接口保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务唯一标识，由支付宝统一分配，无法自助获取
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 接口版本信息，目前默认3，由服务提供方指定。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 签约任务编号，与初始化返回参数一致。
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct() {
		return this.bizProduct;
	}

    /**
     * Sets biz product.
     *
     * @param bizProduct the biz product
     */
    public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

    /**
     * Gets service version.
     *
     * @return the service version
     */
    public String getServiceVersion() {
		return this.serviceVersion;
	}

    /**
     * Sets service version.
     *
     * @param serviceVersion the service version
     */
    public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

    /**
     * Gets task id.
     *
     * @return the task id
     */
    public String getTaskId() {
		return this.taskId;
	}

    /**
     * Sets task id.
     *
     * @param taskId the task id
     */
    public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
