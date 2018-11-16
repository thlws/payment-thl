package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenServicemarketOrderCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.servicemarket.order.create request
 *
 * @author auto create
 * @since 1.0, 2018-08-16 22:30:00
 */
public class AlipayOpenServicemarketOrderCreateRequest implements AlipayUploadRequest<AlipayOpenServicemarketOrderCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 11_12;12_13。小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.alipay.com/isv/10325
	 */
	private String appCategoryIds;

	/** 
	* 小程序官方示例Demo，展示已支持的接口能力及组件。
	 */
	private String appDesc;

	/** 
	* 小程序应用英文名称
	 */
	private String appEnglishName;

	/** 
	* 小程序应用logo图标，图片格式必须为：png、jpeg、jpg，建议上传像素为180*180
	 */
	private FileItem appLogo;

	/** 
	* 小程序应用名称
	 */
	private String appName;

	/** 
	* 小程序应用简介，一句话描述小程序功能
	 */
	private String appSlogan;

	/** 
	* 订购的服务商品ID
	 */
	private String merchandiseId;

	/** 
	* 商户PID
	 */
	private String merchantPid;

	/** 
	* 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	private String outBizNo;

	/** 
	* 小程序客服邮箱
	 */
	private String serviceEmail;

	/** 
	* 小程序客服电话
	 */
	private String servicePhone;

    /**
     * Sets app category ids.
     *
     * @param appCategoryIds the app category ids
     */
    public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}

    /**
     * Gets app category ids.
     *
     * @return the app category ids
     */
    public String getAppCategoryIds() {
		return this.appCategoryIds;
	}

    /**
     * Sets app desc.
     *
     * @param appDesc the app desc
     */
    public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

    /**
     * Gets app desc.
     *
     * @return the app desc
     */
    public String getAppDesc() {
		return this.appDesc;
	}

    /**
     * Sets app english name.
     *
     * @param appEnglishName the app english name
     */
    public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

    /**
     * Gets app english name.
     *
     * @return the app english name
     */
    public String getAppEnglishName() {
		return this.appEnglishName;
	}

    /**
     * Sets app logo.
     *
     * @param appLogo the app logo
     */
    public void setAppLogo(FileItem appLogo) {
		this.appLogo = appLogo;
	}

    /**
     * Gets app logo.
     *
     * @return the app logo
     */
    public FileItem getAppLogo() {
		return this.appLogo;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app slogan.
     *
     * @param appSlogan the app slogan
     */
    public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

    /**
     * Gets app slogan.
     *
     * @return the app slogan
     */
    public String getAppSlogan() {
		return this.appSlogan;
	}

    /**
     * Sets merchandise id.
     *
     * @param merchandiseId the merchandise id
     */
    public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

    /**
     * Gets merchandise id.
     *
     * @return the merchandise id
     */
    public String getMerchandiseId() {
		return this.merchandiseId;
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
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid() {
		return this.merchantPid;
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
     * Sets service email.
     *
     * @param serviceEmail the service email
     */
    public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

    /**
     * Gets service email.
     *
     * @return the service email
     */
    public String getServiceEmail() {
		return this.serviceEmail;
	}

    /**
     * Sets service phone.
     *
     * @param servicePhone the service phone
     */
    public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

    /**
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone() {
		return this.servicePhone;
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
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.servicemarket.order.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("merchandise_id", this.merchandiseId);
		txtParams.put("merchant_pid", this.merchantPid);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("app_logo", this.appLogo);
		return params;
	}

	public Class<AlipayOpenServicemarketOrderCreateResponse> getResponseClass() {
		return AlipayOpenServicemarketOrderCreateResponse.class;
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
