package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.data.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-19 14:04:30
 */
public class MybankCreditLoanapplyDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4844645766784177235L;

	/** 
	 * 查询到的对应的数据，大字段。
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 数据采集到的时间
	 */
	@ApiField("data_time")
	private String dataTime;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData( ) {
		return this.data;
	}

    /**
     * Sets data time.
     *
     * @param dataTime the data time
     */
    public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

    /**
     * Gets data time.
     *
     * @return the data time
     */
    public String getDataTime( ) {
		return this.dataTime;
	}

}
