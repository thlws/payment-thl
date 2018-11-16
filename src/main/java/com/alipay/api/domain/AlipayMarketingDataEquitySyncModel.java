package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 惠支付对集团的权益同步接口
 *
 * @author auto create
 * @since 1.0, 2017-12-26 14:06:29
 */
public class AlipayMarketingDataEquitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6138172761945645853L;

	/**
	 * biz_time
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * equity_code
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * equity_from
	 */
	@ApiField("equity_from")
	private String equityFrom;

	/**
	 * equity_id
	 */
	@ApiField("equity_id")
	private String equityId;

	/**
	 * equity_info
	 */
	@ApiField("equity_info")
	private EquityInfo equityInfo;

	/**
	 * original_biz_no
	 */
	@ApiField("original_biz_no")
	private String originalBizNo;

	/**
	 * original_biz_type
	 */
	@ApiField("original_biz_type")
	private String originalBizType;

	/**
	 * out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz time.
     *
     * @return the biz time
     */
    public Date getBizTime() {
		return this.bizTime;
	}

    /**
     * Sets biz time.
     *
     * @param bizTime the biz time
     */
    public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

    /**
     * Gets equity code.
     *
     * @return the equity code
     */
    public String getEquityCode() {
		return this.equityCode;
	}

    /**
     * Sets equity code.
     *
     * @param equityCode the equity code
     */
    public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

    /**
     * Gets equity from.
     *
     * @return the equity from
     */
    public String getEquityFrom() {
		return this.equityFrom;
	}

    /**
     * Sets equity from.
     *
     * @param equityFrom the equity from
     */
    public void setEquityFrom(String equityFrom) {
		this.equityFrom = equityFrom;
	}

    /**
     * Gets equity id.
     *
     * @return the equity id
     */
    public String getEquityId() {
		return this.equityId;
	}

    /**
     * Sets equity id.
     *
     * @param equityId the equity id
     */
    public void setEquityId(String equityId) {
		this.equityId = equityId;
	}

    /**
     * Gets equity info.
     *
     * @return the equity info
     */
    public EquityInfo getEquityInfo() {
		return this.equityInfo;
	}

    /**
     * Sets equity info.
     *
     * @param equityInfo the equity info
     */
    public void setEquityInfo(EquityInfo equityInfo) {
		this.equityInfo = equityInfo;
	}

    /**
     * Gets original biz no.
     *
     * @return the original biz no
     */
    public String getOriginalBizNo() {
		return this.originalBizNo;
	}

    /**
     * Sets original biz no.
     *
     * @param originalBizNo the original biz no
     */
    public void setOriginalBizNo(String originalBizNo) {
		this.originalBizNo = originalBizNo;
	}

    /**
     * Gets original biz type.
     *
     * @return the original biz type
     */
    public String getOriginalBizType() {
		return this.originalBizType;
	}

    /**
     * Sets original biz type.
     *
     * @param originalBizType the original biz type
     */
    public void setOriginalBizType(String originalBizType) {
		this.originalBizType = originalBizType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
