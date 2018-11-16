package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.querydetail response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMarketShopQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 3751143289861271844L;

	/** 
	 * 门店详细地址，注：不含省市区
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 门店审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔
	 */
	@ApiField("audit_images")
	private String auditImages;

	/** 
	 * 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 授权函图片
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/** 
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元；
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/** 
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示
	 */
	@ApiField("box")
	private String box;

	/** 
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/** 
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/** 
	 * 品牌名称；不填写则默认为“其它品牌”
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 经营许可证，只有餐饮类目需要
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/** 
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/** 
	 * 营业时间;支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

	/** 
	 * 类目ID，类目初始数据由口碑提供
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 城市编码，国标码，详见国家统计局数据
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/** 
	 * 门店创建来源；如：开放平台、支付宝客户端、口碑商家app、商家自主开店、服务商开店、全民开店-支付宝客户端、全民开店-商户app、其它
	 */
	@ApiField("create_channel")
	private String createChannel;

	/** 
	 * 区县编码，国标码，详见国家统计局数据
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 门店创建时间
	 */
	@ApiField("gmt_shop_create")
	private String gmtShopCreate;

	/** 
	 * 门店修改时间
	 */
	@ApiField("gmt_shop_modified")
	private String gmtShopModified;

	/** 
	 * 店铺使用的机具编号，多个以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/** 
	 * 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/** 
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 开发者返佣ID，重要：如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据，需要与签约协议的PID保持一致， 该字段只能在创建接口中传入，不能在修改接口中被修改
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/** 
	 * 纬度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 门店营业执照图片
	 */
	@ApiField("licence")
	private String licence;

	/** 
	 * 门店营业执照编号
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/** 
	 * 营业执照过期时间
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/** 
	 * 门店营业执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/** 
	 * 经度，最长15位字符（包括小数点）， 注：高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 门店首图；非常重要，推荐尺寸2000*1500
	 */
	@ApiField("main_image")
	private String mainImage;

	/** 
	 * 主店名；比如：肯德基
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/** 
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/** 
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/** 
	 * 在其他平台的开店图片，支持多张，逗号分隔
	 */
	@ApiField("online_image")
	private String onlineImage;

	/** 
	 * 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/** 
	 * 其它资质证明图片集；支持多张，逗号分隔
	 */
	@ApiField("other_auth_images")
	private String otherAuthImages;

	/** 
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("parking")
	private String parking;

	/** 
	 * 门店的签约ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 默认付款类型；如：付款码、扫码付、声波支付、在线买单、其它
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 门店收款账户，门店收款账户只能被查询，不能通过接口修改。如果为空，则表示门店收款账户为商户签约账户
	 */
	@ApiField("payment_account")
	private String paymentAccount;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 经过加工后的门店收款二维码
	 */
	@ApiField("processed_qr_code")
	private String processedQrCode;

	/** 
	 * 门店运营归属人uid
	 */
	@ApiField("provider_xiaoer_uid")
	private String providerXiaoerUid;

	/** 
	 * 省份编码，国标码，详见国家统计局数据
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门店收款二维码裸码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 门店标签；JSON格式。包括：keyMerchant-是否重点商户（T/F）；isHallMeal-堂食（T/F）；注：若标签 key 不存在，则门店无对应的标签
	 */
	@ApiField("shop_tags")
	private String shopTags;

	/** 
	 * 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 门店其他的服务，门店与用户线下兑现
	 */
	@ApiField("value_added")
	private String valueAdded;

	/** 
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("wifi")
	private String wifi;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
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
     * Sets audit images.
     *
     * @param auditImages the audit images
     */
    public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}

    /**
     * Gets audit images.
     *
     * @return the audit images
     */
    public String getAuditImages( ) {
		return this.auditImages;
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
     * Sets auth letter.
     *
     * @param authLetter the auth letter
     */
    public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}

    /**
     * Gets auth letter.
     *
     * @return the auth letter
     */
    public String getAuthLetter( ) {
		return this.authLetter;
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
     * Gets avg price.
     *
     * @return the avg price
     */
    public String getAvgPrice( ) {
		return this.avgPrice;
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
     * Gets box.
     *
     * @return the box
     */
    public String getBox( ) {
		return this.box;
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
     * Gets branch shop name.
     *
     * @return the branch shop name
     */
    public String getBranchShopName( ) {
		return this.branchShopName;
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
     * Gets brand logo.
     *
     * @return the brand logo
     */
    public String getBrandLogo( ) {
		return this.brandLogo;
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
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName( ) {
		return this.brandName;
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
     * Gets business certificate.
     *
     * @return the business certificate
     */
    public String getBusinessCertificate( ) {
		return this.businessCertificate;
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
     * Gets business certificate expires.
     *
     * @return the business certificate expires
     */
    public String getBusinessCertificateExpires( ) {
		return this.businessCertificateExpires;
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
     * Gets business time.
     *
     * @return the business time
     */
    public String getBusinessTime( ) {
		return this.businessTime;
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
     * Sets contact number.
     *
     * @param contactNumber the contact number
     */
    public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

    /**
     * Gets contact number.
     *
     * @return the contact number
     */
    public String getContactNumber( ) {
		return this.contactNumber;
	}

    /**
     * Sets create channel.
     *
     * @param createChannel the create channel
     */
    public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}

    /**
     * Gets create channel.
     *
     * @return the create channel
     */
    public String getCreateChannel( ) {
		return this.createChannel;
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
     * Sets gmt shop create.
     *
     * @param gmtShopCreate the gmt shop create
     */
    public void setGmtShopCreate(String gmtShopCreate) {
		this.gmtShopCreate = gmtShopCreate;
	}

    /**
     * Gets gmt shop create.
     *
     * @return the gmt shop create
     */
    public String getGmtShopCreate( ) {
		return this.gmtShopCreate;
	}

    /**
     * Sets gmt shop modified.
     *
     * @param gmtShopModified the gmt shop modified
     */
    public void setGmtShopModified(String gmtShopModified) {
		this.gmtShopModified = gmtShopModified;
	}

    /**
     * Gets gmt shop modified.
     *
     * @return the gmt shop modified
     */
    public String getGmtShopModified( ) {
		return this.gmtShopModified;
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
     * Gets implement id.
     *
     * @return the implement id
     */
    public String getImplementId( ) {
		return this.implementId;
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
     * Sets is operating online.
     *
     * @param isOperatingOnline the is operating online
     */
    public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

    /**
     * Gets is operating online.
     *
     * @return the is operating online
     */
    public String getIsOperatingOnline( ) {
		return this.isOperatingOnline;
	}

    /**
     * Sets is show.
     *
     * @param isShow the is show
     */
    public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

    /**
     * Gets is show.
     *
     * @return the is show
     */
    public String getIsShow( ) {
		return this.isShow;
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
     * Gets isv uid.
     *
     * @return the isv uid
     */
    public String getIsvUid( ) {
		return this.isvUid;
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
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude( ) {
		return this.latitude;
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
     * Gets licence.
     *
     * @return the licence
     */
    public String getLicence( ) {
		return this.licence;
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
     * Gets licence code.
     *
     * @return the licence code
     */
    public String getLicenceCode( ) {
		return this.licenceCode;
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
     * Gets licence expires.
     *
     * @return the licence expires
     */
    public String getLicenceExpires( ) {
		return this.licenceExpires;
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
     * Gets licence name.
     *
     * @return the licence name
     */
    public String getLicenceName( ) {
		return this.licenceName;
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
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude( ) {
		return this.longitude;
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
     * Gets main image.
     *
     * @return the main image
     */
    public String getMainImage( ) {
		return this.mainImage;
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
     * Gets main shop name.
     *
     * @return the main shop name
     */
    public String getMainShopName( ) {
		return this.mainShopName;
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
     * Gets no smoking.
     *
     * @return the no smoking
     */
    public String getNoSmoking( ) {
		return this.noSmoking;
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
     * Gets notify mobile.
     *
     * @return the notify mobile
     */
    public String getNotifyMobile( ) {
		return this.notifyMobile;
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
     * Gets online image.
     *
     * @return the online image
     */
    public String getOnlineImage( ) {
		return this.onlineImage;
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
     * Gets operate notify url.
     *
     * @return the operate notify url
     */
    public String getOperateNotifyUrl( ) {
		return this.operateNotifyUrl;
	}

    /**
     * Sets other auth images.
     *
     * @param otherAuthImages the other auth images
     */
    public void setOtherAuthImages(String otherAuthImages) {
		this.otherAuthImages = otherAuthImages;
	}

    /**
     * Gets other auth images.
     *
     * @return the other auth images
     */
    public String getOtherAuthImages( ) {
		return this.otherAuthImages;
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
     * Gets parking.
     *
     * @return the parking
     */
    public String getParking( ) {
		return this.parking;
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
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId( ) {
		return this.partnerId;
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
     * Gets pay type.
     *
     * @return the pay type
     */
    public String getPayType( ) {
		return this.payType;
	}

    /**
     * Sets payment account.
     *
     * @param paymentAccount the payment account
     */
    public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}

    /**
     * Gets payment account.
     *
     * @return the payment account
     */
    public String getPaymentAccount( ) {
		return this.paymentAccount;
	}

    /**
     * Sets pic coll.
     *
     * @param picColl the pic coll
     */
    public void setPicColl(String picColl) {
		this.picColl = picColl;
	}

    /**
     * Gets pic coll.
     *
     * @return the pic coll
     */
    public String getPicColl( ) {
		return this.picColl;
	}

    /**
     * Sets processed qr code.
     *
     * @param processedQrCode the processed qr code
     */
    public void setProcessedQrCode(String processedQrCode) {
		this.processedQrCode = processedQrCode;
	}

    /**
     * Gets processed qr code.
     *
     * @return the processed qr code
     */
    public String getProcessedQrCode( ) {
		return this.processedQrCode;
	}

    /**
     * Sets provider xiaoer uid.
     *
     * @param providerXiaoerUid the provider xiaoer uid
     */
    public void setProviderXiaoerUid(String providerXiaoerUid) {
		this.providerXiaoerUid = providerXiaoerUid;
	}

    /**
     * Gets provider xiaoer uid.
     *
     * @return the provider xiaoer uid
     */
    public String getProviderXiaoerUid( ) {
		return this.providerXiaoerUid;
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
     * Sets qr code.
     *
     * @param qrCode the qr code
     */
    public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

    /**
     * Gets qr code.
     *
     * @return the qr code
     */
    public String getQrCode( ) {
		return this.qrCode;
	}

    /**
     * Sets shop tags.
     *
     * @param shopTags the shop tags
     */
    public void setShopTags(String shopTags) {
		this.shopTags = shopTags;
	}

    /**
     * Gets shop tags.
     *
     * @return the shop tags
     */
    public String getShopTags( ) {
		return this.shopTags;
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
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId( ) {
		return this.storeId;
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
     * Gets value added.
     *
     * @return the value added
     */
    public String getValueAdded( ) {
		return this.valueAdded;
	}

    /**
     * Sets wifi.
     *
     * @param wifi the wifi
     */
    public void setWifi(String wifi) {
		this.wifi = wifi;
	}

    /**
     * Gets wifi.
     *
     * @return the wifi
     */
    public String getWifi( ) {
		return this.wifi;
	}

}
