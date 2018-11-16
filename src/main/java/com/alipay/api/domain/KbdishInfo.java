package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑的菜品模型,包含基本信息,sku,套餐明细
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:51
 */
public class KbdishInfo extends AlipayObject {

	private static final long serialVersionUID = 3416225721388322969L;

	/**
	 * 分类字典大类的id, 如果操作的是菜品，则比输入，如果操作的是sku信息，可不输入
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 小类,商家自定义配置表例如 肉，酒水，素菜
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 是否是价 Y:是 N否
	 */
	@ApiField("cur_price_flag")
	private String curPriceFlag;

	/**
	 * 是否开台必点菜 Y是  N否，默认否；暂废弃，后续针对开台菜提供新api
	 */
	@ApiField("default_in_carts")
	private String defaultInCarts;

	/**
	 * 开台菜点餐方式:如果是按数量点,直接输入数量例如2,；如果是按照就餐人数点，则输入countOnDiner这个固定的字符串
暂废弃，后续针对开台菜提供新api
	 */
	@ApiField("default_in_carts_detail")
	private String defaultInCartsDetail;

	/**
	 * 菜系,商家自定义
	 */
	@ApiField("dish_cuisine")
	private String dishCuisine;

	/**
	 * 口碑的菜品id, 新增操作可以为空,修改的时候必传
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 商品图片，需要先调用素材的图片上传api得到图片id
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品的名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 做法加价列表
	 */
	@ApiListField("dish_practice_list")
	@ApiField("kbdish_practice_info")
	private List<KbdishPracticeInfo> dishPracticeList;

	/**
	 * 菜品sku列表
	 */
	@ApiListField("dish_sku_list")
	@ApiField("kbdish_sku_info")
	private List<KbdishSkuInfo> dishSkuList;

	/**
	 * 版本号 就是一个数据操作的时间戳
	 */
	@ApiField("dish_version")
	private String dishVersion;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 扩展字段,json串
	 */
	@ApiField("ext_content")
	private String extContent;

	/**
	 * 口碑的商品id,用于营销透传,可不传
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 菜品加料信息
	 */
	@ApiListField("material_binding_info_list")
	@ApiField("kbdish_material_binding_info")
	private List<KbdishMaterialBindingInfo> materialBindingInfoList;

	/**
	 * 商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 起点份数
	 */
	@ApiField("min_serving")
	private String minServing;

	/**
	 * 最小点菜数量, 用户点餐一次加多少,不填默认为1
	 */
	@ApiField("mini_add_num")
	private String miniAddNum;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * Y：不参与优惠计算  N: 参与优惠,不设置默认为N
	 */
	@ApiField("not_count_threshold")
	private String notCountThreshold;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 菜品销售属性，如辣度、加冰等，最多四个
	 */
	@ApiListField("property_info_list")
	@ApiField("kbdish_property_info")
	private List<KbdishPropertyInfo> propertyInfoList;

	/**
	 * 菜品的描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店菜品id. 如果存门店菜品库，设置此值
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 菜品标签json串，key =spicy标示辣度, value=0标示不辣；1微辣；2中辣;3中辣。
key=recommend标示推荐指数,value=0标示不设定;1标示推荐;2十分推荐;3强烈推荐。key=special标识特色标签；value=0标示不设定;1招牌；2新品
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 口碑枚举定义 single:单品;packages：套餐
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * 小类,口碑枚举定义 fixed：固定套餐;choose:选N套餐 几选几
	 */
	@ApiField("type_small")
	private String typeSmall;

	/**
	 * 单位id 字典的id
	 */
	@ApiField("unit_id")
	private String unitId;

	/**
	 * 修改操作小二
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets catetory big id.
     *
     * @return the catetory big id
     */
    public String getCatetoryBigId() {
		return this.catetoryBigId;
	}

    /**
     * Sets catetory big id.
     *
     * @param catetoryBigId the catetory big id
     */
    public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

    /**
     * Gets catetory small id.
     *
     * @return the catetory small id
     */
    public String getCatetorySmallId() {
		return this.catetorySmallId;
	}

