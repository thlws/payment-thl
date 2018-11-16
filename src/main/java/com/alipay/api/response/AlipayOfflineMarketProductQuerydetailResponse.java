package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayDataItemDescription;
import com.alipay.api.domain.AlipayDataItemSalesRule;
import com.alipay.api.domain.AlipayDataItemVoucherTemplete;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.querydetail response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 11:41:52
 */
public class AlipayOfflineMarketProductQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 4455665739199271351L;

	/** 
	 * 商品首图，尺寸比例在65:53范围内且图片大小不超过10k皆可
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 商品描述，只有单品代金券有商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descriptions;

	/** 
	 * 商品下架时间，不得早于商品生效时间，商品下架
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/** 
	 * 商品生效时间，到达生效时间后才可在客户端展示出来
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/** 
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/** 
	 * 是否自动延期，默认false
	 */
	@ApiField("is_auto_expanded")
	private Boolean isAutoExpanded;

	/** 
	 * 该商品当前的状态，共有四个状态：
INIT（初始化状态）
EFFECTIVE（上架/售卖中）
PAUSE（暂停售卖）
INVALID（下架/失效状态）
说明： 处于暂停售卖状态的商品还可以变成上架/售卖中状态，但一旦INVALID就相当于删除了该商品，无法再做其他操作
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商品类型，券类型为固定值VOUCHER
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 商品购买类型：
OBTAIN为领取
AUTO_OBTAIN为自动领取
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/** 
	 * 销售规则，如用户一天只能领取一次等
	 */
	@ApiField("sales_rule")
	private AlipayDataItemSalesRule salesRule;

	/** 
	 * 上架门店id列表，即传入一个或多个shop_id，必须是创建商品partnerId下的店铺，目前支持的店铺最大100个，如果超过100个店铺需要报备
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/** 
	 * 商品名称，请勿超过15个汉字，30个字符
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 券模板信息
	 */
	@ApiField("voucher_templete")
	private AlipayDataItemVoucherTemplete voucherTemplete;

	/** 
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private Long weight;

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover( ) {
		return this.cover;
	}

    /**
     * Sets descriptions.
     *
     * @param descriptions the descriptions
     */
    public void setDescriptions(List<AlipayDataItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

    /**
     * Gets descriptions.
     *
     * @return the descriptions
     */
    public List<AlipayDataItemDescription> getDescriptions( ) {
		return this.descriptions;
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
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd( ) {
		return this.gmtEnd;
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
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public Date getGmtStart( ) {
		return this.gmtStart;
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
     * Gets inventory.
     *
     * @return the inventory
     */
    public Long getInventory( ) {
		return this.inventory;
	}

    /**
     * Sets is auto expanded.
     *
     * @param isAutoExpanded the is auto expanded
     */
    public void setIsAutoExpanded(Boolean isAutoExpanded) {
		this.isAutoExpanded = isAutoExpanded;
	}

    /**
     * Gets is auto expanded.
     *
     * @return the is auto expanded
     */
    public Boolean getIsAutoExpanded( ) {
		return this.isAutoExpanded;
	}

    /**
     * Sets item status.
     *
     * @param itemStatus the item status
     */
    public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

    /**
     * Gets item status.
     *
     * @return the item status
     */
    public String getItemStatus( ) {
		return this.itemStatus;
	}

    /**
     * Sets item type.
     *
     * @param itemType the item type
     */
    public void setItemType(String itemType) {
		this.itemType = itemType;
	}

    /**
     * Gets item type.
     *
     * @return the item type
     */
    public String getItemType( ) {
		return this.itemType;
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
     * Gets pic coll.
     *
     * @return the pic coll
     */
    public String getPicColl( ) {
		return this.picColl;
	}

    /**
     * Sets purchase mode.
     *
     * @param purchaseMode the purchase mode
     */
    public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

    /**
     * Gets purchase mode.
     *
     * @return the purchase mode
     */
    public String getPurchaseMode( ) {
		return this.purchaseMode;
	}

    /**
     * Sets sales rule.
     *
     * @param salesRule the sales rule
     */
    public void setSalesRule(AlipayDataItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}

    /**
     * Gets sales rule.
     *
     * @return the sales rule
     */
    public AlipayDataItemSalesRule getSalesRule( ) {
		return this.salesRule;
	}

    /**
     * Sets shop list.
     *
     * @param shopList the shop list
     */
    public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

    /**
     * Gets shop list.
     *
     * @return the shop list
     */
    public List<String> getShopList( ) {
		return this.shopList;
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
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject( ) {
		return this.subject;
	}

    /**
     * Sets voucher templete.
     *
     * @param voucherTemplete the voucher templete
     */
    public void setVoucherTemplete(AlipayDataItemVoucherTemplete voucherTemplete) {
		this.voucherTemplete = voucherTemplete;
	}

    /**
     * Gets voucher templete.
     *
     * @return the voucher templete
     */
    public AlipayDataItemVoucherTemplete getVoucherTemplete( ) {
		return this.voucherTemplete;
	}

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(Long weight) {
		this.weight = weight;
	}

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public Long getWeight( ) {
		return this.weight;
	}

}
