package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExRefRateInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.ratequery response.
 *
 * @author auto create
 * @since 1.0, 2017-03-27 18:11:27
 */
public class AlipayAccountExrateRatequeryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2499193165527997827L;

	/** 
	 * 查询到的汇率对象列表，如果没有查询到则返回空列表
	 */
	@ApiListField("rate_query_response_list")
	@ApiField("ex_ref_rate_info_v_o")
	private List<ExRefRateInfoVO> rateQueryResponseList;

    /**
     * Sets rate query response list.
     *
     * @param rateQueryResponseList the rate query response list
     */
    public void setRateQueryResponseList(List<ExRefRateInfoVO> rateQueryResponseList) {
		this.rateQueryResponseList = rateQueryResponseList;
	}

    /**
     * Gets rate query response list.
     *
     * @return the rate query response list
     */
    public List<ExRefRateInfoVO> getRateQueryResponseList( ) {
		return this.rateQueryResponseList;
	}

}
