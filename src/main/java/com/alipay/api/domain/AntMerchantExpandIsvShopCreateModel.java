package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV代创建蚂蚁商户店铺
 *
 * @author auto create
 * @since 1.0, 2018-08-23 19:57:34
 */
public class AntMerchantExpandIsvShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3632534237946792369L;

	/**
	 * 地址。商户详细经营地址或人员所在地点
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店地址备注，如：地铁口左边
	 */
	@ApiField("address_memo")
	private String addressMemo;

	/**
	 * 门店实景图列表。最多3张，必须是实景图，不可有水印（如果上传装修效果图将驳回）。json格式字符串
支持格式：jpg/png/jpeg/bmp，单张图片不超过5MB，建议尺寸在2000*1500以上。
	 */
	@ApiField("attachment_list")
	private String attachmentList;

	/**
	 * 店铺经营时间。
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 所选学校。指定门店类目下需要上传大学名称信息。
学校信息，请参考
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 类目标签。选择部分门店类目时，必须要传此值。
比如：校园团餐类目
与类目的映射关系，请参考
	 */
	@ApiField("category_label")
	private String categoryLabel;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 店铺联系手机，与店铺联系固话二选一必填
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话，和店铺联系手机二选一必填
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 区县编码，区县编码是与国家统计局一致，请查询: http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/ 国标省市区号下载：http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7629140.0.0.qRW4KQ&file=2016.xls
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * ISV联系人手机号码
	 */
	@ApiField("isv_contact_mobile")
	private String isvContactMobile;

	/**
	 * 联系人名字
	 */
	@ApiField("isv_contact_name")
	private String isvContactName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户id，表示将要开的店属于哪个商户。
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 省份编码，国标码。请查询:
http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/
国标省市区号下载：http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7629140.0.0.qRW4KQ&file=2016.xls
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 资质证明图片。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key列表，json格式字符串，最多可以上传10张
	 */
	@ApiField("qualification_proof_list")
	private String qualificationProofList;

	/**
	 * 资质证明类型。具体选值参见https://mif-pub.alipayobjects.com/QualificationType.xlsx
	 */
	@ApiField("qualification_proof_type")
	private String qualificationProofType;

	/**
	 * 店铺类目，取值参见文件xxxxxxx
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺名称。直连开店要保证全局店铺名称+地址唯一
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺经营类型，01表示直营，02表示加盟
	 */
	@ApiField("shop_type")
	private String shopType;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address memo.
     *
     * @return the address memo
     */
    public String getAddressMemo() {
		return this.addressMemo;
	}

    /**
     * Sets address memo.
     *
     * @param addressMemo the address memo
     */
    public void setAddressMemo(String addressMemo) {
		this.addressMemo = addressMemo;
	}

    /**
     * Gets attachment list.
     *
     * @return the attachment list
     */
    public String getAttachmentList() {
		return this.attachmentList;
	}

    /**
     * Sets attachment list.
     *
     * @param attachmentList the attachment list
     */
    public void setAttachmentList(String attachmentList) {
		this.attachmentList = attachmentList;
	}

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets campus name.
     *
     * @return the campus name
     */
    public String getCampusName() {
		return this.campusName;
	}

    /**
     * Sets campus name.
     *
     * @param campusName the campus name
     */
    public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

    /**
     * Gets category label.
     *
     * @return the category label
     */
    public String getCategoryLabel() {
		return this.categoryLabel;
	}

    /**
     * Sets category label.
     *
     * @param categoryLabel the category label
     */
    public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
     * Gets contact phone.
     *
     * @return the contact phone
     */
    public String getContactPhone() {
		return this.contactPhone;
	}

    /**
     * Sets contact phone.
     *
     * @param contactPhone the contact phone
     */
    public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
		return this.districtCode;
	}

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

    /**
     * Gets isv contact mobile.
     *
     * @return the isv contact mobile
     */
    public String getIsvContactMobile() {
		return this.isvContactMobile;
	}

    /**
     * Sets isv contact mobile.
     *
     * @param isvContactMobile the isv contact mobile
     */
    public void setIsvContactMobile(String isvContactMobile) {
		this.isvContactMobile = isvContactMobile;
	}

    /**
     * Gets isv contact name.
     *
     * @return the isv contact name
     */
    public String getIsvContactName() {
		return this.isvContactName;
	}

    /**
     * Sets isv contact name.
     *
     * @param isvContactName the isv contact name
     */
    public void setIsvContactName(String isvContactName) {
		this.isvContactName = isvContactName;
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
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets qualification proof list.
     *
     * @return the qualification proof list
     */
    public String getQualificationProofList() {
		return this.qualificationProofList;
	}

    /**
     * Sets qualification proof list.
     *
     * @param qualificationProofList the qualification proof list
     */
    public void setQualificationProofList(String qualificationProofList) {
		this.qualificationProofList = qualificationProofList;
	}

    /**
     * Gets qualification proof type.
     *
     * @return the qualification proof type
     */
    public String getQualificationProofType() {
		return this.qualificationProofType;
	}

    /**
     * Sets qualification proof type.
     *
     * @param qualificationProofType the qualification proof type
     */
    public void setQualificationProofType(String qualificationProofType) {
		this.qualificationProofType = qualificationProofType;
	}

    /**
     * Gets shop category.
     *
     * @return the shop category
     */
    public String getShopCategory() {
		return this.shopCategory;
	}

    /**
     * Sets shop category.
     *
     * @param shopCategory the shop category
     */
    public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop type.
     *
     * @return the shop type
     */
    public String getShopType() {
		return this.shopType;
	}

    /**
     * Sets shop type.
     *
     * @param shopType the shop type
     */
    public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}
