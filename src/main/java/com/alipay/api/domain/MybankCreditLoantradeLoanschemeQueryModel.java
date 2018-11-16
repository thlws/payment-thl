package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询可贷款方案
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:21:58
 */
public class MybankCreditLoantradeLoanschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6274563387642919814L;

	/**
	 * 授信编号
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 微贷政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 外部产品码，外部机构与网商合作的方案产品码，用于标识所属的合作业务，pd_code为空是必传。
	 */
	@ApiField("out_uni_code")
	private String outUniCode;

	/**
	 * 金融云产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 基于哪个场景查询授信方案(FIXED_CREDIT:固化授信；PROD：产品；APPLY：申请；BL:保理；TYZBL：通用自保理；DYNAMIC：动态授信；CREDIT_LIST_FILTER：列表过滤授信方案)
	 */
	@ApiField("scen")
	private String scen;

    /**
     * Gets biz.
     *
     * @return the biz
     */
    public String getBiz() {
		return this.biz;
	}

    /**
     * Sets biz.
     *
     * @param biz the biz
     */
    public void setBiz(String biz) {
		this.biz = biz;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets entity code.
     *
     * @return the entity code
     */
    public String getEntityCode() {
		return this.entityCode;
	}

    /**
     * Sets entity code.
     *
     * @param entityCode the entity code
     */
    public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
		return this.entityName;
	}

    /**
     * Sets entity name.
     *
     * @param entityName the entity name
     */
    public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
		return this.entityType;
	}

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(String entityType) {
		this.entityType = entityType;
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
     * Gets out uni code.
     *
     * @return the out uni code
     */
    public String getOutUniCode() {
		return this.outUniCode;
	}

    /**
     * Sets out uni code.
     *
     * @param outUniCode the out uni code
     */
    public void setOutUniCode(String outUniCode) {
		this.outUniCode = outUniCode;
	}

    /**
     * Gets sale pd code.
     *
     * @return the sale pd code
     */
    public String getSalePdCode() {
		return this.salePdCode;
	}

    /**
     * Sets sale pd code.
     *
     * @param salePdCode the sale pd code
     */
    public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

    /**
     * Gets scen.
     *
     * @return the scen
     */
    public String getScen() {
		return this.scen;
	}

    /**
     * Sets scen.
     *
     * @param scen the scen
     */
    public void setScen(String scen) {
		this.scen = scen;
	}

}
