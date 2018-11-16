package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YLBTransDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.trans.history.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 17:33:03
 */
public class MybankFinanceYulibaoTransHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4443835364663634957L;

	/** 
	 * 历史交易记录查询的当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 当前查询是否具有下一页的数据，true-有，fasle-没有
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 历史交易详情信息
	 */
	@ApiListField("history_trans_detail_infos")
	@ApiField("y_l_b_trans_detail_info")
	private List<YLBTransDetailInfo> historyTransDetailInfos;

	/** 
	 * 当前查询在不分页情况下的数据总数
	 */
	@ApiField("total_item_count")
	private String totalItemCount;

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
     * Sets has next page.
     *
     * @param hasNextPage the has next page
     */
    public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

    /**
     * Gets has next page.
     *
     * @return the has next page
     */
    public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

    /**
     * Sets history trans detail infos.
     *
     * @param historyTransDetailInfos the history trans detail infos
     */
    public void setHistoryTransDetailInfos(List<YLBTransDetailInfo> historyTransDetailInfos) {
		this.historyTransDetailInfos = historyTransDetailInfos;
	}

    /**
     * Gets history trans detail infos.
     *
     * @return the history trans detail infos
     */
    public List<YLBTransDetailInfo> getHistoryTransDetailInfos( ) {
		return this.historyTransDetailInfos;
	}

    /**
     * Sets total item count.
     *
     * @param totalItemCount the total item count
     */
    public void setTotalItemCount(String totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

    /**
     * Gets total item count.
     *
     * @return the total item count
     */
    public String getTotalItemCount( ) {
		return this.totalItemCount;
	}

}
