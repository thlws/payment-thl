package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取报销发票详细信息
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:18:48
 */
public class AlipayEbppInvoiceDetailOutputQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2617972267898877923L;

	/**
	 * 发票代码
长度限制（10-12位）
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
长度限制（8-10位）
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 获取发票明细应用场景
固定值：INVOICE_EXPENSE-发票报销
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets invoice code.
     *
     * @return the invoice code
     */
    public String getInvoiceCode() {
		return this.invoiceCode;
	}

    /**
     * Sets invoice code.
     *
     * @param invoiceCode the invoice code
     */
    public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

    /**
     * Gets invoice no.
     *
     * @return the invoice no
     */
    public String getInvoiceNo() {
		return this.invoiceNo;
	}

    /**
     * Sets invoice no.
     *
     * @param invoiceNo the invoice no
     */
    public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
