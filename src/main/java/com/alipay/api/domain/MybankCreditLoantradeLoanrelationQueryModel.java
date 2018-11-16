package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客户的申贷记录
 *
 * @author auto create
 * @since 1.0, 2018-05-11 17:51:30
 */
public class MybankCreditLoantradeLoanrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5781541515833289932L;

	/**
	 * 工商注册号或者身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 当客户为公司时，certtype是全国组织机构代码证书。当客户为个人时，是居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 预留的扩展字段
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 当客户是公司时，entityname是公司名全称；当客户是个人时，entityname是姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

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
     * Gets ext params.
     *
     * @return the ext params
     */
    public String getExtParams() {
		return this.extParams;
	}

    /**
     * Sets ext params.
     *
     * @param extParams the ext params
     */
    public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

    /**
     * Gets loan policy code.
     *
     * @return the loan policy code
     */
    public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}

    /**
     * Sets loan policy code.
     *
     * @param loanPolicyCode the loan policy code
     */
    public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
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

}
