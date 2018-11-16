package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺DM营销数据
 *
 * @author auto create
 * @since 1.0, 2017-05-16 17:02:42
 */
public class DmActivityShopData extends AlipayObject {

	private static final long serialVersionUID = 6611193368135823751L;

	/**
	 * 数据创建时间戳
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 数据修改时间戳
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_click_persons")
	private Long oneDayClickPersons;

	/**
	 * 单日点击次数
	 */
	@ApiField("one_day_click_times")
	private Long oneDayClickTimes;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_exposure_times")
	private Long oneDayExposureTimes;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 总点击人数
	 */
	@ApiField("total_click_persons")
	private Long totalClickPersons;

	/**
	 * 总点击次数
	 */
	@ApiField("total_click_times")
	private Long totalClickTimes;

	/**
	 * 总曝光次数
	 */
	@ApiField("total_exposure_times")
	private Long totalExposureTimes;

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets one day click persons.
     *
     * @return the one day click persons
     */
    public Long getOneDayClickPersons() {
		return this.oneDayClickPersons;
	}

    /**
     * Sets one day click persons.
     *
     * @param oneDayClickPersons the one day click persons
     */
    public void setOneDayClickPersons(Long oneDayClickPersons) {
		this.oneDayClickPersons = oneDayClickPersons;
	}

    /**
     * Gets one day click times.
     *
     * @return the one day click times
     */
    public Long getOneDayClickTimes() {
		return this.oneDayClickTimes;
	}

    /**
     * Sets one day click times.
     *
     * @param oneDayClickTimes the one day click times
     */
    public void setOneDayClickTimes(Long oneDayClickTimes) {
		this.oneDayClickTimes = oneDayClickTimes;
	}

    /**
     * Gets one day exposure times.
     *
     * @return the one day exposure times
     */
    public Long getOneDayExposureTimes() {
		return this.oneDayExposureTimes;
	}

    /**
     * Sets one day exposure times.
     *
     * @param oneDayExposureTimes the one day exposure times
     */
    public void setOneDayExposureTimes(Long oneDayExposureTimes) {
		this.oneDayExposureTimes = oneDayExposureTimes;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets total click persons.
     *
     * @return the total click persons
     */
    public Long getTotalClickPersons() {
		return this.totalClickPersons;
	}

    /**
     * Sets total click persons.
     *
     * @param totalClickPersons the total click persons
     */
    public void setTotalClickPersons(Long totalClickPersons) {
		this.totalClickPersons = totalClickPersons;
	}

    /**
     * Gets total click times.
     *
     * @return the total click times
     */
    public Long getTotalClickTimes() {
		return this.totalClickTimes;
	}

    /**
     * Sets total click times.
     *
     * @param totalClickTimes the total click times
     */
    public void setTotalClickTimes(Long totalClickTimes) {
		this.totalClickTimes = totalClickTimes;
	}

    /**
     * Gets total exposure times.
     *
     * @return the total exposure times
     */
    public Long getTotalExposureTimes() {
		return this.totalExposureTimes;
	}

    /**
     * Sets total exposure times.
     *
     * @param totalExposureTimes the total exposure times
     */
    public void setTotalExposureTimes(Long totalExposureTimes) {
		this.totalExposureTimes = totalExposureTimes;
	}

}
