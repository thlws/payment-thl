package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaMerchantOrderRentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1132335816494763253L;

	/** 
	 * 是否准入:
Y:准入
N:不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 资金流水号
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 借用时间
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/** 
	 * 物品名称,最长不能超过14个汉字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付金额类型
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/** 
	 * 支付状态
PAY_INIT:待支付
PAY_SUCCESS:支付成功
PAY_FAILED:支付失败
PAY_INPROGRESS:支付中
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 归还时间
	 */
	@ApiField("restore_time")
	private String restoreTime;

	/** 
	 * 订单状态:
borrow:借出
restore:归还
cancel:撤销
	 */
	@ApiField("use_state")
	private String useState;

	/** 
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets admit state.
     *
     * @param admitState the admit state
     */
    public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}

    /**
     * Gets admit state.
     *
     * @return the admit state
     */
    public String getAdmitState( ) {
		return this.admitState;
	}

    /**
     * Sets alipay fund order no.
     *
     * @param alipayFundOrderNo the alipay fund order no
     */
    public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}

    /**
     * Gets alipay fund order no.
     *
     * @return the alipay fund order no
     */
    public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

    /**
     * Sets borrow time.
     *
     * @param borrowTime the borrow time
     */
    public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}

    /**
     * Gets borrow time.
     *
     * @return the borrow time
     */
    public String getBorrowTime( ) {
		return this.borrowTime;
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
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName( ) {
		return this.goodsName;
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
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
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
     * Sets pay amount type.
     *
     * @param payAmountType the pay amount type
     */
    public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}

    /**
     * Gets pay amount type.
     *
     * @return the pay amount type
     */
    public String getPayAmountType( ) {
		return this.payAmountType;
	}

    /**
     * Sets pay status.
     *
     * @param payStatus the pay status
     */
    public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

    /**
     * Gets pay status.
     *
     * @return the pay status
     */
    public String getPayStatus( ) {
		return this.payStatus;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime( ) {
		return this.payTime;
	}

    /**
     * Sets restore time.
     *
     * @param restoreTime the restore time
     */
    public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}

    /**
     * Gets restore time.
     *
     * @return the restore time
     */
    public String getRestoreTime( ) {
		return this.restoreTime;
	}

    /**
     * Sets use state.
     *
     * @param useState the use state
     */
    public void setUseState(String useState) {
		this.useState = useState;
	}

    /**
     * Gets use state.
     *
     * @return the use state
     */
    public String getUseState( ) {
		return this.useState;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
