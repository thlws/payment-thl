package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.trade.search response.
 *
 * @author auto create
 * @since 1.0, 2018-09-04 14:50:00
 */
public class AlipayUserTradeSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5576767612224798129L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private String totalResults;

	/** 
	 * 交易记录列表
	 */
	@ApiListField("trade_records")
	@ApiField("trade_record")
	private List<TradeRecord> tradeRecords;

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public String getTotalPages( ) {
		return this.totalPages;
	}

    /**
     * Sets total results.
     *
     * @param totalResults the total results
     */
    public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

    /**
     * Gets total results.
     *
     * @return the total results
     */
    public String getTotalResults( ) {
		return this.totalResults;
	}

    /**
     * Sets trade records.
     *
     * @param tradeRecords the trade records
     */
    public void setTradeRecords(List<TradeRecord> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}

    /**
     * Gets trade records.
     *
     * @return the trade records
     */
    public List<TradeRecord> getTradeRecords( ) {
		return this.tradeRecords;
	}

}
