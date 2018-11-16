package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业基础信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class BaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2891167272292946595L;

	/**
	 * 支付宝服务窗名称
	 */
	@ApiField("alipay_fuwu_name")
	private String alipayFuwuName;

	/**
	 * 如果商户的app需要签约使用移动快捷支付产品，需要上传该app的名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 企业联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_person_info")
	private List<ContactPersonInfo> contactInfo;

	/**
	 * 企业logo图片
	 */
	@ApiField("logo_pic")
	private String logoPic;

	/**
	 * 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a>
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 企业别称，例如浙江飞猪网络有限公司别称为阿里旅行。需要签约芝麻信用产品必须要传入该字段
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a>
	 */
	@ApiListField("special_license_pic")
	@ApiField("string")
	private List<String> specialLicensePic;

	/**
	 * 使用场景，签约芝麻信用产品必须传入该参数，比如用于放贷风险防控、免押金租车等
	 */
	@ApiField("usage_scenario")
	private String usageScenario;

	/**
	 * 企业网址信息
	 */
	@ApiListField("web_address")
	@ApiField("string")
	private List<String> webAddress;

	/**
	 * 网址授权函图片
	 */
	@ApiField("web_auth_pic")
	private String webAuthPic;

	/**
	 * 微信公众号名称
	 */
	@ApiField("weixin_public_name")
	private String weixinPublicName;

    /**
     * Gets alipay fuwu name.
     *
     * @return the alipay fuwu name
     */
    public String getAlipayFuwuName() {
		return this.alipayFuwuName;
	}

    /**
     * Sets alipay fuwu name.
     *
     * @param alipayFuwuName the alipay fuwu name
     */
    public void setAlipayFuwuName(String alipayFuwuName) {
		this.alipayFuwuName = alipayFuwuName;
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
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets contact info.
     *
     * @return the contact info
     */
    public List<ContactPersonInfo> getContactInfo() {
		return this.contactInfo;
	}

    /**
     * Sets contact info.
     *
     * @param contactInfo the contact info
     */
    public void setContactInfo(List<ContactPersonInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}

    /**
     * Gets logo pic.
     *
     * @return the logo pic
     */
    public String getLogoPic() {
		return this.logoPic;
	}

    /**
     * Sets logo pic.
     *
     * @param logoPic the logo pic
     */
    public void setLogoPic(String logoPic) {
		this.logoPic = logoPic;
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
     * Sets mcc code.
     *
     * @param mccCode the mcc code
     */
    public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getShortName() {
		return this.shortName;
	}

    /**
     * Sets short name.
     *
     * @param shortName the short name
     */
    public void setShortName(String shortName) {
		this.shortName = shortName;
	}

    /**
     * Gets special license pic.
     *
     * @return the special license pic
     */
    public List<String> getSpecialLicensePic() {
		return this.specialLicensePic;
	}

    /**
     * Sets special license pic.
     *
     * @param specialLicensePic the special license pic
     */
    public void setSpecialLicensePic(List<String> specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

    /**
     * Gets usage scenario.
     *
     * @return the usage scenario
     */
    public String getUsageScenario() {
		return this.usageScenario;
	}

    /**
     * Sets usage scenario.
     *
     * @param usageScenario the usage scenario
     */
    public void setUsageScenario(String usageScenario) {
		this.usageScenario = usageScenario;
	}

    /**
     * Gets web address.
     *
     * @return the web address
     */
    public List<String> getWebAddress() {
		return this.webAddress;
	}

    /**
     * Sets web address.
     *
     * @param webAddress the web address
     */
    public void setWebAddress(List<String> webAddress) {
		this.webAddress = webAddress;
	}

    /**
     * Gets web auth pic.
     *
     * @return the web auth pic
     */
    public String getWebAuthPic() {
		return this.webAuthPic;
	}

    /**
     * Sets web auth pic.
     *
     * @param webAuthPic the web auth pic
     */
    public void setWebAuthPic(String webAuthPic) {
		this.webAuthPic = webAuthPic;
	}

    /**
     * Gets weixin public name.
     *
     * @return the weixin public name
     */
    public String getWeixinPublicName() {
		return this.weixinPublicName;
	}

    /**
     * Sets weixin public name.
     *
     * @param weixinPublicName the weixin public name
     */
    public void setWeixinPublicName(String weixinPublicName) {
		this.weixinPublicName = weixinPublicName;
	}

}
