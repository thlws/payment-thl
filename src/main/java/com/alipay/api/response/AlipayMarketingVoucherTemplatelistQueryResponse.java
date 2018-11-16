package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherTemplateLiteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatelist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingVoucherTemplatelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854288128764665317L;

	/** 
	 * 当前页码,页码从1开始
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_templates")
	@ApiField("voucher_template_lite_info")
	private List<VoucherTemplateLiteInfo> voucherTemplates;

    /**
     * Sets current page.
     *
     * @param currentPage the current page
     */
    public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

    /**
     * Gets current page.
     *
     * @return the current page
     */
    public Long getCurrentPage( ) {
		return this.currentPage;
	}

    /**
     * Sets items per page.
     *
     * @param itemsPerPage the items per page
     */
    public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

    /**
     * Gets items per page.
     *
     * @return the items per page
     */
    public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

    /**
     * Sets total items.
     *
     * @param totalItems the total items
     */
    public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

    /**
     * Gets total items.
     *
     * @return the total items
     */
    public Long getTotalItems( ) {
		return this.totalItems;
	}

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public Long getTotalPages( ) {
		return this.totalPages;
	}

    /**
     * Sets voucher templates.
     *
     * @param voucherTemplates the voucher templates
     */
    public void setVoucherTemplates(List<VoucherTemplateLiteInfo> voucherTemplates) {
		this.voucherTemplates = voucherTemplates;
	}

    /**
     * Gets voucher templates.
     *
     * @return the voucher templates
     */
    public List<VoucherTemplateLiteInfo> getVoucherTemplates( ) {
		return this.voucherTemplates;
	}

}
