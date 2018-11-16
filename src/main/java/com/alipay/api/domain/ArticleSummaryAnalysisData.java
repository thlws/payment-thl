package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文章分析数据
 *
 * @author auto create
 * @since 1.0, 2018-04-25 18:30:42
 */
public class ArticleSummaryAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 5883355749346153691L;

	/**
	 * 人均阅读时长
	 */
	@ApiField("avg_read_time")
	private String avgReadTime;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 送达人数
	 */
	@ApiField("deliver_user_cnt")
	private Long deliverUserCnt;

	/**
	 * 图文曝光人数
	 */
	@ApiField("expose_user_cnt")
	private Long exposeUserCnt;

	/**
	 * 点赞数
	 */
	@ApiField("praise_user_cnt")
	private Long praiseUserCnt;

	/**
	 * 图文阅读人数
	 */
	@ApiField("read_user_cnt")
	private Long readUserCnt;

	/**
	 * 评论数
	 */
	@ApiField("reply_user_cnt")
	private Long replyUserCnt;

	/**
	 * 分享人数
	 */
	@ApiField("share_user_cnt")
	private Long shareUserCnt;

    /**
     * Gets avg read time.
     *
     * @return the avg read time
     */
    public String getAvgReadTime() {
		return this.avgReadTime;
	}

    /**
     * Sets avg read time.
     *
     * @param avgReadTime the avg read time
     */
    public void setAvgReadTime(String avgReadTime) {
		this.avgReadTime = avgReadTime;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets deliver user cnt.
     *
     * @return the deliver user cnt
     */
    public Long getDeliverUserCnt() {
		return this.deliverUserCnt;
	}

    /**
     * Sets deliver user cnt.
     *
     * @param deliverUserCnt the deliver user cnt
     */
    public void setDeliverUserCnt(Long deliverUserCnt) {
		this.deliverUserCnt = deliverUserCnt;
	}

    /**
     * Gets expose user cnt.
     *
     * @return the expose user cnt
     */
    public Long getExposeUserCnt() {
		return this.exposeUserCnt;
	}

    /**
     * Sets expose user cnt.
     *
     * @param exposeUserCnt the expose user cnt
     */
    public void setExposeUserCnt(Long exposeUserCnt) {
		this.exposeUserCnt = exposeUserCnt;
	}

    /**
     * Gets praise user cnt.
     *
     * @return the praise user cnt
     */
    public Long getPraiseUserCnt() {
		return this.praiseUserCnt;
	}

    /**
     * Sets praise user cnt.
     *
     * @param praiseUserCnt the praise user cnt
     */
    public void setPraiseUserCnt(Long praiseUserCnt) {
		this.praiseUserCnt = praiseUserCnt;
	}

    /**
     * Gets read user cnt.
     *
     * @return the read user cnt
     */
    public Long getReadUserCnt() {
		return this.readUserCnt;
	}

    /**
     * Sets read user cnt.
     *
     * @param readUserCnt the read user cnt
     */
    public void setReadUserCnt(Long readUserCnt) {
		this.readUserCnt = readUserCnt;
	}

    /**
     * Gets reply user cnt.
     *
     * @return the reply user cnt
     */
    public Long getReplyUserCnt() {
		return this.replyUserCnt;
	}

    /**
     * Sets reply user cnt.
     *
     * @param replyUserCnt the reply user cnt
     */
    public void setReplyUserCnt(Long replyUserCnt) {
		this.replyUserCnt = replyUserCnt;
	}

    /**
     * Gets share user cnt.
     *
     * @return the share user cnt
     */
    public Long getShareUserCnt() {
		return this.shareUserCnt;
	}

    /**
     * Sets share user cnt.
     *
     * @param shareUserCnt the share user cnt
     */
    public void setShareUserCnt(Long shareUserCnt) {
		this.shareUserCnt = shareUserCnt;
	}

}
