package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业免押额度申请初始化
 *
 * @author auto create
 * @since 1.0, 2018-06-28 17:55:31
 */
public class ZhimaCreditEpFreedepositInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2263479791114235286L;

	/**
	 * 业务场景，生活号：SHENGHUOHAO
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 业务来源标识，由前置跳转传递给服务商系统，服务商不需要理解，在本接口传入即可
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 法人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 法人证件类型，大陆身份证：IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 类目
	 */
	@ApiField("credit_category")
	private String creditCategory;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型：
NATIONAL_LEGAL---工商注册号
NATIONAL_LEGAL_MERGE---社会统一信用代码
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 商户传入的跳转地址，该地址由商户调用时候传入，系统不处理，在applay接口完成处理后在biz_content内容带回，由商户系统做完回跳解析后执行redirect
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 商户业务流水号，确保每次业务唯一。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 法人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部请求号，用作关联使用，该号可以是前置业务产生传递给商户，需要商户验签后解析使用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 企业免押额度申请产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求ID，如果是企业信用页面发起的，会在前置流程里面传递给商户该请求值，商户直接在本接口传递接收到的值即可
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets biz channel.
     *
     * @return the biz channel
     */
    public String getBizChannel() {
		return this.bizChannel;
	}

    /**
     * Sets biz channel.
     *
     * @param bizChannel the biz channel
     */
    public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

    /**
     * Gets biz source.
     *
     * @return the biz source
     */
    public String getBizSource() {
		return this.bizSource;
	}

    /**
     * Sets biz source.
     *
     * @param bizSource the biz source
     */
    public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
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
     * Gets credit category.
     *
     * @return the credit category
     */
    public String getCreditCategory() {
		return this.creditCategory;
	}

    /**
     * Sets credit category.
     *
     * @param creditCategory the credit category
     */
    public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

    /**
     * Gets ep cert no.
     *
     * @return the ep cert no
     */
    public String getEpCertNo() {
		return this.epCertNo;
	}

    /**
     * Sets ep cert no.
     *
     * @param epCertNo the ep cert no
     */
    public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

    /**
     * Gets ep cert type.
     *
     * @return the ep cert type
     */
    public String getEpCertType() {
		return this.epCertType;
	}

    /**
     * Sets ep cert type.
     *
     * @param epCertType the ep cert type
     */
    public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

    /**
     * Gets ep name.
     *
     * @return the ep name
     */
    public String getEpName() {
		return this.epName;
	}

    /**
     * Sets ep name.
     *
     * @param epName the ep name
     */
    public void setEpName(String epName) {
		this.epName = epName;
	}

    /**
     * Gets goto url.
     *
     * @return the goto url
     */
    public String getGotoUrl() {
		return this.gotoUrl;
	}

    /**
     * Sets goto url.
     *
     * @param gotoUrl the goto url
     */
    public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
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
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

}
