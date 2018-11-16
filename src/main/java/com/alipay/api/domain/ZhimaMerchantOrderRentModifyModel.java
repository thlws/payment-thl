package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还订单修改接口
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:35:11
 */
public class ZhimaMerchantOrderRentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4431323425598779153L;

	/**
	 * 芝麻借还订单的开始借用时间，格式：yyyy-mm-dd hh:MM:ss 
如果同时传入另一参数:应归还时间expiry_time，则传入的开始借用时间不能晚于传入的应归还时间，如果没有传入应归还时间，则传入的开始借用时间不能晚于原有应归还时间。
borrow_time 与 expiry_time 须至少传入一个，可同时传入。
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/**
	 * 芝麻借还订单的应归还时间(到期时间)，格式：yyyy-mm-dd hh:MM:ss 
传入的应归还时间不能早于原有应归还时间。
borrow_time 与 expiry_time 须至少传入一个，可同时传入。
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 信用借还订单号,该订单号在订单创建时由信用借还产品产生,并通过订单创建接口的返回结果返回给调用者
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 信用借还的产品码,是固定值:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

    /**
     * Gets borrow time.
     *
     * @return the borrow time
     */
    public String getBorrowTime() {
		return this.borrowTime;
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
     * Gets expiry time.
     *
     * @return the expiry time
     */
    public String getExpiryTime() {
		return this.expiryTime;
	}

    /**
     * Sets expiry time.
     *
     * @param expiryTime the expiry time
     */
    public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
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

}
