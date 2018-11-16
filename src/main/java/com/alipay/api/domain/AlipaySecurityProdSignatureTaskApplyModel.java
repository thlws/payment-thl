package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝可信电子签名申请
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class AlipaySecurityProdSignatureTaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6318388932448114395L;

	/**
	 * 外部应用名称，由支付宝统一分配，无法自助获取。
	 */
	@ApiField("biz_app")
	private String bizApp;

	/**
	 * 业务流水号，保证唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务扩展参数 {"key1":"value2"}
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 业务唯一标识，由支付宝统一分配，无法自助获取
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 电子签约类型，目前只支持一种类型电子合同，取值1
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 接口版本信息，目前默认3，由服务提供方指定。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 签约文件列表。具体见SignDataInfo中定义。
	 */
	@ApiListField("sign_data_list")
	@ApiField("sign_data_info")
	private List<SignDataInfo> signDataList;

	/**
	 * 签约子任务，每个任务对应一个签约主体。
	 */
	@ApiListField("sign_task_list")
	@ApiField("sign_task")
	private List<SignTask> signTaskList;

	/**
	 * 制定签约主体执行签约顺序，例如甲乙双方签约，“顺序签约”模式下，甲签约完成后乙才能开始签约；“并行签约”模式下，甲乙可同时进行认证，按照时序顺序在文档上签约。
1 : 顺序签约
2 : 并行签约
	 */
	@ApiField("sign_task_type")
	private Long signTaskType;

    /**
     * Gets biz app.
     *
     * @return the biz app
     */
    public String getBizApp() {
		return this.bizApp;
	}

    /**
     * Sets biz app.
     *
     * @param bizApp the biz app
     */
    public void setBizApp(String bizApp) {
		this.bizApp = bizApp;
	}

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
     * Gets biz info.
     *
     * @return the biz info
     */
    public String getBizInfo() {
		return this.bizInfo;
	}

    /**
     * Sets biz info.
     *
     * @param bizInfo the biz info
     */
    public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
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
     * Gets order type.
     *
     * @return the order type
     */
    public Long getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(Long orderType) {
		this.orderType = orderType;
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
     * Gets sign data list.
     *
     * @return the sign data list
     */
    public List<SignDataInfo> getSignDataList() {
		return this.signDataList;
	}

    /**
     * Sets sign data list.
     *
     * @param signDataList the sign data list
     */
    public void setSignDataList(List<SignDataInfo> signDataList) {
		this.signDataList = signDataList;
	}

    /**
     * Gets sign task list.
     *
     * @return the sign task list
     */
    public List<SignTask> getSignTaskList() {
		return this.signTaskList;
	}

    /**
     * Sets sign task list.
     *
     * @param signTaskList the sign task list
     */
    public void setSignTaskList(List<SignTask> signTaskList) {
		this.signTaskList = signTaskList;
	}

    /**
     * Gets sign task type.
     *
     * @return the sign task type
     */
    public Long getSignTaskType() {
		return this.signTaskType;
	}

    /**
     * Sets sign task type.
     *
     * @param signTaskType the sign task type
     */
    public void setSignTaskType(Long signTaskType) {
		this.signTaskType = signTaskType;
	}

}
