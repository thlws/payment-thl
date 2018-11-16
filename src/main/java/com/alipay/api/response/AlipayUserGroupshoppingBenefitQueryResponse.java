package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.groupshopping.benefit.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:55:00
 */
public class AlipayUserGroupshoppingBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6742155551652646222L;

	/** 
	 * 拼团支付宝权益透出金额
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 该用户是否有权益
	 */
	@ApiField("have_benefit")
	private Boolean haveBenefit;

	/** 
	 * 查询权益的图标地址
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * 查询权益的跳转地址
	 */
	@ApiField("link")
	private String link;

	/** 
	 * 发放权益原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 查询权益的副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/** 
	 * 查询权益的标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount( ) {
		return this.amount;
	}

    /**
     * Sets have benefit.
     *
     * @param haveBenefit the have benefit
     */
    public void setHaveBenefit(Boolean haveBenefit) {
		this.haveBenefit = haveBenefit;
	}

    /**
     * Gets have benefit.
     *
     * @return the have benefit
     */
    public Boolean getHaveBenefit( ) {
		return this.haveBenefit;
	}

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
		this.icon = icon;
	}

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon( ) {
		return this.icon;
	}

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
		this.link = link;
	}

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink( ) {
		return this.link;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason( ) {
		return this.reason;
	}

    /**
     * Sets sub title.
     *
     * @param subTitle the sub title
     */
    public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

    /**
     * Gets sub title.
     *
     * @return the sub title
     */
    public String getSubTitle( ) {
		return this.subTitle;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle( ) {
		return this.title;
	}

}
