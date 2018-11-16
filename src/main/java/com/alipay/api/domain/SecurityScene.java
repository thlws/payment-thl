package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全场景
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:24
 */
public class SecurityScene extends AlipayObject {

	private static final long serialVersionUID = 3251222656771229793L;

	/**
	 * 接入渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 事件信息
	 */
	@ApiField("ctu_params")
	private String ctuParams;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品节点
	 */
	@ApiField("product_node")
	private String productNode;

	/**
	 * 扩展参数
	 */
	@ApiField("security_scene_params")
	private String securitySceneParams;

	/**
	 * 系统名称
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 总金额
	 */
	@ApiField("total_fee")
	private String totalFee;

    /**
     * Gets access channel.
     *
     * @return the access channel
     */
    public String getAccessChannel() {
		return this.accessChannel;
	}

    /**
     * Sets access channel.
     *
     * @param accessChannel the access channel
     */
    public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

    /**
     * Gets ctu params.
     *
     * @return the ctu params
     */
    public String getCtuParams() {
		return this.ctuParams;
	}

    /**
     * Sets ctu params.
     *
     * @param ctuParams the ctu params
     */
    public void setCtuParams(String ctuParams) {
		this.ctuParams = ctuParams;
	}

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
		return this.productName;
	}

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
		this.productName = productName;
	}

    /**
     * Gets product node.
     *
     * @return the product node
     */
    public String getProductNode() {
		return this.productNode;
	}

    /**
     * Sets product node.
     *
     * @param productNode the product node
     */
    public void setProductNode(String productNode) {
		this.productNode = productNode;
	}

    /**
     * Gets security scene params.
     *
     * @return the security scene params
     */
    public String getSecuritySceneParams() {
		return this.securitySceneParams;
	}

    /**
     * Sets security scene params.
     *
     * @param securitySceneParams the security scene params
     */
    public void setSecuritySceneParams(String securitySceneParams) {
		this.securitySceneParams = securitySceneParams;
	}

    /**
     * Gets system name.
     *
     * @return the system name
     */
    public String getSystemName() {
		return this.systemName;
	}

    /**
     * Sets system name.
     *
     * @param systemName the system name
     */
    public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return this.totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
