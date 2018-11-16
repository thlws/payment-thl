package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizOrderQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.applyorder.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMarketApplyorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7567268213673479262L;

	/** 
	 * 支付宝操作流水信息列表
	 */
	@ApiListField("biz_order_infos")
	@ApiField("biz_order_query_response")
	private List<BizOrderQueryResponse> bizOrderInfos;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

    /**
     * Sets biz order infos.
     *
     * @param bizOrderInfos the biz order infos
     */
    public void setBizOrderInfos(List<BizOrderQueryResponse> bizOrderInfos) {
		this.bizOrderInfos = bizOrderInfos;
	}

    /**
     * Gets biz order infos.
     *
     * @return the biz order infos
     */
    public List<BizOrderQueryResponse> getBizOrderInfos( ) {
		return this.bizOrderInfos;
	}

    /**
     * Sets current page no.
     *
     * @param currentPageNo the current page no
     */
    public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

    /**
     * Gets current page no.
     *
     * @return the current page no
     */
    public Long getCurrentPageNo( ) {
		return this.currentPageNo;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
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
     * Sets total page no.
     *
     * @param totalPageNo the total page no
     */
    public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}

    /**
     * Gets total page no.
     *
     * @return the total page no
     */
    public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
