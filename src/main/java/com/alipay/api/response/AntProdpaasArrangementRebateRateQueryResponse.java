package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.arrangement.rebate.rate.query response.
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:21
 */
public class AntProdpaasArrangementRebateRateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6117467181398595194L;

	/** 
	 * 一级类目ID
	 */
	@ApiField("category_1_id")
	private String category1Id;

	/** 
	 * 一级类目名称
	 */
	@ApiField("category_1_name")
	private String category1Name;

	/** 
	 * 结束时间，精确到天
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 开始时间，精确到天
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 费率
	 */
	@ApiField("rate")
	private String rate;

    /**
     * Sets category 1 id.
     *
     * @param category1Id the category 1 id
     */
    public void setCategory1Id(String category1Id) {
		this.category1Id = category1Id;
	}

    /**
     * Gets category 1 id.
     *
     * @return the category 1 id
     */
    public String getCategory1Id( ) {
		return this.category1Id;
	}

    /**
     * Sets category 1 name.
     *
     * @param category1Name the category 1 name
     */
    public void setCategory1Name(String category1Name) {
		this.category1Name = category1Name;
	}

    /**
     * Gets category 1 name.
     *
     * @return the category 1 name
     */
    public String getCategory1Name( ) {
		return this.category1Name;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd( ) {
		return this.gmtEnd;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart( ) {
		return this.gmtStart;
	}

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(String rate) {
		this.rate = rate;
	}

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public String getRate( ) {
		return this.rate;
	}

}
