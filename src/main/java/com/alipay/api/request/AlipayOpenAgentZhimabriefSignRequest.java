package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.ContactModel;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentZhimabriefSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.zhimabrief.sign request
 *
 * @author auto create
 * @since 1.0, 2018-07-19 18:25:00
 */
public class AlipayOpenAgentZhimabriefSignRequest implements AlipayUploadRequest<AlipayOpenAgentZhimabriefSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝生活号(原服务窗)名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String alipayLifeName;

	/** 
	* APP demo，格式为.apk；或者应用说明文档, 格式为.doc .docx .pdf格式（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private FileItem appDemo;

	/** 
	* 商户的APP应用名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String appName;

	/** 
	* 代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照号码。
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem businessLicensePic;

	/** 
	* 自定义使用场景描述，usage_scene选项中无符合描述，填写自定义使用场景描述(usage_scene不填写，则custom_usage_scene必填)
	 */
	private String customUsageScene;

	/** 
	* 营业期限
	 */
	private String dateLimitation;

	/** 
	* 数据反馈接口人
	 */
	private ContactModel drContact;

	/** 
	* 例如：浙江飞猪网络技术有限公司，企业别称请填写【飞猪】。
	 */
	private String enterpriseAlias;

	/** 
	* 企业LOGO-图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem enterpriseLogo;

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
	* 异议处理接口人
	 */
	private ContactModel ohContact;

	/** 
	* 用户服务联动机制接口人
	 */
	private ContactModel prContact;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“需要的特殊资质证书”，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

	/** 
	* 使用场景描述，签约芝麻信用产品的用途，可选值："现金放贷","其他", "消费分期（例如买房、装修等）", "融资租赁", "发放信用卡", "极速返利", "押金减免", "先用后付", "社交场景信用互查", "会员分层信用参考"
	 */
	private List<String> usageScene;

	/** 
	* 接入网址信息（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private List<String> webSites;

	/** 
	* 微信公众号名称（1 app_name、app_demo；2 web_sites；3 alipay_life_name；4 wechat_official_account_name。1、2、3、4至少选择一个填写）
	 */
	private String wechatOfficialAccountName;

    /**
     * Sets alipay life name.
     *
     * @param alipayLifeName the alipay life name
     */
    public void setAlipayLifeName(String alipayLifeName) {
		this.alipayLifeName = alipayLifeName;
	}

    /**
     * Gets alipay life name.
     *
     * @return the alipay life name
     */
    public String getAlipayLifeName() {
		return this.alipayLifeName;
	}

    /**
     * Sets app demo.
     *
     * @param appDemo the app demo
     */
    public void setAppDemo(FileItem appDemo) {
		this.appDemo = appDemo;
	}

    /**
     * Gets app demo.
     *
     * @return the app demo
     */
    public FileItem getAppDemo() {
		return this.appDemo;
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
     * Sets custom usage scene.
     *
     * @param customUsageScene the custom usage scene
     */
    public void setCustomUsageScene(String customUsageScene) {
		this.customUsageScene = customUsageScene;
	}

    /**
     * Gets custom usage scene.
     *
     * @return the custom usage scene
     */
    public String getCustomUsageScene() {
		return this.customUsageScene;
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
     * Sets dr contact.
     *
     * @param drContact the dr contact
     */
    public void setDrContact(ContactModel drContact) {
		this.drContact = drContact;
	}

    /**
     * Gets dr contact.
     *
     * @return the dr contact
     */
    public ContactModel getDrContact() {
		return this.drContact;
	}

    /**
     * Sets enterprise alias.
     *
     * @param enterpriseAlias the enterprise alias
     */
    public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

    /**
     * Gets enterprise alias.
     *
     * @return the enterprise alias
     */
    public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}

    /**
     * Sets enterprise logo.
     *
     * @param enterpriseLogo the enterprise logo
     */
    public void setEnterpriseLogo(FileItem enterpriseLogo) {
		this.enterpriseLogo = enterpriseLogo;
	}

    /**
     * Gets enterprise logo.
     *
     * @return the enterprise logo
     */
    public FileItem getEnterpriseLogo() {
		return this.enterpriseLogo;
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
     * Sets oh contact.
     *
     * @param ohContact the oh contact
     */
    public void setOhContact(ContactModel ohContact) {
		this.ohContact = ohContact;
	}

    /**
     * Gets oh contact.
     *
     * @return the oh contact
     */
    public ContactModel getOhContact() {
		return this.ohContact;
	}

    /**
     * Sets pr contact.
     *
     * @param prContact the pr contact
     */
    public void setPrContact(ContactModel prContact) {
		this.prContact = prContact;
	}

    /**
     * Gets pr contact.
     *
     * @return the pr contact
     */
    public ContactModel getPrContact() {
		return this.prContact;
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

    /**
     * Sets usage scene.
     *
     * @param usageScene the usage scene
     */
    public void setUsageScene(List<String> usageScene) {
		this.usageScene = usageScene;
	}

    /**
     * Gets usage scene.
     *
     * @return the usage scene
     */
    public List<String> getUsageScene() {
		return this.usageScene;
	}

    /**
     * Sets web sites.
     *
     * @param webSites the web sites
     */
    public void setWebSites(List<String> webSites) {
		this.webSites = webSites;
	}

    /**
     * Gets web sites.
     *
     * @return the web sites
     */
    public List<String> getWebSites() {
		return this.webSites;
	}

    /**
     * Sets wechat official account name.
     *
     * @param wechatOfficialAccountName the wechat official account name
     */
    public void setWechatOfficialAccountName(String wechatOfficialAccountName) {
		this.wechatOfficialAccountName = wechatOfficialAccountName;
	}

    /**
     * Gets wechat official account name.
     *
     * @return the wechat official account name
     */
    public String getWechatOfficialAccountName() {
		return this.wechatOfficialAccountName;
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
		return "alipay.open.agent.zhimabrief.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_life_name", this.alipayLifeName);
		txtParams.put("app_name", this.appName);
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("custom_usage_scene", this.customUsageScene);
		txtParams.put("date_limitation", this.dateLimitation);
		txtParams.put("dr_contact", this.drContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.drContact, true));
		txtParams.put("enterprise_alias", this.enterpriseAlias);
		txtParams.put("long_term", this.longTerm);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("oh_contact", this.ohContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.ohContact, true));
		txtParams.put("pr_contact", this.prContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.prContact, true));
		txtParams.put("usage_scene", this.usageScene == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.usageScene, true));
		txtParams.put("web_sites", this.webSites == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.webSites, true));
		txtParams.put("wechat_official_account_name", this.wechatOfficialAccountName);
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
		params.put("app_demo", this.appDemo);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("enterprise_logo", this.enterpriseLogo);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentZhimabriefSignResponse> getResponseClass() {
		return AlipayOpenAgentZhimabriefSignResponse.class;
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
