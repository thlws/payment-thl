package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataServiceOpenAnalyzeResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.service.open.analyze request
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:17
 */
public class AlipayDataServiceOpenAnalyzeRequest implements AlipayRequest<AlipayDataServiceOpenAnalyzeResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 传入biz_no等信息
	 */
	private String extraInfos;

	/** 
	* 服务入参，多个入参json格式
	 */
	private String params;

	/** 
	* 调用者信息，必须传入app_id和app_name;可选pid
	 */
	private String partnerInfo;

	/** 
	* 服务名
	 */
	private String serviceName;

    /**
     * Sets extra infos.
     *
     * @param extraInfos the extra infos
     */
    public void setExtraInfos(String extraInfos) {
		this.extraInfos = extraInfos;
	}

    /**
     * Gets extra infos.
     *
     * @return the extra infos
     */
    public String getExtraInfos() {
		return this.extraInfos;
	}

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(String params) {
		this.params = params;
	}

    /**
     * Gets params.
     *
     * @return the params
     */
    public String getParams() {
		return this.params;
	}

    /**
     * Sets partner info.
     *
     * @param partnerInfo the partner info
     */
    public void setPartnerInfo(String partnerInfo) {
		this.partnerInfo = partnerInfo;
	}

    /**
     * Gets partner info.
     *
     * @return the partner info
     */
    public String getPartnerInfo() {
		return this.partnerInfo;
	}

    /**
     * Sets service name.
     *
     * @param serviceName the service name
     */
    public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

    /**
     * Gets service name.
     *
     * @return the service name
     */
    public String getServiceName() {
		return this.serviceName;
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
		return "alipay.data.service.open.analyze";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("extra_infos", this.extraInfos);
		txtParams.put("params", this.params);
		txtParams.put("partner_info", this.partnerInfo);
		txtParams.put("service_name", this.serviceName);
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

	public Class<AlipayDataServiceOpenAnalyzeResponse> getResponseClass() {
		return AlipayDataServiceOpenAnalyzeResponse.class;
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
