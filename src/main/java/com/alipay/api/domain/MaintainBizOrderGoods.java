package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养订单的商品
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:53
 */
public class MaintainBizOrderGoods extends AlipayObject {

	private static final long serialVersionUID = 1294871117735996885L;

	/**
	 * 商品图片地址，下单时记录的商品图片
	 */
	@ApiField("goods_image")
	private String goodsImage;

	/**
	 * 车主平台商品子订单id。保养订单对应商品子订单表id
	 */
	@ApiField("order_goods_id")
	private String orderGoodsId;

	/**
	 * 原始价格，下单时商品的原始价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * 外部商品编码
	 */
	@ApiField("out_goods_no")
	private String outGoodsNo;

	/**
	 * 外部商品套餐唯一标示。下单时记录的ISV端商品套餐主键
	 */
	@ApiField("out_package_id")
	private String outPackageId;

	/**
	 * 外部套餐名称。下单时记录的商品套餐名称，在商品详情页时透出显示
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 销售价格，下单时商品的销售价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 商品购买数量
	 */
	@ApiField("sale_num")
	private Long saleNum;

    /**
     * Gets goods image.
     *
     * @return the goods image
     */
    public String getGoodsImage() {
		return this.goodsImage;
	}

    /**
     * Sets goods image.
     *
     * @param goodsImage the goods image
     */
    public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

    /**
     * Gets order goods id.
     *
     * @return the order goods id
     */
    public String getOrderGoodsId() {
		return this.orderGoodsId;
	}

    /**
     * Sets order goods id.
     *
     * @param orderGoodsId the order goods id
     */
    public void setOrderGoodsId(String orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

    /**
     * Gets original cost.
     *
     * @return the original cost
     */
    public String getOriginalCost() {
		return this.originalCost;
	}

    /**
     * Sets original cost.
     *
     * @param originalCost the original cost
     */
    public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

    /**
     * Gets out goods no.
     *
     * @return the out goods no
     */
    public String getOutGoodsNo() {
		return this.outGoodsNo;
	}

    /**
     * Sets out goods no.
     *
     * @param outGoodsNo the out goods no
     */
    public void setOutGoodsNo(String outGoodsNo) {
		this.outGoodsNo = outGoodsNo;
	}

    /**
     * Gets out package id.
     *
     * @return the out package id
     */
    public String getOutPackageId() {
		return this.outPackageId;
	}

    /**
     * Sets out package id.
     *
     * @param outPackageId the out package id
     */
    public void setOutPackageId(String outPackageId) {
		this.outPackageId = outPackageId;
	}

    /**
     * Gets package name.
     *
     * @return the package name
     */
    public String getPackageName() {
		return this.packageName;
	}

    /**
     * Sets package name.
     *
     * @param packageName the package name
     */
    public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

    /**
     * Gets real cost.
     *
     * @return the real cost
     */
    public String getRealCost() {
		return this.realCost;
	}

    /**
     * Sets real cost.
     *
     * @param realCost the real cost
     */
    public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

    /**
     * Gets sale num.
     *
     * @return the sale num
     */
    public Long getSaleNum() {
		return this.saleNum;
	}

    /**
     * Sets sale num.
     *
     * @param saleNum the sale num
     */
    public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

}
