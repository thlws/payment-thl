package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityRiskDetectResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.risk.detect request
 *
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:25
 */
public class AlipaySecurityRiskDetectRequest implements AlipayRequest<AlipaySecurityRiskDetectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 买家账户编号
	 */
	private String buyerAccountNo;

	/** 
	* 买家绑定银行卡号
	 */
	private String buyerBindBankcard;

	/** 
	* 买家绑定银行卡的卡类型
	 */
	private String buyerBindBankcardType;

	/** 
	* 买家绑定手机号
	 */
	private String buyerBindMobile;

	/** 
	* 买家账户在商家的等级，范围：VIP（高级买家）, NORMAL(普通买家）。为空默认NORMAL
	 */
	private String buyerGrade;

	/** 
	* 买家证件号码
	 */
	private String buyerIdentityNo;

	/** 
	* 买家证件类型
	 */
	private String buyerIdentityType;

	/** 
	* 买家真实姓名
	 */
	private String buyerRealName;

	/** 
	* 买家注册时间
	 */
	private String buyerRegDate;

	/** 
	* 买家注册时留的Email
	 */
	private String buyerRegEmail;

	/** 
	* 买家注册手机号
	 */
	private String buyerRegMobile;

	/** 
	* 买家业务处理时使用的银行卡号
	 */
	private String buyerSceneBankcard;

	/** 
	* 买家业务处理时使用的银行卡类型
	 */
	private String buyerSceneBankcardType;

	/** 
	* 买家业务处理时使用的邮箱
	 */
	private String buyerSceneEmail;

	/** 
	* 买家业务处理时使用的手机号
	 */
	private String buyerSceneMobile;

	/** 
	* 币种
	 */
	private String currency;

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息,格式为：CELLID^LAC
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标,格式为：精度^维度
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端IMSI识别码
	 */
	private String envClientImsi;

	/** 
	* IOS设备的UDID
	 */
	private String envClientIosUdid;

	/** 
	* 操作的客户端ip
	 */
	private String envClientIp;

	/** 
	* 操作的客户端mac
	 */
	private String envClientMac;

	/** 
	* 操作的客户端分辨率，格式为：水平像素^垂直像素；如：800^600
	 */
	private String envClientScreen;

	/** 
	* 客户端设备的统一识别码UUID
	 */
	private String envClientUuid;

	/** 
	* 订单产品数量，购买产品的数量（不可为小数）
	 */
	private String itemQuantity;

	/** 
	* 订单产品单价，取值范围为[0.01,100000000.00]，精确到小数点后两位。 curren...
	 */
	private String itemUnitPrice;

	/** 
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 订单总金额，取值范围为[0.01,100000000.00]，精确到小数点后两位。
	 */
	private String orderAmount;

	/** 
	* 订单商品所在类目
	 */
	private String orderCategory;

	/** 
	* 订单下单时间
	 */
	private String orderCredateTime;

	/** 
	* 订单商品所在城市
	 */
	private String orderItemCity;

	/** 
	* 订单产品名称
	 */
	private String orderItemName;

	/** 
	* 商户订单唯一标识号
	 */
	private String orderNo;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 订单收货人地址
	 */
	private String receiverAddress;

	/** 
	* 订单收货人地址城市
	 */
	private String receiverCity;

	/** 
	* 订单收货人地址所在区
	 */
	private String receiverDistrict;

	/** 
	* 订单收货人邮箱
	 */
	private String receiverEmail;

	/** 
	* 订单收货人手机
	 */
	private String receiverMobile;

	/** 
	* 订单收货人姓名
	 */
	private String receiverName;

	/** 
	* 订单收货人地址省份
	 */
	private String receiverState;

	/** 
	* 订单收货人地址邮编
	 */
	private String receiverZip;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户编号
	 */
	private String sellerAccountNo;

	/** 
	* 卖家绑定银行卡号
	 */
	private String sellerBindBankcard;

	/** 
	* 卖家绑定的银行卡的卡类型
	 */
	private String sellerBindBankcardType;

	/** 
	* 卖家绑定手机号
	 */
	private String sellerBindMobile;

	/** 
	* 卖家证件号码
	 */
	private String sellerIdentityNo;

	/** 
	* 卖家证件类型
	 */
	private String sellerIdentityType;

	/** 
	* 卖家真实姓名
	 */
	private String sellerRealName;

	/** 
	* 卖家注册时间,格式为：yyyy-MM-dd。
	 */
	private String sellerRegDate;

	/** 
	* 卖家注册Email
	 */
	private String sellerRegEmail;

	/** 
	* 卖家注册手机号
	 */
	private String sellerRegMoile;

	/** 
	* 订单物流方式
	 */
	private String transportType;

    /**
     * Sets buyer account no.
     *
     * @param buyerAccountNo the buyer account no
     */
    public void setBuyerAccountNo(String buyerAccountNo) {
		this.buyerAccountNo = buyerAccountNo;
	}

    /**
     * Gets buyer account no.
     *
     * @return the buyer account no
     */
    public String getBuyerAccountNo() {
		return this.buyerAccountNo;
	}

    /**
     * Sets buyer bind bankcard.
     *
     * @param buyerBindBankcard the buyer bind bankcard
     */
    public void setBuyerBindBankcard(String buyerBindBankcard) {
		this.buyerBindBankcard = buyerBindBankcard;
	}

    /**
     * Gets buyer bind bankcard.
     *
     * @return the buyer bind bankcard
     */
    public String getBuyerBindBankcard() {
		return this.buyerBindBankcard;
	}

    /**
     * Sets buyer bind bankcard type.
     *
     * @param buyerBindBankcardType the buyer bind bankcard type
     */
    public void setBuyerBindBankcardType(String buyerBindBankcardType) {
		this.buyerBindBankcardType = buyerBindBankcardType;
	}

    /**
     * Gets buyer bind bankcard type.
     *
     * @return the buyer bind bankcard type
     */
    public String getBuyerBindBankcardType() {
		return this.buyerBindBankcardType;
	}

    /**
     * Sets buyer bind mobile.
     *
     * @param buyerBindMobile the buyer bind mobile
     */
    public void setBuyerBindMobile(String buyerBindMobile) {
		this.buyerBindMobile = buyerBindMobile;
	}

    /**
     * Gets buyer bind mobile.
     *
     * @return the buyer bind mobile
     */
    public String getBuyerBindMobile() {
		return this.buyerBindMobile;
	}

    /**
     * Sets buyer grade.
     *
     * @param buyerGrade the buyer grade
     */
    public void setBuyerGrade(String buyerGrade) {
		this.buyerGrade = buyerGrade;
	}

    /**
     * Gets buyer grade.
     *
     * @return the buyer grade
     */
    public String getBuyerGrade() {
		return this.buyerGrade;
	}

    /**
     * Sets buyer identity no.
     *
     * @param buyerIdentityNo the buyer identity no
     */
    public void setBuyerIdentityNo(String buyerIdentityNo) {
		this.buyerIdentityNo = buyerIdentityNo;
	}

    /**
     * Gets buyer identity no.
     *
     * @return the buyer identity no
     */
    public String getBuyerIdentityNo() {
		return this.buyerIdentityNo;
	}

    /**
     * Sets buyer identity type.
     *
     * @param buyerIdentityType the buyer identity type
     */
    public void setBuyerIdentityType(String buyerIdentityType) {
		this.buyerIdentityType = buyerIdentityType;
	}

    /**
     * Gets buyer identity type.
     *
     * @return the buyer identity type
     */
    public String getBuyerIdentityType() {
		return this.buyerIdentityType;
	}

    /**
     * Sets buyer real name.
     *
     * @param buyerRealName the buyer real name
     */
    public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}

    /**
     * Gets buyer real name.
     *
     * @return the buyer real name
     */
    public String getBuyerRealName() {
		return this.buyerRealName;
	}

    /**
     * Sets buyer reg date.
     *
     * @param buyerRegDate the buyer reg date
     */
    public void setBuyerRegDate(String buyerRegDate) {
		this.buyerRegDate = buyerRegDate;
	}

    /**
     * Gets buyer reg date.
     *
     * @return the buyer reg date
     */
    public String getBuyerRegDate() {
		return this.buyerRegDate;
	}

    /**
     * Sets buyer reg email.
     *
     * @param buyerRegEmail the buyer reg email
     */
    public void setBuyerRegEmail(String buyerRegEmail) {
		this.buyerRegEmail = buyerRegEmail;
	}

    /**
     * Gets buyer reg email.
     *
     * @return the buyer reg email
     */
    public String getBuyerRegEmail() {
		return this.buyerRegEmail;
	}

    /**
     * Sets buyer reg mobile.
     *
     * @param buyerRegMobile the buyer reg mobile
     */
    public void setBuyerRegMobile(String buyerRegMobile) {
		this.buyerRegMobile = buyerRegMobile;
	}

    /**
     * Gets buyer reg mobile.
     *
     * @return the buyer reg mobile
     */
    public String getBuyerRegMobile() {
		return this.buyerRegMobile;
	}

    /**
     * Sets buyer scene bankcard.
     *
     * @param buyerSceneBankcard the buyer scene bankcard
     */
    public void setBuyerSceneBankcard(String buyerSceneBankcard) {
		this.buyerSceneBankcard = buyerSceneBankcard;
	}

    /**
     * Gets buyer scene bankcard.
     *
     * @return the buyer scene bankcard
     */
    public String getBuyerSceneBankcard() {
		return this.buyerSceneBankcard;
	}

    /**
     * Sets buyer scene bankcard type.
     *
     * @param buyerSceneBankcardType the buyer scene bankcard type
     */
    public void setBuyerSceneBankcardType(String buyerSceneBankcardType) {
		this.buyerSceneBankcardType = buyerSceneBankcardType;
	}

    /**
     * Gets buyer scene bankcard type.
     *
     * @return the buyer scene bankcard type
     */
    public String getBuyerSceneBankcardType() {
		return this.buyerSceneBankcardType;
	}

    /**
     * Sets buyer scene email.
     *
     * @param buyerSceneEmail the buyer scene email
     */
    public void setBuyerSceneEmail(String buyerSceneEmail) {
		this.buyerSceneEmail = buyerSceneEmail;
	}

    /**
     * Gets buyer scene email.
     *
     * @return the buyer scene email
     */
    public String getBuyerSceneEmail() {
		return this.buyerSceneEmail;
	}

    /**
     * Sets buyer scene mobile.
     *
     * @param buyerSceneMobile the buyer scene mobile
     */
    public void setBuyerSceneMobile(String buyerSceneMobile) {
		this.buyerSceneMobile = buyerSceneMobile;
	}

    /**
     * Gets buyer scene mobile.
     *
     * @return the buyer scene mobile
     */
    public String getBuyerSceneMobile() {
		return this.buyerSceneMobile;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets env client base band.
     *
     * @param envClientBaseBand the env client base band
     */
    public void setEnvClientBaseBand(String envClientBaseBand) {
		this.envClientBaseBand = envClientBaseBand;
	}

    /**
     * Gets env client base band.
     *
     * @return the env client base band
     */
    public String getEnvClientBaseBand() {
		return this.envClientBaseBand;
	}

    /**
     * Sets env client base station.
     *
     * @param envClientBaseStation the env client base station
     */
    public void setEnvClientBaseStation(String envClientBaseStation) {
		this.envClientBaseStation = envClientBaseStation;
	}

    /**
     * Gets env client base station.
     *
     * @return the env client base station
     */
    public String getEnvClientBaseStation() {
		return this.envClientBaseStation;
	}

    /**
     * Sets env client coordinates.
     *
     * @param envClientCoordinates the env client coordinates
     */
    public void setEnvClientCoordinates(String envClientCoordinates) {
		this.envClientCoordinates = envClientCoordinates;
	}

    /**
     * Gets env client coordinates.
     *
     * @return the env client coordinates
     */
    public String getEnvClientCoordinates() {
		return this.envClientCoordinates;
	}

    /**
     * Sets env client imei.
     *
     * @param envClientImei the env client imei
     */
    public void setEnvClientImei(String envClientImei) {
		this.envClientImei = envClientImei;
	}

    /**
     * Gets env client imei.
     *
     * @return the env client imei
     */
    public String getEnvClientImei() {
		return this.envClientImei;
	}

    /**
     * Sets env client imsi.
     *
     * @param envClientImsi the env client imsi
     */
    public void setEnvClientImsi(String envClientImsi) {
		this.envClientImsi = envClientImsi;
	}

    /**
     * Gets env client imsi.
     *
     * @return the env client imsi
     */
    public String getEnvClientImsi() {
		return this.envClientImsi;
	}

    /**
     * Sets env client ios udid.
     *
     * @param envClientIosUdid the env client ios udid
     */
    public void setEnvClientIosUdid(String envClientIosUdid) {
		this.envClientIosUdid = envClientIosUdid;
	}

    /**
     * Gets env client ios udid.
     *
     * @return the env client ios udid
     */
    public String getEnvClientIosUdid() {
		return this.envClientIosUdid;
	}

    /**
     * Sets env client ip.
     *
     * @param envClientIp the env client ip
     */
    public void setEnvClientIp(String envClientIp) {
		this.envClientIp = envClientIp;
	}

    /**
     * Gets env client ip.
     *
     * @return the env client ip
     */
    public String getEnvClientIp() {
		return this.envClientIp;
	}

    /**
     * Sets env client mac.
     *
     * @param envClientMac the env client mac
     */
    public void setEnvClientMac(String envClientMac) {
		this.envClientMac = envClientMac;
	}

    /**
     * Gets env client mac.
     *
     * @return the env client mac
     */
    public String getEnvClientMac() {
		return this.envClientMac;
	}

    /**
     * Sets env client screen.
     *
     * @param envClientScreen the env client screen
     */
    public void setEnvClientScreen(String envClientScreen) {
		this.envClientScreen = envClientScreen;
	}

    /**
     * Gets env client screen.
     *
     * @return the env client screen
     */
    public String getEnvClientScreen() {
		return this.envClientScreen;
	}

    /**
     * Sets env client uuid.
     *
     * @param envClientUuid the env client uuid
     */
    public void setEnvClientUuid(String envClientUuid) {
		this.envClientUuid = envClientUuid;
	}

    /**
     * Gets env client uuid.
     *
     * @return the env client uuid
     */
    public String getEnvClientUuid() {
		return this.envClientUuid;
	}

    /**
     * Sets item quantity.
     *
     * @param itemQuantity the item quantity
     */
    public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

    /**
     * Gets item quantity.
     *
     * @return the item quantity
     */
    public String getItemQuantity() {
		return this.itemQuantity;
	}

    /**
     * Sets item unit price.
     *
     * @param itemUnitPrice the item unit price
     */
    public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

    /**
     * Gets item unit price.
     *
     * @return the item unit price
     */
    public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}

    /**
     * Sets js token id.
     *
     * @param jsTokenId the js token id
     */
    public void setJsTokenId(String jsTokenId) {
		this.jsTokenId = jsTokenId;
	}

    /**
     * Gets js token id.
     *
     * @return the js token id
     */
    public String getJsTokenId() {
		return this.jsTokenId;
	}

    /**
     * Sets order amount.
     *
     * @param orderAmount the order amount
     */
    public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

    /**
     * Gets order amount.
     *
     * @return the order amount
     */
    public String getOrderAmount() {
		return this.orderAmount;
	}

    /**
     * Sets order category.
     *
     * @param orderCategory the order category
     */
    public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

    /**
     * Gets order category.
     *
     * @return the order category
     */
    public String getOrderCategory() {
		return this.orderCategory;
	}

    /**
     * Sets order credate time.
     *
     * @param orderCredateTime the order credate time
     */
    public void setOrderCredateTime(String orderCredateTime) {
		this.orderCredateTime = orderCredateTime;
	}

    /**
     * Gets order credate time.
     *
     * @return the order credate time
     */
    public String getOrderCredateTime() {
		return this.orderCredateTime;
	}

    /**
     * Sets order item city.
     *
     * @param orderItemCity the order item city
     */
    public void setOrderItemCity(String orderItemCity) {
		this.orderItemCity = orderItemCity;
	}

    /**
     * Gets order item city.
     *
     * @return the order item city
     */
    public String getOrderItemCity() {
		return this.orderItemCity;
	}

    /**
     * Sets order item name.
     *
     * @param orderItemName the order item name
     */
    public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

    /**
     * Gets order item name.
     *
     * @return the order item name
     */
    public String getOrderItemName() {
		return this.orderItemName;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
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
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets receiver address.
     *
     * @param receiverAddress the receiver address
     */
    public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

    /**
     * Gets receiver address.
     *
     * @return the receiver address
     */
    public String getReceiverAddress() {
		return this.receiverAddress;
	}

    /**
     * Sets receiver city.
     *
     * @param receiverCity the receiver city
     */
    public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

    /**
     * Gets receiver city.
     *
     * @return the receiver city
     */
    public String getReceiverCity() {
		return this.receiverCity;
	}

    /**
     * Sets receiver district.
     *
     * @param receiverDistrict the receiver district
     */
    public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

    /**
     * Gets receiver district.
     *
     * @return the receiver district
     */
    public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

    /**
     * Sets receiver email.
     *
     * @param receiverEmail the receiver email
     */
    public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

    /**
     * Gets receiver email.
     *
     * @return the receiver email
     */
    public String getReceiverEmail() {
		return this.receiverEmail;
	}

    /**
     * Sets receiver mobile.
     *
     * @param receiverMobile the receiver mobile
     */
    public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

    /**
     * Gets receiver mobile.
     *
     * @return the receiver mobile
     */
    public String getReceiverMobile() {
		return this.receiverMobile;
	}

    /**
     * Sets receiver name.
     *
     * @param receiverName the receiver name
     */
    public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

    /**
     * Gets receiver name.
     *
     * @return the receiver name
     */
    public String getReceiverName() {
		return this.receiverName;
	}

    /**
     * Sets receiver state.
     *
     * @param receiverState the receiver state
     */
    public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

    /**
     * Gets receiver state.
     *
     * @return the receiver state
     */
    public String getReceiverState() {
		return this.receiverState;
	}

    /**
     * Sets receiver zip.
     *
     * @param receiverZip the receiver zip
     */
    public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

    /**
     * Gets receiver zip.
     *
     * @return the receiver zip
     */
    public String getReceiverZip() {
		return this.receiverZip;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets seller account no.
     *
     * @param sellerAccountNo the seller account no
     */
    public void setSellerAccountNo(String sellerAccountNo) {
		this.sellerAccountNo = sellerAccountNo;
	}

    /**
     * Gets seller account no.
     *
     * @return the seller account no
     */
    public String getSellerAccountNo() {
		return this.sellerAccountNo;
	}

    /**
     * Sets seller bind bankcard.
     *
     * @param sellerBindBankcard the seller bind bankcard
     */
    public void setSellerBindBankcard(String sellerBindBankcard) {
		this.sellerBindBankcard = sellerBindBankcard;
	}

    /**
     * Gets seller bind bankcard.
     *
     * @return the seller bind bankcard
     */
    public String getSellerBindBankcard() {
		return this.sellerBindBankcard;
	}

    /**
     * Sets seller bind bankcard type.
     *
     * @param sellerBindBankcardType the seller bind bankcard type
     */
    public void setSellerBindBankcardType(String sellerBindBankcardType) {
		this.sellerBindBankcardType = sellerBindBankcardType;
	}

    /**
     * Gets seller bind bankcard type.
     *
     * @return the seller bind bankcard type
     */
    public String getSellerBindBankcardType() {
		return this.sellerBindBankcardType;
	}

    /**
     * Sets seller bind mobile.
     *
     * @param sellerBindMobile the seller bind mobile
     */
    public void setSellerBindMobile(String sellerBindMobile) {
		this.sellerBindMobile = sellerBindMobile;
	}

    /**
     * Gets seller bind mobile.
     *
     * @return the seller bind mobile
     */
    public String getSellerBindMobile() {
		return this.sellerBindMobile;
	}

    /**
     * Sets seller identity no.
     *
     * @param sellerIdentityNo the seller identity no
     */
    public void setSellerIdentityNo(String sellerIdentityNo) {
		this.sellerIdentityNo = sellerIdentityNo;
	}

    /**
     * Gets seller identity no.
     *
     * @return the seller identity no
     */
    public String getSellerIdentityNo() {
		return this.sellerIdentityNo;
	}

    /**
     * Sets seller identity type.
     *
     * @param sellerIdentityType the seller identity type
     */
    public void setSellerIdentityType(String sellerIdentityType) {
		this.sellerIdentityType = sellerIdentityType;
	}

    /**
     * Gets seller identity type.
     *
     * @return the seller identity type
     */
    public String getSellerIdentityType() {
		return this.sellerIdentityType;
	}

    /**
     * Sets seller real name.
     *
     * @param sellerRealName the seller real name
     */
    public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}

    /**
     * Gets seller real name.
     *
     * @return the seller real name
     */
    public String getSellerRealName() {
		return this.sellerRealName;
	}

    /**
     * Sets seller reg date.
     *
     * @param sellerRegDate the seller reg date
     */
    public void setSellerRegDate(String sellerRegDate) {
		this.sellerRegDate = sellerRegDate;
	}

    /**
     * Gets seller reg date.
     *
     * @return the seller reg date
     */
    public String getSellerRegDate() {
		return this.sellerRegDate;
	}

    /**
     * Sets seller reg email.
     *
     * @param sellerRegEmail the seller reg email
     */
    public void setSellerRegEmail(String sellerRegEmail) {
		this.sellerRegEmail = sellerRegEmail;
	}

    /**
     * Gets seller reg email.
     *
     * @return the seller reg email
     */
    public String getSellerRegEmail() {
		return this.sellerRegEmail;
	}

    /**
     * Sets seller reg moile.
     *
     * @param sellerRegMoile the seller reg moile
     */
    public void setSellerRegMoile(String sellerRegMoile) {
		this.sellerRegMoile = sellerRegMoile;
	}

    /**
     * Gets seller reg moile.
     *
     * @return the seller reg moile
     */
    public String getSellerRegMoile() {
		return this.sellerRegMoile;
	}

    /**
     * Sets transport type.
     *
     * @param transportType the transport type
     */
    public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

    /**
     * Gets transport type.
     *
     * @return the transport type
     */
    public String getTransportType() {
		return this.transportType;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.security.risk.detect";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("buyer_account_no", this.buyerAccountNo);
		txtParams.put("buyer_bind_bankcard", this.buyerBindBankcard);
		txtParams.put("buyer_bind_bankcard_type", this.buyerBindBankcardType);
		txtParams.put("buyer_bind_mobile", this.buyerBindMobile);
		txtParams.put("buyer_grade", this.buyerGrade);
		txtParams.put("buyer_identity_no", this.buyerIdentityNo);
		txtParams.put("buyer_identity_type", this.buyerIdentityType);
		txtParams.put("buyer_real_name", this.buyerRealName);
		txtParams.put("buyer_reg_date", this.buyerRegDate);
		txtParams.put("buyer_reg_email", this.buyerRegEmail);
		txtParams.put("buyer_reg_mobile", this.buyerRegMobile);
		txtParams.put("buyer_scene_bankcard", this.buyerSceneBankcard);
		txtParams.put("buyer_scene_bankcard_type", this.buyerSceneBankcardType);
		txtParams.put("buyer_scene_email", this.buyerSceneEmail);
		txtParams.put("buyer_scene_mobile", this.buyerSceneMobile);
		txtParams.put("currency", this.currency);
		txtParams.put("env_client_base_band", this.envClientBaseBand);
		txtParams.put("env_client_base_station", this.envClientBaseStation);
		txtParams.put("env_client_coordinates", this.envClientCoordinates);
		txtParams.put("env_client_imei", this.envClientImei);
		txtParams.put("env_client_imsi", this.envClientImsi);
		txtParams.put("env_client_ios_udid", this.envClientIosUdid);
		txtParams.put("env_client_ip", this.envClientIp);
		txtParams.put("env_client_mac", this.envClientMac);
		txtParams.put("env_client_screen", this.envClientScreen);
		txtParams.put("env_client_uuid", this.envClientUuid);
		txtParams.put("item_quantity", this.itemQuantity);
		txtParams.put("item_unit_price", this.itemUnitPrice);
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("order_amount", this.orderAmount);
		txtParams.put("order_category", this.orderCategory);
		txtParams.put("order_credate_time", this.orderCredateTime);
		txtParams.put("order_item_city", this.orderItemCity);
		txtParams.put("order_item_name", this.orderItemName);
		txtParams.put("order_no", this.orderNo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("receiver_address", this.receiverAddress);
		txtParams.put("receiver_city", this.receiverCity);
		txtParams.put("receiver_district", this.receiverDistrict);
		txtParams.put("receiver_email", this.receiverEmail);
		txtParams.put("receiver_mobile", this.receiverMobile);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("receiver_state", this.receiverState);
		txtParams.put("receiver_zip", this.receiverZip);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("seller_account_no", this.sellerAccountNo);
		txtParams.put("seller_bind_bankcard", this.sellerBindBankcard);
		txtParams.put("seller_bind_bankcard_type", this.sellerBindBankcardType);
		txtParams.put("seller_bind_mobile", this.sellerBindMobile);
		txtParams.put("seller_identity_no", this.sellerIdentityNo);
		txtParams.put("seller_identity_type", this.sellerIdentityType);
		txtParams.put("seller_real_name", this.sellerRealName);
		txtParams.put("seller_reg_date", this.sellerRegDate);
		txtParams.put("seller_reg_email", this.sellerRegEmail);
		txtParams.put("seller_reg_moile", this.sellerRegMoile);
		txtParams.put("transport_type", this.transportType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

    /**
     * Put other text param.
     *
     * @param key   the key
     * @param value the value
     */
    public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipaySecurityRiskDetectResponse> getResponseClass() {
		return AlipaySecurityRiskDetectResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
