package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务场景信息
 *
 * @author auto create
 * @since 1.0, 2017-11-16 14:06:46
 */
public class AuthenticationScene extends AlipayObject {

	private static final long serialVersionUID = 7341161778241552233L;

	/**
	 * 渠道类型
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 系统名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务产品节点
	 */
	@ApiField("biz_prod_node")
	private String bizProdNode;

	/**
	 * 产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 场景参数
	 */
	@ApiField("scene_params")
	private String sceneParams;

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
     * Gets biz name.
     *
     * @return the biz name
     */
    public String getBizName() {
		return this.bizName;
	}

    /**
     * Sets biz name.
     *
     * @param bizName the biz name
     */
    public void setBizName(String bizName) {
		this.bizName = bizName;
	}

    /**
     * Gets biz prod node.
     *
     * @return the biz prod node
     */
    public String getBizProdNode() {
		return this.bizProdNode;
	}

    /**
     * Sets biz prod node.
     *
     * @param bizProdNode the biz prod node
     */
    public void setBizProdNode(String bizProdNode) {
		this.bizProdNode = bizProdNode;
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
     * Gets scene params.
     *
     * @return the scene params
     */
    public String getSceneParams() {
		return this.sceneParams;
	}

    /**
     * Sets scene params.
     *
     * @param sceneParams the scene params
     */
    public void setSceneParams(String sceneParams) {
		this.sceneParams = sceneParams;
	}

}
