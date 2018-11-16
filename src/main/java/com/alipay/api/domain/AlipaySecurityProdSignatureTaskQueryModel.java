package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝可信电子签名结果查询
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:43
 */
public class AlipaySecurityProdSignatureTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2874238834194482754L;

	/**
	 * 业务类型唯一标识。调用前联系支付宝服务提供方，由电子签名平台统一分配。
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 查询订单编号，参考alipay.security.prod.signature.task.apply接口返回的order_id。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 调用前联系支付宝服务提供方，由电子签名平台统一分配。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 查询的签约任务编号列表，JSONArray格式。参考alipay.security.prod.signature.task.apply返回的task_list对象中的task_id属性。支持查询1到多个任务结果，如果列表为空，则默认查询所有任务结果，如果与当前订单下的任务没有匹配，则不返回任何签约任务。
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

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
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
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
     * Gets task id list.
     *
     * @return the task id list
     */
    public List<String> getTaskIdList() {
		return this.taskIdList;
	}

    /**
     * Sets task id list.
     *
     * @param taskIdList the task id list
     */
    public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

}
