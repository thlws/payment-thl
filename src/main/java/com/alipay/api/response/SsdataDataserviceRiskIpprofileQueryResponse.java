package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.ipprofile.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-08 14:08:06
 */
public class SsdataDataserviceRiskIpprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3394645876782489764L;

	/** 
	 * IP上用户活跃度分值（分值越高活跃度越高）
	 */
	@ApiField("ip_active_score")
	private String ipActiveScore;

	/** 
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/** 
	 * IP对应AS描述
	 */
	@ApiField("ip_as_name")
	private String ipAsName;

	/** 
	 * ip对应AS号
	 */
	@ApiField("ip_asn")
	private String ipAsn;

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
	 * IP最大概率经纬度点的纬度
	 */
	@ApiField("ip_latitude")
	private String ipLatitude;

	/** 
	 * IP最大概率经纬度点的经度
	 */
	@ApiField("ip_longitude")
	private String ipLongitude;

	/** 
	 * IP所属网段
	 */
	@ApiField("ip_net_id")
	private String ipNetId;

	/** 
	 * IP非人操作分值（分值越高非人概率越高）
	 */
	@ApiField("ip_not_human_score")
	private String ipNotHumanScore;

	/** 
	 * IP运营商名称
	 */
	@ApiField("ip_opt_desc")
	private String ipOptDesc;

	/** 
	 * 近三个月是否发生过案件
	 */
	@ApiField("is_case_threemonth")
	private String isCaseThreemonth;

	/** 
	 * 是否3G/4G等基站类IP
	 */
	@ApiField("is_cellular_ip")
	private String isCellularIp;

	/** 
	 * 是否教育网IP
	 */
	@ApiField("is_edu_ip")
	private String isEduIp;

	/** 
	 * 是否IDCIP
	 */
	@ApiField("is_idc_ip")
	private String isIdcIp;

	/** 
	 * 是否境外IP
	 */
	@ApiField("is_oversea_ip")
	private String isOverseaIp;

	/** 
	 * 是否代理IP
	 */
	@ApiField("is_proxy_ip")
	private String isProxyIp;

	/** 
	 * 自然人主体使用当前IP的概率
	 */
	@ApiField("net_cert_ratio")
	private String netCertRatio;

	/** 
	 * 该城市使用当前IP的概率
	 */
	@ApiField("net_city_ratio")
	private String netCityRatio;

	/** 
	 * 该区使用当前IP的概率
	 */
	@ApiField("net_district_ratio")
	private String netDistrictRatio;

	/** 
	 * 手机号持有人使用当前IP的概率
	 */
	@ApiField("net_phone_ratio")
	private String netPhoneRatio;

	/** 
	 * 用户使用当前IP的概率综合分
	 */
	@ApiField("net_ratio_norm")
	private String netRatioNorm;

	/** 
	 * 风险码，比如 r_ip_004 表示 ip近期不活跃，r_ip_005表示ip较新，r_ip_006表示ip上聚集多个设备，r_ip_007表示设备分布异常；
	 */
	@ApiListField("riskcode")
	@ApiField("string")
	private List<String> riskcode;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/** 
	 * IP使用时间类型
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
	 * IP上周用户数波动指数
	 */
	@ApiField("user_cnt_weekstddev")
	private String userCntWeekstddev;

	/** 
	 * IP上活跃用户的稳定指数
	 */
	@ApiField("user_stability")
	private String userStability;

    /**
     * Sets ip active score.
     *
     * @param ipActiveScore the ip active score
     */
    public void setIpActiveScore(String ipActiveScore) {
		this.ipActiveScore = ipActiveScore;
	}

    /**
     * Gets ip active score.
     *
     * @return the ip active score
     */
    public String getIpActiveScore( ) {
		return this.ipActiveScore;
	}

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
     * Sets ip as name.
     *
     * @param ipAsName the ip as name
     */
    public void setIpAsName(String ipAsName) {
		this.ipAsName = ipAsName;
	}

    /**
     * Gets ip as name.
     *
     * @return the ip as name
     */
    public String getIpAsName( ) {
		return this.ipAsName;
	}

    /**
     * Sets ip asn.
     *
     * @param ipAsn the ip asn
     */
    public void setIpAsn(String ipAsn) {
		this.ipAsn = ipAsn;
	}

    /**
     * Gets ip asn.
     *
     * @return the ip asn
     */
    public String getIpAsn( ) {
		return this.ipAsn;
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
     * Sets ip net id.
     *
     * @param ipNetId the ip net id
     */
    public void setIpNetId(String ipNetId) {
		this.ipNetId = ipNetId;
	}

    /**
     * Gets ip net id.
     *
     * @return the ip net id
     */
    public String getIpNetId( ) {
		return this.ipNetId;
	}

    /**
     * Sets ip not human score.
     *
     * @param ipNotHumanScore the ip not human score
     */
    public void setIpNotHumanScore(String ipNotHumanScore) {
		this.ipNotHumanScore = ipNotHumanScore;
	}

    /**
     * Gets ip not human score.
     *
     * @return the ip not human score
     */
    public String getIpNotHumanScore( ) {
		return this.ipNotHumanScore;
	}

    /**
     * Sets ip opt desc.
     *
     * @param ipOptDesc the ip opt desc
     */
    public void setIpOptDesc(String ipOptDesc) {
		this.ipOptDesc = ipOptDesc;
	}

    /**
     * Gets ip opt desc.
     *
     * @return the ip opt desc
     */
    public String getIpOptDesc( ) {
		return this.ipOptDesc;
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
     * Sets net city ratio.
     *
     * @param netCityRatio the net city ratio
     */
    public void setNetCityRatio(String netCityRatio) {
		this.netCityRatio = netCityRatio;
	}

    /**
     * Gets net city ratio.
     *
     * @return the net city ratio
     */
    public String getNetCityRatio( ) {
		return this.netCityRatio;
	}

    /**
     * Sets net district ratio.
     *
     * @param netDistrictRatio the net district ratio
     */
    public void setNetDistrictRatio(String netDistrictRatio) {
		this.netDistrictRatio = netDistrictRatio;
	}

    /**
     * Gets net district ratio.
     *
     * @return the net district ratio
     */
    public String getNetDistrictRatio( ) {
		return this.netDistrictRatio;
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
     * Sets net ratio norm.
     *
     * @param netRatioNorm the net ratio norm
     */
    public void setNetRatioNorm(String netRatioNorm) {
		this.netRatioNorm = netRatioNorm;
	}

    /**
     * Gets net ratio norm.
     *
     * @return the net ratio norm
     */
    public String getNetRatioNorm( ) {
		return this.netRatioNorm;
	}

    /**
     * Sets riskcode.
     *
     * @param riskcode the riskcode
     */
    public void setRiskcode(List<String> riskcode) {
		this.riskcode = riskcode;
	}

    /**
     * Gets riskcode.
     *
     * @return the riskcode
     */
    public List<String> getRiskcode( ) {
		return this.riskcode;
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
