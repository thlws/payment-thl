package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.morse.operate.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-01-17 10:34:23
 */
public class ZhimaDataMorseOperateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5758163956411798519L;

	/** 
	 * 交易流水号，一次交易的唯一标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 结果扩展字段，用于补充出参内容
	 */
	@ApiField("result_extent")
	private String resultExtent;

	/** 
	 * 操作结果信息，用于标识操作是否成功。true：表示成功，false：表示失败
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

    /**
     * Sets result extent.
     *
     * @param resultExtent the result extent
     */
    public void setResultExtent(String resultExtent) {
		this.resultExtent = resultExtent;
	}

    /**
     * Gets result extent.
     *
     * @return the result extent
     */
    public String getResultExtent( ) {
		return this.resultExtent;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
