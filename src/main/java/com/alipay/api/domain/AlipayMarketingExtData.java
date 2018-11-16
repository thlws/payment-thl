package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码扩展模型
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingExtData extends AlipayObject {

	private static final long serialVersionUID = 7167374796716619649L;

	/**
	 * 复杂模型
	 */
	@ApiField("lbs_info")
	private AlipayMarketingIbsInfo lbsInfo;

	/**
	 * 外部uid
	 */
	@ApiField("out_user_id")
	private String outUserId;

    /**
     * Gets lbs info.
     *
     * @return the lbs info
     */
    public AlipayMarketingIbsInfo getLbsInfo() {
		return this.lbsInfo;
	}

    /**
     * Sets lbs info.
     *
     * @param lbsInfo the lbs info
     */
    public void setLbsInfo(AlipayMarketingIbsInfo lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

    /**
     * Gets out user id.
     *
     * @return the out user id
     */
    public String getOutUserId() {
		return this.outUserId;
	}

    /**
     * Sets out user id.
     *
     * @param outUserId the out user id
     */
    public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
