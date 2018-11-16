package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.score.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-11 20:24:36
 */
public class AlipayInsDataAutoScoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2112127863276385229L;

	/** 
	 * 唯一流水号，调用方应持久化本字段
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 专属分分值，浮点数
	 */
	@ApiField("exclusive_score")
	private String exclusiveScore;

	/** 
	 * 扩展信息，标准JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 车险分
	 */
	@ApiField("score")
	private Long score;

	/** 
	 * 请求发起时通过程序生成并传递UUID，调用方应持久化本字段
	 */
	@ApiField("uuid")
	private String uuid;

    /**
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo( ) {
		return this.billNo;
	}

    /**
     * Sets exclusive score.
     *
     * @param exclusiveScore the exclusive score
     */
    public void setExclusiveScore(String exclusiveScore) {
		this.exclusiveScore = exclusiveScore;
	}

    /**
     * Gets exclusive score.
     *
     * @return the exclusive score
     */
    public String getExclusiveScore( ) {
		return this.exclusiveScore;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(Long score) {
		this.score = score;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public Long getScore( ) {
		return this.score;
	}

    /**
     * Sets uuid.
     *
     * @param uuid the uuid
     */
    public void setUuid(String uuid) {
		this.uuid = uuid;
	}

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getUuid( ) {
		return this.uuid;
	}

}
