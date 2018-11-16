package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店查询摘要信息接口模型
 *
 * @author auto create
 * @since 1.0, 2017-02-17 14:20:04
 */
public class ShopSummaryQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 8248181466211695639L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌名，不填写则默认为其它品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 门店类目列表
	 */
	@ApiListField("category_infos")
	@ApiField("shop_category_info")
	private List<ShopCategoryInfo> categoryInfos;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */
	@ApiField("is_show")
	private String isShow;

	/**
	 * 纬度，只有在query_type=KB_PROMOTER非空
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，只有在query_type=KB_PROMOTER非空
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店首图
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店评论信息
	 */
	@ApiField("shop_comment_info")
	private ShopCommentInfo shopCommentInfo;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * COMMON（普通门店）、MALL（商圈）
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭
	 */
	@ApiField("status")
	private String status;

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
     * Gets branch shop name.
     *
     * @return the branch shop name
     */
    public String getBranchShopName() {
		return this.branchShopName;
	}

    /**
     * Sets branch shop name.
     *
     * @param branchShopName the branch shop name
     */
    public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public String getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets category infos.
     *
     * @return the category infos
     */
    public List<ShopCategoryInfo> getCategoryInfos() {
		return this.categoryInfos;
	}

    /**
     * Sets category infos.
     *
     * @param categoryInfos the category infos
     */
    public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos) {
		this.categoryInfos = categoryInfos;
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
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets is show.
     *
     * @return the is show
     */
    public String getIsShow() {
		return this.isShow;
	}

    /**
     * Sets is show.
     *
     * @param isShow the is show
     */
    public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets main image.
     *
     * @return the main image
     */
    public String getMainImage() {
		return this.mainImage;
	}

    /**
     * Sets main image.
     *
     * @param mainImage the main image
     */
    public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

    /**
     * Gets main shop name.
     *
     * @return the main shop name
     */
    public String getMainShopName() {
		return this.mainShopName;
	}

    /**
     * Sets main shop name.
     *
     * @param mainShopName the main shop name
     */
    public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

    /**
     * Gets pic coll.
     *
     * @return the pic coll
     */
    public String getPicColl() {
		return this.picColl;
	}

    /**
     * Sets pic coll.
     *
     * @param picColl the pic coll
     */
    public void setPicColl(String picColl) {
		this.picColl = picColl;
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
     * Gets shop comment info.
     *
     * @return the shop comment info
     */
    public ShopCommentInfo getShopCommentInfo() {
		return this.shopCommentInfo;
	}

    /**
     * Sets shop comment info.
     *
     * @param shopCommentInfo the shop comment info
     */
    public void setShopCommentInfo(ShopCommentInfo shopCommentInfo) {
		this.shopCommentInfo = shopCommentInfo;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
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

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
