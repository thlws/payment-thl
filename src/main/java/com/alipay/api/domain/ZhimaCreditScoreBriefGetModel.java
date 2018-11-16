package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用评分普惠版
 *
 * @author auto create
 * @since 1.0, 2018-03-14 21:12:30
 */
public class ZhimaCreditScoreBriefGetModel extends AlipayObject {

	private static final long serialVersionUID = 2435269475492331872L;

	/**
	 * 350～950之间 业务判断的准入标准 建议业务确定一个稳定的判断标准 频繁的变更该标准可能导致接口被停用
	 */
	@ApiField("admittance_score")
	private Long admittanceScore;

	/**
	 * 对应的证件号(未脱敏)或支付宝uid
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 用户姓名 当证件类型为ALIPAY_USER_ID时不需要传入
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets admittance score.
     *
     * @return the admittance score
     */
    public Long getAdmittanceScore() {
		return this.admittanceScore;
	}

    /**
     * Sets admittance score.
     *
     * @param admittanceScore the admittance score
     */
    public void setAdmittanceScore(Long admittanceScore) {
		this.admittanceScore = admittanceScore;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets linked merchant id.
     *
     * @return the linked merchant id
     */
    public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}

    /**
     * Sets linked merchant id.
     *
     * @param linkedMerchantId the linked merchant id
     */
    public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return this.transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