    /**
     * Sets catetory small id.
     *
     * @param catetorySmallId the catetory small id
     */
    public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

    /**
     * Gets create user.
     *
     * @return the create user
     */
    public String getCreateUser() {
		return this.createUser;
	}

    /**
     * Sets create user.
     *
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

    /**
     * Gets cur price flag.
     *
     * @return the cur price flag
     */
    public String getCurPriceFlag() {
		return this.curPriceFlag;
	}

    /**
     * Sets cur price flag.
     *
     * @param curPriceFlag the cur price flag
     */
    public void setCurPriceFlag(String curPriceFlag) {
		this.curPriceFlag = curPriceFlag;
	}

    /**
     * Gets default in carts.
     *
     * @return the default in carts
     */
    public String getDefaultInCarts() {
		return this.defaultInCarts;
	}

    /**
     * Sets default in carts.
     *
     * @param defaultInCarts the default in carts
     */
    public void setDefaultInCarts(String defaultInCarts) {
		this.defaultInCarts = defaultInCarts;
	}

    /**
     * Gets default in carts detail.
     *
     * @return the default in carts detail
     */
    public String getDefaultInCartsDetail() {
		return this.defaultInCartsDetail;
	}

    /**
     * Sets default in carts detail.
     *
     * @param defaultInCartsDetail the default in carts detail
     */
    public void setDefaultInCartsDetail(String defaultInCartsDetail) {
		this.defaultInCartsDetail = defaultInCartsDetail;
	}

    /**
     * Gets dish cuisine.
     *
     * @return the dish cuisine
     */
    public String getDishCuisine() {
		return this.dishCuisine;
	}

