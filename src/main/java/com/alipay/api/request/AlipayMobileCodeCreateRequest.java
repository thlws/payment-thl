package com.alipay.api.request;

import java.util.Date;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileCodeCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.code.create request
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:34:41
 */
public class AlipayMobileCodeCreateRequest implements AlipayRequest<AlipayMobileCodeCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务关联ID。比如订单号,userId，业务连接等
	 */
	private String bizLinkedId;

	/** 
	* 类似产品名称，根据该值决定码存储类型；新接业务需要找码平台技术配置
	 */
	private String bizType;

	/** 
	* 业务自定义,码平台不用理解。一定要传json字符串。
	 */
	private String contextStr;

	/** 
	* 如果是true，则扫一扫下发跳转地址直接取自bizLinkedId
否则，从路由信息里取跳转地址
	 */
	private Boolean isDirect;

	/** 
	* 备注信息字段
	 */
	private String memo;

	/** 
	* 发码来源，业务自定
	 */
	private String sourceId;

	/** 
	* 编码启动时间（yyy-MM-dd hh:mm:ss），为空表示立即启用
	 */
	private Date startDate;

	/** 
	* 超时时间,单位秒；若不传则为永久。发码超时时间需要找码平台技术评估
	 */
	private Long timeout;

	/** 
	* 支付宝用户id
	 */
	private String userId;

    /**
     * Sets biz linked id.
     *
     * @param bizLinkedId the biz linked id
     */
    public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

    /**
     * Gets biz linked id.
     *
     * @return the biz linked id
     */
    public String getBizLinkedId() {
		return this.bizLinkedId;
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
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets context str.
     *
     * @param contextStr the context str
     */
    public void setContextStr(String contextStr) {
		this.contextStr = contextStr;
	}

    /**
     * Gets context str.
     *
     * @return the context str
     */
    public String getContextStr() {
		return this.contextStr;
	}

    /**
     * Sets is direct.
     *
     * @param isDirect the is direct
     */
    public void setIsDirect(Boolean isDirect) {
		this.isDirect = isDirect;
	}

    /**
     * Gets is direct.
     *
     * @return the is direct
     */
    public Boolean getIsDirect() {
		return this.isDirect;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets timeout.
     *
     * @param timeout the timeout
     */
    public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

    /**
     * Gets timeout.
     *
     * @return the timeout
     */
    public Long getTimeout() {
		return this.timeout;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
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
		return "alipay.mobile.code.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_linked_id", this.bizLinkedId);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("context_str", this.contextStr);
		txtParams.put("is_direct", this.isDirect);
		txtParams.put("memo", this.memo);
		txtParams.put("source_id", this.sourceId);
		txtParams.put("start_date", this.startDate);
		txtParams.put("timeout", this.timeout);
		txtParams.put("user_id", this.userId);
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

	public Class<AlipayMobileCodeCreateResponse> getResponseClass() {
		return AlipayMobileCodeCreateResponse.class;
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
