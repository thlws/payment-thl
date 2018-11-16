package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容咨询类推荐文章列表
 *
 * @author auto create
 * @since 1.0, 2017-06-22 11:44:23
 */
public class LifeRecommendArticles extends AlipayObject {

	private static final long serialVersionUID = 3647756755723235198L;

	/**
	 * 文章id
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * 文章封面图片
	 */
	@ApiField("article_image")
	private String articleImage;

	/**
	 * 支付宝钱包的文章详情地址
	 */
	@ApiField("article_link")
	private String articleLink;

	/**
	 * 文章阅读数
	 */
	@ApiField("article_read_cnt")
	private String articleReadCnt;

	/**
	 * 文章来源
	 */
	@ApiField("article_source")
	private String articleSource;

	/**
	 * 文章的标题
	 */
	@ApiField("article_title")
	private String articleTitle;

    /**
     * Gets article id.
     *
     * @return the article id
     */
    public String getArticleId() {
		return this.articleId;
	}

    /**
     * Sets article id.
     *
     * @param articleId the article id
     */
    public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

    /**
     * Gets article image.
     *
     * @return the article image
     */
    public String getArticleImage() {
		return this.articleImage;
	}

    /**
     * Sets article image.
     *
     * @param articleImage the article image
     */
    public void setArticleImage(String articleImage) {
		this.articleImage = articleImage;
	}

    /**
     * Gets article link.
     *
     * @return the article link
     */
    public String getArticleLink() {
		return this.articleLink;
	}

    /**
     * Sets article link.
     *
     * @param articleLink the article link
     */
    public void setArticleLink(String articleLink) {
		this.articleLink = articleLink;
	}

    /**
     * Gets article read cnt.
     *
     * @return the article read cnt
     */
    public String getArticleReadCnt() {
		return this.articleReadCnt;
	}

    /**
     * Sets article read cnt.
     *
     * @param articleReadCnt the article read cnt
     */
    public void setArticleReadCnt(String articleReadCnt) {
		this.articleReadCnt = articleReadCnt;
	}

    /**
     * Gets article source.
     *
     * @return the article source
     */
    public String getArticleSource() {
		return this.articleSource;
	}

    /**
     * Sets article source.
     *
     * @param articleSource the article source
     */
    public void setArticleSource(String articleSource) {
		this.articleSource = articleSource;
	}

    /**
     * Gets article title.
     *
     * @return the article title
     */
    public String getArticleTitle() {
		return this.articleTitle;
	}

    /**
     * Sets article title.
     *
     * @param articleTitle the article title
     */
    public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

}
