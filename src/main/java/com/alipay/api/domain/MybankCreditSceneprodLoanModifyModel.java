package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融订单状态修改
 *
 * @author auto create
 * @since 1.0, 2018-07-31 10:38:20
 */
public class MybankCreditSceneprodLoanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7257763668543688781L;

	/**
	 * 业务订单扩展字段，根据机构不同填入的参数会有区别
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 扩展字段实体，规范了通用的扩展字段内的信息，便于调用方使用，与ext_param作用相同。与ext_param有同名字段冲突时以ext_param_info内容为准。
	 */
	@ApiField("ext_param_info")
	private SceneExtParam extParamInfo;

	/**
	 * 出资机构在网商的角色号（ipRoleId）, 不需要更改可以不填
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 贷款金额，单位：分 。如果不需要更改可以不传
	 */
	@ApiField("loan_amt")
	private String loanAmt;

	/**
	 * 贷款期数，单位：月，如果不需要更改可以不传
	 */
	@ApiField("loan_period")
	private String loanPeriod;

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
	 * 要更改的订单状态
	 */
	@ApiField("status")
	private String status;

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
     * Gets ext param info.
     *
     * @return the ext param info
     */
    public SceneExtParam getExtParamInfo() {
		return this.extParamInfo;
	}

    /**
     * Sets ext param info.
     *
     * @param extParamInfo the ext param info
     */
    public void setExtParamInfo(SceneExtParam extParamInfo) {
		this.extParamInfo = extParamInfo;
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
     * Gets loan amt.
     *
     * @return the loan amt
     */
    public String getLoanAmt() {
		return this.loanAmt;
	}

    /**
     * Sets loan amt.
     *
     * @param loanAmt the loan amt
     */
    public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

    /**
     * Gets loan period.
     *
     * @return the loan period
     */
    public String getLoanPeriod() {
		return this.loanPeriod;
	}

    /**
     * Sets loan period.
     *
     * @param loanPeriod the loan period
     */
    public void setLoanPeriod(String loanPeriod) {
		this.loanPeriod = loanPeriod;
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

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
