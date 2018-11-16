package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 17:10:00
 */
public class AlipayCommerceIotMdeviceprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6527478733568897533L;

	/** 
	 * 设备激活时间
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/** 
	 * 地址信息
	 */
	@ApiField("addr_info")
	private String addrInfo;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 机具唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 机具名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/** 
	 * 机具序列号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 机具图片信息
	 */
	@ApiField("img_url")
	private String imgUrl;

	/** 
	 * isv信息
	 */
	@ApiField("isv")
	private MerchantModel isv;

	/** 
	 * 商户联系信息
	 */
	@ApiField("merchant")
	private MerchantModel merchant;

	/** 
	 * 店铺地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/** 
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * xxx店铺
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 机具状态code
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 设备状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/** 
	 * 机具生产厂商
	 */
	@ApiField("supplier_name")
	private String supplierName;

    /**
     * Sets activate time.
     *
     * @param activateTime the activate time
     */
    public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

    /**
     * Gets activate time.
     *
     * @return the activate time
     */
    public Date getActivateTime( ) {
		return this.activateTime;
	}

    /**
     * Sets addr info.
     *
     * @param addrInfo the addr info
     */
    public void setAddrInfo(String addrInfo) {
		this.addrInfo = addrInfo;
	}

    /**
     * Gets addr info.
     *
     * @return the addr info
     */
    public String getAddrInfo( ) {
		return this.addrInfo;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public String getDeviceId( ) {
		return this.deviceId;
	}

    /**
     * Sets device name.
     *
     * @param deviceName the device name
     */
    public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

    /**
     * Gets device name.
     *
     * @return the device name
     */
    public String getDeviceName( ) {
		return this.deviceName;
	}

    /**
     * Sets device sn.
     *
     * @param deviceSn the device sn
     */
    public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

    /**
     * Gets device sn.
     *
     * @return the device sn
     */
    public String getDeviceSn( ) {
		return this.deviceSn;
	}

    /**
     * Sets img url.
     *
     * @param imgUrl the img url
     */
    public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

    /**
     * Gets img url.
     *
     * @return the img url
     */
    public String getImgUrl( ) {
		return this.imgUrl;
	}

    /**
     * Sets isv.
     *
     * @param isv the isv
     */
    public void setIsv(MerchantModel isv) {
		this.isv = isv;
	}

    /**
     * Gets isv.
     *
     * @return the isv
     */
    public MerchantModel getIsv( ) {
		return this.isv;
	}

    /**
     * Sets merchant.
     *
     * @param merchant the merchant
     */
    public void setMerchant(MerchantModel merchant) {
		this.merchant = merchant;
	}

    /**
     * Gets merchant.
     *
     * @return the merchant
     */
    public MerchantModel getMerchant( ) {
		return this.merchant;
	}

    /**
     * Sets shop address.
     *
     * @param shopAddress the shop address
     */
    public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

    /**
     * Gets shop address.
     *
     * @return the shop address
     */
    public String getShopAddress( ) {
		return this.shopAddress;
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
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId( ) {
		return this.shopId;
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
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName( ) {
		return this.shopName;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets status desc.
     *
     * @param statusDesc the status desc
     */
    public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

    /**
     * Gets status desc.
     *
     * @return the status desc
     */
    public String getStatusDesc( ) {
		return this.statusDesc;
	}

    /**
     * Sets supplier name.
     *
     * @param supplierName the supplier name
     */
    public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

    /**
     * Gets supplier name.
     *
     * @return the supplier name
     */
    public String getSupplierName( ) {
		return this.supplierName;
	}

}
