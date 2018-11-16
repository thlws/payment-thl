package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息验证
 *
 * @author auto create
 * @since 1.0, 2017-11-29 18:04:35
 */
public class ZhimaCreditRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1873789382212239566L;

	/**
	 * 申请人证件号，中国大陆18或者15位合法身份号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 申请人证件姓名，简体中文，长度不超过64，姓名中不含",","/u0001"，"|","&","^","\\"等特殊字符
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码，标记商户接入的具体产品；直接使用每个接口入参中示例值即可
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请人与联系人之间关系类型，目前支持4类关系，family(亲友)、workmate(同事)、schoolmate(同学)、friend(朋友)
	 */
	@ApiField("relation")
	private String relation;

	/**
	 * 联系人姓名，简体中文，长度不超过64，姓名中不含",","/u0001"，"|","&","^","\\"等特殊字符
	 */
	@ApiField("relation_name")
	private String relationName;

	/**
	 * 手机号码。中国大陆合法手机号，长度11位，不含国家代码
	 */
	@ApiField("relation_phone")
	private String relationPhone;

	/**
	 * 商户请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，商户要保证其业务唯一性，使用相同transaction_id的查询，芝麻在一段时间内（一般为1天）返回首次查询结果，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

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
     * Gets relation.
     *
     * @return the relation
     */
    public String getRelation() {
		return this.relation;
	}

    /**
     * Sets relation.
     *
     * @param relation the relation
     */
    public void setRelation(String relation) {
		this.relation = relation;
	}

    /**
     * Gets relation name.
     *
     * @return the relation name
     */
    public String getRelationName() {
		return this.relationName;
	}

    /**
     * Sets relation name.
     *
     * @param relationName the relation name
     */
    public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

    /**
     * Gets relation phone.
     *
     * @return the relation phone
     */
    public String getRelationPhone() {
		return this.relationPhone;
	}

    /**
     * Sets relation phone.
     *
     * @param relationPhone the relation phone
     */
    public void setRelationPhone(String relationPhone) {
		this.relationPhone = relationPhone;
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
