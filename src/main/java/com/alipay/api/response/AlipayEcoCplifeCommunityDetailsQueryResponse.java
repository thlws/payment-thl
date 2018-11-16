package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CPCommServices;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.community.details.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoCplifeCommunityDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6863644462912492142L;

	/** 
	 * 开发者关联的高德地图中住宅、住宿或地名地址等小区相关类型的POI（地图兴趣点）ID列表和POI名称，中间用"|"分隔。
	 */
	@ApiListField("associated_pois")
	@ApiField("string")
	private List<String> associatedPois;

	/** 
	 * 小区审核状态，小区审核状态关联小区主服务的审核状态：
AUDITING：审核中；
AUDIT_FAILED：审核驳回；
AUDIT_SUCCESS：审核通过。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 地级市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 小区主要详细地址，不需要包含省市区名称。
	 */
	@ApiField("community_address")
	private String communityAddress;

	/** 
	 * 小区所在的经纬度列表（注：需要是高德坐标系），每对经纬度用"|"分隔，经度在前，纬度在后。

注：若新建的小区覆盖多个片区，最多包含5组经纬度，其中第一组作为主经纬度。
	 */
	@ApiListField("community_locations")
	@ApiField("string")
	private List<String> communityLocations;

	/** 
	 * 小区名称。
	 */
	@ApiField("community_name")
	private String communityName;

	/** 
	 * 小区已初始化的服务列表
	 */
	@ApiListField("community_services")
	@ApiField("c_p_comm_services")
	private List<CPCommServices> communityServices;

	/** 
	 * 小区当前状态，状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线

新创建的小区为PENDING_ONLINE待上线状态，需要尽快初始化基础服务，完成开发和验证，并提交服务上线申请。由支付宝小二审核通过后完成服务和小区上线。
	 */
	@ApiField("community_status")
	private String communityStatus;

	/** 
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 小区创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/** 
	 * 小区最近修改时间（包括状态变更）。
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 物业服务热线或联系电话，便于用户在需要时联系物业。
	 */
	@ApiField("hotline")
	private String hotline;

	/** 
	 * 若开发者和支付宝签署了相关协议，会返回开发者的PID（Partner ID）。
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 小区关联的物业公司名称
	 */
	@ApiField("merchant_firm_name")
	private String merchantFirmName;

	/** 
	 * 小区对应的物业公司支付宝账号PID（合作伙伴partner id）。
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 若从小区当前状态到下一状态需要完成下一步条件代码，则返回该字段，否则不返回。

操作主体有：
INVOKER - 接口调用方
MERCHANT - 物业公司
AUDITOR - 平台审核方

条件代码包括但不限于：
WAIT_SERVICE_PROVISION - 等待基础服务初始化
WAIT_PROD_VERIFICATION - 等待在生产环境通过自测
WAIT_ONLINE_APPLICATION - 等待提起上线申请
WAIT_OFFLINE_APPLICATION - 等待提起下线申请
WAIT_CONFIRMATION - 等待相关方确认
WAIT_AUDITING - 等待审核
	 */
	@ApiField("next_action")
	private String nextAction;

	/** 
	 * 小区在物业系统中的唯一编号，若开发者传入过，则返回。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/** 
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 若小区上线后，返回小区主页推广二维码图片链接
	 */
	@ApiField("qr_code_image")
	private String qrCodeImage;

    /**
     * Sets associated pois.
     *
     * @param associatedPois the associated pois
     */
    public void setAssociatedPois(List<String> associatedPois) {
		this.associatedPois = associatedPois;
	}

    /**
     * Gets associated pois.
     *
     * @return the associated pois
     */
    public List<String> getAssociatedPois( ) {
		return this.associatedPois;
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
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode( ) {
		return this.cityCode;
	}

    /**
     * Sets community address.
     *
     * @param communityAddress the community address
     */
    public void setCommunityAddress(String communityAddress) {
		this.communityAddress = communityAddress;
	}

    /**
     * Gets community address.
     *
     * @return the community address
     */
    public String getCommunityAddress( ) {
		return this.communityAddress;
	}

    /**
     * Sets community locations.
     *
     * @param communityLocations the community locations
     */
    public void setCommunityLocations(List<String> communityLocations) {
		this.communityLocations = communityLocations;
	}

    /**
     * Gets community locations.
     *
     * @return the community locations
     */
    public List<String> getCommunityLocations( ) {
		return this.communityLocations;
	}

    /**
     * Sets community name.
     *
     * @param communityName the community name
     */
    public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

    /**
     * Gets community name.
     *
     * @return the community name
     */
    public String getCommunityName( ) {
		return this.communityName;
	}

    /**
     * Sets community services.
     *
     * @param communityServices the community services
     */
    public void setCommunityServices(List<CPCommServices> communityServices) {
		this.communityServices = communityServices;
	}

    /**
     * Gets community services.
     *
     * @return the community services
     */
    public List<CPCommServices> getCommunityServices( ) {
		return this.communityServices;
	}

    /**
     * Sets community status.
     *
     * @param communityStatus the community status
     */
    public void setCommunityStatus(String communityStatus) {
		this.communityStatus = communityStatus;
	}

    /**
     * Gets community status.
     *
     * @return the community status
     */
    public String getCommunityStatus( ) {
		return this.communityStatus;
	}

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode( ) {
		return this.districtCode;
	}

    /**
     * Sets gmt created.
     *
     * @param gmtCreated the gmt created
     */
    public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

    /**
     * Gets gmt created.
     *
     * @return the gmt created
     */
    public Date getGmtCreated( ) {
		return this.gmtCreated;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified( ) {
		return this.gmtModified;
	}

    /**
     * Sets hotline.
     *
     * @param hotline the hotline
     */
    public void setHotline(String hotline) {
		this.hotline = hotline;
	}

    /**
     * Gets hotline.
     *
     * @return the hotline
     */
    public String getHotline( ) {
		return this.hotline;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid( ) {
		return this.isvPid;
	}

    /**
     * Sets merchant firm name.
     *
     * @param merchantFirmName the merchant firm name
     */
    public void setMerchantFirmName(String merchantFirmName) {
		this.merchantFirmName = merchantFirmName;
	}

    /**
     * Gets merchant firm name.
     *
     * @return the merchant firm name
     */
    public String getMerchantFirmName( ) {
		return this.merchantFirmName;
	}

    /**
     * Sets merchant pid.
     *
     * @param merchantPid the merchant pid
     */
    public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid( ) {
		return this.merchantPid;
	}

    /**
     * Sets next action.
     *
     * @param nextAction the next action
     */
    public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

    /**
     * Gets next action.
     *
     * @return the next action
     */
    public String getNextAction( ) {
		return this.nextAction;
	}

    /**
     * Sets out community id.
     *
     * @param outCommunityId the out community id
     */
    public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

    /**
     * Gets out community id.
     *
     * @return the out community id
     */
    public String getOutCommunityId( ) {
		return this.outCommunityId;
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
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode( ) {
		return this.provinceCode;
	}

    /**
     * Sets qr code image.
     *
     * @param qrCodeImage the qr code image
     */
    public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}

    /**
     * Gets qr code image.
     *
     * @return the qr code image
     */
    public String getQrCodeImage( ) {
		return this.qrCodeImage;
	}

}
