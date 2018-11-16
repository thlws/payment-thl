package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户日计步数查询
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:43:07
 */
public class AlipayUserStepcounterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6312358797813977953L;

	/**
	 * 商户要查询步数的日期。如果不传入此参数，则返回用户当日步数。
	 */
	@ApiField("count_date")
	private String countDate;

	/**
	 * 请求方唯一标识。每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户要查询步数的时区，此参数只在查询当日用户步数时有效。若此参数为空，则以用户当时所在时区返回步数。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户唯一用户id。为2088开头id号，需通过alipay.user.userinfo.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets count date.
     *
     * @return the count date
     */
    public String getCountDate() {
		return this.countDate;
	}

    /**
     * Sets count date.
     *
     * @param countDate the count date
     */
    public void setCountDate(String countDate) {
		this.countDate = countDate;
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
