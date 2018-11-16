package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单同步
 *
 * @author auto create
 * @since 1.0, 2018-09-12 14:26:46
 */
public class KoubeiCateringOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2768473914857272255L;

	/**
	 * 订单向下调整金额
	 */
	@ApiField("adjust_amount")
	private String adjustAmount;

	/**
	 * 订单总金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * "可枚举的业务产品类型
(1)KB_ORDER_DISHES 立即就餐
(2) KB_RESERVATION 预约点餐"
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 可枚举的业务类型。
DINNER：正餐；
SNACK：快餐；
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 可枚举的就餐方式。
FOR_HERE：堂食；
TAKE_OUT：外卖；
TO_GO：外带
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * 订单优惠金额；
包括但不限于：
(1) 单品优惠；
(2) 订单满减优惠；
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单优惠明细信息，包括优惠名称及对应的优惠金额；
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 菜品金额之和
	 */
	@ApiField("dish_amount")
	private String dishAmount;

	/**
	 * 菜品明细列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_list")
	private List<DishList> dishList;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 在线支付金额
	 */
	@ApiField("koubei_payment_amount")
	private String koubeiPaymentAmount;

	/**
	 * POS支付的金额，为POS侧支付成功的订单金额之和；
	 */
	@ApiField("offline_payment_amount")
	private String offlinePaymentAmount;

	/**
	 * 口碑的订单号，口碑推单时传入
特别说明：
(1)在POS侧未做任何接单线上推单前，这个值可能为空；比如，收银员开台并点菜；
(2)在POS侧接单后，口碑订单号写入POS侧；本服务查询时，需要能回传给口碑；
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 可枚举的点餐方式。
POS：pos点餐；
SCAN：扫码点菜；
PLATFORM：平台(外卖类的)
	 */
	@ApiField("order_style")
	private String orderStyle;

	/**
	 * 2018-01-29 10:00:00
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 其他可打折的金额
	 */
	@ApiField("other_amount_discountable")
	private String otherAmountDiscountable;

	/**
	 * 对其他金额的详细说明；表达服务费、餐台费等各种费用具体的金额。
	 */
	@ApiListField("other_amount_infos")
	@ApiField("other_amount_infos")
	private List<OtherAmountInfos> otherAmountInfos;

	/**
	 * 其他不可打折的金额
	 */
	@ApiField("other_amount_undiscountable")
	private String otherAmountUndiscountable;

	/**
	 * POS订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付类型。
ADVANCE_PAYMENT：先付；
AFTER_PAYMENT：后付；
	 */
	@ApiField("pay_style")
	private String payStyle;

	/**
	 * 支付信息
	 */
	@ApiListField("payment_list")
	@ApiField("payment_list")
	private List<PaymentList> paymentList;

	/**
	 * 就餐人数
	 */
	@ApiField("people_num")
	private Long peopleNum;

	/**
	 * POS订单的版本，用于控制POS与口碑订单信息同步，避免乱序的控制机制。
特别说明：
POS侧订单信息的变化都应该能反映到订单版本中。必须保证递增
	 */
	@ApiField("pos_version")
	private Long posVersion;

	/**
	 * 订单应收金额
	 */
	@ApiField("receivable_amount")
	private String receivableAmount;

	/**
	 * 退款信息
	 */
	@ApiListField("refund_list")
	@ApiField("refund_list")
	private List<RefundList> refundList;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * "可枚举的订单状态：
