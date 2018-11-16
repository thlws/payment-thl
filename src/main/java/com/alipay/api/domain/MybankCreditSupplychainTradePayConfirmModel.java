package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-交易支付确认
 *
 * @author auto create
 * @since 1.0, 2018-07-04 19:03:05
 */
public class MybankCreditSupplychainTradePayConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1876443549132342549L;

	/**
	 * 买家身份信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 预付订单号，在预付场景为必填，其他场景视情况而定
	 */
	@ApiField("prepay_order_no")
	private String prepayOrderNo;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets buyer.
     *
     * @return the buyer
     */
    public Member getBuyer() {
		return this.buyer;
	}

    /**
     * Sets buyer.
     *
     * @param buyer the buyer
     */
    public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets prepay order no.
     *
     * @return the prepay order no
     */
    public String getPrepayOrderNo() {
		return this.prepayOrderNo;
	}

    /**
     * Sets prepay order no.
     *
     * @param prepayOrderNo the prepay order no
     */
    public void setPrepayOrderNo(String prepayOrderNo) {
		this.prepayOrderNo = prepayOrderNo;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
