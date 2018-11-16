package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.search.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:42:30
 */
public class KoubeiMerchantOperatorSearchBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3765781879347719141L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 操作员信息列表
	 */
	@ApiListField("operator_info_models")
	@ApiField("operator_info_model")
	private List<OperatorInfoModel> operatorInfoModels;

	/** 
	 * 总数据量
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

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
     * Sets operator info models.
     *
     * @param operatorInfoModels the operator info models
     */
    public void setOperatorInfoModels(List<OperatorInfoModel> operatorInfoModels) {
		this.operatorInfoModels = operatorInfoModels;
	}

    /**
     * Gets operator info models.
     *
     * @return the operator info models
     */
    public List<OperatorInfoModel> getOperatorInfoModels( ) {
		return this.operatorInfoModels;
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

}
