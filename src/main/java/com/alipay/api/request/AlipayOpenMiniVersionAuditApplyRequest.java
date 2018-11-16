package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.RegionInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniVersionAuditApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.version.audit.apply request
 *
 * @author auto create
 * @since 1.0, 2018-06-04 19:40:00
 */
public class AlipayOpenMiniVersionAuditApplyRequest implements AlipayUploadRequest<AlipayOpenMiniVersionAuditApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.alipay.com/isv/10325，如果不填默认采用当前小程序应用类目
	 */
	private String appCategoryIds;

	/** 
	* 小程序应用描述，20-200个字，如果不填默认采用当前小程序的应用描述
	 */
	private String appDesc;

	/** 
	* 小程序应用英文名称，如果不填默认采用当前小程序应用英文名称
	 */
	private String appEnglishName;

	/** 
	* 小程序logo图标，图片格式必须为：png、jpeg、jpg，建议上传像素为180*180，如果不填默认采用当前小程序应用logo图标
	 */
	private FileItem appLogo;

	/** 
	* 小程序应用名称，如果不填默认采用当前小程序应用名称
	 */
	private String appName;

	/** 
	* 小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介
	 */
	private String appSlogan;

	/** 
	* 小程序版本号
	 */
	private String appVersion;

	/** 
	* 第五张营业执照照片，不能超过4MB，图片格式只支持jpg，png，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem fifthLicensePic;

	/** 
	* 小程序第五张应用截图，不能超过4MB，图片格式只支持jpg，png
	 */
	private FileItem fifthScreenShot;

	/** 
	* 第一张营业执照照片，不能超过4MB，图片格式只支持jpg，png，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem firstLicensePic;

	/** 
	* 实例化的小程序可以不用传第一张应用截图，小程序第一张应用截图，不能超过4MB，图片格式只支持jpg，png
	 */
	private FileItem firstScreenShot;

	/** 
	* 第四张营业执照照片，不能超过4MB，图片格式只支持jpg，png，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem fourthLicensePic;

	/** 
	* 小程序第四张应用截图，不能超过4MB，图片格式只支持jpg，png
	 */
	private FileItem fourthScreenShot;

	/** 
	* 营业执照名称，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private String licenseName;

	/** 
	* 营业执照号，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private String licenseNo;

	/** 
	* 营业执照有效期，格式为yyyy-MM-dd，9999-12-31表示长期，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private String licenseValidDate;

	/** 
	* 小程序备注
	 */
	private String memo;

	/** 
	* 门头照图片，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem outDoorPic;

	/** 
	* 小程序服务区域类型，GLOBAL-全球，CHINA-中国，LOCATION-指定区域
	 */
	private String regionType;

	/** 
	* 第二张营业执照照片，不能超过4MB，图片格式只支持jpg，png，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem secondLicensePic;

	/** 
	* 实例化的小程序可以不用传第二张应用截图，小程序第二张应用截图，不能超过4MB，图片格式只支持jpg，png
	 */
	private FileItem secondScreenShot;

	/** 
	* 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱
	 */
	private String serviceEmail;

	/** 
	* 小程序客服电话，如果不填默认采用当前小程序的应用客服电话
	 */
	private String servicePhone;

	/** 
	* 省市区信息，当区域类型为LOCATION时，不能为空，province_code不能为空，当填写city_code时，province_code不能为空，当填写area_code时，province_code和city_code不能为空。只填province_code时，该省全部选择；province_code和city_code都填时，该市全部选择。province_code，city_code和area_code都填时，该县全部选择。具体code可以参考https://docs.alipay.com/isv/10327
	 */
	private List<RegionInfo> serviceRegionInfo;

	/** 
	* 第三张营业执照照片，不能超过4MB，图片格式只支持jpg，png，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息
	 */
	private FileItem thirdLicensePic;

	/** 
	* 小程序第三张应用截图，不能超过4MB，图片格式只支持jpg，png
	 */
	private FileItem thirdScreenShot;

	/** 
	* 小程序版本描述
	 */
	private String versionDesc;

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
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
	}

    /**
     * Sets fifth license pic.
     *
     * @param fifthLicensePic the fifth license pic
     */
    public void setFifthLicensePic(FileItem fifthLicensePic) {
		this.fifthLicensePic = fifthLicensePic;
	}

    /**
     * Gets fifth license pic.
     *
     * @return the fifth license pic
     */
    public FileItem getFifthLicensePic() {
		return this.fifthLicensePic;
	}

    /**
     * Sets fifth screen shot.
     *
     * @param fifthScreenShot the fifth screen shot
     */
    public void setFifthScreenShot(FileItem fifthScreenShot) {
		this.fifthScreenShot = fifthScreenShot;
	}

    /**
     * Gets fifth screen shot.
     *
     * @return the fifth screen shot
     */
    public FileItem getFifthScreenShot() {
		return this.fifthScreenShot;
	}

    /**
     * Sets first license pic.
     *
     * @param firstLicensePic the first license pic
     */
    public void setFirstLicensePic(FileItem firstLicensePic) {
		this.firstLicensePic = firstLicensePic;
	}

    /**
     * Gets first license pic.
     *
     * @return the first license pic
     */
    public FileItem getFirstLicensePic() {
		return this.firstLicensePic;
	}

    /**
     * Sets first screen shot.
     *
     * @param firstScreenShot the first screen shot
     */
    public void setFirstScreenShot(FileItem firstScreenShot) {
		this.firstScreenShot = firstScreenShot;
	}

    /**
     * Gets first screen shot.
     *
     * @return the first screen shot
     */
    public FileItem getFirstScreenShot() {
		return this.firstScreenShot;
	}

    /**
     * Sets fourth license pic.
     *
     * @param fourthLicensePic the fourth license pic
     */
    public void setFourthLicensePic(FileItem fourthLicensePic) {
		this.fourthLicensePic = fourthLicensePic;
	}

    /**
     * Gets fourth license pic.
     *
     * @return the fourth license pic
     */
    public FileItem getFourthLicensePic() {
		return this.fourthLicensePic;
	}

    /**
     * Sets fourth screen shot.
     *
     * @param fourthScreenShot the fourth screen shot
     */
    public void setFourthScreenShot(FileItem fourthScreenShot) {
		this.fourthScreenShot = fourthScreenShot;
	}

    /**
     * Gets fourth screen shot.
     *
     * @return the fourth screen shot
     */
    public FileItem getFourthScreenShot() {
		return this.fourthScreenShot;
	}

    /**
     * Sets license name.
     *
     * @param licenseName the license name
     */
    public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

    /**
     * Gets license name.
     *
     * @return the license name
     */
    public String getLicenseName() {
		return this.licenseName;
	}

    /**
     * Sets license no.
     *
     * @param licenseNo the license no
     */
    public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

    /**
     * Gets license no.
     *
     * @return the license no
     */
    public String getLicenseNo() {
		return this.licenseNo;
	}

    /**
     * Sets license valid date.
     *
     * @param licenseValidDate the license valid date
     */
    public void setLicenseValidDate(String licenseValidDate) {
		this.licenseValidDate = licenseValidDate;
	}

    /**
     * Gets license valid date.
     *
     * @return the license valid date
     */
    public String getLicenseValidDate() {
		return this.licenseValidDate;
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
     * Sets out door pic.
     *
     * @param outDoorPic the out door pic
     */
    public void setOutDoorPic(FileItem outDoorPic) {
		this.outDoorPic = outDoorPic;
	}

    /**
     * Gets out door pic.
     *
     * @return the out door pic
     */
    public FileItem getOutDoorPic() {
		return this.outDoorPic;
	}

    /**
     * Sets region type.
     *
     * @param regionType the region type
     */
    public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

    /**
     * Gets region type.
     *
     * @return the region type
     */
    public String getRegionType() {
		return this.regionType;
	}

    /**
     * Sets second license pic.
     *
     * @param secondLicensePic the second license pic
     */
    public void setSecondLicensePic(FileItem secondLicensePic) {
		this.secondLicensePic = secondLicensePic;
	}

    /**
     * Gets second license pic.
     *
     * @return the second license pic
     */
    public FileItem getSecondLicensePic() {
		return this.secondLicensePic;
	}

    /**
     * Sets second screen shot.
     *
     * @param secondScreenShot the second screen shot
     */
    public void setSecondScreenShot(FileItem secondScreenShot) {
		this.secondScreenShot = secondScreenShot;
	}

    /**
     * Gets second screen shot.
     *
     * @return the second screen shot
     */
    public FileItem getSecondScreenShot() {
		return this.secondScreenShot;
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

    /**
     * Sets service region info.
     *
     * @param serviceRegionInfo the service region info
     */
    public void setServiceRegionInfo(List<RegionInfo> serviceRegionInfo) {
		this.serviceRegionInfo = serviceRegionInfo;
	}

    /**
     * Gets service region info.
     *
     * @return the service region info
     */
    public List<RegionInfo> getServiceRegionInfo() {
		return this.serviceRegionInfo;
	}

    /**
     * Sets third license pic.
     *
     * @param thirdLicensePic the third license pic
     */
    public void setThirdLicensePic(FileItem thirdLicensePic) {
		this.thirdLicensePic = thirdLicensePic;
	}

    /**
     * Gets third license pic.
     *
     * @return the third license pic
     */
    public FileItem getThirdLicensePic() {
		return this.thirdLicensePic;
	}

    /**
     * Sets third screen shot.
     *
     * @param thirdScreenShot the third screen shot
     */
    public void setThirdScreenShot(FileItem thirdScreenShot) {
		this.thirdScreenShot = thirdScreenShot;
	}

    /**
     * Gets third screen shot.
     *
     * @return the third screen shot
     */
    public FileItem getThirdScreenShot() {
		return this.thirdScreenShot;
	}

    /**
     * Sets version desc.
     *
     * @param versionDesc the version desc
     */
    public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}

    /**
     * Gets version desc.
     *
     * @return the version desc
     */
    public String getVersionDesc() {
		return this.versionDesc;
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
		return "alipay.open.mini.version.audit.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("app_version", this.appVersion);
		txtParams.put("license_name", this.licenseName);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("license_valid_date", this.licenseValidDate);
		txtParams.put("memo", this.memo);
		txtParams.put("region_type", this.regionType);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
		txtParams.put("service_region_info", this.serviceRegionInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.serviceRegionInfo, true));
		txtParams.put("version_desc", this.versionDesc);
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
		params.put("fifth_license_pic", this.fifthLicensePic);
		params.put("fifth_screen_shot", this.fifthScreenShot);
		params.put("first_license_pic", this.firstLicensePic);
		params.put("first_screen_shot", this.firstScreenShot);
		params.put("fourth_license_pic", this.fourthLicensePic);
		params.put("fourth_screen_shot", this.fourthScreenShot);
		params.put("out_door_pic", this.outDoorPic);
		params.put("second_license_pic", this.secondLicensePic);
		params.put("second_screen_shot", this.secondScreenShot);
		params.put("third_license_pic", this.thirdLicensePic);
		params.put("third_screen_shot", this.thirdScreenShot);
		return params;
	}

	public Class<AlipayOpenMiniVersionAuditApplyResponse> getResponseClass() {
		return AlipayOpenMiniVersionAuditApplyResponse.class;
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
