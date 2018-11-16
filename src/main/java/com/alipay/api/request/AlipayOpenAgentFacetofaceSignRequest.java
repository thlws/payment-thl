package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentFacetofaceSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.facetoface.sign request
 *
 * @author auto create
 * @since 1.0, 2018-07-12 18:55:00
 */
public class AlipayOpenAgentFacetofaceSignRequest implements AlipayUploadRequest<AlipayOpenAgentFacetofaceSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照号码
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片。被代创建商户运营主体为个人账户必填，企业账户无需填写，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicensePic;

	/** 
	* 营业期限
	 */
	private String dateLimitation;

	/** 
	* 营业期限是否长期有效
	 */
	private Boolean longTerm;

	/** 
	* 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 店铺内景图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“需要的特殊资质证书”，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets business license auth pic.
     *
     * @param businessLicenseAuthPic the business license auth pic
     */
    public void setBusinessLicenseAuthPic(FileItem businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

    /**
     * Gets business license auth pic.
     *
     * @return the business license auth pic
     */
    public FileItem getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}

    /**
     * Sets business license no.
     *
     * @param businessLicenseNo the business license no
     */
    public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

    /**
     * Gets business license no.
     *
     * @return the business license no
     */
    public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

    /**
     * Sets business license pic.
     *
     * @param businessLicensePic the business license pic
     */
    public void setBusinessLicensePic(FileItem businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

    /**
     * Gets business license pic.
     *
     * @return the business license pic
     */
    public FileItem getBusinessLicensePic() {
		return this.businessLicensePic;
	}

    /**
     * Sets date limitation.
     *
     * @param dateLimitation the date limitation
     */
    public void setDateLimitation(String dateLimitation) {
		this.dateLimitation = dateLimitation;
	}

    /**
     * Gets date limitation.
     *
     * @return the date limitation
     */
    public String getDateLimitation() {
		return this.dateLimitation;
	}

    /**
     * Sets long term.
     *
     * @param longTerm the long term
     */
    public void setLongTerm(Boolean longTerm) {
		this.longTerm = longTerm;
	}

    /**
     * Gets long term.
     *
     * @return the long term
     */
    public Boolean getLongTerm() {
		return this.longTerm;
	}

    /**
     * Sets mcc code.
     *
     * @param mccCode the mcc code
     */
    public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

    /**
     * Gets mcc code.
     *
     * @return the mcc code
     */
    public String getMccCode() {
		return this.mccCode;
	}

    /**
     * Sets shop scene pic.
     *
     * @param shopScenePic the shop scene pic
     */
    public void setShopScenePic(FileItem shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

    /**
     * Gets shop scene pic.
     *
     * @return the shop scene pic
     */
    public FileItem getShopScenePic() {
		return this.shopScenePic;
	}

    /**
     * Sets shop sign board pic.
     *
     * @param shopSignBoardPic the shop sign board pic
     */
    public void setShopSignBoardPic(FileItem shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

    /**
     * Gets shop sign board pic.
     *
     * @return the shop sign board pic
     */
    public FileItem getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

    /**
     * Sets special license pic.
     *
     * @param specialLicensePic the special license pic
     */
    public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

    /**
     * Gets special license pic.
     *
     * @return the special license pic
     */
    public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
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
		return "alipay.open.agent.facetoface.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
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
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentFacetofaceSignResponse> getResponseClass() {
		return AlipayOpenAgentFacetofaceSignResponse.class;
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
