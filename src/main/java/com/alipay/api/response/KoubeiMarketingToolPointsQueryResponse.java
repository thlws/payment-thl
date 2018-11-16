package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingToolPointsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7578824363832727966L;

	/** 
	 * 可用集点
	 */
	@ApiField("available_points")
	private String availablePoints;

	/** 
	 * 冻结集点
	 */
	@ApiField("freezed_points")
	private String freezedPoints;

	/** 
	 * 累计集点
	 */
	@ApiField("total_points")
	private String totalPoints;

    /**
     * Sets available points.
     *
     * @param availablePoints the available points
     */
    public void setAvailablePoints(String availablePoints) {
		this.availablePoints = availablePoints;
	}

    /**
     * Gets available points.
     *
     * @return the available points
     */
    public String getAvailablePoints( ) {
		return this.availablePoints;
	}

    /**
     * Sets freezed points.
     *
     * @param freezedPoints the freezed points
     */
    public void setFreezedPoints(String freezedPoints) {
		this.freezedPoints = freezedPoints;
	}

    /**
     * Gets freezed points.
     *
     * @return the freezed points
     */
    public String getFreezedPoints( ) {
		return this.freezedPoints;
	}

    /**
     * Sets total points.
     *
     * @param totalPoints the total points
     */
    public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}

    /**
     * Gets total points.
     *
     * @return the total points
     */
    public String getTotalPoints( ) {
		return this.totalPoints;
	}

}
