package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.facetoface.twostage.use response.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:35:17
 */
public class AlipayMarketingFacetofaceTwostageUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3529697142675972998L;

	/** 
	 * 业务扩展数据
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 淘宝会员ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * otp校验结果
	 */
	@ApiField("otp_verify")
	private String otpVerify;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData( ) {
		return this.bizData;
	}

    /**
     * Sets havana id.
     *
     * @param havanaId the havana id
     */
    public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

    /**
     * Gets havana id.
     *
     * @return the havana id
     */
    public String getHavanaId( ) {
		return this.havanaId;
	}

    /**
     * Sets otp verify.
     *
     * @param otpVerify the otp verify
     */
    public void setOtpVerify(String otpVerify) {
		this.otpVerify = otpVerify;
	}

    /**
     * Gets otp verify.
     *
     * @return the otp verify
     */
    public String getOtpVerify( ) {
		return this.otpVerify;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
