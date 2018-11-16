package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.commodity.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-16 17:32:17
 */
public class AlipayOpenServicemarketCommodityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8823627722339667871L;

	/** 
	 * 热点URL
	 */
	@ApiField("app_hot_logo")
	private String appHotLogo;

	/** 
	 * 插件服务审核备注
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/** 
	 * 授权文件url
	 */
	@ApiField("authorization_file")
	private String authorizationFile;

	/** 
	 * 插件应用类型
	 */
	@ApiField("biz_type_code")
	private String bizTypeCode;

	/** 
	 * CARLIFE("车主服务", "001"),
MEDICALCARE("医疗服务", "003"),
CITYSERVICE("城市服务", "004"),
MOBILE_OPERATOR("运营商服务", "005");
	 */
	@ApiField("category_code")
	private String categoryCode;

	/** 
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 服务归属  0-自主开发  1-委托开发者
	 */
	@ApiField("commodity_affiliation")
	private String commodityAffiliation;

	/** 
	 * 服务插件id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 服务商联系人
	 */
	@ApiField("contactor")
	private String contactor;

	/** 
	 * 服务创建时间
	 */
	@ApiField("create_date")
	private String createDate;

	/** 
	 * 服务logo地址
	 */
	@ApiField("log_url")
	private String logUrl;

	/** 
	 * 移动端服务配置地址
	 */
	@ApiField("mobile_visiturl")
	private String mobileVisiturl;

	/** 
	 * 服务创建者名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 服务商联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * ONLINE-已上架
OFFLINE-待上架
AUDIT-审核中
AUDIT_REJECT-审核拒绝
AUDIT_OFFLINE-已下架
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 0表示BD不可审核   1表示BD可以审核
	 */
	@ApiField("sub_status")
	private String subStatus;

	/** 
	 * 服务插件相关描述信息
	 */
	@ApiField("subtitle")
	private String subtitle;

	/** 
	 * 应用验收说明
	 */
	@ApiField("test_detail")
	private String testDetail;

	/** 
	 * 压力测试报告url
	 */
	@ApiField("test_report")
	private String testReport;

	/** 
	 * 服务插件名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 用户指南url
	 */
	@ApiField("user_guide")
	private String userGuide;

	/** 
	 * 服务创建者ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets app hot logo.
     *
     * @param appHotLogo the app hot logo
     */
    public void setAppHotLogo(String appHotLogo) {
		this.appHotLogo = appHotLogo;
	}

    /**
     * Gets app hot logo.
     *
     * @return the app hot logo
     */
    public String getAppHotLogo( ) {
		return this.appHotLogo;
	}

    /**
     * Sets audit memo.
     *
     * @param auditMemo the audit memo
     */
    public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

    /**
     * Gets audit memo.
     *
     * @return the audit memo
     */
    public String getAuditMemo( ) {
		return this.auditMemo;
	}

    /**
     * Sets authorization file.
     *
     * @param authorizationFile the authorization file
     */
    public void setAuthorizationFile(String authorizationFile) {
		this.authorizationFile = authorizationFile;
	}

    /**
     * Gets authorization file.
     *
     * @return the authorization file
     */
    public String getAuthorizationFile( ) {
		return this.authorizationFile;
	}

    /**
     * Sets biz type code.
     *
     * @param bizTypeCode the biz type code
     */
    public void setBizTypeCode(String bizTypeCode) {
		this.bizTypeCode = bizTypeCode;
	}

    /**
     * Gets biz type code.
     *
     * @return the biz type code
     */
    public String getBizTypeCode( ) {
		return this.bizTypeCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode( ) {
		return this.categoryCode;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId( ) {
		return this.categoryId;
	}

    /**
     * Sets commodity affiliation.
     *
     * @param commodityAffiliation the commodity affiliation
     */
    public void setCommodityAffiliation(String commodityAffiliation) {
		this.commodityAffiliation = commodityAffiliation;
	}

    /**
     * Gets commodity affiliation.
     *
     * @return the commodity affiliation
     */
    public String getCommodityAffiliation( ) {
		return this.commodityAffiliation;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId( ) {
		return this.commodityId;
	}

    /**
     * Sets contactor.
     *
     * @param contactor the contactor
     */
    public void setContactor(String contactor) {
		this.contactor = contactor;
	}

    /**
     * Gets contactor.
     *
     * @return the contactor
     */
    public String getContactor( ) {
		return this.contactor;
	}

    /**
     * Sets create date.
     *
     * @param createDate the create date
     */
    public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

    /**
     * Gets create date.
     *
     * @return the create date
     */
    public String getCreateDate( ) {
		return this.createDate;
	}

    /**
     * Sets log url.
     *
     * @param logUrl the log url
     */
    public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}

    /**
     * Gets log url.
     *
     * @return the log url
     */
    public String getLogUrl( ) {
		return this.logUrl;
	}

    /**
     * Sets mobile visiturl.
     *
     * @param mobileVisiturl the mobile visiturl
     */
    public void setMobileVisiturl(String mobileVisiturl) {
		this.mobileVisiturl = mobileVisiturl;
	}

    /**
     * Gets mobile visiturl.
     *
     * @return the mobile visiturl
     */
    public String getMobileVisiturl( ) {
		return this.mobileVisiturl;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone( ) {
		return this.phone;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets sub status.
     *
     * @param subStatus the sub status
     */
    public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

    /**
     * Gets sub status.
     *
     * @return the sub status
     */
    public String getSubStatus( ) {
		return this.subStatus;
	}

    /**
     * Sets subtitle.
     *
     * @param subtitle the subtitle
     */
    public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

    /**
     * Gets subtitle.
     *
     * @return the subtitle
     */
    public String getSubtitle( ) {
		return this.subtitle;
	}

    /**
     * Sets test detail.
     *
     * @param testDetail the test detail
     */
    public void setTestDetail(String testDetail) {
		this.testDetail = testDetail;
	}

    /**
     * Gets test detail.
     *
     * @return the test detail
     */
    public String getTestDetail( ) {
		return this.testDetail;
	}

    /**
     * Sets test report.
     *
     * @param testReport the test report
     */
    public void setTestReport(String testReport) {
		this.testReport = testReport;
	}

    /**
     * Gets test report.
     *
     * @return the test report
     */
    public String getTestReport( ) {
		return this.testReport;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle( ) {
		return this.title;
	}

    /**
     * Sets user guide.
     *
     * @param userGuide the user guide
     */
    public void setUserGuide(String userGuide) {
		this.userGuide = userGuide;
	}

    /**
     * Gets user guide.
     *
     * @return the user guide
     */
    public String getUserGuide( ) {
		return this.userGuide;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
