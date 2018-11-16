package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简单的mock模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class SimpleMockModel extends AlipayObject {

	private static final long serialVersionUID = 4351713668955957332L;

	/**
	 * 11
	 */
	@ApiField("count_items")
	private Long countItems;

	/**
	 * 111
	 */
	@ApiField("happen_time")
	private Date happenTime;

	/**
	 * 1.2f
	 */
	@ApiField("price_num")
	private String priceNum;

	/**
	 * false
	 */
	@ApiField("right")
	private Boolean right;

	/**
	 * trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets count items.
     *
     * @return the count items
     */
    public Long getCountItems() {
		return this.countItems;
	}

    /**
     * Sets count items.
     *
     * @param countItems the count items
     */
    public void setCountItems(Long countItems) {
		this.countItems = countItems;
	}

    /**
     * Gets happen time.
     *
     * @return the happen time
     */
    public Date getHappenTime() {
		return this.happenTime;
	}

    /**
     * Sets happen time.
     *
     * @param happenTime the happen time
     */
    public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

    /**
     * Gets price num.
     *
     * @return the price num
     */
    public String getPriceNum() {
		return this.priceNum;
	}

    /**
     * Sets price num.
     *
     * @param priceNum the price num
     */
    public void setPriceNum(String priceNum) {
		this.priceNum = priceNum;
	}

    /**
     * Gets right.
     *
     * @return the right
     */
    public Boolean getRight() {
		return this.right;
	}

    /**
     * Sets right.
     *
     * @param right the right
     */
    public void setRight(Boolean right) {
		this.right = right;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
