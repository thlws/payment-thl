package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 套餐信息
 *
 * @author auto create
 * @since 1.0, 2018-09-07 20:26:16
 */
public class SelectedMealInfo extends AlipayObject {

	private static final long serialVersionUID = 6368495534836871154L;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 数量
	 */
	@ApiField("num")
	private String num;

	/**
	 * 外部菜品ID
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * "菜品的其他信息，包括但不限于：sku、规格，做法等信息;
为Map结构的json格式，key的枚举定义：
(1)PRACTICE:""红烧""   做法
(2PRACTICE_PRICE:""10.0"" 做法加价
(3)SALES_PROPERTY: {""甜度"":[""五分甜"",""三分甜""],""冰量"":[""少冰""]} 一般销售属性 (4)SPECIFICATION:""大""  规格"
	 */
	@ApiField("out_dish_infos")
	private String outDishInfos;

	/**
	 * 外部菜品SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 加料价格，仅当type=SIDE时有值
	 */
	@ApiField("side_price")
	private String sidePrice;

	/**
	 * 商品下细分的sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * "（新增）子明细类型：
可枚举：
(1)COMBO 套餐内子明细
(2)SIDE  加料明细"
	 */
	@ApiField("type")
	private String type;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

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
     * Gets ext infos.
     *
     * @return the ext infos
     */
    public String getExtInfos() {
		return this.extInfos;
	}

    /**
     * Sets ext infos.
     *
     * @param extInfos the ext infos
     */
    public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

    /**
     * Gets num.
     *
     * @return the num
     */
    public String getNum() {
		return this.num;
	}

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(String num) {
		this.num = num;
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
     * Gets out dish infos.
     *
     * @return the out dish infos
     */
    public String getOutDishInfos() {
		return this.outDishInfos;
	}

    /**
     * Sets out dish infos.
     *
     * @param outDishInfos the out dish infos
     */
    public void setOutDishInfos(String outDishInfos) {
		this.outDishInfos = outDishInfos;
	}

    /**
     * Gets out sku id.
     *
     * @return the out sku id
     */
    public String getOutSkuId() {
		return this.outSkuId;
	}

    /**
     * Sets out sku id.
     *
     * @param outSkuId the out sku id
     */
    public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

    /**
     * Gets side price.
     *
     * @return the side price
     */
    public String getSidePrice() {
		return this.sidePrice;
	}

    /**
     * Sets side price.
     *
     * @param sidePrice the side price
     */
    public void setSidePrice(String sidePrice) {
		this.sidePrice = sidePrice;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
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
