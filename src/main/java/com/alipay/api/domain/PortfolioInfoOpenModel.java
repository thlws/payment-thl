package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品集信息
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:55
 */
public class PortfolioInfoOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6398236734276616882L;

	/**
	 * 头图素材id
	 */
	@ApiField("cover_image_id")
	private String coverImageId;

	/**
	 * 头图素材type；
枚举（PICTURE/VIDEO）
	 */
	@ApiField("cover_image_type")
	private String coverImageType;

	/**
	 * 头图链接
	 */
	@ApiField("cover_image_url")
	private String coverImageUrl;

	/**
	 * 作品集id
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 作品集标题
	 */
	@ApiField("portfolio_title")
	private String portfolioTitle;

    /**
     * Gets cover image id.
     *
     * @return the cover image id
     */
    public String getCoverImageId() {
		return this.coverImageId;
	}

    /**
     * Sets cover image id.
     *
     * @param coverImageId the cover image id
     */
    public void setCoverImageId(String coverImageId) {
		this.coverImageId = coverImageId;
	}

    /**
     * Gets cover image type.
     *
     * @return the cover image type
     */
    public String getCoverImageType() {
		return this.coverImageType;
	}

    /**
     * Sets cover image type.
     *
     * @param coverImageType the cover image type
     */
    public void setCoverImageType(String coverImageType) {
		this.coverImageType = coverImageType;
	}

    /**
     * Gets cover image url.
     *
     * @return the cover image url
     */
    public String getCoverImageUrl() {
		return this.coverImageUrl;
	}

    /**
     * Sets cover image url.
     *
     * @param coverImageUrl the cover image url
     */
    public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

    /**
     * Gets portfolio id.
     *
     * @return the portfolio id
     */
    public String getPortfolioId() {
		return this.portfolioId;
	}

    /**
     * Sets portfolio id.
     *
     * @param portfolioId the portfolio id
     */
    public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

    /**
     * Gets portfolio title.
     *
     * @return the portfolio title
     */
    public String getPortfolioTitle() {
		return this.portfolioTitle;
	}

    /**
     * Sets portfolio title.
     *
     * @param portfolioTitle the portfolio title
     */
    public void setPortfolioTitle(String portfolioTitle) {
		this.portfolioTitle = portfolioTitle;
	}

}
