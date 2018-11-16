package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CaptchaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.img.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:31
 */
public class SsdataFindataOperatorImgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4624853242987847626L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 图片验证码信息
	 */
	@ApiField("captcha")
	private CaptchaInfo captcha;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

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
     * Sets captcha.
     *
     * @param captcha the captcha
     */
    public void setCaptcha(CaptchaInfo captcha) {
		this.captcha = captcha;
	}

    /**
     * Gets captcha.
     *
     * @return the captcha
     */
    public CaptchaInfo getCaptcha( ) {
		return this.captcha;
	}

    /**
     * Sets org biz no.
     *
     * @param orgBizNo the org biz no
     */
    public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

    /**
     * Gets org biz no.
     *
     * @return the org biz no
     */
    public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
