package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品询价申请
 *
 * @author auto create
 * @since 1.0, 2018-01-11 15:55:21
 */
public class AlipayInsSceneProductInquiryApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5471778876129646542L;

	/**
	 * 保险产品的投保人,当产品价格和投保人有关时候需传值
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保业务参数，标准json格式支付串
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险被保人,产品价格和被保人相关时传值。
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 询价流水号，标识一次询价请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保险产品码，由保险产品小二分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 投保来源渠道，由保险产品小二分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 产品险种对应的保额(金额类型，单位为分，例如100000为1000元)。产品保额类型为金额时必传
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

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
     * Gets insureds.
     *
     * @return the insureds
     */
    public List<InsPerson> getInsureds() {
		return this.insureds;
	}

    /**
     * Sets insureds.
     *
     * @param insureds the insureds
     */
    public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
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
     * Gets period.
     *
     * @return the period
     */
    public String getPeriod() {
		return this.period;
	}

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(String period) {
		this.period = period;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
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

    /**
     * Gets sum insured.
     *
     * @return the sum insured
     */
    public Long getSumInsured() {
		return this.sumInsured;
	}

    /**
     * Sets sum insured.
     *
     * @param sumInsured the sum insured
     */
    public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
