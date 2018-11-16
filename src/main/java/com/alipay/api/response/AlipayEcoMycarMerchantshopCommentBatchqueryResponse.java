package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantshopCommentResult;
import com.alipay.api.domain.MerchantshopCommentStatistic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.merchantshop.comment.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:11
 */
public class AlipayEcoMycarMerchantshopCommentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4615168865646874853L;

	/** 
	 * 评论信息
	 */
	@ApiListField("comment_result")
	@ApiField("merchantshop_comment_result")
	private List<MerchantshopCommentResult> commentResult;

	/** 
	 * 评论统计信息
	 */
	@ApiField("comment_statistic")
	private MerchantshopCommentStatistic commentStatistic;

    /**
     * Sets comment result.
     *
     * @param commentResult the comment result
     */
    public void setCommentResult(List<MerchantshopCommentResult> commentResult) {
		this.commentResult = commentResult;
	}

    /**
     * Gets comment result.
     *
     * @return the comment result
     */
    public List<MerchantshopCommentResult> getCommentResult( ) {
		return this.commentResult;
	}

    /**
     * Sets comment statistic.
     *
     * @param commentStatistic the comment statistic
     */
    public void setCommentStatistic(MerchantshopCommentStatistic commentStatistic) {
		this.commentStatistic = commentStatistic;
	}

    /**
     * Gets comment statistic.
     *
     * @return the comment statistic
     */
    public MerchantshopCommentStatistic getCommentStatistic( ) {
		return this.commentStatistic;
	}

}
