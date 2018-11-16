package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.wap.merge.pay response.
 *
 * @author auto create
 * @since 1.0, 2017-03-14 19:15:29
 */
public class AlipayTradeWapMergePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4698725442827726625L;

	/** 
	 * 如果和支付宝约定子订单必须同时支付成功或者同时失败时此参数才存在，取值有以下两种：
1. FINISHED：全部订单付款成功
2. CLOSED：全部订单付款失败
	 */
	@ApiField("merge_pay_status")
	private String mergePayStatus;

	/** 
	 * 合并子订单中所有订单的支付结果信息
	 */
	@ApiListField("order_detail_results")
	@ApiField("order_detail_result")
	private List<OrderDetailResult> orderDetailResults;

	/** 
	 * 如果和支付宝约定子订单必须同时支付成功或者同时失败并且请求时传递了`out_merge_no`时才存在
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

    /**
     * Sets merge pay status.
     *
     * @param mergePayStatus the merge pay status
     */
    public void setMergePayStatus(String mergePayStatus) {
		this.mergePayStatus = mergePayStatus;
	}

    /**
     * Gets merge pay status.
     *
     * @return the merge pay status
     */
    public String getMergePayStatus( ) {
		return this.mergePayStatus;
	}

    /**
     * Sets order detail results.
     *
     * @param orderDetailResults the order detail results
     */
    public void setOrderDetailResults(List<OrderDetailResult> orderDetailResults) {
		this.orderDetailResults = orderDetailResults;
	}

    /**
     * Gets order detail results.
     *
     * @return the order detail results
     */
    public List<OrderDetailResult> getOrderDetailResults( ) {
		return this.orderDetailResults;
	}

    /**
     * Sets out merge no.
     *
     * @param outMergeNo the out merge no
     */
    public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}

    /**
     * Gets out merge no.
     *
     * @return the out merge no
     */
    public String getOutMergeNo( ) {
		return this.outMergeNo;
	}

}
