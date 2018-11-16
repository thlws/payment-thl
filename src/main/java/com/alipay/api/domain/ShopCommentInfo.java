package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店评分信息模型
 *
 * @author auto create
 * @since 1.0, 2017-09-14 18:45:53
 */
public class ShopCommentInfo extends AlipayObject {

	private static final long serialVersionUID = 2742822549348348724L;

	/**
	 * 店铺30天平均人气值
	 */
	@ApiField("avg_popularity")
	private String avgPopularity;

	/**
	 * avg_popularity字段展示文案
	 */
	@ApiField("avg_popularity_name")
	private String avgPopularityName;

	/**
	 * 门店评分，评分越高，门店质量越高
	 */
	@ApiField("score")
	private String score;

	/**
	 * 门店星级，0~5,越高，店铺质量越高
	 */
	@ApiField("star")
	private String star;

    /**
     * Gets avg popularity.
     *
     * @return the avg popularity
     */
    public String getAvgPopularity() {
		return this.avgPopularity;
	}

    /**
     * Sets avg popularity.
     *
     * @param avgPopularity the avg popularity
     */
    public void setAvgPopularity(String avgPopularity) {
		this.avgPopularity = avgPopularity;
	}

    /**
     * Gets avg popularity name.
     *
     * @return the avg popularity name
     */
    public String getAvgPopularityName() {
		return this.avgPopularityName;
	}

    /**
     * Sets avg popularity name.
     *
     * @param avgPopularityName the avg popularity name
     */
    public void setAvgPopularityName(String avgPopularityName) {
		this.avgPopularityName = avgPopularityName;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

    /**
     * Gets star.
     *
     * @return the star
     */
    public String getStar() {
		return this.star;
	}

    /**
     * Sets star.
     *
     * @param star the star
     */
    public void setStar(String star) {
		this.star = star;
	}

}
