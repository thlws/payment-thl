package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户日计步数据批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:39:54
 */
public class AlipayUserStepcounterDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1118777812189637428L;

	/**
	 * 步数数据查询的结束日期。此日期不能小于步数查询的开始日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 请求方唯一标识。每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 步数数据查询的开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户的计步时区。若此参数为空，则返回所有时区的步数信息。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户唯一用户id。为2088开头id号，需通过alipay.user.info.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public String getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public String getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets time zone.
     *
     * @return the time zone
     */
    public String getTimeZone() {
		return this.timeZone;
	}

    /**
     * Sets time zone.
     *
     * @param timeZone the time zone
     */
    public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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
