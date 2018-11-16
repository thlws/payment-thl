package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保单列表查询
 *
 * @author auto create
 * @since 1.0, 2016-11-14 11:45:43
 */
public class AlipayInsSceneApplicationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3378352662841548478L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public InsPerson getApplicant() {
		return this.applicant;
	}

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
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
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
