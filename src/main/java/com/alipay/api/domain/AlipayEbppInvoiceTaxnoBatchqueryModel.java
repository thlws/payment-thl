package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取指定企业税号的用户发票要素列表
 *
 * @author auto create
 * @since 1.0, 2018-08-24 14:37:07
 */
public class AlipayEbppInvoiceTaxnoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4712122879397458225L;

	/**
	 * 查询结束时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.其中一个值不能为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("end_invoice_date")
	private String endInvoiceDate;

	/**
	 * 查询票种列表
可选值
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiListField("invoice_kind_list")
	@ApiField("string")
	private List<String> invoiceKindList;

	/**
	 * 查询结果上限笔数；
不设置时默认200笔上限；
上限为500笔
	 */
	@ApiField("limit_size")
	private Long limitSize;

	/**
	 * 当前页码，为空时默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 发票要素获取应用场景
INVOICE_EXPENSE－发票报销
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 查询起始时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.其中一个值不能为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("start_invoice_date")
	private String startInvoiceDate;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

    /**
     * Gets end invoice date.
     *
     * @return the end invoice date
     */
    public String getEndInvoiceDate() {
		return this.endInvoiceDate;
	}

    /**
     * Sets end invoice date.
     *
     * @param endInvoiceDate the end invoice date
     */
    public void setEndInvoiceDate(String endInvoiceDate) {
		this.endInvoiceDate = endInvoiceDate;
	}

    /**
     * Gets invoice kind list.
     *
     * @return the invoice kind list
     */
    public List<String> getInvoiceKindList() {
		return this.invoiceKindList;
	}

    /**
     * Sets invoice kind list.
     *
     * @param invoiceKindList the invoice kind list
     */
    public void setInvoiceKindList(List<String> invoiceKindList) {
		this.invoiceKindList = invoiceKindList;
	}

    /**
     * Gets limit size.
     *
     * @return the limit size
     */
    public Long getLimitSize() {
		return this.limitSize;
	}

    /**
     * Sets limit size.
     *
     * @param limitSize the limit size
     */
    public void setLimitSize(Long limitSize) {
		this.limitSize = limitSize;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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
     * Gets start invoice date.
     *
     * @return the start invoice date
     */
    public String getStartInvoiceDate() {
		return this.startInvoiceDate;
	}

    /**
     * Sets start invoice date.
     *
     * @param startInvoiceDate the start invoice date
     */
    public void setStartInvoiceDate(String startInvoiceDate) {
		this.startInvoiceDate = startInvoiceDate;
	}

    /**
     * Gets tax no.
     *
     * @return the tax no
     */
    public String getTaxNo() {
		return this.taxNo;
	}

    /**
     * Sets tax no.
     *
     * @param taxNo the tax no
     */
    public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
