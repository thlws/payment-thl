package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LotteryType;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.typelist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-30 15:10:00
 */
public class AlipayCommerceLotteryTypelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2247862245359828496L;

	/** 
	 * 彩票系统支持的可用于赠送的彩种类型列表
	 */
	@ApiListField("results")
	@ApiField("lottery_type")
	private List<LotteryType> results;

	/** 
	 * 彩票系统支持的可用于赠送的彩种个数
	 */
	@ApiField("total_result")
	private Long totalResult;

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(List<LotteryType> results) {
		this.results = results;
	}

    /**
     * Gets results.
     *
     * @return the results
     */
    public List<LotteryType> getResults( ) {
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
