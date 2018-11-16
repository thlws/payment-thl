package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.ZhimaCreditEpCodecCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: zhima.credit.ep.codec.create request
 *
 * @author auto create
 * @since 1.0, 2018-08-16 16:30:00
 */
public class ZhimaCreditEpCodecCreateRequest implements AlipayUploadRequest<ZhimaCreditEpCodecCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户端保持自有渠道id所对应商户的唯一性
	 */
	private String channelId;

	/** 
	* 支持中文名，最长50个字符
	 */
	private String channelName;

	/** 
	* 主图背景图二进制数据
	 */
	private FileItem contentImg;

	/** 
	* 跳转页URL
	 */
	private String gotoUrl;

	/** 
	* logo图片二进制数据
	 */
	private FileItem logoImg;

	/** 
	* 推广子文案
	 */
	private String subtitle;

	/** 
	* 推广主文案，限20个中文字符以内
	 */
	private String title;

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel name.
     *
     * @param channelName the channel name
     */
    public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

    /**
     * Gets channel name.
     *
     * @return the channel name
     */
    public String getChannelName() {
		return this.channelName;
	}

    /**
     * Sets content img.
     *
     * @param contentImg the content img
     */
    public void setContentImg(FileItem contentImg) {
		this.contentImg = contentImg;
	}

    /**
     * Gets content img.
     *
     * @return the content img
     */
    public FileItem getContentImg() {
		return this.contentImg;
	}

    /**
     * Sets goto url.
     *
     * @param gotoUrl the goto url
     */
    public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

    /**
     * Gets goto url.
     *
     * @return the goto url
     */
    public String getGotoUrl() {
		return this.gotoUrl;
	}

    /**
     * Sets logo img.
     *
     * @param logoImg the logo img
     */
    public void setLogoImg(FileItem logoImg) {
		this.logoImg = logoImg;
	}

    /**
     * Gets logo img.
     *
     * @return the logo img
     */
    public FileItem getLogoImg() {
		return this.logoImg;
	}

    /**
     * Sets subtitle.
     *
     * @param subtitle the subtitle
     */
    public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

    /**
     * Gets subtitle.
     *
     * @return the subtitle
     */
    public String getSubtitle() {
		return this.subtitle;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
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
		return "zhima.credit.ep.codec.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("channel_id", this.channelId);
		txtParams.put("channel_name", this.channelName);
		txtParams.put("goto_url", this.gotoUrl);
		txtParams.put("subtitle", this.subtitle);
		txtParams.put("title", this.title);
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
		params.put("content_img", this.contentImg);
		params.put("logo_img", this.logoImg);
		return params;
	}

	public Class<ZhimaCreditEpCodecCreateResponse> getResponseClass() {
		return ZhimaCreditEpCodecCreateResponse.class;
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
