package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品sku模型
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:51
 */
public class KbdishSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 5192242123394624186L;

	/**
	 * 餐盒费用
	 */
	@ApiField("box_price")
	private String boxPrice;

	/**
	 * 口碑的菜品id,新增的时候可以为空
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 套餐明细list
	 */
	@ApiListField("dish_packages_detail_list")
	@ApiField("kbdish_packages_detail_info")
	private List<KbdishPackagesDetailInfo> dishPackagesDetailList;

	/**
	 * 商品的skuId
	 */
	@ApiField("goods_sku_id")
	private String goodsSkuId;

	/**
	 * 会员价格
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 外部的菜品skuId, isv自己的skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * sku的扩展字典,json字符串
	 */
	@ApiField("sku_ext_content")
	private String skuExtContent;

	/**
	 * sku的id 口碑生成
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku的排序字段
	 */
	@ApiField("sku_sort")
	private String skuSort;

	/**
	 * 规则id1
	 */
	@ApiField("spec_code_01")
	private String specCode01;

	/**
	 * 规格2
	 */
	@ApiField("spec_code_02")
	private String specCode02;

	/**
	 * 规格3
	 */
	@ApiField("spec_code_03")
	private String specCode03;

	/**
	 * 规格4
	 */
	@ApiField("spec_code_04")
	private String specCode04;

	/**
	 * 规格5
	 */
	@ApiField("spec_code_05")
	private String specCode05;

	/**
	 * open 启动 stop 停用
变更状态的时候必输入.新增时候如果不设置默认设置启动
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets box price.
     *
     * @return the box price
     */
    public String getBoxPrice() {
		return this.boxPrice;
	}

    /**
     * Sets box price.
     *
     * @param boxPrice the box price
     */
    public void setBoxPrice(String boxPrice) {
		this.boxPrice = boxPrice;
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
     * Gets dish packages detail list.
     *
     * @return the dish packages detail list
     */
    public List<KbdishPackagesDetailInfo> getDishPackagesDetailList() {
		return this.dishPackagesDetailList;
	}

    /**
     * Sets dish packages detail list.
     *
     * @param dishPackagesDetailList the dish packages detail list
     */
    public void setDishPackagesDetailList(List<KbdishPackagesDetailInfo> dishPackagesDetailList) {
		this.dishPackagesDetailList = dishPackagesDetailList;
	}

    /**
     * Gets goods sku id.
     *
     * @return the goods sku id
     */
    public String getGoodsSkuId() {
		return this.goodsSkuId;
	}

    /**
     * Sets goods sku id.
     *
     * @param goodsSkuId the goods sku id
     */
    public void setGoodsSkuId(String goodsSkuId) {
		this.goodsSkuId = goodsSkuId;
	}

    /**
     * Gets member price.
     *
     * @return the member price
     */
    public String getMemberPrice() {
		return this.memberPrice;
	}

    /**
     * Sets member price.
     *
     * @param memberPrice the member price
     */
    public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
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
     * Gets sell price.
     *
     * @return the sell price
     */
    public String getSellPrice() {
		return this.sellPrice;
	}

    /**
     * Sets sell price.
     *
     * @param sellPrice the sell price
     */
    public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

    /**
     * Gets sku ext content.
     *
     * @return the sku ext content
     */
    public String getSkuExtContent() {
		return this.skuExtContent;
	}

    /**
     * Sets sku ext content.
     *
     * @param skuExtContent the sku ext content
     */
    public void setSkuExtContent(String skuExtContent) {
		this.skuExtContent = skuExtContent;
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
     * Gets sku sort.
     *
     * @return the sku sort
     */
    public String getSkuSort() {
		return this.skuSort;
	}

    /**
     * Sets sku sort.
     *
     * @param skuSort the sku sort
     */
    public void setSkuSort(String skuSort) {
		this.skuSort = skuSort;
	}

    /**
     * Gets spec code 01.
     *
     * @return the spec code 01
     */
    public String getSpecCode01() {
		return this.specCode01;
	}

    /**
     * Sets spec code 01.
     *
     * @param specCode01 the spec code 01
     */
    public void setSpecCode01(String specCode01) {
		this.specCode01 = specCode01;
	}

    /**
     * Gets spec code 02.
     *
     * @return the spec code 02
     */
    public String getSpecCode02() {
		return this.specCode02;
	}

    /**
     * Sets spec code 02.
     *
     * @param specCode02 the spec code 02
     */
    public void setSpecCode02(String specCode02) {
		this.specCode02 = specCode02;
	}

    /**
     * Gets spec code 03.
     *
     * @return the spec code 03
     */
    public String getSpecCode03() {
		return this.specCode03;
	}

    /**
     * Sets spec code 03.
     *
     * @param specCode03 the spec code 03
     */
    public void setSpecCode03(String specCode03) {
		this.specCode03 = specCode03;
	}

    /**
     * Gets spec code 04.
     *
     * @return the spec code 04
     */
    public String getSpecCode04() {
		return this.specCode04;
	}

    /**
     * Sets spec code 04.
     *
     * @param specCode04 the spec code 04
     */
    public void setSpecCode04(String specCode04) {
		this.specCode04 = specCode04;
	}

    /**
     * Gets spec code 05.
     *
     * @return the spec code 05
     */
    public String getSpecCode05() {
		return this.specCode05;
	}

    /**
     * Sets spec code 05.
     *
     * @param specCode05 the spec code 05
     */
    public void setSpecCode05(String specCode05) {
		this.specCode05 = specCode05;
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
