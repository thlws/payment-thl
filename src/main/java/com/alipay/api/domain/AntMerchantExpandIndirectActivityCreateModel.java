package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户运营活动报名接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 16:28:04
 */
public class AntMerchantExpandIndirectActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3413917474155731892L;

	/**
	 * 活动类型，间联商户报名的支付宝活动类型。
蓝海行动：BLUE_SEA
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 商户简称，门头照的名称或者大众点评、美团、饿了么、口碑、百度外卖入驻平台名称。需和进件时别名保持一致。
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 营业执照，要求营业执照文本信息清晰可见。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 收银台照片，必须包含：①主扫：扫码支付场景需要展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”露出的二维码物料或立牌；②被扫：展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”的扫码机具（盒子）
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("checkstand_pic")
	private String checkstandPic;

	/**
	 * 店内环境照，要求照片清晰可见。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 商户名称，营业执照上的名称，需和进件名称保持一致。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主流餐饮平台入驻证明（任选一个即可）：大众点评、美团、饿了么、口碑、百度外卖餐饮平台商户展示页面。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("settled_pic")
	private String settledPic;

	/**
	 * 门头照。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

    /**
     * Gets activity type.
     *
     * @return the activity type
     */
    public String getActivityType() {
		return this.activityType;
	}

    /**
     * Sets activity type.
     *
     * @param activityType the activity type
     */
    public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

    /**
     * Gets alias name.
     *
     * @return the alias name
     */
    public String getAliasName() {
		return this.aliasName;
	}

    /**
     * Sets alias name.
     *
     * @param aliasName the alias name
     */
    public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
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
     * Gets checkstand pic.
     *
     * @return the checkstand pic
     */
    public String getCheckstandPic() {
		return this.checkstandPic;
	}

    /**
     * Sets checkstand pic.
     *
     * @param checkstandPic the checkstand pic
     */
    public void setCheckstandPic(String checkstandPic) {
		this.checkstandPic = checkstandPic;
	}

    /**
     * Gets indoor pic.
     *
     * @return the indoor pic
     */
    public String getIndoorPic() {
		return this.indoorPic;
	}

    /**
     * Sets indoor pic.
     *
     * @param indoorPic the indoor pic
     */
    public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets settled pic.
     *
     * @return the settled pic
     */
    public String getSettledPic() {
		return this.settledPic;
	}

    /**
     * Sets settled pic.
     *
     * @param settledPic the settled pic
     */
    public void setSettledPic(String settledPic) {
		this.settledPic = settledPic;
	}

    /**
     * Gets shop entrance pic.
     *
     * @return the shop entrance pic
     */
    public String getShopEntrancePic() {
		return this.shopEntrancePic;
	}

    /**
     * Sets shop entrance pic.
     *
     * @param shopEntrancePic the shop entrance pic
     */
    public void setShopEntrancePic(String shopEntrancePic) {
		this.shopEntrancePic = shopEntrancePic;
	}

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId() {
		return this.subMerchantId;
	}

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