WAIT_PAY: 待支付
SUCCESS: 结账 
FINISH: 反结
CLOSE: 关单"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 就餐的餐台号码
	 */
	@ApiField("table_no")
	private String tableNo;

	/**
	 * 订单累计已支付金额
	 */
	@ApiField("total_paymented_amount")
	private String totalPaymentedAmount;

	/**
	 * 是否使用线上优惠的标记
(1) Y : 这是默认选项；这种情况下，订单级优惠均可使用；
(2) N：当POS侧设置了手工优惠或者其他场景不希望使用线上订单级优惠的时候，设置此标识；
此字段的使用主要是规避商家重复出优惠的问题。
	 */
	@ApiField("use_online_promotion_flag")
	private String useOnlinePromotionFlag;

    /**
     * Gets adjust amount.
     *
     * @return the adjust amount
     */
    public String getAdjustAmount() {
		return this.adjustAmount;
	}

    /**
     * Sets adjust amount.
     *
     * @param adjustAmount the adjust amount
     */
    public void setAdjustAmount(String adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

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
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct() {
		return this.bizProduct;
	}

    /**
     * Sets biz product.
     *
     * @param bizProduct the biz product
     */
    public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public String getBusinessType() {
		return this.businessType;
	}

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

    /**
     * Gets dinner type.
     *
     * @return the dinner type
     */
    public String getDinnerType() {
		return this.dinnerType;
	}

    /**
     * Sets dinner type.
     *
     * @param dinnerType the dinner type
     */
    public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
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
     * Gets dish amount.
     *
     * @return the dish amount
     */
    public String getDishAmount() {
		return this.dishAmount;
	}

    /**
     * Sets dish amount.
     *
     * @param dishAmount the dish amount
     */
    public void setDishAmount(String dishAmount) {
		this.dishAmount = dishAmount;
	}

    /**
     * Gets dish list.
     *
     * @return the dish list
     */
    public List<DishList> getDishList() {
		return this.dishList;
	}

    /**
     * Sets dish list.
     *
     * @param dishList the dish list
     */
    public void setDishList(List<DishList> dishList) {
		this.dishList = dishList;
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
     * Gets koubei payment amount.
     *
     * @return the koubei payment amount
     */
    public String getKoubeiPaymentAmount() {
		return this.koubeiPaymentAmount;
	}

    /**
     * Sets koubei payment amount.
     *
     * @param koubeiPaymentAmount the koubei payment amount
     */
    public void setKoubeiPaymentAmount(String koubeiPaymentAmount) {
		this.koubeiPaymentAmount = koubeiPaymentAmount;
	}

    /**
     * Gets offline payment amount.
     *
     * @return the offline payment amount
     */
    public String getOfflinePaymentAmount() {
		return this.offlinePaymentAmount;
	}

    /**
     * Sets offline payment amount.
     *
     * @param offlinePaymentAmount the offline payment amount
     */
    public void setOfflinePaymentAmount(String offlinePaymentAmount) {
		this.offlinePaymentAmount = offlinePaymentAmount;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order style.
     *
     * @return the order style
     */
    public String getOrderStyle() {
		return this.orderStyle;
	}

    /**
     * Sets order style.
     *
     * @param orderStyle the order style
     */
    public void setOrderStyle(String orderStyle) {
		this.orderStyle = orderStyle;
	}

    /**
     * Gets order time.
     *
     * @return the order time
     */
    public Date getOrderTime() {
		return this.orderTime;
	}

    /**
     * Sets order time.
     *
     * @param orderTime the order time
     */
    public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

    /**
     * Gets other amount discountable.
     *
     * @return the other amount discountable
     */
    public String getOtherAmountDiscountable() {
		return this.otherAmountDiscountable;
	}

    /**
     * Sets other amount discountable.
     *
     * @param otherAmountDiscountable the other amount discountable
     */
    public void setOtherAmountDiscountable(String otherAmountDiscountable) {
		this.otherAmountDiscountable = otherAmountDiscountable;
	}

    /**
     * Gets other amount infos.
     *
     * @return the other amount infos
     */
    public List<OtherAmountInfos> getOtherAmountInfos() {
		return this.otherAmountInfos;
	}

    /**
     * Sets other amount infos.
     *
     * @param otherAmountInfos the other amount infos
     */
    public void setOtherAmountInfos(List<OtherAmountInfos> otherAmountInfos) {
		this.otherAmountInfos = otherAmountInfos;
	}

    /**
     * Gets other amount undiscountable.
     *
     * @return the other amount undiscountable
     */
    public String getOtherAmountUndiscountable() {
		return this.otherAmountUndiscountable;
	}

    /**
     * Sets other amount undiscountable.
     *
     * @param otherAmountUndiscountable the other amount undiscountable
     */
    public void setOtherAmountUndiscountable(String otherAmountUndiscountable) {
		this.otherAmountUndiscountable = otherAmountUndiscountable;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets pay style.
     *
     * @return the pay style
     */
    public String getPayStyle() {
		return this.payStyle;
	}

    /**
     * Sets pay style.
     *
     * @param payStyle the pay style
     */
    public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

    /**
     * Gets payment list.
     *
     * @return the payment list
     */
    public List<PaymentList> getPaymentList() {
		return this.paymentList;
	}

    /**
     * Sets payment list.
     *
     * @param paymentList the payment list
     */
    public void setPaymentList(List<PaymentList> paymentList) {
		this.paymentList = paymentList;
	}

    /**
     * Gets people num.
     *
     * @return the people num
     */
    public Long getPeopleNum() {
		return this.peopleNum;
	}

    /**
     * Sets people num.
     *
     * @param peopleNum the people num
     */
    public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

    /**
     * Gets pos version.
     *
     * @return the pos version
     */
    public Long getPosVersion() {
		return this.posVersion;
	}

    /**
     * Sets pos version.
     *
     * @param posVersion the pos version
     */
    public void setPosVersion(Long posVersion) {
		this.posVersion = posVersion;
	}

    /**
     * Gets receivable amount.
     *
     * @return the receivable amount
     */
    public String getReceivableAmount() {
		return this.receivableAmount;
	}

    /**
     * Sets receivable amount.
     *
     * @param receivableAmount the receivable amount
     */
    public void setReceivableAmount(String receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

    /**
     * Gets refund list.
     *
     * @return the refund list
     */
    public List<RefundList> getRefundList() {
		return this.refundList;
	}

    /**
     * Sets refund list.
     *
     * @param refundList the refund list
     */
    public void setRefundList(List<RefundList> refundList) {
		this.refundList = refundList;
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
     * Gets table no.
     *
     * @return the table no
     */
    public String getTableNo() {
		return this.tableNo;
	}

    /**
     * Sets table no.
     *
     * @param tableNo the table no
     */
    public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

    /**
     * Gets total paymented amount.
     *
     * @return the total paymented amount
     */
    public String getTotalPaymentedAmount() {
		return this.totalPaymentedAmount;
	}

    /**
     * Sets total paymented amount.
     *
     * @param totalPaymentedAmount the total paymented amount
     */
    public void setTotalPaymentedAmount(String totalPaymentedAmount) {
		this.totalPaymentedAmount = totalPaymentedAmount;
	}

    /**
     * Gets use online promotion flag.
     *
     * @return the use online promotion flag
     */
    public String getUseOnlinePromotionFlag() {
		return this.useOnlinePromotionFlag;
	}

    /**
     * Sets use online promotion flag.
     *
     * @param useOnlinePromotionFlag the use online promotion flag
     */
    public void setUseOnlinePromotionFlag(String useOnlinePromotionFlag) {
		this.useOnlinePromotionFlag = useOnlinePromotionFlag;
	}

}
