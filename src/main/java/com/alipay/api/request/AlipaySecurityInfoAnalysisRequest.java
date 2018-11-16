package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityInfoAnalysisResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.info.analysis request
 *
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:20
 */
public class AlipaySecurityInfoAnalysisRequest implements AlipayRequest<AlipaySecurityInfoAnalysisResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端的imsi
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
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户ID
	 */
	private String userAccountNo;

	/** 
	* 用户绑定银行卡号
	 */
	private String userBindBankcard;

	/** 
	* 用户绑定银行卡的卡类型
	 */
	private String userBindBankcardType;

	/** 
	* 用户绑定手机号
	 */
	private String userBindMobile;

	/** 
	* 用户证件类型
	 */
	private String userIdentityType;

	/** 
	* 用户真实姓名
	 */
	private String userRealName;

	/** 
	* 用户注册时间
	 */
	private String userRegDate;

	/** 
	* 用户注册Email
	 */
	private String userRegEmail;

	/** 
	* 用户注册手机号
	 */
	private String userRegMobile;

	/** 
	* 用户证件号码
	 */
	private String userrIdentityNo;

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
     * Sets user account no.
     *
     * @param userAccountNo the user account no
     */
    public void setUserAccountNo(String userAccountNo) {
		this.userAccountNo = userAccountNo;
	}

    /**
     * Gets user account no.
     *
     * @return the user account no
     */
    public String getUserAccountNo() {
		return this.userAccountNo;
	}

    /**
     * Sets user bind bankcard.
     *
     * @param userBindBankcard the user bind bankcard
     */
    public void setUserBindBankcard(String userBindBankcard) {
		this.userBindBankcard = userBindBankcard;
	}

    /**
     * Gets user bind bankcard.
     *
     * @return the user bind bankcard
     */
    public String getUserBindBankcard() {
		return this.userBindBankcard;
	}

    /**
     * Sets user bind bankcard type.
     *
     * @param userBindBankcardType the user bind bankcard type
     */
    public void setUserBindBankcardType(String userBindBankcardType) {
		this.userBindBankcardType = userBindBankcardType;
	}

    /**
     * Gets user bind bankcard type.
     *
     * @return the user bind bankcard type
     */
    public String getUserBindBankcardType() {
		return this.userBindBankcardType;
	}

    /**
     * Sets user bind mobile.
     *
     * @param userBindMobile the user bind mobile
     */
    public void setUserBindMobile(String userBindMobile) {
		this.userBindMobile = userBindMobile;
	}

    /**
     * Gets user bind mobile.
     *
     * @return the user bind mobile
     */
    public String getUserBindMobile() {
		return this.userBindMobile;
	}

    /**
     * Sets user identity type.
     *
     * @param userIdentityType the user identity type
     */
    public void setUserIdentityType(String userIdentityType) {
		this.userIdentityType = userIdentityType;
	}

    /**
     * Gets user identity type.
     *
     * @return the user identity type
     */
    public String getUserIdentityType() {
		return this.userIdentityType;
	}

    /**
     * Sets user real name.
     *
     * @param userRealName the user real name
     */
    public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

    /**
     * Gets user real name.
     *
     * @return the user real name
     */
    public String getUserRealName() {
		return this.userRealName;
	}

    /**
     * Sets user reg date.
     *
     * @param userRegDate the user reg date
     */
    public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}

    /**
     * Gets user reg date.
     *
     * @return the user reg date
     */
    public String getUserRegDate() {
		return this.userRegDate;
	}

    /**
     * Sets user reg email.
     *
     * @param userRegEmail the user reg email
     */
    public void setUserRegEmail(String userRegEmail) {
		this.userRegEmail = userRegEmail;
	}

    /**
     * Gets user reg email.
     *
     * @return the user reg email
     */
    public String getUserRegEmail() {
		return this.userRegEmail;
	}

    /**
     * Sets user reg mobile.
     *
     * @param userRegMobile the user reg mobile
     */
    public void setUserRegMobile(String userRegMobile) {
		this.userRegMobile = userRegMobile;
	}

    /**
     * Gets user reg mobile.
     *
     * @return the user reg mobile
     */
    public String getUserRegMobile() {
		return this.userRegMobile;
	}

    /**
     * Sets userr identity no.
     *
     * @param userrIdentityNo the userr identity no
     */
    public void setUserrIdentityNo(String userrIdentityNo) {
		this.userrIdentityNo = userrIdentityNo;
	}

    /**
     * Gets userr identity no.
     *
     * @return the userr identity no
     */
    public String getUserrIdentityNo() {
		return this.userrIdentityNo;
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
		return "alipay.security.info.analysis";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
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
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("user_account_no", this.userAccountNo);
		txtParams.put("user_bind_bankcard", this.userBindBankcard);
		txtParams.put("user_bind_bankcard_type", this.userBindBankcardType);
		txtParams.put("user_bind_mobile", this.userBindMobile);
		txtParams.put("user_identity_type", this.userIdentityType);
		txtParams.put("user_real_name", this.userRealName);
		txtParams.put("user_reg_date", this.userRegDate);
		txtParams.put("user_reg_email", this.userRegEmail);
		txtParams.put("user_reg_mobile", this.userRegMobile);
		txtParams.put("userr_identity_no", this.userrIdentityNo);
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

	public Class<AlipaySecurityInfoAnalysisResponse> getResponseClass() {
		return AlipaySecurityInfoAnalysisResponse.class;
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
