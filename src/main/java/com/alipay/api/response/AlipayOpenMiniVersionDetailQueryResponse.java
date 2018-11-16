package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppCategoryInfo;
import com.alipay.api.domain.MiniPackageInfo;
import com.alipay.api.domain.RegionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.version.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-25 00:18:29
 */
public class AlipayOpenMiniVersionDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4157666476321337898L;

	/** 
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * 小程序应用英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/** 
	 * 小程序应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 小程序应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/** 
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 小程序版本提交审核的时间
	 */
	@ApiField("gmt_apply_audit")
	private String gmtApplyAudit;

	/** 
	 * 小程序版本审核结束时间
	 */
	@ApiField("gmt_audit_end")
	private String gmtAuditEnd;

	/** 
	 * 小程序版本创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 小程序版本下架时间
	 */
	@ApiField("gmt_offline")
	private String gmtOffline;

	/** 
	 * 小程序版本上架时间
	 */
	@ApiField("gmt_online")
	private String gmtOnline;

	/** 
	 * 小程序灰度比例值，p10-10%的用户，p30-30%的用户，p50-50%的用户
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	/** 
	 * 小程序备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 小程序类目列表
	 */
	@ApiListField("mini_app_category_info_list")
	@ApiField("mini_app_category_info")
	private List<MiniAppCategoryInfo> miniAppCategoryInfoList;

	/** 
	 * 小程序功能包列表
	 */
	@ApiListField("package_info_list")
	@ApiField("mini_package_info")
	private List<MiniPackageInfo> packageInfoList;

	/** 
	 * 审核驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 安全扫描结果，HAS_RISK-安全扫描不通过，APPROVED-安全扫描通过，SCANNING-正在扫描
	 */
	@ApiField("scan_result")
	private String scanResult;

	/** 
	 * 小程序版本截图，多个截图以逗号隔开
	 */
	@ApiListField("screen_shot_list")
	@ApiField("string")
	private List<String> screenShotList;

	/** 
	 * 客服邮箱
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/** 
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/** 
	 * 小程序服务区域信息，当服务区域类型是LOCATION时，这里明确指出具体的服务区域信息
	 */
	@ApiListField("service_region_info")
	@ApiField("region_info")
	private List<RegionInfo> serviceRegionInfo;

	/** 
	 * 小程序服务区域类型，GLOBLE-全球，CHINA-中国，LOCATION-指定区域
	 */
	@ApiField("service_region_type")
	private String serviceRegionType;

	/** 
	 * 小程序版本状态，INIT-开发中，AUDITING-审核中，WAIT_RELEASE-审核通过，AUDIT_REJECT-审核驳回，RELEASE-已上架，GRAY-灰度中，OFFLINE-下架
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 小程序版本描述
	 */
	@ApiField("version_desc")
	private String versionDesc;

    /**
     * Sets app desc.
     *
     * @param appDesc the app desc
     */
    public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

    /**
     * Gets app desc.
     *
     * @return the app desc
     */
    public String getAppDesc( ) {
		return this.appDesc;
	}

    /**
     * Sets app english name.
     *
     * @param appEnglishName the app english name
     */
    public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

    /**
     * Gets app english name.
     *
     * @return the app english name
     */
    public String getAppEnglishName( ) {
		return this.appEnglishName;
	}

    /**
     * Sets app logo.
     *
     * @param appLogo the app logo
     */
    public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

    /**
     * Gets app logo.
     *
     * @return the app logo
     */
    public String getAppLogo( ) {
		return this.appLogo;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName( ) {
		return this.appName;
	}

    /**
     * Sets app slogan.
     *
     * @param appSlogan the app slogan
     */
    public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

    /**
     * Gets app slogan.
     *
     * @return the app slogan
     */
    public String getAppSlogan( ) {
		return this.appSlogan;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion( ) {
		return this.appVersion;
	}

    /**
     * Sets gmt apply audit.
     *
     * @param gmtApplyAudit the gmt apply audit
     */
    public void setGmtApplyAudit(String gmtApplyAudit) {
		this.gmtApplyAudit = gmtApplyAudit;
	}

    /**
     * Gets gmt apply audit.
     *
     * @return the gmt apply audit
     */
    public String getGmtApplyAudit( ) {
		return this.gmtApplyAudit;
	}

    /**
     * Sets gmt audit end.
     *
     * @param gmtAuditEnd the gmt audit end
     */
    public void setGmtAuditEnd(String gmtAuditEnd) {
		this.gmtAuditEnd = gmtAuditEnd;
	}

    /**
     * Gets gmt audit end.
     *
     * @return the gmt audit end
     */
    public String getGmtAuditEnd( ) {
		return this.gmtAuditEnd;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets gmt offline.
     *
     * @param gmtOffline the gmt offline
     */
    public void setGmtOffline(String gmtOffline) {
		this.gmtOffline = gmtOffline;
	}

    /**
     * Gets gmt offline.
     *
     * @return the gmt offline
     */
    public String getGmtOffline( ) {
		return this.gmtOffline;
	}

    /**
     * Sets gmt online.
     *
     * @param gmtOnline the gmt online
     */
    public void setGmtOnline(String gmtOnline) {
		this.gmtOnline = gmtOnline;
	}

    /**
     * Gets gmt online.
     *
     * @return the gmt online
     */
    public String getGmtOnline( ) {
		return this.gmtOnline;
	}

    /**
     * Sets gray strategy.
     *
     * @param grayStrategy the gray strategy
     */
    public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

    /**
     * Gets gray strategy.
     *
     * @return the gray strategy
     */
    public String getGrayStrategy( ) {
		return this.grayStrategy;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
	}

    /**
     * Sets mini app category info list.
     *
     * @param miniAppCategoryInfoList the mini app category info list
     */
    public void setMiniAppCategoryInfoList(List<MiniAppCategoryInfo> miniAppCategoryInfoList) {
		this.miniAppCategoryInfoList = miniAppCategoryInfoList;
	}

    /**
     * Gets mini app category info list.
     *
     * @return the mini app category info list
     */
    public List<MiniAppCategoryInfo> getMiniAppCategoryInfoList( ) {
		return this.miniAppCategoryInfoList;
	}

    /**
     * Sets package info list.
     *
     * @param packageInfoList the package info list
     */
    public void setPackageInfoList(List<MiniPackageInfo> packageInfoList) {
		this.packageInfoList = packageInfoList;
	}

    /**
     * Gets package info list.
     *
     * @return the package info list
     */
    public List<MiniPackageInfo> getPackageInfoList( ) {
		return this.packageInfoList;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason( ) {
		return this.rejectReason;
	}

    /**
     * Sets scan result.
     *
     * @param scanResult the scan result
     */
    public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}

    /**
     * Gets scan result.
     *
     * @return the scan result
     */
    public String getScanResult( ) {
		return this.scanResult;
	}

    /**
     * Sets screen shot list.
     *
     * @param screenShotList the screen shot list
     */
    public void setScreenShotList(List<String> screenShotList) {
		this.screenShotList = screenShotList;
	}

    /**
     * Gets screen shot list.
     *
     * @return the screen shot list
     */
    public List<String> getScreenShotList( ) {
		return this.screenShotList;
	}

    /**
     * Sets service email.
     *
     * @param serviceEmail the service email
     */
    public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

    /**
     * Gets service email.
     *
     * @return the service email
     */
    public String getServiceEmail( ) {
		return this.serviceEmail;
	}

    /**
     * Sets service phone.
     *
     * @param servicePhone the service phone
     */
    public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

    /**
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone( ) {
		return this.servicePhone;
	}

    /**
     * Sets service region info.
     *
     * @param serviceRegionInfo the service region info
     */
    public void setServiceRegionInfo(List<RegionInfo> serviceRegionInfo) {
		this.serviceRegionInfo = serviceRegionInfo;
	}

    /**
     * Gets service region info.
     *
     * @return the service region info
     */
    public List<RegionInfo> getServiceRegionInfo( ) {
		return this.serviceRegionInfo;
	}

    /**
     * Sets service region type.
     *
     * @param serviceRegionType the service region type
     */
    public void setServiceRegionType(String serviceRegionType) {
		this.serviceRegionType = serviceRegionType;
	}

    /**
     * Gets service region type.
     *
     * @return the service region type
     */
    public String getServiceRegionType( ) {
		return this.serviceRegionType;
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
     * Sets version desc.
     *
     * @param versionDesc the version desc
     */
    public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}

    /**
     * Gets version desc.
     *
     * @return the version desc
     */
    public String getVersionDesc( ) {
		return this.versionDesc;
	}

}
