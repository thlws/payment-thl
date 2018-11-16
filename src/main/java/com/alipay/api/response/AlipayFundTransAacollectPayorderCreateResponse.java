package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.payorder.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-20 14:05:00
 */
public class AlipayFundTransAacollectPayorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8548825268359225324L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 业务类型,客户端透传给收银台。默认值：biz_account_transfer
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 付款订单号,小程序传给收银台
	 */
	@ApiField("transfer_no")
	private String transferNo;

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo( ) {
		return this.batchNo;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets transfer no.
     *
     * @param transferNo the transfer no
     */
    public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

    /**
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo( ) {
		return this.transferNo;
	}

}
