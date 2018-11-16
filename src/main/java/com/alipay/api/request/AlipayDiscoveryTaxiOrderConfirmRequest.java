package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDiscoveryTaxiOrderConfirmResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.discovery.taxi.order.confirm request
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:59
 */
public class AlipayDiscoveryTaxiOrderConfirmRequest implements AlipayRequest<AlipayDiscoveryTaxiOrderConfirmResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 司机纬度
	 */
	private String driverLat;

	/** 
	* 司机车牌
	 */
	private String driverLicense;

	/** 
	* 司机经度
	 */
	private String driverLng;

	/** 
	* 司机姓名
	 */
	private String driverName;

	/** 
	* 司机手机号
	 */
	private String driverPhone;

	/** 
	* 是否支持支付宝付款
	 */
	private Boolean isAlipaySupport;

	/** 
	* 打车订单ID
	 */
	private String outBizNo;

	/** 
	* 商户ID
	 */
	private String partnerId;

	/** 
	* 收款账号
	 */
	private String seller;

    /**
     * Sets driver lat.
     *
     * @param driverLat the driver lat
     */
    public void setDriverLat(String driverLat) {
		this.driverLat = driverLat;
	}

    /**
     * Gets driver lat.
     *
     * @return the driver lat
     */
    public String getDriverLat() {
		return this.driverLat;
	}

    /**
     * Sets driver license.
     *
     * @param driverLicense the driver license
     */
    public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

    /**
     * Gets driver license.
     *
     * @return the driver license
     */
    public String getDriverLicense() {
		return this.driverLicense;
	}

    /**
     * Sets driver lng.
     *
     * @param driverLng the driver lng
     */
    public void setDriverLng(String driverLng) {
		this.driverLng = driverLng;
	}

    /**
     * Gets driver lng.
     *
     * @return the driver lng
     */
    public String getDriverLng() {
		return this.driverLng;
	}

    /**
     * Sets driver name.
     *
     * @param driverName the driver name
     */
    public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

    /**
     * Gets driver name.
     *
     * @return the driver name
     */
    public String getDriverName() {
		return this.driverName;
	}

    /**
     * Sets driver phone.
     *
     * @param driverPhone the driver phone
     */
    public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

    /**
     * Gets driver phone.
     *
     * @return the driver phone
     */
    public String getDriverPhone() {
		return this.driverPhone;
	}

    /**
     * Sets is alipay support.
     *
     * @param isAlipaySupport the is alipay support
     */
    public void setIsAlipaySupport(Boolean isAlipaySupport) {
		this.isAlipaySupport = isAlipaySupport;
	}

    /**
     * Gets is alipay support.
     *
     * @return the is alipay support
     */
    public Boolean getIsAlipaySupport() {
		return this.isAlipaySupport;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
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
     * Sets seller.
     *
     * @param seller the seller
     */
    public void setSeller(String seller) {
		this.seller = seller;
	}

    /**
     * Gets seller.
     *
     * @return the seller
     */
    public String getSeller() {
		return this.seller;
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
		return "alipay.discovery.taxi.order.confirm";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("driver_lat", this.driverLat);
		txtParams.put("driver_license", this.driverLicense);
		txtParams.put("driver_lng", this.driverLng);
		txtParams.put("driver_name", this.driverName);
		txtParams.put("driver_phone", this.driverPhone);
		txtParams.put("is_alipay_support", this.isAlipaySupport);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("seller", this.seller);
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

	public Class<AlipayDiscoveryTaxiOrderConfirmResponse> getResponseClass() {
		return AlipayDiscoveryTaxiOrderConfirmResponse.class;
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
