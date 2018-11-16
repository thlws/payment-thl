package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务窗基础信息修改接口
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:17:00
 */
public class AlipayOpenPublicInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3413437413691124976L;

	/**
	 * 生活号名称，2-20个字之间；不得含有违反法律法规和公序良俗的相关信息；不得侵害他人名誉权、知识产权、商业秘密等合法权利；不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 授权运营书图片地址，企业商户若为被经营方授权，需上传加盖公章的扫描件，支持.jpg .jpeg .png格式，小于1M。使用alipay.offline.material.image.upload上传，将得到的image_url回填与此处。
	 */
	@ApiField("auth_pic")
	private String authPic;

	/**
	 * 背景图片地址，建议尺寸 1600 x 1000px，支持.jpg .jpeg .png格式，小于1M。使用alipay.offline.material.image.upload上传，将得到的image_url回填与此处
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 简介
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 营业执照地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于1M。使用alipay.offline.material.image.upload上传，将得到的image_url回填与此处。
	 */
	@ApiField("license_url")
	private String licenseUrl;

	/**
	 * 生活号头像地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于1M。使用alipay.offline.material.image.upload上传，将得到的image_url回填与此处
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	/**
	 * 门店照片地址，支持.jpg .jpeg .png格式，小于1M。使用alipay.offline.material.image.upload上传，将得到的image_url回填与此处。
	 */
	@ApiListField("shop_pics")
	@ApiField("string")
	private List<String> shopPics;

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
     * Gets auth pic.
     *
     * @return the auth pic
     */
    public String getAuthPic() {
		return this.authPic;
	}

    /**
     * Sets auth pic.
     *
     * @param authPic the auth pic
     */
    public void setAuthPic(String authPic) {
		this.authPic = authPic;
	}

    /**
     * Gets background url.
     *
     * @return the background url
     */
    public String getBackgroundUrl() {
		return this.backgroundUrl;
	}

    /**
     * Sets background url.
     *
     * @param backgroundUrl the background url
     */
    public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

    /**
     * Gets introduction.
     *
     * @return the introduction
     */
    public String getIntroduction() {
		return this.introduction;
	}

    /**
     * Sets introduction.
     *
     * @param introduction the introduction
     */
    public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

    /**
     * Gets license url.
     *
     * @return the license url
     */
    public String getLicenseUrl() {
		return this.licenseUrl;
	}

    /**
     * Sets license url.
     *
     * @param licenseUrl the license url
     */
    public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
		return this.logoUrl;
	}

    /**
     * Sets logo url.
     *
     * @param logoUrl the logo url
     */
    public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

    /**
     * Gets public greeting.
     *
     * @return the public greeting
     */
    public String getPublicGreeting() {
		return this.publicGreeting;
	}

    /**
     * Sets public greeting.
     *
     * @param publicGreeting the public greeting
     */
    public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}

    /**
     * Gets shop pics.
     *
     * @return the shop pics
     */
    public List<String> getShopPics() {
		return this.shopPics;
	}

    /**
     * Sets shop pics.
     *
     * @param shopPics the shop pics
     */
    public void setShopPics(List<String> shopPics) {
		this.shopPics = shopPics;
	}

}
