package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LotteryPresent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.presentlist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-30 15:00:00
 */
public class AlipayCommerceLotteryPresentlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7884448467263168432L;

	/** 
	 * 列表内容
	 */
	@ApiListField("results")
	@ApiField("lottery_present")
	private List<LotteryPresent> results;

	/** 
	 * 返回的列表的大小
	 */
	@ApiField("total_result")
	private Long totalResult;

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(List<LotteryPresent> results) {
		this.results = results;
	}

    /**
     * Gets results.
     *
     * @return the results
     */
    public List<LotteryPresent> getResults( ) {
		return this.results;
	}

    /**
     * Sets total result.
     *
     * @param totalResult the total result
     */
    public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}

    /**
     * Gets total result.
     *
     * @return the total result
     */
    public Long getTotalResult( ) {
		return this.totalResult;
	}

}
