package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.directional.ipprofile.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-08 14:07:36
 */
public class AlipaySecurityRiskDirectionalIpprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2274538441549982884L;

	/** 
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/** 
	 * IP归属运营商所属市
	 */
	@ApiField("ip_carrier_city")
	private String ipCarrierCity;

	/** 
	 * IP归属运营商所属区县
	 */
	@ApiField("ip_carrier_district")
	private String ipCarrierDistrict;

	/** 
	 * IP归属运营商所属省
	 */
	@ApiField("ip_carrier_province")
	private String ipCarrierProvince;

	/** 
	 * 真实使用地所在市
	 */
	@ApiField("ip_gps_city")
	private String ipGpsCity;

	/** 
	 * 真实使用地所在区县
	 */
	@ApiField("ip_gps_district")
	private String ipGpsDistrict;

	/** 
	 * 真实使用地所在省
	 */
	@ApiField("ip_gps_province")
	private String ipGpsProvince;

	/** 
	 * IP最大概率经纬度点的纬度。统计ip使用地域出现概率最高的经纬度值，属性描述纬度
	 */
	@ApiField("ip_latitude")
	private String ipLatitude;

	/** 
	 * IP最大概率经纬度点的经度。统计ip使用地域出现概率最高的经纬度值，属性描述经度
	 */
	@ApiField("ip_longitude")
	private String ipLongitude;

	/** 
	 * 近三个月是否发生过案件,0：否；1：是
	 */
	@ApiField("is_case_threemonth")
	private String isCaseThreemonth;

	/** 
	 * 是否3G/4G等基站类IP,0：否；1：是
	 */
	@ApiField("is_cellular_ip")
	private String isCellularIp;

	/** 
	 * 是否教育网IP,0：否；1：是
	 */
	@ApiField("is_edu_ip")
	private String isEduIp;

	/** 
	 * 是否IDCIP,0：否；1：是
	 */
	@ApiField("is_idc_ip")
	private String isIdcIp;

	/** 
	 * 是否境外IP，0：否；1：是
	 */
	@ApiField("is_oversea_ip")
	private String isOverseaIp;

	/** 
	 * 是否代理IP,0：否；1：是
	 */
	@ApiField("is_proxy_ip")
	private String isProxyIp;

	/** 
	 * 身份证持有人使用当前IP的概率，取值范围：0 ~ 1，值越大概率越大
	 */
	@ApiField("net_cert_ratio")
	private String netCertRatio;

	/** 
	 * 手机号持有人使用当前IP的概率，取值范围：0 ~ 1，值越大概率越大
	 */
	@ApiField("net_phone_ratio")
	private String netPhoneRatio;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/** 
	 * IP使用时间类型，枚举类型，如：corp:工作类, life：家庭类, NA：未知
	 */
	@ApiField("usage_time_type")
	private String usageTimeType;

	/** 
	 * IP上近半年的活跃用户数
	 */
	@ApiField("user_cnt_halfyear")
	private String userCntHalfyear;

	/** 
	 * IP上周活跃平均用户数
	 */
	@ApiField("user_cnt_weekavg")
	private String userCntWeekavg;

	/** 
	 * IP上周用户数波动指数, 取值范围：0 ~ 1，值越大波动越大
	 */
	@ApiField("user_cnt_weekstddev")
	private String userCntWeekstddev;

	/** 
	 * IP上活跃用户的稳定指数，取值范围：0 ~ 1，越大越稳定
	 */
	@ApiField("user_stability")
	private String userStability;

    /**
     * Sets ip address.
     *
     * @param ipAddress the ip address
     */
    public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

    /**
     * Gets ip address.
     *
     * @return the ip address
     */
    public String getIpAddress( ) {
		return this.ipAddress;
	}

    /**
     * Sets ip carrier city.
     *
     * @param ipCarrierCity the ip carrier city
     */
    public void setIpCarrierCity(String ipCarrierCity) {
		this.ipCarrierCity = ipCarrierCity;
	}

    /**
     * Gets ip carrier city.
     *
     * @return the ip carrier city
     */
    public String getIpCarrierCity( ) {
		return this.ipCarrierCity;
	}

    /**
     * Sets ip carrier district.
     *
     * @param ipCarrierDistrict the ip carrier district
     */
    public void setIpCarrierDistrict(String ipCarrierDistrict) {
		this.ipCarrierDistrict = ipCarrierDistrict;
	}

    /**
     * Gets ip carrier district.
     *
     * @return the ip carrier district
     */
    public String getIpCarrierDistrict( ) {
		return this.ipCarrierDistrict;
	}

    /**
     * Sets ip carrier province.
     *
     * @param ipCarrierProvince the ip carrier province
     */
    public void setIpCarrierProvince(String ipCarrierProvince) {
		this.ipCarrierProvince = ipCarrierProvince;
	}

    /**
     * Gets ip carrier province.
     *
     * @return the ip carrier province
     */
    public String getIpCarrierProvince( ) {
		return this.ipCarrierProvince;
	}

    /**
     * Sets ip gps city.
     *
     * @param ipGpsCity the ip gps city
     */
    public void setIpGpsCity(String ipGpsCity) {
		this.ipGpsCity = ipGpsCity;
	}

    /**
     * Gets ip gps city.
     *
     * @return the ip gps city
     */
    public String getIpGpsCity( ) {
		return this.ipGpsCity;
	}

    /**
     * Sets ip gps district.
     *
     * @param ipGpsDistrict the ip gps district
     */
    public void setIpGpsDistrict(String ipGpsDistrict) {
		this.ipGpsDistrict = ipGpsDistrict;
	}

    /**
     * Gets ip gps district.
     *
     * @return the ip gps district
     */
    public String getIpGpsDistrict( ) {
		return this.ipGpsDistrict;
	}

    /**
     * Sets ip gps province.
     *
     * @param ipGpsProvince the ip gps province
     */
    public void setIpGpsProvince(String ipGpsProvince) {
		this.ipGpsProvince = ipGpsProvince;
	}

    /**
     * Gets ip gps province.
     *
     * @return the ip gps province
     */
    public String getIpGpsProvince( ) {
		return this.ipGpsProvince;
	}

    /**
     * Sets ip latitude.
     *
     * @param ipLatitude the ip latitude
     */
    public void setIpLatitude(String ipLatitude) {
		this.ipLatitude = ipLatitude;
	}

    /**
     * Gets ip latitude.
     *
     * @return the ip latitude
     */
    public String getIpLatitude( ) {
		return this.ipLatitude;
	}

    /**
     * Sets ip longitude.
     *
     * @param ipLongitude the ip longitude
     */
    public void setIpLongitude(String ipLongitude) {
		this.ipLongitude = ipLongitude;
	}

    /**
     * Gets ip longitude.
     *
     * @return the ip longitude
     */
    public String getIpLongitude( ) {
		return this.ipLongitude;
	}

    /**
     * Sets is case threemonth.
     *
     * @param isCaseThreemonth the is case threemonth
     */
    public void setIsCaseThreemonth(String isCaseThreemonth) {
		this.isCaseThreemonth = isCaseThreemonth;
	}

    /**
     * Gets is case threemonth.
     *
     * @return the is case threemonth
     */
    public String getIsCaseThreemonth( ) {
		return this.isCaseThreemonth;
	}

    /**
     * Sets is cellular ip.
     *
     * @param isCellularIp the is cellular ip
     */
    public void setIsCellularIp(String isCellularIp) {
		this.isCellularIp = isCellularIp;
	}

    /**
     * Gets is cellular ip.
     *
     * @return the is cellular ip
     */
    public String getIsCellularIp( ) {
		return this.isCellularIp;
	}

    /**
     * Sets is edu ip.
     *
     * @param isEduIp the is edu ip
     */
    public void setIsEduIp(String isEduIp) {
		this.isEduIp = isEduIp;
	}

    /**
     * Gets is edu ip.
     *
     * @return the is edu ip
     */
    public String getIsEduIp( ) {
		return this.isEduIp;
	}

    /**
     * Sets is idc ip.
     *
     * @param isIdcIp the is idc ip
     */
    public void setIsIdcIp(String isIdcIp) {
		this.isIdcIp = isIdcIp;
	}

    /**
     * Gets is idc ip.
     *
     * @return the is idc ip
     */
    public String getIsIdcIp( ) {
		return this.isIdcIp;
	}

    /**
     * Sets is oversea ip.
     *
     * @param isOverseaIp the is oversea ip
     */
    public void setIsOverseaIp(String isOverseaIp) {
		this.isOverseaIp = isOverseaIp;
	}

    /**
     * Gets is oversea ip.
     *
     * @return the is oversea ip
     */
    public String getIsOverseaIp( ) {
		return this.isOverseaIp;
	}

    /**
     * Sets is proxy ip.
     *
     * @param isProxyIp the is proxy ip
     */
    public void setIsProxyIp(String isProxyIp) {
		this.isProxyIp = isProxyIp;
	}

    /**
     * Gets is proxy ip.
     *
     * @return the is proxy ip
     */
    public String getIsProxyIp( ) {
		return this.isProxyIp;
	}

    /**
     * Sets net cert ratio.
     *
     * @param netCertRatio the net cert ratio
     */
    public void setNetCertRatio(String netCertRatio) {
		this.netCertRatio = netCertRatio;
	}

    /**
     * Gets net cert ratio.
     *
     * @return the net cert ratio
     */
    public String getNetCertRatio( ) {
		return this.netCertRatio;
	}

    /**
     * Sets net phone ratio.
     *
     * @param netPhoneRatio the net phone ratio
     */
    public void setNetPhoneRatio(String netPhoneRatio) {
		this.netPhoneRatio = netPhoneRatio;
	}

    /**
     * Gets net phone ratio.
     *
     * @return the net phone ratio
     */
    public String getNetPhoneRatio( ) {
		return this.netPhoneRatio;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

    /**
     * Sets usage time type.
     *
     * @param usageTimeType the usage time type
     */
    public void setUsageTimeType(String usageTimeType) {
		this.usageTimeType = usageTimeType;
	}

    /**
     * Gets usage time type.
     *
     * @return the usage time type
     */
    public String getUsageTimeType( ) {
		return this.usageTimeType;
	}

    /**
     * Sets user cnt halfyear.
     *
     * @param userCntHalfyear the user cnt halfyear
     */
    public void setUserCntHalfyear(String userCntHalfyear) {
		this.userCntHalfyear = userCntHalfyear;
	}

    /**
     * Gets user cnt halfyear.
     *
     * @return the user cnt halfyear
     */
    public String getUserCntHalfyear( ) {
		return this.userCntHalfyear;
	}

    /**
     * Sets user cnt weekavg.
     *
     * @param userCntWeekavg the user cnt weekavg
     */
    public void setUserCntWeekavg(String userCntWeekavg) {
		this.userCntWeekavg = userCntWeekavg;
	}

    /**
     * Gets user cnt weekavg.
     *
     * @return the user cnt weekavg
     */
    public String getUserCntWeekavg( ) {
		return this.userCntWeekavg;
	}

    /**
     * Sets user cnt weekstddev.
     *
     * @param userCntWeekstddev the user cnt weekstddev
     */
    public void setUserCntWeekstddev(String userCntWeekstddev) {
		this.userCntWeekstddev = userCntWeekstddev;
	}

    /**
     * Gets user cnt weekstddev.
     *
     * @return the user cnt weekstddev
     */
    public String getUserCntWeekstddev( ) {
		return this.userCntWeekstddev;
	}

    /**
     * Sets user stability.
     *
     * @param userStability the user stability
     */
    public void setUserStability(String userStability) {
		this.userStability = userStability;
	}

    /**
     * Gets user stability.
     *
     * @return the user stability
     */
    public String getUserStability( ) {
		return this.userStability;
	}

}
