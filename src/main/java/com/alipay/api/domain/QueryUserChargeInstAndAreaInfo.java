package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出账机构与城市信息对象信息
 *
 * @author auto create
 * @since 1.0, 2017-05-22 17:13:48
 */
public class QueryUserChargeInstAndAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 1471467587332781963L;

	/**
	 * 出账机构简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 缴费次数
	 */
	@ApiField("pay_count")
	private String payCount;

	/**
	 * 最近一次缴费日期
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 子业务类型：
 电费:ELECTRIC,水费:WATER,GAS:燃气费
  暖气费：HEATING, 有线电视费:CATV
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst name.
     *
     * @return the charge inst name
     */
    public String getChargeInstName() {
		return this.chargeInstName;
	}

    /**
     * Sets charge inst name.
     *
     * @param chargeInstName the charge inst name
     */
    public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets pay count.
     *
     * @return the pay count
     */
    public String getPayCount() {
		return this.payCount;
	}

    /**
     * Sets pay count.
     *
     * @param payCount the pay count
     */
    public void setPayCount(String payCount) {
		this.payCount = payCount;
	}

    /**
     * Gets pay date.
     *
     * @return the pay date
     */
    public String getPayDate() {
		return this.payDate;
	}

    /**
     * Sets pay date.
     *
     * @param payDate the pay date
     */
    public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
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
