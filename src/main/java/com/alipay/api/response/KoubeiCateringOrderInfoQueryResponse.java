package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbPosOrderDishDetail;
import com.alipay.api.domain.PosBillPayChannel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 16:34:28
 */
public class KoubeiCateringOrderInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876333427981745484L;

	/** 
	 * 应收金额，以元为单位，精确到分
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/** 
	 * 业务类型：DINNER-正餐、SNACK-快餐
	 */
	@ApiField("business_type")
	private String businessType;

	/** 
	 * KOUBEI-口碑
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * FOR_HERE("FOR_HERE", "堂食"),
TAKE_OUT("TAKE_OUT", "外卖"),
TO_GO("TO_GO", "外带"),
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/** 
	 * 菜明细列表，使用 JSONObject.parseArray(dish_details,KbPosOrderDishDetail.class) 获取菜明细模型列表
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/** 
	 * 扩展信息，使用Map<String,String> extInfo = JSONObject.parseObject(ext_info,Map.class)转换，包含核销模式(key为settleMode，value为RECEIPT接单打款/VERIFY核销打款)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 是否享受会员价优惠
	 */
	@ApiField("member_flag")
	private String memberFlag;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 下单方式：
PLATFORM——线上点，SCAN——扫码点
	 */
	@ApiField("order_style")
	private String orderStyle;

	/** 
	 * 用户下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 其他杂费，以元为单位，精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/** 
	 * 打包费，以元为单位，精确到分
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/** 
	 * 实付金额，以元为单位，精确到分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 是一个list列表，value参考对象PosBillPayChannel	支付渠道列表信息，目前只会有一个支付渠道。使用 JSONObject.parseArray(pay_channels,PosBillPayChannel.class)获取
	 */
	@ApiListField("pay_channels")
	@ApiField("pos_bill_pay_channel")
	private List<PosBillPayChannel> payChannels;

	/** 
	 * 就餐人数，int类型
	 */
	@ApiField("people_num")
	private String peopleNum;

	/** 
	 * 实收金额，以元为单位，精确到分
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 服务费，以元为单位，精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 预订开台时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("table_time")
	private Date tableTime;

	/** 
	 * 取餐号码，示例： 桌号：04，令牌：13，取餐号：5100，配送：2018012912312312321（比如饿了么订单号）
	 */
	@ApiField("take_no")
	private String takeNo;

	/** 
	 * 取餐类型：TABLE-桌号，NO-取餐号，NO_BOOK-取餐号（预约），TABLE_BOOK-预约桌号
	 */
	@ApiField("take_style")
	private String takeStyle;

	/** 
	 * 应付金额，以元为单位，精确到分
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 用户手机号码，1864234324324
	 */
	@ApiField("user_mobile")
	private String userMobile;

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

    /**
     * Gets bill amount.
     *
     * @return the bill amount
     */
    public String getBillAmount( ) {
		return this.billAmount;
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
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct( ) {
		return this.bizProduct;
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
     * Gets business type.
     *
     * @return the business type
     */
    public String getBusinessType( ) {
		return this.businessType;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel( ) {
		return this.channel;
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
     * Gets dinner type.
     *
     * @return the dinner type
     */
    public String getDinnerType( ) {
		return this.dinnerType;
	}

    /**
     * Sets dish details.
     *
     * @param dishDetails the dish details
     */
    public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

    /**
     * Gets dish details.
     *
     * @return the dish details
     */
    public List<KbPosOrderDishDetail> getDishDetails( ) {
		return this.dishDetails;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets member flag.
     *
     * @param memberFlag the member flag
     */
    public void setMemberFlag(String memberFlag) {
		this.memberFlag = memberFlag;
	}

    /**
     * Gets member flag.
     *
     * @return the member flag
     */
    public String getMemberFlag( ) {
		return this.memberFlag;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId( ) {
		return this.merchantId;
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
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
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
     * Gets order style.
     *
     * @return the order style
     */
    public String getOrderStyle( ) {
		return this.orderStyle;
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
     * Gets order time.
     *
     * @return the order time
     */
    public Date getOrderTime( ) {
		return this.orderTime;
	}

    /**
     * Sets other amount.
     *
     * @param otherAmount the other amount
     */
    public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

    /**
     * Gets other amount.
     *
     * @return the other amount
     */
    public String getOtherAmount( ) {
		return this.otherAmount;
	}

    /**
     * Sets packing amount.
     *
     * @param packingAmount the packing amount
     */
    public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
	}

    /**
     * Gets packing amount.
     *
     * @return the packing amount
     */
    public String getPackingAmount( ) {
		return this.packingAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount( ) {
		return this.payAmount;
	}

    /**
     * Sets pay channels.
     *
     * @param payChannels the pay channels
     */
    public void setPayChannels(List<PosBillPayChannel> payChannels) {
		this.payChannels = payChannels;
	}

    /**
     * Gets pay channels.
     *
     * @return the pay channels
     */
    public List<PosBillPayChannel> getPayChannels( ) {
		return this.payChannels;
	}

    /**
     * Sets people num.
     *
     * @param peopleNum the people num
     */
    public void setPeopleNum(String peopleNum) {
		this.peopleNum = peopleNum;
	}

    /**
     * Gets people num.
     *
     * @return the people num
     */
    public String getPeopleNum( ) {
		return this.peopleNum;
	}

    /**
     * Sets receipt amount.
     *
     * @param receiptAmount the receipt amount
     */
    public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

    /**
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

    /**
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount( ) {
		return this.serviceAmount;
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
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId( ) {
		return this.shopId;
	}

    /**
     * Sets table time.
     *
     * @param tableTime the table time
     */
    public void setTableTime(Date tableTime) {
		this.tableTime = tableTime;
	}

    /**
     * Gets table time.
     *
     * @return the table time
     */
    public Date getTableTime( ) {
		return this.tableTime;
	}

    /**
     * Sets take no.
     *
     * @param takeNo the take no
     */
    public void setTakeNo(String takeNo) {
		this.takeNo = takeNo;
	}

    /**
     * Gets take no.
     *
     * @return the take no
     */
    public String getTakeNo( ) {
		return this.takeNo;
	}

    /**
     * Sets take style.
     *
     * @param takeStyle the take style
     */
    public void setTakeStyle(String takeStyle) {
		this.takeStyle = takeStyle;
	}

    /**
     * Gets take style.
     *
     * @return the take style
     */
    public String getTakeStyle( ) {
		return this.takeStyle;
	}

    /**
     * Sets trade amount.
     *
     * @param tradeAmount the trade amount
     */
    public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

    /**
     * Gets trade amount.
     *
     * @return the trade amount
     */
    public String getTradeAmount( ) {
		return this.tradeAmount;
	}

    /**
     * Sets user mobile.
     *
     * @param userMobile the user mobile
     */
    public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

    /**
     * Gets user mobile.
     *
     * @return the user mobile
     */
    public String getUserMobile( ) {
		return this.userMobile;
	}

}
