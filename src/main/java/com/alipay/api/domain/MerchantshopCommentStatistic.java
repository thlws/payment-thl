package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养评论统计信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:21:57
 */
public class MerchantshopCommentStatistic extends AlipayObject {

	private static final long serialVersionUID = 4846725373516615514L;

	/**
	 * 评论总数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 评分（平均分），两位小数
	 */
	@ApiField("score")
	private Long score;

    /**
     * Gets comment count.
     *
     * @return the comment count
     */
    public Long getCommentCount() {
		return this.commentCount;
	}

    /**
     * Sets comment count.
     *
     * @param commentCount the comment count
     */
    public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public Long getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(Long score) {
		this.score = score;
	}

}
