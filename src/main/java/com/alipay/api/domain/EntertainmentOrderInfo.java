package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值ISV订单回流模型
 *
 * @author auto create
 * @since 1.0, 2017-11-02 10:19:49
 */
public class EntertainmentOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2273598782389459839L;

	/**
	 * 订单号,通过回调获得
如果订单状态为2  未支付  那就不存在alipay_trade_no 就不是必填
3和5 用户付款行为已经发生，那么 alipay_trade_no  就是必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 订单完成时间(UNIX时间戳)
未支付自动关闭
	 */
	@ApiField("complete_time")
	private Long completeTime;

	/**
	 * 下单时间(UNIX时间戳)
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 额外的参数信息,格式为json
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 与娱乐充值平台对接的商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 与娱乐充值平台对接的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 标识是哪个isv来源的订单
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * isv订单号(每个isv独立保证唯一,16位)
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 2-未支付自动关闭
3-退款
5-交易完成
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 支付时间(UNIX时间戳)
	 */
	@ApiField("pay_time")
	private Long payTime;

	/**
	 * 与娱乐充值平台对接的产品编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 与娱乐充值平台对接的产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 用户购买数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 用户总支付金额
	 */
	@ApiField("total_payment")
	private String totalPayment;

	/**
	 * 每个商品单价
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * 用户充值账号
	 */
	@ApiField("user_account")
	private String userAccount;

    /**
     * Gets alipay trade no.
     *
     * @return the alipay trade no
     */
    public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}

    /**
     * Sets alipay trade no.
     *
     * @param alipayTradeNo the alipay trade no
     */
    public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

    /**
     * Gets alipay uid.
     *
     * @return the alipay uid
     */
    public String getAlipayUid() {
		return this.alipayUid;
	}

    /**
     * Sets alipay uid.
     *
     * @param alipayUid the alipay uid
     */
    public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

    /**
     * Gets complete time.
     *
     * @return the complete time
     */
    public Long getCompleteTime() {
		return this.completeTime;
	}

    /**
     * Sets complete time.
     *
     * @param completeTime the complete time
     */
    public void setCompleteTime(Long completeTime) {
		this.completeTime = completeTime;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Long getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
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
     * Gets isv code.
     *
     * @return the isv code
     */
    public String getIsvCode() {
		return this.isvCode;
	}

    /**
     * Sets isv code.
     *
     * @param isvCode the isv code
     */
    public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public Long getOrderStatus() {
		return this.orderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public Long getPayTime() {
		return this.payTime;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(Long payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
		return this.productName;
	}

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
		this.productName = productName;
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
     * Gets total payment.
     *
     * @return the total payment
     */
    public String getTotalPayment() {
		return this.totalPayment;
	}

    /**
     * Sets total payment.
     *
     * @param totalPayment the total payment
     */
    public void setTotalPayment(String totalPayment) {
		this.totalPayment = totalPayment;
	}

    /**
     * Gets unit price.
     *
     * @return the unit price
     */
    public String getUnitPrice() {
		return this.unitPrice;
	}

    /**
     * Sets unit price.
     *
     * @param unitPrice the unit price
     */
    public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

    /**
     * Gets user account.
     *
     * @return the user account
     */
    public String getUserAccount() {
		return this.userAccount;
	}

    /**
     * Sets user account.
     *
     * @param userAccount the user account
     */
    public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

}
