package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.sharetoken.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:13:06
 */
public class AlipayMarketingSharetokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1455471238469781547L;

	/** 
	 * 吱口令失效时间，若为空则表示永久有效
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 吱口令引导文案一，示例值中的：『#吱口令# 长按复制此条消息即可分享，』
	 */
	@ApiField("guider_str_1")
	private String guiderStr1;

	/** 
	 * 吱口令引导文案二，示例值中的：『，赶紧去分享吧』
	 */
	@ApiField("guider_str_2")
	private String guiderStr2;

	/** 
	 * 吱口令
	 */
	@ApiField("share_token")
	private String shareToken;

	/** 
	 * 吱口令生效时间
	 */
	@ApiListField("start_date")
	@ApiField("date")
	private List<Date> startDate;

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public Date getExpireDate( ) {
		return this.expireDate;
	}

    /**
     * Sets guider str 1.
     *
     * @param guiderStr1 the guider str 1
     */
    public void setGuiderStr1(String guiderStr1) {
		this.guiderStr1 = guiderStr1;
	}

    /**
     * Gets guider str 1.
     *
     * @return the guider str 1
     */
    public String getGuiderStr1( ) {
		return this.guiderStr1;
	}

    /**
     * Sets guider str 2.
     *
     * @param guiderStr2 the guider str 2
     */
    public void setGuiderStr2(String guiderStr2) {
		this.guiderStr2 = guiderStr2;
	}

    /**
     * Gets guider str 2.
     *
     * @return the guider str 2
     */
    public String getGuiderStr2( ) {
		return this.guiderStr2;
	}

    /**
     * Sets share token.
     *
     * @param shareToken the share token
     */
    public void setShareToken(String shareToken) {
		this.shareToken = shareToken;
	}

    /**
     * Gets share token.
     *
     * @return the share token
     */
    public String getShareToken( ) {
		return this.shareToken;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(List<Date> startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public List<Date> getStartDate( ) {
		return this.startDate;
	}

}
