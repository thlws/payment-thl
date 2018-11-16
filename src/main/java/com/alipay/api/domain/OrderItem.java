package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单明细
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:47:25
 */
public class OrderItem extends AlipayObject {

	private static final long serialVersionUID = 3285279588277272232L;

	/**
	 * 店铺所在具体位置
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 店铺品类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 店铺所在的市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 订购的服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 订单联系人
	 */
	@ApiField("contacts")
	private String contacts;

	/**
	 * 门店创建人(已删除)
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 过期时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小程序APPID，订购实体为小程序的场景该字段必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序应用名称，订购实体为小程序的场景该字段必填
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * TO_DO-未实施,DOING-实施中,TO_CONFIRM-待商户确认,DONE-已完成,MERCHANT_REJECTED-商户已回绝,MERCHANT_CANCELLED-商户已取消,ISV_REJECTED-服务商已回绝,ISV_CANCELLED-服务商已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单所属人联系方式（手机或者座机）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 店铺所在的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 店铺ID，订购实体为口碑门店的场景该字段必填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称，订购实体为口碑门店的场景该字段必填
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺状态（ONLINE--已上架 OFFLINE--未上架 AVAILABLE--已开通 INIT--未开通 EXPIRED--已过期）
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 待服务商接单
	 */
	@ApiField("status")
	private String status;

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
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
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
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets contacts.
     *
     * @return the contacts
     */
    public String getContacts() {
		return this.contacts;
	}

    /**
     * Sets contacts.
     *
     * @param contacts the contacts
     */
    public void setContacts(String contacts) {
		this.contacts = contacts;
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
     * Gets expire date.
     *
     * @return the expire date
     */
    public String getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName() {
		return this.merchantName;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid() {
		return this.merchantPid;
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
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId() {
		return this.miniAppId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

    /**
     * Gets mini app name.
     *
     * @return the mini app name
     */
    public String getMiniAppName() {
		return this.miniAppName;
	}

    /**
     * Sets mini app name.
     *
     * @param miniAppName the mini app name
     */
    public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

    /**
     * Gets online time.
     *
     * @return the online time
     */
    public String getOnlineTime() {
		return this.onlineTime;
	}

    /**
     * Sets online time.
     *
     * @param onlineTime the online time
     */
    public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets phone no.
     *
     * @return the phone no
     */
    public String getPhoneNo() {
		return this.phoneNo;
	}

    /**
     * Sets phone no.
     *
     * @param phoneNo the phone no
     */
    public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop status.
     *
     * @return the shop status
     */
    public String getShopStatus() {
		return this.shopStatus;
	}

    /**
     * Sets shop status.
     *
     * @param shopStatus the shop status
     */
    public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
