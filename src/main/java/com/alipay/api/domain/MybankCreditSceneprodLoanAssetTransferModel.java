package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融订单资产转让
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:59:03
 */
public class MybankCreditSceneprodLoanAssetTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8619916127237947523L;

	/**
	 * 接收资产方的网商银行账户, 内标，200开头，不是8888开头的
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 业务订单扩展字段，根据机构不同填入的参数会有区别
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 出资机构在网商的角色号（ipRoleId）
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 机构编码，机构接入场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品编码，场景金融平台给机构提供的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 服务机构在网商的角色号（ipRoleId）
	 */
	@ApiField("service_inst_iprole_id")
	private String serviceInstIproleId;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

    /**
     * Gets account no.
     *
     * @return the account no
     */
    public String getAccountNo() {
		return this.accountNo;
	}

    /**
     * Sets account no.
     *
     * @param accountNo the account no
     */
    public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets finance inst iprole id.
     *
     * @return the finance inst iprole id
     */
    public String getFinanceInstIproleId() {
		return this.financeInstIproleId;
	}

    /**
     * Sets finance inst iprole id.
     *
     * @param financeInstIproleId the finance inst iprole id
     */
    public void setFinanceInstIproleId(String financeInstIproleId) {
		this.financeInstIproleId = financeInstIproleId;
	}

    /**
     * Gets org code.
     *
     * @return the org code
     */
    public String getOrgCode() {
		return this.orgCode;
	}

    /**
     * Sets org code.
     *
     * @param orgCode the org code
     */
    public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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
     * Gets service inst iprole id.
     *
     * @return the service inst iprole id
     */
    public String getServiceInstIproleId() {
		return this.serviceInstIproleId;
	}

    /**
     * Sets service inst iprole id.
     *
     * @param serviceInstIproleId the service inst iprole id
     */
    public void setServiceInstIproleId(String serviceInstIproleId) {
		this.serviceInstIproleId = serviceInstIproleId;
	}

    /**
     * Gets site.
     *
     * @return the site
     */
    public String getSite() {
		return this.site;
	}

    /**
     * Sets site.
     *
     * @param site the site
     */
    public void setSite(String site) {
		this.site = site;
	}

    /**
     * Gets site user id.
     *
     * @return the site user id
     */
    public String getSiteUserId() {
		return this.siteUserId;
	}

    /**
     * Sets site user id.
     *
     * @param siteUserId the site user id
     */
    public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
