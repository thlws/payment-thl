package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证初始化
 *
 * @author auto create
 * @since 1.0, 2017-10-27 14:28:16
 */
public class ZhimaCustomerEpCertificationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7425963151789518697L;

	/**
	 * 认证场景码，支持的场景码有EP_ALIPAY_ACCOUNT。签约的协议决定了可以使用哪些场景。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 扩展业务参数，暂时没有用到，接口预留
	 */
	@ApiField("ext_biz_param")
	private String extBizParam;

	/**
	 * 值为一个json串，无入参时值为"{}"，有入参时必须指定身份类型identity_type，不同的身份类型对应的身份信息不同。 
当前支持的identity_type=EP_CERT_INFO ，身份信息为法人证件三要素与企业证件三要素，如 {"identity_type": "EP_CERT_INFO", "cert_type": "IDENTITY_CARD", "cert_name": "收委", "cert_no":"260104197909275964", "ep_cert_type": "NATIONAL_LEGAL_MERGE", "ep_cert_name": "xxx有限公司", "ep_cert_no":"91330000327827106L"}。
备注：上述json串中的 ep_cert_type 属性仅支持2种类型： NATIONAL_LEGAL：工商注册号；NATIONAL_LEGAL_MERGE ： 社会统一信用代码。
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 认证商户自定义配置，支持一些商户可选的功能,目前为预留的属性值
	 */
	@ApiField("merchant_config")
	private String merchantConfig;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段日期，结尾可以使用一个序列号。
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode() {
		return this.bizCode;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets ext biz param.
     *
     * @return the ext biz param
     */
    public String getExtBizParam() {
		return this.extBizParam;
	}

    /**
     * Sets ext biz param.
     *
     * @param extBizParam the ext biz param
     */
    public void setExtBizParam(String extBizParam) {
		this.extBizParam = extBizParam;
	}

    /**
     * Gets identity param.
     *
     * @return the identity param
     */
    public String getIdentityParam() {
		return this.identityParam;
	}

    /**
     * Sets identity param.
     *
     * @param identityParam the identity param
     */
    public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

    /**
     * Gets merchant config.
     *
     * @return the merchant config
     */
    public String getMerchantConfig() {
		return this.merchantConfig;
	}

    /**
     * Sets merchant config.
     *
     * @param merchantConfig the merchant config
     */
    public void setMerchantConfig(String merchantConfig) {
		this.merchantConfig = merchantConfig;
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
