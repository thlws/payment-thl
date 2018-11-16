package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcapiprodDataPutResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.data.put request
 *
 * @author auto create
 * @since 1.0, 2015-04-02 16:45:23
 */
public class AlipayEcapiprodDataPutRequest implements AlipayRequest<AlipayEcapiprodDataPutResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 数据类型
	 */
	private String category;

	/** 
	* 数据字符编码，默认UTF-8
	 */
	private String charSet;

	/** 
	* 数据采集平台生成的采集任务编号
	 */
	private String collectingTaskId;

	/** 
	* 身份证，工商注册号等
	 */
	private String entityCode;

	/** 
	* 姓名或公司名等，name和code不能同时为空
	 */
	private String entityName;

	/** 
	* 人或公司等
	 */
	private String entityType;

	/** 
	* 渠道商
	 */
	private String isvCode;

	/** 
	* 数据主体,以json格式传输的数据
	 */
	private String jsonData;

	/** 
	* 数据合作方
	 */
	private String orgCode;

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
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
     * Sets char set.
     *
     * @param charSet the char set
     */
    public void setCharSet(String charSet) {
		this.charSet = charSet;
	}

    /**
     * Gets char set.
     *
     * @return the char set
     */
    public String getCharSet() {
		return this.charSet;
	}

    /**
     * Sets collecting task id.
     *
     * @param collectingTaskId the collecting task id
     */
    public void setCollectingTaskId(String collectingTaskId) {
		this.collectingTaskId = collectingTaskId;
	}

    /**
     * Gets collecting task id.
     *
     * @return the collecting task id
     */
    public String getCollectingTaskId() {
		return this.collectingTaskId;
	}

    /**
     * Sets entity code.
     *
     * @param entityCode the entity code
     */
    public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

    /**
     * Gets entity code.
     *
     * @return the entity code
     */
    public String getEntityCode() {
		return this.entityCode;
	}

    /**
     * Sets entity name.
     *
     * @param entityName the entity name
     */
    public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
		return this.entityName;
	}

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
		return this.entityType;
	}

    /**
     * Sets isv code.
     *
     * @param isvCode the isv code
     */
    public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

    /**
     * Gets isv code.
     *
     * @return the isv code
     */
    public String getIsvCode() {
		return this.isvCode;
	}

    /**
     * Sets json data.
     *
     * @param jsonData the json data
     */
    public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

    /**
     * Gets json data.
     *
     * @return the json data
     */
    public String getJsonData() {
		return this.jsonData;
	}

    /**
     * Sets org code.
     *
     * @param orgCode the org code
     */
    public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

    /**
     * Gets org code.
     *
     * @return the org code
     */
    public String getOrgCode() {
		return this.orgCode;
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
		return "alipay.ecapiprod.data.put";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("char_set", this.charSet);
		txtParams.put("collecting_task_id", this.collectingTaskId);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("json_data", this.jsonData);
		txtParams.put("org_code", this.orgCode);
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

	public Class<AlipayEcapiprodDataPutResponse> getResponseClass() {
		return AlipayEcapiprodDataPutResponse.class;
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
