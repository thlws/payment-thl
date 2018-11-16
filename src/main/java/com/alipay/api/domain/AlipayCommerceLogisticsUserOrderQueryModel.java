package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户业务订单查询
 *
 * @author auto create
 * @since 1.0, 2018-03-28 17:29:55
 */
public class AlipayCommerceLogisticsUserOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7246123281433299847L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展参数 , json 格式。
可选还是必选取决于biz_type参数 . 
对于 CABINET_FACE_TAKE 自提柜刷脸开柜业务需要传字段 cabinet_no ( 柜子编号 ) .
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 物流体系里合作商户的编码
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	/**
	 * 当前支持支付宝登录号,以及支付宝人脸标识
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 目前支持支付宝登录号( ALIPAY_LOGON_ID ) ,以及支付宝人脸标识 ( ALIPAY_FACE_TOKEN )
	 */
	@ApiField("target_id_type")
	private String targetIdType;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets merchant code.
     *
     * @return the merchant code
     */
    public String getMerchantCode() {
		return this.merchantCode;
	}

    /**
     * Sets merchant code.
     *
     * @param merchantCode the merchant code
     */
    public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

    /**
     * Gets target id.
     *
     * @return the target id
     */
    public String getTargetId() {
		return this.targetId;
	}

    /**
     * Sets target id.
     *
     * @param targetId the target id
     */
    public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

    /**
     * Gets target id type.
     *
     * @return the target id type
     */
    public String getTargetIdType() {
		return this.targetIdType;
	}

    /**
     * Sets target id type.
     *
     * @param targetIdType the target id type
     */
    public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

}
