package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.search response.
 *
 * @author auto create
 * @since 1.0, 2018-08-24 19:12:35
 */
public class AlipayUserAccountSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4497741611442686685L;

	/** 
	 * 支付宝用户账务明细信息
	 */
	@ApiListField("account_records")
	@ApiField("account_record")
	private List<AccountRecord> accountRecords;

	/** 
	 * 总页面数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

    /**
     * Sets account records.
     *
     * @param accountRecords the account records
     */
    public void setAccountRecords(List<AccountRecord> accountRecords) {
		this.accountRecords = accountRecords;
	}

    /**
     * Gets account records.
     *
     * @return the account records
     */
    public List<AccountRecord> getAccountRecords( ) {
		return this.accountRecords;
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
     * Sets total results.
     *
     * @param totalResults the total results
     */
    public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

    /**
     * Gets total results.
     *
     * @return the total results
     */
    public Long getTotalResults( ) {
		return this.totalResults;
	}

}
