package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户订购信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class AlipayContract extends AlipayObject {

	private static final long serialVersionUID = 7297423592185827772L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订购的应用名称，有效时间。
	 */
	@ApiField("contract_content")
	private String contractContent;

	/**
	 * 订购的失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 订购URL。在sign返回false时返回应用的订购地址，可以引导用户订购。
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 订购的生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否订购的标识。true：代表已订购。
	 */
	@ApiField("subscribe")
	private Boolean subscribe;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets contract content.
     *
     * @return the contract content
     */
    public String getContractContent() {
		return this.contractContent;
	}

    /**
     * Sets contract content.
     *
     * @param contractContent the contract content
     */
    public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets page url.
     *
     * @return the page url
     */
    public String getPageUrl() {
		return this.pageUrl;
	}

    /**
     * Sets page url.
     *
     * @param pageUrl the page url
     */
    public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets subscribe.
     *
     * @return the subscribe
     */
    public Boolean getSubscribe() {
		return this.subscribe;
	}

    /**
     * Sets subscribe.
     *
     * @param subscribe the subscribe
     */
    public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}

}
