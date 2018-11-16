package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑餐饮行业商品修改接口
 *
 * @author auto create
 * @since 1.0, 2018-03-22 10:22:53
 */
public class KoubeiCateringItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8485418743772274944L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商品可用时段列表。最多添加三条规则。该内容仅用于展示，不影响实际核销。
	 */
	@ApiListField("available_periods")
	@ApiField("available_period_info")
	private List<AvailablePeriodInfo> availablePeriods;

	/**
	 * 商品购买须知
	 */
	@ApiField("buyer_notes")
	private BuyerNotesInfo buyerNotes;

	/**
	 * 口碑商品所属的后台类目id，ISV可通过开放接口koubei.item.category.children.batchquery来获得后台类目树，并选择叶子类目，作为该值传入
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品首图。支持bmp,png,jpeg,jpg,gif格式的图片，建议宽高比16:9，建议宽高：1242*698px 图片大小≤5M。图片大小超过5M,接口会报错。若图片尺寸不对，口碑服务器自身不会做压缩，但是口碑把这些图片放到客户端上展现时，自己会做性能优化(等比缩放，以图片中心为基准裁剪)。
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 外部码库id。仅适用于核销方式为外部核销的商品。当核销方式为外部核销时，该参数必填。当核销方式为券码核销或付款码核销时，接口不会使用该参数。
	 */
	@ApiField("external_code_inventory_id")
	private String externalCodeInventoryId;

	/**
	 * 外部券模板id。仅适用于核销方式为外部核销的商品。当核销方式为外部核销时，该参数必填。当核销方式为券码核销或付款码核销时，接口不会使用该参数。
	 */
	@ApiField("external_code_template_id")
	private String externalCodeTemplateId;

	/**
	 * 售卖结束时间。当到达该时间时，商品暂停售卖，将不在客户端中继续展示，用户无法继续购买。
注意：该时间不能晚于核销绝对有效期的结束时间。如果该值不填，则默认为2037-12-31 23:59:59
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 商品售卖开始时间，商品状态有效并且到达生效时间后才可在客户端（消费者端）展示出来，如果商品生效时间小于当前时间，则立即生效。
说明：商品售卖开始时间不能早于创建当天的0点。商品售卖时间开始后，则不允许修改商品售卖开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 发布商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品详情-菜品图文详情
	 */
	@ApiListField("item_dishes")
	@ApiField("item_dish_info")
	private List<ItemDishInfo> itemDishes;

	/**
	 * 商品展示渠道。ALL表示正常投放，允许在口碑门店详情页、搜索结果、大牌抢购及其他频道中展示。ORIENTATION表示定向投放，仅限报名参加大牌抢购后投放或用户扫商品二维码购买。不填默认为ALL。
	 */
	@ApiField("item_display_channel")
	private String itemDisplayChannel;

	/**
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品详情-商品套餐内容
	 */
	@ApiListField("item_packages")
	@ApiField("item_package_info")
	private List<ItemPackageInfo> itemPackages;

	/**
	 * 商家公告，最多不超过200个字符
	 */
	@ApiField("latest_notice")
	private String latestNotice;

	/**
	 * 商品备注信息。用于商户内部管理，用户页面不露出。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商品详情-商家介绍图文详情
	 */
	@ApiField("merchant_introduction")
	private IntroductionInfo merchantIntroduction;

	/**
	 * 操作人员身份类型。如果是isv代操作，请传入ISV；如果是商户操作请传入MERCHANT；如果是商户员工则传入M_STAFF
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 商品原价。字符串类型，单位元，2位小数。最高价格49998元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品详情-补充说明列表
	 */
	@ApiListField("package_notes")
	@ApiField("string")
	private List<String> packageNotes;

	/**
	 * 商品详情图片列表。尺寸大小与商品首图一致，最多5张。C端上展现时，自己会做性能优化(等比缩放，以图片中心为基准裁剪)
	 */
	@ApiListField("picture_details")
	@ApiField("string")
	private List<String> pictureDetails;

	/**
	 * 商品现价。字符串类型，单位元，2位小数。最高价格49998元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）。比如2016102903214476899999999
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 商品关联门店id列表，即传入一个或多个shop_id。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 商品编码，由商家自定义，不可重复，用于商品核销。如果ticket_display_mode选择付款码核销方式(USER_PAY_CODE)，则sku_id必填。如果ticket_display_mode选择券码核销方式(TICKET_CODE)，则sku_id必须为空
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品名称，请勿超过60个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商品首图(1:1)版本，作为商品在淘宝渠道露出的首图。支持bmp，png，jpeg，jpg，gif格式的图片。如果某个商品的本字段为空，则该商品无法再淘宝渠道露出
	 */
	@ApiField("taobao_cover_image")
	private String taobaoCoverImage;

	/**
	 * 商品购买凭证核销方式。枚举值为：USER_PAY_CODE代表付款码核销方式，如果选择付款码核销，则sku_id必填。TICKET_CODE代表券码核销方式，如果选择券码核销，则sku_id必须为空。EXTERNAL_TICKET_CODE表示 外部券码核销方式
	 */
	@ApiField("ticket_display_mode")
	private String ticketDisplayMode;

	/**
	 * 商品不可用日期区间。该内容仅用于展示，不影响实际核销。
	 */
	@ApiListField("unavailable_periods")
	@ApiField("unavailable_period_info")
	private List<UnavailablePeriodInfo> unavailablePeriods;

	/**
	 * 购买有效期：商品自购买起多长时间内有效，取值范围 7-360，单位天。举例，如果是7的话，是到第七天晚上23:59:59失效。商品购买后，没有在有效期内核销，则自动退款给用户。举例：买了一个鱼香肉丝杨梅汁套餐的商品，有效期一个月，如果一个月之后，用户没有消费该套餐，则自动退款给用户
	 */
	@ApiField("validity_period")
	private Long validityPeriod;

	/**
	 * 商品顺序权重，影响商品在c端货架露出顺序。必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private String weight;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets available periods.
     *
     * @return the available periods
     */
    public List<AvailablePeriodInfo> getAvailablePeriods() {
		return this.availablePeriods;
	}

    /**
     * Sets available periods.
     *
     * @param availablePeriods the available periods
     */
    public void setAvailablePeriods(List<AvailablePeriodInfo> availablePeriods) {
		this.availablePeriods = availablePeriods;
	}

    /**
     * Gets buyer notes.
     *
     * @return the buyer notes
     */
    public BuyerNotesInfo getBuyerNotes() {
		return this.buyerNotes;
	}

    /**
     * Sets buyer notes.
     *
     * @param buyerNotes the buyer notes
     */
    public void setBuyerNotes(BuyerNotesInfo buyerNotes) {
		this.buyerNotes = buyerNotes;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
		return this.cover;
	}

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Gets external code inventory id.
     *
     * @return the external code inventory id
     */
    public String getExternalCodeInventoryId() {
		return this.externalCodeInventoryId;
	}

    /**
     * Sets external code inventory id.
     *
     * @param externalCodeInventoryId the external code inventory id
     */
    public void setExternalCodeInventoryId(String externalCodeInventoryId) {
		this.externalCodeInventoryId = externalCodeInventoryId;
	}

    /**
     * Gets external code template id.
     *
     * @return the external code template id
     */
    public String getExternalCodeTemplateId() {
		return this.externalCodeTemplateId;
	}

    /**
     * Sets external code template id.
     *
     * @param externalCodeTemplateId the external code template id
     */
    public void setExternalCodeTemplateId(String externalCodeTemplateId) {
		this.externalCodeTemplateId = externalCodeTemplateId;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public Date getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Long getInventory() {
		return this.inventory;
	}

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

    /**
     * Gets item dishes.
     *
     * @return the item dishes
     */
    public List<ItemDishInfo> getItemDishes() {
		return this.itemDishes;
	}

    /**
     * Sets item dishes.
     *
     * @param itemDishes the item dishes
     */
    public void setItemDishes(List<ItemDishInfo> itemDishes) {
		this.itemDishes = itemDishes;
	}

    /**
     * Gets item display channel.
     *
     * @return the item display channel
     */
    public String getItemDisplayChannel() {
		return this.itemDisplayChannel;
	}

    /**
     * Sets item display channel.
     *
     * @param itemDisplayChannel the item display channel
     */
    public void setItemDisplayChannel(String itemDisplayChannel) {
		this.itemDisplayChannel = itemDisplayChannel;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item packages.
     *
     * @return the item packages
     */
    public List<ItemPackageInfo> getItemPackages() {
		return this.itemPackages;
	}

    /**
     * Sets item packages.
     *
     * @param itemPackages the item packages
     */
    public void setItemPackages(List<ItemPackageInfo> itemPackages) {
		this.itemPackages = itemPackages;
	}

    /**
     * Gets latest notice.
     *
     * @return the latest notice
     */
    public String getLatestNotice() {
		return this.latestNotice;
	}

    /**
     * Sets latest notice.
     *
     * @param latestNotice the latest notice
     */
    public void setLatestNotice(String latestNotice) {
		this.latestNotice = latestNotice;
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
     * Gets merchant introduction.
     *
     * @return the merchant introduction
     */
    public IntroductionInfo getMerchantIntroduction() {
		return this.merchantIntroduction;
	}

    /**
     * Sets merchant introduction.
     *
     * @param merchantIntroduction the merchant introduction
     */
    public void setMerchantIntroduction(IntroductionInfo merchantIntroduction) {
		this.merchantIntroduction = merchantIntroduction;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice() {
		return this.originalPrice;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets package notes.
     *
     * @return the package notes
     */
    public List<String> getPackageNotes() {
		return this.packageNotes;
	}

    /**
     * Sets package notes.
     *
     * @param packageNotes the package notes
     */
    public void setPackageNotes(List<String> packageNotes) {
		this.packageNotes = packageNotes;
	}

    /**
     * Gets picture details.
     *
     * @return the picture details
     */
    public List<String> getPictureDetails() {
		return this.pictureDetails;
	}

    /**
     * Sets picture details.
     *
     * @param pictureDetails the picture details
     */
    public void setPictureDetails(List<String> pictureDetails) {
		this.pictureDetails = pictureDetails;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId() {
		return this.skuId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets taobao cover image.
     *
     * @return the taobao cover image
     */
    public String getTaobaoCoverImage() {
		return this.taobaoCoverImage;
	}

    /**
     * Sets taobao cover image.
     *
     * @param taobaoCoverImage the taobao cover image
     */
    public void setTaobaoCoverImage(String taobaoCoverImage) {
		this.taobaoCoverImage = taobaoCoverImage;
	}

    /**
     * Gets ticket display mode.
     *
     * @return the ticket display mode
     */
    public String getTicketDisplayMode() {
		return this.ticketDisplayMode;
	}

    /**
     * Sets ticket display mode.
     *
     * @param ticketDisplayMode the ticket display mode
     */
    public void setTicketDisplayMode(String ticketDisplayMode) {
		this.ticketDisplayMode = ticketDisplayMode;
	}

    /**
     * Gets unavailable periods.
     *
     * @return the unavailable periods
     */
    public List<UnavailablePeriodInfo> getUnavailablePeriods() {
		return this.unavailablePeriods;
	}

    /**
     * Sets unavailable periods.
     *
     * @param unavailablePeriods the unavailable periods
     */
    public void setUnavailablePeriods(List<UnavailablePeriodInfo> unavailablePeriods) {
		this.unavailablePeriods = unavailablePeriods;
	}

    /**
     * Gets validity period.
     *
     * @return the validity period
     */
    public Long getValidityPeriod() {
		return this.validityPeriod;
	}

    /**
     * Sets validity period.
     *
     * @param validityPeriod the validity period
     */
    public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public String getWeight() {
		return this.weight;
	}

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(String weight) {
		this.weight = weight;
	}

}
