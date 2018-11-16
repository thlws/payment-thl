package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.contract.facetoface.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-08 19:36:40
 */
public class AntMerchantExpandContractFacetofaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4488464864971716728L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 产品签约审核结果，申请单状态为审核失败时失败原因用“;”分割，其他状态产品签约审核结果为空
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/** 
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、审核成功、审核失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets order detail.
     *
     * @param orderDetail the order detail
     */
    public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

    /**
     * Gets order detail.
     *
     * @return the order detail
     */
    public String getOrderDetail( ) {
		return this.orderDetail;
	}

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

}