    /**
     * Sets dish cuisine.
     *
     * @param dishCuisine the dish cuisine
     */
    public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
	}

    /**
     * Gets dish id.
     *
     * @return the dish id
     */
    public String getDishId() {
		return this.dishId;
	}

    /**
     * Sets dish id.
     *
     * @param dishId the dish id
     */
    public void setDishId(String dishId) {
		this.dishId = dishId;
	}

    /**
     * Gets dish img.
     *
     * @return the dish img
     */
    public String getDishImg() {
		return this.dishImg;
	}

    /**
     * Sets dish img.
     *
     * @param dishImg the dish img
     */
    public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
	}

    /**
     * Gets dish name.
     *
     * @return the dish name
     */
    public String getDishName() {
		return this.dishName;
	}

    /**
     * Sets dish name.
     *
     * @param dishName the dish name
     */
    public void setDishName(String dishName) {
		this.dishName = dishName;
	}

    /**
     * Gets dish practice list.
     *
     * @return the dish practice list
     */
    public List<KbdishPracticeInfo> getDishPracticeList() {
		return this.dishPracticeList;
	}

    /**
     * Sets dish practice list.
     *
     * @param dishPracticeList the dish practice list
     */
    public void setDishPracticeList(List<KbdishPracticeInfo> dishPracticeList) {
		this.dishPracticeList = dishPracticeList;
	}

    /**
     * Gets dish sku list.
     *
     * @return the dish sku list
     */
    public List<KbdishSkuInfo> getDishSkuList() {
		return this.dishSkuList;
	}

    /**
     * Sets dish sku list.
     *
     * @param dishSkuList the dish sku list
     */
    public void setDishSkuList(List<KbdishSkuInfo> dishSkuList) {
		this.dishSkuList = dishSkuList;
	}

    /**
     * Gets dish version.
     *
     * @return the dish version
     */
    public String getDishVersion() {
		return this.dishVersion;
	}

    /**
     * Sets dish version.
     *
     * @param dishVersion the dish version
     */
    public void setDishVersion(String dishVersion) {
		this.dishVersion = dishVersion;
	}

    /**
     * Gets en remember code.
     *
     * @return the en remember code
     */
    public String getEnRememberCode() {
		return this.enRememberCode;
	}

    /**
     * Sets en remember code.
     *
     * @param enRememberCode the en remember code
     */
    public void setEnRememberCode(String enRememberCode) {
		this.enRememberCode = enRememberCode;
	}

    /**
     * Gets ext content.
     *
     * @return the ext content
     */
    public String getExtContent() {
		return this.extContent;
	}

    /**
     * Sets ext content.
     *
     * @param extContent the ext content
     */
    public void setExtContent(String extContent) {
		this.extContent = extContent;
	}

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public String getGoodsId() {
		return this.goodsId;
	}

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     */
    public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

    /**
     * Gets material binding info list.
     *
     * @return the material binding info list
     */
    public List<KbdishMaterialBindingInfo> getMaterialBindingInfoList() {
		return this.materialBindingInfoList;
	}

    /**
     * Sets material binding info list.
     *
     * @param materialBindingInfoList the material binding info list
     */
    public void setMaterialBindingInfoList(List<KbdishMaterialBindingInfo> materialBindingInfoList) {
		this.materialBindingInfoList = materialBindingInfoList;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets min serving.
     *
     * @return the min serving
     */
    public String getMinServing() {
		return this.minServing;
	}

    /**
     * Sets min serving.
     *
     * @param minServing the min serving
     */
    public void setMinServing(String minServing) {
		this.minServing = minServing;
	}

    /**
     * Gets mini add num.
     *
     * @return the mini add num
     */
    public String getMiniAddNum() {
		return this.miniAddNum;
	}

    /**
     * Sets mini add num.
     *
     * @param miniAddNum the mini add num
     */
    public void setMiniAddNum(String miniAddNum) {
		this.miniAddNum = miniAddNum;
	}

    /**
     * Gets nb remember code.
     *
     * @return the nb remember code
     */
    public String getNbRememberCode() {
		return this.nbRememberCode;
	}

    /**
     * Sets nb remember code.
     *
     * @param nbRememberCode the nb remember code
     */
    public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

    /**
     * Gets not count threshold.
     *
     * @return the not count threshold
     */
    public String getNotCountThreshold() {
		return this.notCountThreshold;
	}

    /**
     * Sets not count threshold.
     *
     * @param notCountThreshold the not count threshold
     */
    public void setNotCountThreshold(String notCountThreshold) {
		this.notCountThreshold = notCountThreshold;
	}

    /**
     * Gets out dish id.
     *
     * @return the out dish id
     */
    public String getOutDishId() {
		return this.outDishId;
	}

    /**
     * Sets out dish id.
     *
     * @param outDishId the out dish id
     */
    public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

    /**
     * Gets property info list.
     *
     * @return the property info list
     */
    public List<KbdishPropertyInfo> getPropertyInfoList() {
		return this.propertyInfoList;
	}

    /**
     * Sets property info list.
     *
     * @param propertyInfoList the property info list
     */
    public void setPropertyInfoList(List<KbdishPropertyInfo> propertyInfoList) {
		this.propertyInfoList = propertyInfoList;
	}

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
		return this.remarks;
	}

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks) {
		this.remarks = remarks;
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

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public String getTags() {
		return this.tags;
	}

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(String tags) {
		this.tags = tags;
	}

    /**
     * Gets type big.
     *
     * @return the type big
     */
    public String getTypeBig() {
		return this.typeBig;
	}

    /**
     * Sets type big.
     *
     * @param typeBig the type big
     */
    public void setTypeBig(String typeBig) {
		this.typeBig = typeBig;
	}

    /**
     * Gets type small.
     *
     * @return the type small
     */
    public String getTypeSmall() {
		return this.typeSmall;
	}

    /**
     * Sets type small.
     *
     * @param typeSmall the type small
     */
    public void setTypeSmall(String typeSmall) {
		this.typeSmall = typeSmall;
	}

    /**
     * Gets unit id.
     *
     * @return the unit id
     */
    public String getUnitId() {
		return this.unitId;
	}

    /**
     * Sets unit id.
     *
     * @param unitId the unit id
     */
    public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

    /**
     * Gets update user.
     *
     * @return the update user
     */
    public String getUpdateUser() {
		return this.updateUser;
	}

    /**
     * Sets update user.
     *
     * @param updateUser the update user
     */
    public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
