package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailItemDescription;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.item.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:18:47
 */
public class KoubeiRetailItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7334968261136112256L;

	/** 
	 * 封面图url地址
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("retail_item_description")
	private List<RetailItemDescription> descriptions;

	/** 
	 * 折扣比例，5折：0.5
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/** 
	 * 商品失效时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 商品生效时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品状态，共有5个状态：INIT（初始状态）EFFECTIVE（生效）PAUSE（暂停）FREEZE(冻结)INVALID（失效）
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商品原价(减至券)。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/** 
	 * 商品详情图片列表
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/** 
	 * 优惠价(减至券)。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("reduce_to_amount")
	private String reduceToAmount;

	/** 
	 * 商品适用的门店信息列表
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/** 
	 * 适用的sku列表,最多支持800个SKU，超过返回为空
	 */
	@ApiListField("sku_list")
	@ApiField("string")
	private List<String> skuList;

	/** 
	 * 券名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 券类型：CASH为代金券，DISCOUNT为折扣券;ALL为全场，SINGLE为单品
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 代金券金额：满100减30 => 30。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("value_amount")
	private String valueAmount;

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
    public void setDescriptions(List<RetailItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

    /**
     * Gets descriptions.
     *
     * @return the descriptions
     */
    public List<RetailItemDescription> getDescriptions( ) {
		return this.descriptions;
	}

    /**
     * Sets discount rate.
     *
     * @param discountRate the discount rate
     */
    public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

    /**
     * Gets discount rate.
     *
     * @return the discount rate
     */
    public String getDiscountRate( ) {
		return this.discountRate;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd( ) {
		return this.gmtEnd;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart( ) {
		return this.gmtStart;
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
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId( ) {
		return this.itemId;
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
     * Sets original amount.
     *
     * @param originalAmount the original amount
     */
    public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

    /**
     * Gets original amount.
     *
     * @return the original amount
     */
    public String getOriginalAmount( ) {
		return this.originalAmount;
	}

    /**
     * Sets picture list.
     *
     * @param pictureList the picture list
     */
    public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}

    /**
     * Gets picture list.
     *
     * @return the picture list
     */
    public List<String> getPictureList( ) {
		return this.pictureList;
	}

    /**
     * Sets reduce to amount.
     *
     * @param reduceToAmount the reduce to amount
     */
    public void setReduceToAmount(String reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

    /**
     * Gets reduce to amount.
     *
     * @return the reduce to amount
     */
    public String getReduceToAmount( ) {
		return this.reduceToAmount;
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
     * Sets sku list.
     *
     * @param skuList the sku list
     */
    public void setSkuList(List<String> skuList) {
		this.skuList = skuList;
	}

    /**
     * Gets sku list.
     *
     * @return the sku list
     */
    public List<String> getSkuList( ) {
		return this.skuList;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle( ) {
		return this.title;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType( ) {
		return this.type;
	}

    /**
     * Sets value amount.
     *
     * @param valueAmount the value amount
     */
    public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

    /**
     * Gets value amount.
     *
     * @return the value amount
     */
    public String getValueAmount( ) {
		return this.valueAmount;
	}

}
