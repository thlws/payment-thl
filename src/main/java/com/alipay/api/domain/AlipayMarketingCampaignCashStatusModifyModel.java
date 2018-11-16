package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更改现金活动状态
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:09
 */
public class AlipayMarketingCampaignCashStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6597883359311781354L;

	/**
	 * 修改后的活动状态, PAUSE或者READY或者CLOSED
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 要修改的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus() {
		return this.campStatus;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo() {
		return this.crowdNo;
	}

    /**
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
