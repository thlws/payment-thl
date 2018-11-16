package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宣讲会新增与刷新接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:23
 */
public class AlipayEcoEduCampusJobtalkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2884494348645431943L;

	/**
	 * 公司在合作方的唯一标识id
	 */
	@ApiField("campany_source")
	private String campanySource;

	/**
	 * 工作城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 工作城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 宣讲会公司法律名称（唯一）
	 */
	@ApiField("company_lawname")
	private String companyLawname;

	/**
	 * 宣讲会公司全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 备用字段，json格式
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 工作城市地区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 工作地点纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 企业logo的url
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 工作地点经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 工作省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 工作省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;

	/**
	 * 宣讲会举办地点
	 */
	@ApiField("talk_address")
	private String talkAddress;

	/**
	 * 宣讲会正文，过滤要求：表格，字体字号，符号，图片，链接
	 */
	@ApiField("talk_content")
	private String talkContent;

	/**
	 * 宣讲会结束时间(毫秒数)
	 */
	@ApiField("talk_endtime")
	private String talkEndtime;

	/**
	 * 宣讲会举办时间(毫秒数)
	 */
	@ApiField("talk_holdtime")
	private String talkHoldtime;

	/**
	 * 宣讲会举办学校code
	 */
	@ApiField("talk_school_code")
	private String talkSchoolCode;

	/**
	 * 宣讲会举办学校
	 */
	@ApiField("talk_school_name")
	private String talkSchoolName;

	/**
	 * 宣讲会来源方id
	 */
	@ApiField("talk_source_code")
	private String talkSourceCode;

	/**
	 * 宣讲会在合作方的ID
	 */
	@ApiField("talk_source_id")
	private String talkSourceId;

	/**
	 * 宣讲会标题
	 */
	@ApiField("talk_title")
	private String talkTitle;

	/**
	 * 宣讲会类型
1=宣讲会
2=空中宣讲会
3=双选会
	 */
	@ApiField("talk_type")
	private Long talkType;

	/**
	 * 宣讲会信息来源
	 */
	@ApiField("talksource_source")
	private String talksourceSource;

	/**
	 * 企业官网
	 */
	@ApiField("web_url")
	private String webUrl;

    /**
     * Gets campany source.
     *
     * @return the campany source
     */
    public String getCampanySource() {
		return this.campanySource;
	}

    /**
     * Sets campany source.
     *
     * @param campanySource the campany source
     */
    public void setCampanySource(String campanySource) {
		this.campanySource = campanySource;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets company lawname.
     *
     * @return the company lawname
     */
    public String getCompanyLawname() {
		return this.companyLawname;
	}

    /**
     * Sets company lawname.
     *
     * @param companyLawname the company lawname
     */
    public void setCompanyLawname(String companyLawname) {
		this.companyLawname = companyLawname;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets content var.
     *
     * @return the content var
     */
    public String getContentVar() {
		return this.contentVar;
	}

    /**
     * Sets content var.
     *
     * @param contentVar the content var
     */
    public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

    /**
     * Gets district.
     *
     * @return the district
     */
    public String getDistrict() {
		return this.district;
	}

    /**
     * Sets district.
     *
     * @param district the district
     */
    public void setDistrict(String district) {
		this.district = district;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
		return this.logoUrl;
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
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
		return this.province;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets street.
     *
     * @return the street
     */
    public String getStreet() {
		return this.street;
	}

    /**
     * Sets street.
     *
     * @param street the street
     */
    public void setStreet(String street) {
		this.street = street;
	}

    /**
     * Gets talk address.
     *
     * @return the talk address
     */
    public String getTalkAddress() {
		return this.talkAddress;
	}

    /**
     * Sets talk address.
     *
     * @param talkAddress the talk address
     */
    public void setTalkAddress(String talkAddress) {
		this.talkAddress = talkAddress;
	}

    /**
     * Gets talk content.
     *
     * @return the talk content
     */
    public String getTalkContent() {
		return this.talkContent;
	}

    /**
     * Sets talk content.
     *
     * @param talkContent the talk content
     */
    public void setTalkContent(String talkContent) {
		this.talkContent = talkContent;
	}

    /**
     * Gets talk endtime.
     *
     * @return the talk endtime
     */
    public String getTalkEndtime() {
		return this.talkEndtime;
	}

    /**
     * Sets talk endtime.
     *
     * @param talkEndtime the talk endtime
     */
    public void setTalkEndtime(String talkEndtime) {
		this.talkEndtime = talkEndtime;
	}

    /**
     * Gets talk holdtime.
     *
     * @return the talk holdtime
     */
    public String getTalkHoldtime() {
		return this.talkHoldtime;
	}

    /**
     * Sets talk holdtime.
     *
     * @param talkHoldtime the talk holdtime
     */
    public void setTalkHoldtime(String talkHoldtime) {
		this.talkHoldtime = talkHoldtime;
	}

    /**
     * Gets talk school code.
     *
     * @return the talk school code
     */
    public String getTalkSchoolCode() {
		return this.talkSchoolCode;
	}

    /**
     * Sets talk school code.
     *
     * @param talkSchoolCode the talk school code
     */
    public void setTalkSchoolCode(String talkSchoolCode) {
		this.talkSchoolCode = talkSchoolCode;
	}

    /**
     * Gets talk school name.
     *
     * @return the talk school name
     */
    public String getTalkSchoolName() {
		return this.talkSchoolName;
	}

    /**
     * Sets talk school name.
     *
     * @param talkSchoolName the talk school name
     */
    public void setTalkSchoolName(String talkSchoolName) {
		this.talkSchoolName = talkSchoolName;
	}

    /**
     * Gets talk source code.
     *
     * @return the talk source code
     */
    public String getTalkSourceCode() {
		return this.talkSourceCode;
	}

    /**
     * Sets talk source code.
     *
     * @param talkSourceCode the talk source code
     */
    public void setTalkSourceCode(String talkSourceCode) {
		this.talkSourceCode = talkSourceCode;
	}

    /**
     * Gets talk source id.
     *
     * @return the talk source id
     */
    public String getTalkSourceId() {
		return this.talkSourceId;
	}

    /**
     * Sets talk source id.
     *
     * @param talkSourceId the talk source id
     */
    public void setTalkSourceId(String talkSourceId) {
		this.talkSourceId = talkSourceId;
	}

    /**
     * Gets talk title.
     *
     * @return the talk title
     */
    public String getTalkTitle() {
		return this.talkTitle;
	}

    /**
     * Sets talk title.
     *
     * @param talkTitle the talk title
     */
    public void setTalkTitle(String talkTitle) {
		this.talkTitle = talkTitle;
	}

    /**
     * Gets talk type.
     *
     * @return the talk type
     */
    public Long getTalkType() {
		return this.talkType;
	}

    /**
     * Sets talk type.
     *
     * @param talkType the talk type
     */
    public void setTalkType(Long talkType) {
		this.talkType = talkType;
	}

    /**
     * Gets talksource source.
     *
     * @return the talksource source
     */
    public String getTalksourceSource() {
		return this.talksourceSource;
	}

    /**
     * Sets talksource source.
     *
     * @param talksourceSource the talksource source
     */
    public void setTalksourceSource(String talksourceSource) {
		this.talksourceSource = talksourceSource;
	}

    /**
     * Gets web url.
     *
     * @return the web url
     */
    public String getWebUrl() {
		return this.webUrl;
	}

    /**
     * Sets web url.
     *
     * @param webUrl the web url
     */
    public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
