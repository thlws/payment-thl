package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySamsungEbppRechargeResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.samsung.ebpp.recharge request
 *
 * @author auto create
 * @since 1.0, 2018-01-02 11:20:54
 */
public class AlipaySamsungEbppRechargeRequest implements AlipayRequest<AlipaySamsungEbppRechargeResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 设备唯一值
	 */
	private String apdId;

	/** 
	* 手机位置信息
	 */
	private String cellId;

	/** 
	* apdid对应的设备信息key
	 */
	private String deviceInfoToken;

	/** 
	* 商户输入的扩展信息
	 */
	private String exparam;

	/** 
	* 商户用户的无线设备的终端信息
	 */
	private String imei;

	/** 
	* 客户端IP
	 */
	private String ip;

	/** 
	* 基站LAC
	 */
	private String lacId;

	/** 
	* 业务来源
	 */
	private String loginFrom;

	/** 
	* 设备mac信息
	 */
	private String mac;

	/** 
	* 设备的安全支付标识
	 */
	private String tid;

	/** 
	* 设备umid信息
	 */
	private String umid;

	/** 
	* wifi上的mac地址
	 */
	private String wirelessMac;

    /**
     * Sets apd id.
     *
     * @param apdId the apd id
     */
    public void setApdId(String apdId) {
		this.apdId = apdId;
	}

    /**
     * Gets apd id.
     *
     * @return the apd id
     */
    public String getApdId() {
		return this.apdId;
	}

    /**
     * Sets cell id.
     *
     * @param cellId the cell id
     */
    public void setCellId(String cellId) {
		this.cellId = cellId;
	}

    /**
     * Gets cell id.
     *
     * @return the cell id
     */
    public String getCellId() {
		return this.cellId;
	}

    /**
     * Sets device info token.
     *
     * @param deviceInfoToken the device info token
     */
    public void setDeviceInfoToken(String deviceInfoToken) {
		this.deviceInfoToken = deviceInfoToken;
	}

    /**
     * Gets device info token.
     *
     * @return the device info token
     */
    public String getDeviceInfoToken() {
		return this.deviceInfoToken;
	}

    /**
     * Sets exparam.
     *
     * @param exparam the exparam
     */
    public void setExparam(String exparam) {
		this.exparam = exparam;
	}

    /**
     * Gets exparam.
     *
     * @return the exparam
     */
    public String getExparam() {
		return this.exparam;
	}

    /**
     * Sets imei.
     *
     * @param imei the imei
     */
    public void setImei(String imei) {
		this.imei = imei;
	}

    /**
     * Gets imei.
     *
     * @return the imei
     */
    public String getImei() {
		return this.imei;
	}

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
		this.ip = ip;
	}

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
		return this.ip;
	}

    /**
     * Sets lac id.
     *
     * @param lacId the lac id
     */
    public void setLacId(String lacId) {
		this.lacId = lacId;
	}

    /**
     * Gets lac id.
     *
     * @return the lac id
     */
    public String getLacId() {
		return this.lacId;
	}

    /**
     * Sets login from.
     *
     * @param loginFrom the login from
     */
    public void setLoginFrom(String loginFrom) {
		this.loginFrom = loginFrom;
	}

    /**
     * Gets login from.
     *
     * @return the login from
     */
    public String getLoginFrom() {
		return this.loginFrom;
	}

    /**
     * Sets mac.
     *
     * @param mac the mac
     */
    public void setMac(String mac) {
		this.mac = mac;
	}

    /**
     * Gets mac.
     *
     * @return the mac
     */
    public String getMac() {
		return this.mac;
	}

    /**
     * Sets tid.
     *
     * @param tid the tid
     */
    public void setTid(String tid) {
		this.tid = tid;
	}

    /**
     * Gets tid.
     *
     * @return the tid
     */
    public String getTid() {
		return this.tid;
	}

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid() {
		return this.umid;
	}

    /**
     * Sets wireless mac.
     *
     * @param wirelessMac the wireless mac
     */
    public void setWirelessMac(String wirelessMac) {
		this.wirelessMac = wirelessMac;
	}

    /**
     * Gets wireless mac.
     *
     * @return the wireless mac
     */
    public String getWirelessMac() {
		return this.wirelessMac;
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
		return "alipay.samsung.ebpp.recharge";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apd_id", this.apdId);
		txtParams.put("cell_id", this.cellId);
		txtParams.put("device_info_token", this.deviceInfoToken);
		txtParams.put("exparam", this.exparam);
		txtParams.put("imei", this.imei);
		txtParams.put("ip", this.ip);
		txtParams.put("lac_id", this.lacId);
		txtParams.put("login_from", this.loginFrom);
		txtParams.put("mac", this.mac);
		txtParams.put("tid", this.tid);
		txtParams.put("umid", this.umid);
		txtParams.put("wireless_mac", this.wirelessMac);
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

	public Class<AlipaySamsungEbppRechargeResponse> getResponseClass() {
		return AlipaySamsungEbppRechargeResponse.class;
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
