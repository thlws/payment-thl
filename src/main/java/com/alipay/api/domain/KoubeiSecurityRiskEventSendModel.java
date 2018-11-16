package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑isv风控事件发送接口
 *
 * @author auto create
 * @since 1.0, 2018-09-18 18:55:37
 */
public class KoubeiSecurityRiskEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 5851992921827579667L;

	/**
	 * 每一个事件码对应的扩展信息，是Map<String,String>的类型JSON格式化的字符串，具体内容与场景相关，请联系接口负责人获取相关文档。
	 */
	@ApiField("business_info")
	private String businessInfo;

	/**
	 * 事件发生的gmt事件，单位为毫秒
	 */
	@ApiField("gmt_occur")
	private Long gmtOccur;

	/**
	 * 场景关联的产品名称，例如外部商户（EXT_MERCHANT），外部门店（EXT_SHOP）
	 */
	@ApiField("product")
	private String product;

	/**
	 * 唯一标识请求的id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 业务场景码，描述一种具体的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

    /**
     * Gets business info.
     *
     * @return the business info
     */
    public String getBusinessInfo() {
		return this.businessInfo;
	}

    /**
     * Sets business info.
     *
     * @param businessInfo the business info
     */
    public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}

    /**
     * Gets gmt occur.
     *
     * @return the gmt occur
     */
    public Long getGmtOccur() {
		return this.gmtOccur;
	}

    /**
     * Sets gmt occur.
     *
     * @param gmtOccur the gmt occur
     */
    public void setGmtOccur(Long gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public String getProduct() {
		return this.product;
	}

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(String product) {
		this.product = product;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
