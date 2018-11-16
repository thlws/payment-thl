package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货品信息模型
 *
 * @author auto create
 * @since 1.0, 2018-05-30 14:49:13
 */
public class GoodsVO extends AlipayObject {

	private static final long serialVersionUID = 8218875827116221949L;

	/**
	 * 商品的附加描述,BOX_LONG:箱的长度(CM),BOX_WIDTH:箱的宽度(CM),BOX_HIGH:箱的高度(CM),BOX_WEIGHT:箱的重量(KG),BOX_LONG:货的长度(CM),BOX_WIDTH:货的宽度(CM),BOX_HIGH:货的高度(CM),BOX_WEIGHT:货的重量(KG),FORBIDDEN_RECEIVE_DAYS:禁收天数,FORBIDDEN_SALE_WEIGHT:禁售天数,EXPIRE_DAYS:到期天数,SPECIFICATION:规格,SPECIFICATION_DESC:规格描述,IMG_URL:图片地址,SALE_AREA:销售区域,ORIGIN_AREA:原产地,TARGET_AREA:发货地,PRODUCTION_PROCESSING:生产工艺,COMPOSITION:成分组成,SAFETY_NO:食品安全证号,USE_CONDITION:使用须知,STORAGE_TIME_TYPE:保质期类型
	 */
	@ApiField("addition_desc")
	private String additionDesc;

	/**
	 * 外部的商品编码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 商品的生效状态，EFFECTIVE：生效，INVALID：失效
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 箱数转换系数
	 */
	@ApiField("box_num")
	private Long boxNum;

	/**
	 * 菜鸟对应的商品编码
	 */
	@ApiField("cainiao_item_code")
	private String cainiaoItemCode;

	/**
	 * 货品的基本类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 最近操作的日期
	 */
	@ApiField("last_operate_time")
	private Date lastOperateTime;

	/**
	 * 操作人
	 */
	@ApiField("last_operator")
	private String lastOperator;

	/**
	 * 商品的原始价格（含税），单位元
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 商品的现价（含税），单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 出厂价，单位元
	 */
	@ApiField("produce_price")
	private String producePrice;

	/**
	 * 生产厂商名称
	 */
	@ApiField("producer_id")
	private String producerId;

	/**
	 * 生产厂商名称
	 */
	@ApiField("producer_name")
	private String producerName;

	/**
	 * 起售件数
	 */
	@ApiField("sale_limit")
	private Long saleLimit;

	/**
	 * 商品的规格信息
	 */
	@ApiField("specifications")
	private String specifications;

	/**
	 * 保质期（天）
	 */
	@ApiField("storage_time")
	private Long storageTime;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 税率值，单位%
	 */
	@ApiField("tax_rate")
	private String taxRate;

    /**
     * Gets addition desc.
     *
     * @return the addition desc
     */
    public String getAdditionDesc() {
		return this.additionDesc;
	}

    /**
     * Sets addition desc.
     *
     * @param additionDesc the addition desc
     */
    public void setAdditionDesc(String additionDesc) {
		this.additionDesc = additionDesc;
	}

    /**
     * Gets barcode.
     *
     * @return the barcode
     */
    public String getBarcode() {
		return this.barcode;
	}

    /**
     * Sets barcode.
     *
     * @param barcode the barcode
     */
    public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

    /**
     * Gets biz status.
     *
     * @return the biz status
     */
    public String getBizStatus() {
		return this.bizStatus;
	}

    /**
     * Sets biz status.
     *
     * @param bizStatus the biz status
     */
    public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

    /**
     * Gets box num.
     *
     * @return the box num
     */
    public Long getBoxNum() {
		return this.boxNum;
	}

    /**
     * Sets box num.
     *
     * @param boxNum the box num
     */
    public void setBoxNum(Long boxNum) {
		this.boxNum = boxNum;
	}

    /**
     * Gets cainiao item code.
     *
     * @return the cainiao item code
     */
    public String getCainiaoItemCode() {
		return this.cainiaoItemCode;
	}

    /**
     * Sets cainiao item code.
     *
     * @param cainiaoItemCode the cainiao item code
     */
    public void setCainiaoItemCode(String cainiaoItemCode) {
		this.cainiaoItemCode = cainiaoItemCode;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
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
     * Gets goods code.
     *
     * @return the goods code
     */
    public String getGoodsCode() {
		return this.goodsCode;
	}

    /**
     * Sets goods code.
     *
     * @param goodsCode the goods code
     */
    public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
		return this.goodsName;
	}

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

    /**
     * Gets last operate time.
     *
     * @return the last operate time
     */
    public Date getLastOperateTime() {
		return this.lastOperateTime;
	}

    /**
     * Sets last operate time.
     *
     * @param lastOperateTime the last operate time
     */
    public void setLastOperateTime(Date lastOperateTime) {
		this.lastOperateTime = lastOperateTime;
	}

    /**
     * Gets last operator.
     *
     * @return the last operator
     */
    public String getLastOperator() {
		return this.lastOperator;
	}

    /**
     * Sets last operator.
     *
     * @param lastOperator the last operator
     */
    public void setLastOperator(String lastOperator) {
		this.lastOperator = lastOperator;
	}

    /**
     * Gets origin price.
     *
     * @return the origin price
     */
    public String getOriginPrice() {
		return this.originPrice;
	}

    /**
     * Sets origin price.
     *
     * @param originPrice the origin price
     */
    public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
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
     * Gets produce price.
     *
     * @return the produce price
     */
    public String getProducePrice() {
		return this.producePrice;
	}

    /**
     * Sets produce price.
     *
     * @param producePrice the produce price
     */
    public void setProducePrice(String producePrice) {
		this.producePrice = producePrice;
	}

    /**
     * Gets producer id.
     *
     * @return the producer id
     */
    public String getProducerId() {
		return this.producerId;
	}

    /**
     * Sets producer id.
     *
     * @param producerId the producer id
     */
    public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

    /**
     * Gets producer name.
     *
     * @return the producer name
     */
    public String getProducerName() {
		return this.producerName;
	}

    /**
     * Sets producer name.
     *
     * @param producerName the producer name
     */
    public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

    /**
     * Gets sale limit.
     *
     * @return the sale limit
     */
    public Long getSaleLimit() {
		return this.saleLimit;
	}

    /**
     * Sets sale limit.
     *
     * @param saleLimit the sale limit
     */
    public void setSaleLimit(Long saleLimit) {
		this.saleLimit = saleLimit;
	}

    /**
     * Gets specifications.
     *
     * @return the specifications
     */
    public String getSpecifications() {
		return this.specifications;
	}

    /**
     * Sets specifications.
     *
     * @param specifications the specifications
     */
    public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

    /**
     * Gets storage time.
     *
     * @return the storage time
     */
    public Long getStorageTime() {
		return this.storageTime;
	}

    /**
     * Sets storage time.
     *
     * @param storageTime the storage time
     */
    public void setStorageTime(Long storageTime) {
		this.storageTime = storageTime;
	}

    /**
     * Gets supplier id.
     *
     * @return the supplier id
     */
    public String getSupplierId() {
		return this.supplierId;
	}

    /**
     * Sets supplier id.
     *
     * @param supplierId the supplier id
     */
    public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

    /**
     * Gets tax rate.
     *
     * @return the tax rate
     */
    public String getTaxRate() {
		return this.taxRate;
	}

    /**
     * Sets tax rate.
     *
     * @param taxRate the tax rate
     */
    public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
