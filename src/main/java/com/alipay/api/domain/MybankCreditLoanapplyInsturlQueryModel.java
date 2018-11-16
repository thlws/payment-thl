package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构跳转链接查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-17 17:57:19
 */
public class MybankCreditLoanapplyInsturlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5151424649617179329L;

	/**
	 * 机构合约编号，商户接入企业信贷业务时自动分配，获取地址：https://partner.mybank.cn/cooperation/myCooperation.htm，路径：我的合作-查看详情-开发接口调用-接口合约编号；
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 业务接入类型，取值：Dsd、Ptd；Dsd为大数据贷款类型（网商贷专业版、基础版接口包对应合作机构请选择此类型，即合作机构推送数据，网商计算授信，网商承担风险），Ptd为平台贷款类型（合作机构自行计算授信并承担风险）；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 机构内部客户身份证号，当biz_type为Dsd时，cert_no +user_name或者user_id不能同时为null。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户合法性校验。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 机构客群标签，仅当arrangement_no存在的时候，此值可以为空；
	 */
	@ApiField("cust_group_code")
	private String custGroupCode;

	/**
	 * 机构内部客户工商注册号；
	 */
	@ApiField("ext_business_license_no")
	private String extBusinessLicenseNo;

	/**
	 * 机构用户ID，机构须保证编号唯一；
	 */
	@ApiField("ext_user_id")
	private String extUserId;

	/**
	 * 机构内部客户手机号，如果没有，默认值为11位0；
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 运营产品编码，仅当arrangement_no存在的时候，此值可以为空；
	 */
	@ApiField("op_pd_code")
	private String opPdCode;

	/**
	 * 入驻的机构的渠道编号，由业务接口人来分配
	 */
	@ApiField("org_channel_code")
	private String orgChannelCode;

	/**
	 * 跳转链接的类型，取值：scheme、landing；scheme为支付宝扫码跳转链接，landing为外部App跳转链接；
	 */
	@ApiField("url_type")
	private String urlType;

	/**
	 * 机构内部客户的支付宝ID，当biz_type为Dsd时，cert_no +user_name或者user_id不能同时为null。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户合法性校验。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 机构内部客户姓名，当biz_type为Dsd时，cert_no + user_name或者user_id不能同时为null。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户合法性校验。
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets arrangement no.
     *
     * @return the arrangement no
     */
    public String getArrangementNo() {
		return this.arrangementNo;
	}

    /**
     * Sets arrangement no.
     *
     * @param arrangementNo the arrangement no
     */
    public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Gets cust group code.
     *
     * @return the cust group code
     */
    public String getCustGroupCode() {
		return this.custGroupCode;
	}

    /**
     * Sets cust group code.
     *
     * @param custGroupCode the cust group code
     */
    public void setCustGroupCode(String custGroupCode) {
		this.custGroupCode = custGroupCode;
	}

    /**
     * Gets ext business license no.
     *
     * @return the ext business license no
     */
    public String getExtBusinessLicenseNo() {
		return this.extBusinessLicenseNo;
	}

    /**
     * Sets ext business license no.
     *
     * @param extBusinessLicenseNo the ext business license no
     */
    public void setExtBusinessLicenseNo(String extBusinessLicenseNo) {
		this.extBusinessLicenseNo = extBusinessLicenseNo;
	}

    /**
     * Gets ext user id.
     *
     * @return the ext user id
     */
    public String getExtUserId() {
		return this.extUserId;
	}

    /**
     * Sets ext user id.
     *
     * @param extUserId the ext user id
     */
    public void setExtUserId(String extUserId) {
		this.extUserId = extUserId;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets op pd code.
     *
     * @return the op pd code
     */
    public String getOpPdCode() {
		return this.opPdCode;
	}

    /**
     * Sets op pd code.
     *
     * @param opPdCode the op pd code
     */
    public void setOpPdCode(String opPdCode) {
		this.opPdCode = opPdCode;
	}

    /**
     * Gets org channel code.
     *
     * @return the org channel code
     */
    public String getOrgChannelCode() {
		return this.orgChannelCode;
	}

    /**
     * Sets org channel code.
     *
     * @param orgChannelCode the org channel code
     */
    public void setOrgChannelCode(String orgChannelCode) {
		this.orgChannelCode = orgChannelCode;
	}

    /**
     * Gets url type.
     *
     * @return the url type
     */
    public String getUrlType() {
		return this.urlType;
	}

    /**
     * Sets url type.
     *
     * @param urlType the url type
     */
    public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}
