package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.offline.material.image.upload request
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMaterialImageUploadRequest implements AlipayUploadRequest<AlipayOfflineMaterialImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片/视频二进制内容，图片/视频大小不能超过5M
	 */
	private FileItem imageContent;

	/** 
	* 图片/视频名称
	 */
	private String imageName;

	/** 
	* 用于显示指定图片/视频所属的partnerId（支付宝内部使用，外部商户无需填写此字段）
	 */
	private String imagePid;

	/** 
	* 图片/视频格式
	 */
	private String imageType;

    /**
     * Sets image content.
     *
     * @param imageContent the image content
     */
    public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}

    /**
     * Gets image content.
     *
     * @return the image content
     */
    public FileItem getImageContent() {
		return this.imageContent;
	}

    /**
     * Sets image name.
     *
     * @param imageName the image name
     */
    public void setImageName(String imageName) {
		this.imageName = imageName;
	}

    /**
     * Gets image name.
     *
     * @return the image name
     */
    public String getImageName() {
		return this.imageName;
	}

    /**
     * Sets image pid.
     *
     * @param imagePid the image pid
     */
    public void setImagePid(String imagePid) {
		this.imagePid = imagePid;
	}

    /**
     * Gets image pid.
     *
     * @return the image pid
     */
    public String getImagePid() {
		return this.imagePid;
	}

    /**
     * Sets image type.
     *
     * @param imageType the image type
     */
    public void setImageType(String imageType) {
		this.imageType = imageType;
	}

    /**
     * Gets image type.
     *
     * @return the image type
     */
    public String getImageType() {
		return this.imageType;
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
		return "alipay.offline.material.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("image_name", this.imageName);
		txtParams.put("image_pid", this.imagePid);
		txtParams.put("image_type", this.imageType);
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
		params.put("image_content", this.imageContent);
		return params;
	}

	public Class<AlipayOfflineMaterialImageUploadResponse> getResponseClass() {
		return AlipayOfflineMaterialImageUploadResponse.class;
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
