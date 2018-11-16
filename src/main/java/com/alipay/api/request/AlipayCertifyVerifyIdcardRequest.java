package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCertifyVerifyIdcardResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.certify.verify.idcard request
 *
 * @author auto create
 * @since 1.0, 2017-07-05 16:00:47
 */
public class AlipayCertifyVerifyIdcardRequest implements AlipayRequest<AlipayCertifyVerifyIdcardResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 访问来源，业务系统 用于结算
	 */
	private String bizFrom;

	/** 
	* 业务主体ID 如userId
	 */
	private String bizId;

	/** 
	* 证件姓名
	 */
	private String certName;

	/** 
	* 身份证号码
	 */
	private String certNo;

	/** 
	* 认证来源 : 业务BU,如网商银行
	 */
	private String certifyFrom;

	/** 
	* Y强制查官网，N缺省，先查本地后官网
	 */
	private String forcePublic;

    /**
     * Sets biz from.
     *
     * @param bizFrom the biz from
     */
    public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

    /**
     * Gets biz from.
     *
     * @return the biz from
     */
    public String getBizFrom() {
		return this.bizFrom;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets certify from.
     *
     * @param certifyFrom the certify from
     */
    public void setCertifyFrom(String certifyFrom) {
		this.certifyFrom = certifyFrom;
	}

    /**
     * Gets certify from.
     *
     * @return the certify from
     */
    public String getCertifyFrom() {
		return this.certifyFrom;
	}

    /**
     * Sets force public.
     *
     * @param forcePublic the force public
     */
    public void setForcePublic(String forcePublic) {
		this.forcePublic = forcePublic;
	}

    /**
     * Gets force public.
     *
     * @return the force public
     */
    public String getForcePublic() {
		return this.forcePublic;
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
		return "alipay.certify.verify.idcard";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_from", this.bizFrom);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("cert_name", this.certName);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("certify_from", this.certifyFrom);
		txtParams.put("force_public", this.forcePublic);
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

	public Class<AlipayCertifyVerifyIdcardResponse> getResponseClass() {
		return AlipayCertifyVerifyIdcardResponse.class;
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
