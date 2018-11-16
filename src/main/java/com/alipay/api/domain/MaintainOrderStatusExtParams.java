package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态扩展参数
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:02
 */
public class MaintainOrderStatusExtParams extends AlipayObject {

	private static final long serialVersionUID = 7882799518783682439L;

	/**
	 * 编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 快递发货商
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 4S订单状态
	 */
	@ApiField("order_status_txt")
	private String orderStatusTxt;

	/**
	 * 收货地址
	 */
	@ApiField("receiver_addr")
	private String receiverAddr;

	/**
	 * 发货地址
	 */
	@ApiField("sender_addr")
	private String senderAddr;

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets logistics company.
     *
     * @return the logistics company
     */
    public String getLogisticsCompany() {
		return this.logisticsCompany;
	}

    /**
     * Sets logistics company.
     *
     * @param logisticsCompany the logistics company
     */
    public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

    /**
     * Gets logistics no.
     *
     * @return the logistics no
     */
    public String getLogisticsNo() {
		return this.logisticsNo;
	}

    /**
     * Sets logistics no.
     *
     * @param logisticsNo the logistics no
     */
    public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

    /**
     * Gets order status txt.
     *
     * @return the order status txt
     */
    public String getOrderStatusTxt() {
		return this.orderStatusTxt;
	}

    /**
     * Sets order status txt.
     *
     * @param orderStatusTxt the order status txt
     */
    public void setOrderStatusTxt(String orderStatusTxt) {
		this.orderStatusTxt = orderStatusTxt;
	}

    /**
     * Gets receiver addr.
     *
     * @return the receiver addr
     */
    public String getReceiverAddr() {
		return this.receiverAddr;
	}

    /**
     * Sets receiver addr.
     *
     * @param receiverAddr the receiver addr
     */
    public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

    /**
     * Gets sender addr.
     *
     * @return the sender addr
     */
    public String getSenderAddr() {
		return this.senderAddr;
	}

    /**
     * Sets sender addr.
     *
     * @param senderAddr the sender addr
     */
    public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
