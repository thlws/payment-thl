package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchRefundDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund.query response.
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:39
 */
public class AlipayTradeBatchRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4171675556443742187L;

	/** 
	 * 退款明细信息
	 */
	@ApiListField("result_details")
	@ApiField("batch_refund_detail_result")
	private List<BatchRefundDetailResult> resultDetails;

    /**
     * Sets result details.
     *
     * @param resultDetails the result details
     */
    public void setResultDetails(List<BatchRefundDetailResult> resultDetails) {
		this.resultDetails = resultDetails;
	}

    /**
     * Gets result details.
     *
     * @return the result details
     */
    public List<BatchRefundDetailResult> getResultDetails( ) {
		return this.resultDetails;
	}

}
