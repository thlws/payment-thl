package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.settle response.
 *
 * @author auto create
 * @since 1.0, 2018-07-10 13:55:00
 */
public class AlipayTradeBatchSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7828592731769312736L;

	/** 
	 * 结算受理时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 业务结果码。

ACCEPT_SUCCESS：受理成功；
ACCEPT_FAIL：受理失败；
SUCCESS：结算处理成功；
FAIL：结算处理失败；
SYSTEM_EXCEPTION：系统异常
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets settle no.
     *
     * @param settleNo the settle no
     */
    public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

    /**
     * Gets settle no.
     *
     * @return the settle no
     */
    public String getSettleNo( ) {
		return this.settleNo;
	}

}
