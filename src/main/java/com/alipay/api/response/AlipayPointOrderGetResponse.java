package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.order.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:56:51
 */
public class AlipayPointOrderGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5149974893684776634L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 发放时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 支付宝集分宝发放者用户ID
	 */
	@ApiField("dispatch_user_id")
	private String dispatchUserId;

	/** 
	 * 向用户展示集分宝发放备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * isv提供的发放号订单号，由数字和字母组成，最大长度为32为，需要保证每笔发放的唯一性，支付宝会对该参数做唯一性控制。如果使用同样的订单号，支付宝将返回订单号已经存在的错误
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 集分宝发放流水状态，I表示处理中，S表示成功，F表示失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 发放集分宝的数量
	 */
	@ApiField("point_count")
	private Long pointCount;

	/** 
	 * 支付宝集分宝接收者用户ID
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

    /**
     * Sets alipay order no.
     *
     * @param alipayOrderNo the alipay order no
     */
    public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

    /**
     * Gets alipay order no.
     *
     * @return the alipay order no
     */
    public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime( ) {
		return this.createTime;
	}

    /**
     * Sets dispatch user id.
     *
     * @param dispatchUserId the dispatch user id
     */
    public void setDispatchUserId(String dispatchUserId) {
		this.dispatchUserId = dispatchUserId;
	}

    /**
     * Gets dispatch user id.
     *
     * @return the dispatch user id
     */
    public String getDispatchUserId( ) {
		return this.dispatchUserId;
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
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
	}

    /**
     * Sets point count.
     *
     * @param pointCount the point count
     */
    public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}

    /**
     * Gets point count.
     *
     * @return the point count
     */
    public Long getPointCount( ) {
		return this.pointCount;
	}

    /**
     * Sets receive user id.
     *
     * @param receiveUserId the receive user id
     */
    public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

    /**
     * Gets receive user id.
     *
     * @return the receive user id
     */
    public String getReceiveUserId( ) {
		return this.receiveUserId;
	}

}
