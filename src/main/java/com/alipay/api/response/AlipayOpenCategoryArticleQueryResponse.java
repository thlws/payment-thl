package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeRecommendArticles;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.category.article.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-26 13:28:21
 */
public class AlipayOpenCategoryArticleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6732842633298157647L;

	/** 
	 * 文章列表
	 */
	@ApiListField("articles")
	@ApiField("life_recommend_articles")
	private List<LifeRecommendArticles> articles;

    /**
     * Sets articles.
     *
     * @param articles the articles
     */
    public void setArticles(List<LifeRecommendArticles> articles) {
		this.articles = articles;
	}

    /**
     * Gets articles.
     *
     * @return the articles
     */
    public List<LifeRecommendArticles> getArticles( ) {
		return this.articles;
	}

}
