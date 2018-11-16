package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:29
 */
public class AlipayEbppIndustryOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6338384782888934793L;

	/** 
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 订单创建时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单支付时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 退款时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/** 
	 * 订单成功时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_success")
	private Date gmtSuccess;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 回传外部流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 账单的状态，I-等待付款，P-处理中，已扣款待销账，C-单据关闭，F-失败，W-清算后退款，S-销账成功
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
	}

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
     * Sets gmt pay.
     *
     * @param gmtPay the gmt pay
     */
    public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

    /**
     * Gets gmt pay.
     *
     * @return the gmt pay
     */
    public Date getGmtPay( ) {
		return this.gmtPay;
	}

    /**
     * Sets gmt refund.
     *
     * @param gmtRefund the gmt refund
     */
    public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

    /**
     * Gets gmt refund.
     *
     * @return the gmt refund
     */
    public Date getGmtRefund( ) {
		return this.gmtRefund;
	}

    /**
     * Sets gmt success.
     *
     * @param gmtSuccess the gmt success
     */
    public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}

    /**
     * Gets gmt success.
     *
     * @return the gmt success
     */
    public Date getGmtSuccess( ) {
		return this.gmtSuccess;
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
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
