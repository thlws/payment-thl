package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建保险凭证请求对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InsCreateCertificateRequest extends AlipayObject {

	private static final long serialVersionUID = 1882369588752957693L;

	/**
	 * 扩展字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 面值
	 */
	@ApiField("face_value")
	private String faceValue;

	/**
	 * 电子保单号
	 */
	@ApiField("ins_policy_no")
	private String insPolicyNo;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拥有人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets certificate type.
     *
     * @return the certificate type
     */
    public String getCertificateType() {
		return this.certificateType;
	}

    /**
     * Sets certificate type.
     *
     * @param certificateType the certificate type
     */
    public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

    /**
     * Gets effect time.
     *
     * @return the effect time
     */
    public Date getEffectTime() {
		return this.effectTime;
	}

    /**
     * Sets effect time.
     *
     * @param effectTime the effect time
     */
    public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public Date getExpireTime() {
		return this.expireTime;
	}

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

    /**
     * Gets face value.
     *
     * @return the face value
     */
    public String getFaceValue() {
		return this.faceValue;
	}

    /**
     * Sets face value.
     *
     * @param faceValue the face value
     */
    public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

    /**
     * Gets ins policy no.
     *
     * @return the ins policy no
     */
    public String getInsPolicyNo() {
		return this.insPolicyNo;
	}

    /**
     * Sets ins policy no.
     *
     * @param insPolicyNo the ins policy no
     */
    public void setInsPolicyNo(String insPolicyNo) {
		this.insPolicyNo = insPolicyNo;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
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
     * Gets order source.
     *
     * @return the order source
     */
    public String getOrderSource() {
		return this.orderSource;
	}

    /**
     * Sets order source.
     *
     * @param orderSource the order source
     */
    public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets owner uid.
     *
     * @return the owner uid
     */
    public String getOwnerUid() {
		return this.ownerUid;
	}

    /**
     * Sets owner uid.
     *
     * @param ownerUid the owner uid
     */
    public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

}
