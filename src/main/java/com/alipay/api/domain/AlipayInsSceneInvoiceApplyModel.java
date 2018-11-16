package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发票申请
 *
 * @author auto create
 * @since 1.0, 2017-03-30 11:59:29
 */
public class AlipayInsSceneInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8872927897188539573L;

	/**
	 * 发票寄送类型;ELECTRONIC:电子发票;PAPER:纸质发票；BOTH:电子+纸质
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 发票收件人
	 */
	@ApiField("invoice_addressee")
	private InsAddressee invoiceAddressee;

	/**
	 * 发票申请明细
	 */
	@ApiField("invoice_apply_item")
	private InsInvoiceApplyItem invoiceApplyItem;

	/**
	 * 申请发票开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票抬头;收取发票的公司名称或个人姓名
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 开票类型;1:增值税普通发票（公司） ;2:增值税普通发票（个人） ;3:增值税专用发票.
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 商户业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的发票申请请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

    /**
     * Gets delivery type.
     *
     * @return the delivery type
     */
    public String getDeliveryType() {
		return this.deliveryType;
	}

    /**
     * Sets delivery type.
     *
     * @param deliveryType the delivery type
     */
    public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

    /**
     * Gets invoice addressee.
     *
     * @return the invoice addressee
     */
    public InsAddressee getInvoiceAddressee() {
		return this.invoiceAddressee;
	}

    /**
     * Sets invoice addressee.
     *
     * @param invoiceAddressee the invoice addressee
     */
    public void setInvoiceAddressee(InsAddressee invoiceAddressee) {
		this.invoiceAddressee = invoiceAddressee;
	}

    /**
     * Gets invoice apply item.
     *
     * @return the invoice apply item
     */
    public InsInvoiceApplyItem getInvoiceApplyItem() {
		return this.invoiceApplyItem;
	}

    /**
     * Sets invoice apply item.
     *
     * @param invoiceApplyItem the invoice apply item
     */
    public void setInvoiceApplyItem(InsInvoiceApplyItem invoiceApplyItem) {
		this.invoiceApplyItem = invoiceApplyItem;
	}

    /**
     * Gets invoice date.
     *
     * @return the invoice date
     */
    public Date getInvoiceDate() {
		return this.invoiceDate;
	}

    /**
     * Sets invoice date.
     *
     * @param invoiceDate the invoice date
     */
    public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

    /**
     * Gets invoice title.
     *
     * @return the invoice title
     */
    public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

    /**
     * Sets invoice title.
     *
     * @param invoiceTitle the invoice title
     */
    public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

    /**
     * Gets invoice type.
     *
     * @return the invoice type
     */
    public String getInvoiceType() {
		return this.invoiceType;
	}

    /**
     * Sets invoice type.
     *
     * @param invoiceType the invoice type
     */
    public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
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
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
