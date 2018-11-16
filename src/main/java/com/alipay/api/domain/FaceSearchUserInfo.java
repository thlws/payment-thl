package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息
 *
 * @author auto create
 * @since 1.0, 2018-09-07 23:09:38
 */
public class FaceSearchUserInfo extends AlipayObject {

	private static final long serialVersionUID = 1792362941243931225L;

	/**
	 * 自定义用户标识
	 */
	@ApiField("customuserid")
	private String customuserid;

	/**
	 * 商户标识
	 */
	@ApiField("merchantid")
	private String merchantid;

	/**
	 * 商户uid
	 */
	@ApiField("merchantuid")
	private String merchantuid;

	/**
	 * 分数
	 */
	@ApiField("score")
	private String score;

    /**
     * Gets customuserid.
     *
     * @return the customuserid
     */
    public String getCustomuserid() {
		return this.customuserid;
	}

    /**
     * Sets customuserid.
     *
     * @param customuserid the customuserid
     */
    public void setCustomuserid(String customuserid) {
		this.customuserid = customuserid;
	}

    /**
     * Gets merchantid.
     *
     * @return the merchantid
     */
    public String getMerchantid() {
		return this.merchantid;
	}

    /**
     * Sets merchantid.
     *
     * @param merchantid the merchantid
     */
    public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

    /**
     * Gets merchantuid.
     *
     * @return the merchantuid
     */
    public String getMerchantuid() {
		return this.merchantuid;
	}

    /**
     * Sets merchantuid.
     *
     * @param merchantuid the merchantuid
     */
    public void setMerchantuid(String merchantuid) {
		this.merchantuid = merchantuid;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

}
