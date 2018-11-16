package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantApplyResultRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.mapplyorder.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-28 23:35:07
 */
public class AntMerchantExpandMapplyorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5167923756191228927L;

	/** 
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝商户入驻申请单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 入驻申请单认证审核、签约审核详情
	 */
	@ApiListField("result_info")
	@ApiField("merchant_apply_result_record")
	private List<MerchantApplyResultRecord> resultInfo;

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

    /**
     * Sets result info.
     *
     * @param resultInfo the result info
     */
    public void setResultInfo(List<MerchantApplyResultRecord> resultInfo) {
		this.resultInfo = resultInfo;
	}

    /**
     * Gets result info.
     *
     * @return the result info
     */
    public List<MerchantApplyResultRecord> getResultInfo( ) {
		return this.resultInfo;
	}

}
