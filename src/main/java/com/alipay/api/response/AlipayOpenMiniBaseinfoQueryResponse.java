package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-15 14:11:36
 */
public class AlipayOpenMiniBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2848255967811352511L;

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
	 * 类目名称，格式为第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目;
	 */
	@ApiField("category_names")
	private String categoryNames;

	/** 
	 * 功能包名称
	 */
	@ApiListField("package_names")
	@ApiField("string")
	private List<String> packageNames;

	/** 
	 * 域白名单
	 */
	@ApiListField("safe_domains")
	@ApiField("string")
	private List<String> safeDomains;

	/** 
	 * 小程序客服邮箱
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/** 
	 * 小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

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
     * Sets category names.
     *
     * @param categoryNames the category names
     */
    public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}

    /**
     * Gets category names.
     *
     * @return the category names
     */
    public String getCategoryNames( ) {
		return this.categoryNames;
	}

    /**
     * Sets package names.
     *
     * @param packageNames the package names
     */
    public void setPackageNames(List<String> packageNames) {
		this.packageNames = packageNames;
	}

    /**
     * Gets package names.
     *
     * @return the package names
     */
    public List<String> getPackageNames( ) {
		return this.packageNames;
	}

    /**
     * Sets safe domains.
     *
     * @param safeDomains the safe domains
     */
    public void setSafeDomains(List<String> safeDomains) {
		this.safeDomains = safeDomains;
	}

    /**
     * Gets safe domains.
     *
     * @return the safe domains
     */
    public List<String> getSafeDomains( ) {
		return this.safeDomains;
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

}
