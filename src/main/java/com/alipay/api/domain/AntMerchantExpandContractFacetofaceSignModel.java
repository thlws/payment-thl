package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通当面付申请接口
 *
 * @author auto create
 * @since 1.0, 2017-06-14 12:07:18
 */
public class AntMerchantExpandContractFacetofaceSignModel extends AlipayObject {

	private static final long serialVersionUID = 8727787816369382989L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，通过ant.merchant.expand.image.upload接口上传营业执照授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片，通过ant.merchant.expand.image.upload接口上传营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 联系人邮箱地址
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 企业联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“经营类目编码”
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 外部入驻申请单据号，由开发者生成，并需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 店铺内景图片，个人账户必填，企业账户选填，通过ant.merchant.expand.image.upload接口上传店铺内景图片
	 */
	@ApiField("shop_scene_pic")
	private String shopScenePic;

	/**
	 * 店铺门头照图片，个人账户必填，企业账户选填，通过ant.merchant.expand.image.upload接口上传店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	/**
	 * 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“需要的特殊资质证书” 
通过ant.merchant.expand.image.upload接口上传企业特殊资质图片
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

    /**
     * Gets business license auth pic.
     *
     * @return the business license auth pic
     */
    public String getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}

    /**
     * Sets business license auth pic.
     *
     * @param businessLicenseAuthPic the business license auth pic
     */
    public void setBusinessLicenseAuthPic(String businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
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
     * Sets business license no.
     *
     * @param businessLicenseNo the business license no
     */
    public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

    /**
     * Gets business license pic.
     *
     * @return the business license pic
     */
    public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}

    /**
     * Sets business license pic.
     *
     * @param businessLicensePic the business license pic
     */
    public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

    /**
     * Gets contact email.
     *
     * @return the contact email
     */
    public String getContactEmail() {
		return this.contactEmail;
	}

    /**
     * Sets contact email.
     *
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

    /**
     * Gets contact mobile.
     *
     * @return the contact mobile
     */
    public String getContactMobile() {
		return this.contactMobile;
	}

    /**
     * Sets contact mobile.
     *
     * @param contactMobile the contact mobile
     */
    public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

    /**
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
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
     * Gets shop scene pic.
     *
     * @return the shop scene pic
     */
    public String getShopScenePic() {
		return this.shopScenePic;
	}

    /**
     * Sets shop scene pic.
     *
     * @param shopScenePic the shop scene pic
     */
    public void setShopScenePic(String shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

    /**
     * Gets shop sign board pic.
     *
     * @return the shop sign board pic
     */
    public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

    /**
     * Sets shop sign board pic.
     *
     * @param shopSignBoardPic the shop sign board pic
     */
    public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

    /**
     * Gets special license pic.
     *
     * @return the special license pic
     */
    public String getSpecialLicensePic() {
		return this.specialLicensePic;
	}

    /**
     * Sets special license pic.
     *
     * @param specialLicensePic the special license pic
     */
    public void setSpecialLicensePic(String specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

}
