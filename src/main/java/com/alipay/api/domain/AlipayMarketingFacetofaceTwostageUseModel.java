package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当面付二阶段
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:35:17
 */
public class AlipayMarketingFacetofaceTwostageUseModel extends AlipayObject {

	private static final long serialVersionUID = 5552386657292672393L;

	/**
	 * 业务场景码，外部商户在接入时需要进行分配
	 */
	@ApiField("biz_sence")
	private String bizSence;

	/**
	 * 付钱码码值
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 业务场景唯一编号，用于标识这笔请求，每次调用请勿使用相同的sence_no，每笔请求的sence_no必须不一样，支付时传递的DYNAMIC_TOKEN_OUT_BIZ_NO必须与调用开放平台传递的sence_no保持一致
	 */
	@ApiField("sence_no")
	private String senceNo;

    /**
     * Gets biz sence.
     *
     * @return the biz sence
     */
    public String getBizSence() {
		return this.bizSence;
	}

    /**
     * Sets biz sence.
     *
     * @param bizSence the biz sence
     */
    public void setBizSence(String bizSence) {
		this.bizSence = bizSence;
	}

    /**
     * Gets dynamic id.
     *
     * @return the dynamic id
     */
    public String getDynamicId() {
		return this.dynamicId;
	}

    /**
     * Sets dynamic id.
     *
     * @param dynamicId the dynamic id
     */
    public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

    /**
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
	}

    /**
     * Gets sence no.
     *
     * @return the sence no
     */
    public String getSenceNo() {
		return this.senceNo;
	}

    /**
     * Sets sence no.
     *
     * @param senceNo the sence no
     */
    public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

}
