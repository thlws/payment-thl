package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品明细信息
 *
 * @author auto create
 * @since 1.0, 2018-09-03 17:15:56
 */
public class DishList extends AlipayObject {

	private static final long serialVersionUID = 2647934375976969878L;

	/**
	 * 总价
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 口碑推单的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 菜品优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 菜品优惠明细
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 菜品在口碑侧基于商品表达的商品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品类型：
可枚举：
(1)SINGLE
(2)COMBO
	 */
	@ApiField("dish_type")
	private String dishType;

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
	 * POS侧菜品明细单ID
	 */
	@ApiField("out_detail_id")
	private String outDetailId;

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
(2)SALES_PROPERTY: {""甜度"":[""五分甜"",""三分甜""],""冰量"":[""少冰""]} 一般销售属性
(3)SPECIFICATION:""大""  规格"
	 */
	@ApiField("out_dish_infos")
	private String outDishInfos;

	/**
	 * 外部菜品SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 套餐选择信息
	 */
	@ApiListField("selected_meal_info")
	@ApiField("selected_meal_info")
	private List<SelectedMealInfo> selectedMealInfo;

	/**
	 * 商品下细分的sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * "菜品状态：
可枚举：
(1)INIT:加菜
(2)SUCCESS:接单
(2)REFUND:退菜
(2)CLOSE:拒单"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否临时车：
可枚举：
(1)Y
(2)N
	 */
	@ApiField("temporary_dish")
	private String temporaryDish;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount() {
		return this.discountAmount;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets discount infos.
     *
     * @return the discount infos
     */
    public List<DiscountInfos> getDiscountInfos() {
		return this.discountInfos;
	}

    /**
     * Sets discount infos.
     *
     * @param discountInfos the discount infos
     */
    public void setDiscountInfos(List<DiscountInfos> discountInfos) {
		this.discountInfos = discountInfos;
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
     * Gets dish type.
     *
     * @return the dish type
     */
    public String getDishType() {
		return this.dishType;
	}

    /**
     * Sets dish type.
     *
     * @param dishType the dish type
     */
    public void setDishType(String dishType) {
		this.dishType = dishType;
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
     * Gets out detail id.
     *
     * @return the out detail id
     */
    public String getOutDetailId() {
		return this.outDetailId;
	}

    /**
     * Sets out detail id.
     *
     * @param outDetailId the out detail id
     */
    public void setOutDetailId(String outDetailId) {
		this.outDetailId = outDetailId;
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
     * Gets selected meal info.
     *
     * @return the selected meal info
     */
    public List<SelectedMealInfo> getSelectedMealInfo() {
		return this.selectedMealInfo;
	}

    /**
     * Sets selected meal info.
     *
     * @param selectedMealInfo the selected meal info
     */
    public void setSelectedMealInfo(List<SelectedMealInfo> selectedMealInfo) {
		this.selectedMealInfo = selectedMealInfo;
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
     * Gets temporary dish.
     *
     * @return the temporary dish
     */
    public String getTemporaryDish() {
		return this.temporaryDish;
	}

    /**
     * Sets temporary dish.
     *
     * @param temporaryDish the temporary dish
     */
    public void setTemporaryDish(String temporaryDish) {
		this.temporaryDish = temporaryDish;
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
