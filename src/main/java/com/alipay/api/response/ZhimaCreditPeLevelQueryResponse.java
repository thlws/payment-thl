package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.level.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-07 16:40:00
 */
public class ZhimaCreditPeLevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2632383325361842268L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻分分级编码。分值范围[A,B,C,D,E]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("level_code")
	private String levelCode;

	/** 
	 * 用户的芝麻分分级描述。分值范围[信用极好，信用优秀，信用良好，信用中等，信用较差]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("level_name")
	private String levelName;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets level code.
     *
     * @param levelCode the level code
     */
    public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

    /**
     * Gets level code.
     *
     * @return the level code
     */
    public String getLevelCode( ) {
		return this.levelCode;
	}

    /**
     * Sets level name.
     *
     * @param levelName the level name
     */
    public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

    /**
     * Gets level name.
     *
     * @return the level name
     */
    public String getLevelName( ) {
		return this.levelName;
	}

}
