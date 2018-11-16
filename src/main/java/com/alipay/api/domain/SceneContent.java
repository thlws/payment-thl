package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容中台场景页文章信息
 *
 * @author auto create
 * @since 1.0, 2018-01-02 19:44:01
 */
public class SceneContent extends AlipayObject {

	private static final long serialVersionUID = 4899298155829363819L;

	/**
	 * 文章分类
	 */
	@ApiField("article_classify")
	private Long articleClassify;

	/**
	 * 文章作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 文章id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 文章封面图片
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 文章图片列表
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * public_name为生活号名称，属于公开信息，无需脱敏
	 */
	@ApiField("public_name")
	private String publicName;

	/**
	 * 跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 推荐埋点
	 */
	@ApiField("scm")
	private String scm;

	/**
	 * 文章摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 文章标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 文章点赞数
	 */
	@ApiField("total_praise_count")
	private Long totalPraiseCount;

	/**
	 * 文章回复数
	 */
	@ApiField("total_reply_count")
	private Long totalReplyCount;

	/**
	 * 文章阅读数
	 */
	@ApiField("total_view_count")
	private Long totalViewCount;

	/**
	 * 文章类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets article classify.
     *
     * @return the article classify
     */
    public Long getArticleClassify() {
		return this.articleClassify;
	}

    /**
     * Sets article classify.
     *
     * @param articleClassify the article classify
     */
    public void setArticleClassify(Long articleClassify) {
		this.articleClassify = articleClassify;
	}

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
		return this.author;
	}

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
		this.author = author;
	}

    /**
     * Gets content id.
     *
     * @return the content id
     */
    public String getContentId() {
		return this.contentId;
	}

    /**
     * Sets content id.
     *
     * @param contentId the content id
     */
    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
		return this.cover;
	}

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Gets image list.
     *
     * @return the image list
     */
    public List<String> getImageList() {
		return this.imageList;
	}

    /**
     * Sets image list.
     *
     * @param imageList the image list
     */
    public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

    /**
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId() {
		return this.publicId;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

    /**
     * Gets public name.
     *
     * @return the public name
     */
    public String getPublicName() {
		return this.publicName;
	}

    /**
     * Sets public name.
     *
     * @param publicName the public name
     */
    public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

    /**
     * Gets scheme.
     *
     * @return the scheme
     */
    public String getScheme() {
		return this.scheme;
	}

    /**
     * Sets scheme.
     *
     * @param scheme the scheme
     */
    public void setScheme(String scheme) {
		this.scheme = scheme;
	}

    /**
     * Gets scm.
     *
     * @return the scm
     */
    public String getScm() {
		return this.scm;
	}

    /**
     * Sets scm.
     *
     * @param scm the scm
     */
    public void setScm(String scm) {
		this.scm = scm;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
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
     * Gets total praise count.
     *
     * @return the total praise count
     */
    public Long getTotalPraiseCount() {
		return this.totalPraiseCount;
	}

    /**
     * Sets total praise count.
     *
     * @param totalPraiseCount the total praise count
     */
    public void setTotalPraiseCount(Long totalPraiseCount) {
		this.totalPraiseCount = totalPraiseCount;
	}

    /**
     * Gets total reply count.
     *
     * @return the total reply count
     */
    public Long getTotalReplyCount() {
		return this.totalReplyCount;
	}

    /**
     * Sets total reply count.
     *
     * @param totalReplyCount the total reply count
     */
    public void setTotalReplyCount(Long totalReplyCount) {
		this.totalReplyCount = totalReplyCount;
	}

    /**
     * Gets total view count.
     *
     * @return the total view count
     */
    public Long getTotalViewCount() {
		return this.totalViewCount;
	}

    /**
     * Sets total view count.
     *
     * @param totalViewCount the total view count
     */
    public void setTotalViewCount(Long totalViewCount) {
		this.totalViewCount = totalViewCount;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
