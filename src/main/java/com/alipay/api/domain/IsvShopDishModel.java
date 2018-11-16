package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品热度统计模型
 *
 * @author auto create
 * @since 1.0, 2017-03-31 13:28:51
 */
public class IsvShopDishModel extends AlipayObject {

	private static final long serialVersionUID = 1632157764545557463L;

	/**
	 * 菜品库存。 alipay.offline.provider.shopaction.record回传点菜中的desc。建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 菜品分类ID
alipay.offline.provider.shopaction.record回传点菜中的dishTypeID，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("dish_type_id")
	private String dishTypeId;

	/**
	 * 商家定义菜品的分类名称 alipay.offline.provider.shopaction.record回传点菜中的dishTypeName，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * 菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对sort_col做离散化，数字越大越热
	 */
	@ApiField("good_level")
	private String goodLevel;

	/**
	 * 当前店铺的商家最近7天销量（份）
	 */
	@ApiField("merchant_sold_cnt_seven_d")
	private Long merchantSoldCntSevenD;

	/**
	 * 当前店铺的商家最近30天销量（份）
	 */
	@ApiField("merchant_sold_cnt_thirty_d")
	private Long merchantSoldCntThirtyD;

	/**
	 * 当前店铺的商家最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("merchant_sold_reusercnt_thirty_d")
	private Long merchantSoldReusercntThirtyD;

	/**
	 * 当前店铺的商家最近30天消费支付宝用户数
	 */
	@ApiField("merchant_sold_usercnt_thirty_d")
	private Long merchantSoldUsercntThirtyD;

	/**
	 * alipay.offline.provider.shopaction.record回传点菜中的name
	 */
	@ApiField("name")
	private String name;

	/**
	 * ISV自己的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口中插入菜品与alipay.offline.provider.useraction.record上传用户点菜菜单作为元数据，通过分析得到的数据。当前的ID就是插入菜品中的outerDishId，同时也是上传用户点菜中的action_type是order_dishes里面的dish对象的goodsId
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 废弃，请ISV使用自己的图
	 */
	@ApiField("pict")
	private String pict;

	/**
	 * 当前值来自于alipay.offline.provider.shopaction.record中的outer_shop_do对象里面的 type字段。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * alipay.offline.provider.shopaction.record回传点菜中的price，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品库存。
alipay.offline.provider.shopaction.record回传点菜中的quantity，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 当前店铺最近7天销量（份）
	 */
	@ApiField("sold_cnt_seven_d")
	private Long soldCntSevenD;

	/**
	 * 当前店铺最近30天销量（份）
	 */
	@ApiField("sold_cnt_thirty_d")
	private Long soldCntThirtyD;

	/**
	 * 当前店铺最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("sold_reusercnt_thirty_d")
	private Long soldReusercntThirtyD;

	/**
	 * 当前店铺最近30天消费支付宝用户数
	 */
	@ApiField("sold_usercnt_thirty_d")
	private Long soldUsercntThirtyD;

	/**
	 * 排序值。 alipay.offline.provider.shopaction.record回传点菜中的sort。建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiListField("sort_col")
	@ApiField("number")
	private List<Long> sortCol;

	/**
	 * 菜品显示的单位（份/斤/杯） alipay.offline.provider.shopaction.record回传点菜中的unit，建议ISV在拿到推荐的菜品的ID后，直接使用自己的菜品元数据，口碑元数据是ISV上传，实时性无法保证。
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets dish type id.
     *
     * @return the dish type id
     */
    public String getDishTypeId() {
		return this.dishTypeId;
	}

    /**
     * Sets dish type id.
     *
     * @param dishTypeId the dish type id
     */
    public void setDishTypeId(String dishTypeId) {
		this.dishTypeId = dishTypeId;
	}

    /**
     * Gets dish type name.
     *
     * @return the dish type name
     */
    public String getDishTypeName() {
		return this.dishTypeName;
	}

    /**
     * Sets dish type name.
     *
     * @param dishTypeName the dish type name
     */
    public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

    /**
     * Gets good level.
     *
     * @return the good level
     */
    public String getGoodLevel() {
		return this.goodLevel;
	}

    /**
     * Sets good level.
     *
     * @param goodLevel the good level
     */
    public void setGoodLevel(String goodLevel) {
		this.goodLevel = goodLevel;
	}

    /**
     * Gets merchant sold cnt seven d.
     *
     * @return the merchant sold cnt seven d
     */
    public Long getMerchantSoldCntSevenD() {
		return this.merchantSoldCntSevenD;
	}

    /**
     * Sets merchant sold cnt seven d.
     *
     * @param merchantSoldCntSevenD the merchant sold cnt seven d
     */
    public void setMerchantSoldCntSevenD(Long merchantSoldCntSevenD) {
		this.merchantSoldCntSevenD = merchantSoldCntSevenD;
	}

