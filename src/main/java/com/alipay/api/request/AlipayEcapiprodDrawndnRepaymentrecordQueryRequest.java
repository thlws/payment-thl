package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcapiprodDrawndnRepaymentrecordQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.repaymentrecord.query request
 *
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:40
 */
public class AlipayEcapiprodDrawndnRepaymentrecordQueryRequest implements AlipayRequest<AlipayEcapiprodDrawndnRepaymentrecordQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支用编号
	 */
	private String drawndnNo;

	/** 
	* 还款记录的终止时间，终止时间与起始时间的范围不能超过31天
	 */
	private String end;

	/** 
	* 客户身份证号码，为18位，最后X必须为大写
	 */
	private String entityCode;

	/** 
	* 客户的姓名
	 */
	private String entityName;

	/** 
	* 融资平台分配给ISV的编码
	 */
	private String isvCode;

	/** 
	* 融资平台分配给小贷公司的机构编码
	 */
	private String orgCode;

	/** 
	* 还款记录的起始时间（距离当前时间不能大于183天，只能在【0-183】之间）
	 */
	private String start;

    /**
     * Sets drawndn no.
     *
     * @param drawndnNo the drawndn no
     */
    public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}

    /**
     * Gets drawndn no.
     *
     * @return the drawndn no
     */
    public String getDrawndnNo() {
		return this.drawndnNo;
	}

    /**
     * Sets end.
     *
     * @param end the end
     */
    public void setEnd(String end) {
		this.end = end;
	}

    /**
     * Gets end.
     *
     * @return the end
     */
    public String getEnd() {
		return this.end;
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

    /**
     * Sets start.
     *
     * @param start the start
     */
    public void setStart(String start) {
		this.start = start;
	}

    /**
     * Gets start.
     *
     * @return the start
     */
    public String getStart() {
		return this.start;
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
		return "alipay.ecapiprod.drawndn.repaymentrecord.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("drawndn_no", this.drawndnNo);
		txtParams.put("end", this.end);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("org_code", this.orgCode);
		txtParams.put("start", this.start);
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

	public Class<AlipayEcapiprodDrawndnRepaymentrecordQueryResponse> getResponseClass() {
		return AlipayEcapiprodDrawndnRepaymentrecordQueryResponse.class;
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
