package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOperatorMobileBindResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.operator.mobile.bind request
 *
 * @author auto create
 * @since 1.0, 2018-09-13 13:55:27
 */
public class AlipayOperatorMobileBindRequest implements AlipayRequest<AlipayOperatorMobileBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 标识该运营商是否需要验证用户的手机号绑定过快捷卡
1：需要
0：不需要
	 */
	private String checkSigncard;

	/** 
	* 支付宝处理完请求后，如验证失败，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	private String fReturnUrl;

	/** 
	* 标识该运营商是否提供了查询手机归属的spi接口。
1：提供了
0：没提供
	 */
	private String hasSpi;

	/** 
	* 标识该运营商名称
	 */
	private String operatorName;

	/** 
	* 标识该运营商所在省份
	 */
	private String provinceName;

	/** 
	* 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	private String sReturnUrl;

    /**
     * Sets check signcard.
     *
     * @param checkSigncard the check signcard
     */
    public void setCheckSigncard(String checkSigncard) {
		this.checkSigncard = checkSigncard;
	}

    /**
     * Gets check signcard.
     *
     * @return the check signcard
     */
    public String getCheckSigncard() {
		return this.checkSigncard;
	}

    /**
     * Sets return url.
     *
     * @param fReturnUrl the f return url
     */
    public void setfReturnUrl(String fReturnUrl) {
		this.fReturnUrl = fReturnUrl;
	}

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getfReturnUrl() {
		return this.fReturnUrl;
	}

    /**
     * Sets has spi.
     *
     * @param hasSpi the has spi
     */
    public void setHasSpi(String hasSpi) {
		this.hasSpi = hasSpi;
	}

    /**
     * Gets has spi.
     *
     * @return the has spi
     */
    public String getHasSpi() {
		return this.hasSpi;
	}

    /**
     * Sets operator name.
     *
     * @param operatorName the operator name
     */
    public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

    /**
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
		return this.operatorName;
	}

    /**
     * Sets province name.
     *
     * @param provinceName the province name
     */
    public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

    /**
     * Gets province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
		return this.provinceName;
	}

    /**
     * Sets return url.
     *
     * @param sReturnUrl the s return url
     */
    public void setsReturnUrl(String sReturnUrl) {
		this.sReturnUrl = sReturnUrl;
	}

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getsReturnUrl() {
		return this.sReturnUrl;
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
		return "alipay.operator.mobile.bind";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("check_signcard", this.checkSigncard);
		txtParams.put("f_return_url", this.fReturnUrl);
		txtParams.put("has_spi", this.hasSpi);
		txtParams.put("operator_name", this.operatorName);
		txtParams.put("province_name", this.provinceName);
		txtParams.put("s_return_url", this.sReturnUrl);
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

	public Class<AlipayOperatorMobileBindResponse> getResponseClass() {
		return AlipayOperatorMobileBindResponse.class;
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
