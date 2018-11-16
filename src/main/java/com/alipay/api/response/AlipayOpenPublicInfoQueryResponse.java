package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicAuditStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.info.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3886216431999353496L;

	/** 
	 * 生活号名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 最新审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 最新审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 审核状态表，目前支持名称、头像、名称与头像、简介审核状态
	 */
	@ApiListField("audit_status_list")
	@ApiField("public_audit_status")
	private List<PublicAuditStatus> auditStatusList;

	/** 
	 * 背景图片地址
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/** 
	 * 生活号简介
	 */
	@ApiField("introduction")
	private String introduction;

	/** 
	 * 生活号是否上线，T表示上线，F表示未上线
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 生活号是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架
	 */
	@ApiField("is_release")
	private String isRelease;

	/** 
	 * 生活号头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 商家经营类目，详情可参考
<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.INIZWb&articleId=105364&docType=1">商家经营类目</a>
	 */
	@ApiField("mcc_code_desc")
	private String mccCodeDesc;

	/** 
	 * 欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

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
     * Sets audit desc.
     *
     * @param auditDesc the audit desc
     */
    public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

    /**
     * Gets audit desc.
     *
     * @return the audit desc
     */
    public String getAuditDesc( ) {
		return this.auditDesc;
	}

    /**
     * Sets audit status.
     *
     * @param auditStatus the audit status
     */
    public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

    /**
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus( ) {
		return this.auditStatus;
	}

    /**
     * Sets audit status list.
     *
     * @param auditStatusList the audit status list
     */
    public void setAuditStatusList(List<PublicAuditStatus> auditStatusList) {
		this.auditStatusList = auditStatusList;
	}

    /**
     * Gets audit status list.
     *
     * @return the audit status list
     */
    public List<PublicAuditStatus> getAuditStatusList( ) {
		return this.auditStatusList;
	}

    /**
     * Sets background url.
     *
     * @param backgroundUrl the background url
     */
    public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

    /**
     * Gets background url.
     *
     * @return the background url
     */
    public String getBackgroundUrl( ) {
		return this.backgroundUrl;
	}

    /**
     * Sets introduction.
     *
     * @param introduction the introduction
     */
    public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

    /**
     * Gets introduction.
     *
     * @return the introduction
     */
    public String getIntroduction( ) {
		return this.introduction;
	}

    /**
     * Sets is online.
     *
     * @param isOnline the is online
     */
    public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

    /**
     * Gets is online.
     *
     * @return the is online
     */
    public String getIsOnline( ) {
		return this.isOnline;
	}

    /**
     * Sets is release.
     *
     * @param isRelease the is release
     */
    public void setIsRelease(String isRelease) {
		this.isRelease = isRelease;
	}

    /**
     * Gets is release.
     *
     * @return the is release
     */
    public String getIsRelease( ) {
		return this.isRelease;
	}

    /**
     * Sets logo url.
     *
     * @param logoUrl the logo url
     */
    public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl( ) {
		return this.logoUrl;
	}

    /**
     * Sets mcc code desc.
     *
     * @param mccCodeDesc the mcc code desc
     */
    public void setMccCodeDesc(String mccCodeDesc) {
		this.mccCodeDesc = mccCodeDesc;
	}

    /**
     * Gets mcc code desc.
     *
     * @return the mcc code desc
     */
    public String getMccCodeDesc( ) {
		return this.mccCodeDesc;
	}

    /**
     * Sets public greeting.
     *
     * @param publicGreeting the public greeting
     */
    public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}

    /**
     * Gets public greeting.
     *
     * @return the public greeting
     */
    public String getPublicGreeting( ) {
		return this.publicGreeting;
	}

}
