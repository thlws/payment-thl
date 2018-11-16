package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:33
 */
public class AlipayOfflineMarketShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4688731836537742568L;

	/**
	 * 门店详细地址，地址字符长度在4-50个字符，注：不含省市区。门店详细地址按规范格式填写地址，以免影响门店搜索及活动报名：例1：道路+门牌号，“人民东路18号”；例2：道路+门牌号+标志性建筑+楼层，“四川北路1552号欢乐广场1楼”。
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店审核时需要的图片；至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过；多个图片之间以英文逗号分隔。
	 */
	@ApiField("audit_images")
	private String auditImages;

	/**
	 * 门店授权函,营业执照与签约账号主体不一致时需要。
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元，不需填写单位。
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 店铺接口业务版本号，新接入的ISV，请统一传入2.0。
	 */
	@ApiField("biz_version")
	private String bizVersion;

	/**
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示。
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)。
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名，不填写则默认为“其它品牌”。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 许可证，各行业所需的证照资质参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>；该字段只能上传一张许可证，一张以外的许可证、除营业执照和许可证之外其他证照请放在其他资质字段上传。
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 许可证有效期，格式：2020-03-20或长期。严格按照格式填写。
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 请严格按"周一-周五 09:00-20:00,周六-周日 10:00-22:00"的格式进行填写，时间段不能重复，最多支持两个时间段，24小时营业请填写"00:00-23:59"
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 类目id，请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店电话号码；支持座机和手机，只支持数字和+-号，在客户端对用户展现， 支持多个电话， 以英文逗号分隔。
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * （支付宝内部参数）小二的支付宝账号。
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * （支付宝内部参数）企业支付宝账号。
	 */
	@ApiField("enterprise_logon_id")
	private String enterpriseLogonId;

	/**
	 * （支付宝内部参数）企业支付宝账户名称。
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 机具号，多个之间以英文逗号分隔。
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * ISV返佣id，门店创建、或者门店交易的返佣将通过此账号反给ISV，如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据。此字段必须是个合法uid，2088开头的16位支付宝会员账号，如果传入错误将无法创建门店。
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/**
	 * 纬度；最长15位字符（包括小数点）， 注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * （支付宝内部参数）leads的编号。
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 门店营业执照图片，各行业所需的证照资质参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">商户入驻要求</a>。
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号，只支持输入中文，英文和数字，营业执照信息与is_operating_online至少填一项。
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/**
	 * 营业执照过期时间。格式：2020-10-20或长期。严格按照格式填写。
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/**
	 * 门店营业执照名称。
	 */
	@ApiField("licence_name")
	private String licenceName;

	/**
	 * 经度；最长15位字符（包括小数点）， 注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 门店首图，非常重要，推荐尺寸2000*1500。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名  比如：肯德基；主店名里不要包含分店名，如“万塘路店”。主店名长度不能超过20个字符。
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示。
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息， 不在客户端展示。
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/**
	 * 废弃字段，请使用online_url字段替代。
	 */
	@ApiField("online_image")
	private String onlineImage;

	/**
	 * 其他平台开店的店铺链接url，多个url使用英文逗号隔开,isv迁移到新接口使用此字段，与is_operating_online=T配套使用。
	 */
	@ApiField("online_url")
	private String onlineUrl;

	/**
	 * 表示以系统集成商的身份开店，开放平台现在统一传入ISV。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 当商户的门店审核状态发生变化时，会向该地址推送消息。
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 其他资质。用于上传营业证照、许可证照外的其他资质，除已上传许可证外的其他许可证也可以在该字段上传。
	 */
	@ApiField("other_authorization")
	private String otherAuthorization;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("parking")
	private String parking;

	/**
	 * （支付宝内部参数）服务商要操作的商户PID。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * （支付宝内部参数）付款方式：code_scanned_pay：付款码 
online_pay：在线买单。ISV不可以指定此字段，ISV泛行业开店默认为在线买单，云纵开店可以指定支付方式。
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls">点此下载</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * （支付宝内部参数）leads开店重试支付宝流水ID。
	 */
	@ApiField("ref_apply_id")
	private String refApplyId;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在门店notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店其他的服务，门店与用户线下兑现。
	 */
	@ApiField("value_added")
	private String valueAdded;

	/**
	 * 废弃字段，使用biz_version字段替代。
	 */
	@ApiField("version")
	private String version;

	/**
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示。
	 */
	@ApiField("wifi")
	private String wifi;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets audit images.
     *
     * @return the audit images
     */
    public String getAuditImages() {
		return this.auditImages;
	}

    /**
     * Sets audit images.
     *
     * @param auditImages the audit images
     */
    public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}

    /**
     * Gets auth letter.
     *
     * @return the auth letter
     */
    public String getAuthLetter() {
		return this.authLetter;
	}

    /**
     * Sets auth letter.
     *
     * @param authLetter the auth letter
     */
    public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}

    /**
     * Gets avg price.
     *
     * @return the avg price
     */
    public String getAvgPrice() {
		return this.avgPrice;
	}

    /**
     * Sets avg price.
     *
     * @param avgPrice the avg price
     */
    public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

    /**
     * Gets biz version.
     *
     * @return the biz version
     */
    public String getBizVersion() {
		return this.bizVersion;
	}

    /**
     * Sets biz version.
     *
     * @param bizVersion the biz version
     */
    public void setBizVersion(String bizVersion) {
		this.bizVersion = bizVersion;
	}

    /**
     * Gets box.
     *
     * @return the box
     */
    public String getBox() {
		return this.box;
	}

    /**
     * Sets box.
     *
     * @param box the box
     */
    public void setBox(String box) {
		this.box = box;
	}

    /**
     * Gets branch shop name.
     *
     * @return the branch shop name
     */
    public String getBranchShopName() {
		return this.branchShopName;
	}

    /**
     * Sets branch shop name.
     *
     * @param branchShopName the branch shop name
     */
    public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

    /**
     * Gets brand logo.
     *
     * @return the brand logo
     */
    public String getBrandLogo() {
		return this.brandLogo;
	}

    /**
     * Sets brand logo.
     *
     * @param brandLogo the brand logo
     */
    public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets business certificate.
     *
     * @return the business certificate
     */
    public String getBusinessCertificate() {
		return this.businessCertificate;
	}

    /**
     * Sets business certificate.
     *
     * @param businessCertificate the business certificate
     */
    public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}

    /**
     * Gets business certificate expires.
     *
     * @return the business certificate expires
     */
    public String getBusinessCertificateExpires() {
		return this.businessCertificateExpires;
	}

    /**
     * Sets business certificate expires.
     *
     * @param businessCertificateExpires the business certificate expires
     */
    public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public String getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
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
     * Gets contact number.
     *
     * @return the contact number
     */
    public String getContactNumber() {
		return this.contactNumber;
	}

    /**
     * Sets contact number.
     *
     * @param contactNumber the contact number
     */
    public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator() {
		return this.creator;
	}

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
		this.creator = creator;
	}

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
		return this.districtCode;
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
     * Gets enterprise logon id.
     *
     * @return the enterprise logon id
     */
    public String getEnterpriseLogonId() {
		return this.enterpriseLogonId;
	}

    /**
     * Sets enterprise logon id.
     *
     * @param enterpriseLogonId the enterprise logon id
     */
    public void setEnterpriseLogonId(String enterpriseLogonId) {
		this.enterpriseLogonId = enterpriseLogonId;
	}

    /**
     * Gets enterprise name.
     *
     * @return the enterprise name
     */
    public String getEnterpriseName() {
		return this.enterpriseName;
	}

    /**
     * Sets enterprise name.
     *
     * @param enterpriseName the enterprise name
     */
    public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

    /**
     * Gets implement id.
     *
     * @return the implement id
     */
    public String getImplementId() {
		return this.implementId;
	}

    /**
     * Sets implement id.
     *
     * @param implementId the implement id
     */
    public void setImplementId(String implementId) {
		this.implementId = implementId;
	}

    /**
     * Gets is operating online.
     *
     * @return the is operating online
     */
    public String getIsOperatingOnline() {
		return this.isOperatingOnline;
	}

    /**
     * Sets is operating online.
     *
     * @param isOperatingOnline the is operating online
     */
    public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

    /**
     * Gets isv uid.
     *
     * @return the isv uid
     */
    public String getIsvUid() {
		return this.isvUid;
	}

    /**
     * Sets isv uid.
     *
     * @param isvUid the isv uid
     */
    public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
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
     * Gets leads id.
     *
     * @return the leads id
     */
    public String getLeadsId() {
		return this.leadsId;
	}

    /**
     * Sets leads id.
     *
     * @param leadsId the leads id
     */
    public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

    /**
     * Gets licence.
     *
     * @return the licence
     */
    public String getLicence() {
		return this.licence;
	}

    /**
     * Sets licence.
     *
     * @param licence the licence
     */
    public void setLicence(String licence) {
		this.licence = licence;
	}

    /**
     * Gets licence code.
     *
     * @return the licence code
     */
    public String getLicenceCode() {
		return this.licenceCode;
	}

    /**
     * Sets licence code.
     *
     * @param licenceCode the licence code
     */
    public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

    /**
     * Gets licence expires.
     *
     * @return the licence expires
     */
    public String getLicenceExpires() {
		return this.licenceExpires;
	}

    /**
     * Sets licence expires.
     *
     * @param licenceExpires the licence expires
     */
    public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}

    /**
     * Gets licence name.
     *
     * @return the licence name
     */
    public String getLicenceName() {
		return this.licenceName;
	}

    /**
     * Sets licence name.
     *
     * @param licenceName the licence name
     */
    public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public Long getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets main image.
     *
     * @return the main image
     */
    public String getMainImage() {
		return this.mainImage;
	}

    /**
     * Sets main image.
     *
     * @param mainImage the main image
     */
    public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

    /**
     * Gets main shop name.
     *
     * @return the main shop name
     */
    public String getMainShopName() {
		return this.mainShopName;
	}

    /**
     * Sets main shop name.
     *
     * @param mainShopName the main shop name
     */
    public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

    /**
     * Gets no smoking.
     *
     * @return the no smoking
     */
    public String getNoSmoking() {
		return this.noSmoking;
	}

    /**
     * Sets no smoking.
     *
     * @param noSmoking the no smoking
     */
    public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}

    /**
     * Gets notify mobile.
     *
     * @return the notify mobile
     */
    public String getNotifyMobile() {
		return this.notifyMobile;
	}

    /**
     * Sets notify mobile.
     *
     * @param notifyMobile the notify mobile
     */
    public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}

    /**
     * Gets online image.
     *
     * @return the online image
     */
    public String getOnlineImage() {
		return this.onlineImage;
	}

    /**
     * Sets online image.
     *
     * @param onlineImage the online image
     */
    public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}

    /**
     * Gets online url.
     *
     * @return the online url
     */
    public String getOnlineUrl() {
		return this.onlineUrl;
	}

    /**
     * Sets online url.
     *
     * @param onlineUrl the online url
     */
    public void setOnlineUrl(String onlineUrl) {
		this.onlineUrl = onlineUrl;
	}

    /**
     * Gets op role.
     *
     * @return the op role
     */
    public String getOpRole() {
		return this.opRole;
	}

    /**
     * Sets op role.
     *
     * @param opRole the op role
     */
    public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

    /**
     * Gets operate notify url.
     *
     * @return the operate notify url
     */
    public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}

    /**
     * Sets operate notify url.
     *
     * @param operateNotifyUrl the operate notify url
     */
    public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

    /**
     * Gets other authorization.
     *
     * @return the other authorization
     */
    public String getOtherAuthorization() {
		return this.otherAuthorization;
	}

    /**
     * Sets other authorization.
     *
     * @param otherAuthorization the other authorization
     */
    public void setOtherAuthorization(String otherAuthorization) {
		this.otherAuthorization = otherAuthorization;
	}

    /**
     * Gets parking.
     *
     * @return the parking
     */
    public String getParking() {
		return this.parking;
	}

    /**
     * Sets parking.
     *
     * @param parking the parking
     */
    public void setParking(String parking) {
		this.parking = parking;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public String getPayType() {
		return this.payType;
	}

    /**
     * Sets pay type.
     *
     * @param payType the pay type
     */
    public void setPayType(String payType) {
		this.payType = payType;
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
     * Gets ref apply id.
     *
     * @return the ref apply id
     */
    public String getRefApplyId() {
		return this.refApplyId;
	}

    /**
     * Sets ref apply id.
     *
     * @param refApplyId the ref apply id
     */
    public void setRefApplyId(String refApplyId) {
		this.refApplyId = refApplyId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

    /**
     * Gets value added.
     *
     * @return the value added
     */
    public String getValueAdded() {
		return this.valueAdded;
	}

    /**
     * Sets value added.
     *
     * @param valueAdded the value added
     */
    public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
		return this.version;
	}

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
		this.version = version;
	}

    /**
     * Gets wifi.
     *
     * @return the wifi
     */
    public String getWifi() {
		return this.wifi;
	}

    /**
     * Sets wifi.
     *
     * @param wifi the wifi
     */
    public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