    /**
     * Gets merchant sold cnt thirty d.
     *
     * @return the merchant sold cnt thirty d
     */
    public Long getMerchantSoldCntThirtyD() {
		return this.merchantSoldCntThirtyD;
	}

    /**
     * Sets merchant sold cnt thirty d.
     *
     * @param merchantSoldCntThirtyD the merchant sold cnt thirty d
     */
    public void setMerchantSoldCntThirtyD(Long merchantSoldCntThirtyD) {
		this.merchantSoldCntThirtyD = merchantSoldCntThirtyD;
	}

    /**
     * Gets merchant sold reusercnt thirty d.
     *
     * @return the merchant sold reusercnt thirty d
     */
    public Long getMerchantSoldReusercntThirtyD() {
		return this.merchantSoldReusercntThirtyD;
	}

    /**
     * Sets merchant sold reusercnt thirty d.
     *
     * @param merchantSoldReusercntThirtyD the merchant sold reusercnt thirty d
     */
    public void setMerchantSoldReusercntThirtyD(Long merchantSoldReusercntThirtyD) {
		this.merchantSoldReusercntThirtyD = merchantSoldReusercntThirtyD;
	}

    /**
     * Gets merchant sold usercnt thirty d.
     *
     * @return the merchant sold usercnt thirty d
     */
    public Long getMerchantSoldUsercntThirtyD() {
		return this.merchantSoldUsercntThirtyD;
	}

    /**
     * Sets merchant sold usercnt thirty d.
     *
     * @param merchantSoldUsercntThirtyD the merchant sold usercnt thirty d
     */
    public void setMerchantSoldUsercntThirtyD(Long merchantSoldUsercntThirtyD) {
		this.merchantSoldUsercntThirtyD = merchantSoldUsercntThirtyD;
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
     * Gets outer dish id.
     *
     * @return the outer dish id
     */
    public String getOuterDishId() {
		return this.outerDishId;
	}

    /**
     * Sets outer dish id.
     *
     * @param outerDishId the outer dish id
     */
    public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

    /**
     * Gets pict.
     *
     * @return the pict
     */
    public String getPict() {
		return this.pict;
	}

    /**
     * Sets pict.
     *
     * @param pict the pict
     */
    public void setPict(String pict) {
		this.pict = pict;
	}

    /**
     * Gets platform.
     *
     * @return the platform
     */
    public String getPlatform() {
		return this.platform;
	}

    /**
     * Sets platform.
     *
     * @param platform the platform
     */
    public void setPlatform(String platform) {
		this.platform = platform;
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
     * Gets quantity.
     *
     * @return the quantity
     */
    public Long getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
		this.quantity = quantity;
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
     * Gets sold cnt seven d.
     *
     * @return the sold cnt seven d
     */
    public Long getSoldCntSevenD() {
		return this.soldCntSevenD;
	}

    /**
     * Sets sold cnt seven d.
     *
     * @param soldCntSevenD the sold cnt seven d
     */
    public void setSoldCntSevenD(Long soldCntSevenD) {
		this.soldCntSevenD = soldCntSevenD;
	}

    /**
     * Gets sold cnt thirty d.
     *
     * @return the sold cnt thirty d
     */
    public Long getSoldCntThirtyD() {
		return this.soldCntThirtyD;
	}

    /**
     * Sets sold cnt thirty d.
     *
     * @param soldCntThirtyD the sold cnt thirty d
     */
    public void setSoldCntThirtyD(Long soldCntThirtyD) {
		this.soldCntThirtyD = soldCntThirtyD;
	}

    /**
     * Gets sold reusercnt thirty d.
     *
     * @return the sold reusercnt thirty d
     */
    public Long getSoldReusercntThirtyD() {
		return this.soldReusercntThirtyD;
	}

    /**
     * Sets sold reusercnt thirty d.
     *
     * @param soldReusercntThirtyD the sold reusercnt thirty d
     */
    public void setSoldReusercntThirtyD(Long soldReusercntThirtyD) {
		this.soldReusercntThirtyD = soldReusercntThirtyD;
	}

    /**
     * Gets sold usercnt thirty d.
     *
     * @return the sold usercnt thirty d
     */
    public Long getSoldUsercntThirtyD() {
		return this.soldUsercntThirtyD;
	}

    /**
     * Sets sold usercnt thirty d.
     *
     * @param soldUsercntThirtyD the sold usercnt thirty d
     */
    public void setSoldUsercntThirtyD(Long soldUsercntThirtyD) {
		this.soldUsercntThirtyD = soldUsercntThirtyD;
	}

    /**
     * Gets sort col.
     *
     * @return the sort col
     */
    public List<Long> getSortCol() {
		return this.sortCol;
	}

    /**
     * Sets sort col.
     *
     * @param sortCol the sort col
     */
    public void setSortCol(List<Long> sortCol) {
		this.sortCol = sortCol;
	}

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
		return this.unit;
	}

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
		this.unit = unit;
	}

}
