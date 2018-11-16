package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计数信息
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:03
 */
public class CountInfo extends AlipayObject {

	private static final long serialVersionUID = 4391378364771289179L;

	/**
	 * 飞猪内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 点赞数
	 */
	@ApiField("support_count")
	private Long supportCount;

	/**
	 * 阅读数
	 */
	@ApiField("total_page_view_count")
	private Long totalPageViewCount;

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
     * Gets support count.
     *
     * @return the support count
     */
    public Long getSupportCount() {
		return this.supportCount;
	}

    /**
     * Sets support count.
     *
     * @param supportCount the support count
     */
    public void setSupportCount(Long supportCount) {
		this.supportCount = supportCount;
	}

    /**
     * Gets total page view count.
     *
     * @return the total page view count
     */
    public Long getTotalPageViewCount() {
		return this.totalPageViewCount;
	}

    /**
     * Sets total page view count.
     *
     * @param totalPageViewCount the total page view count
     */
    public void setTotalPageViewCount(Long totalPageViewCount) {
		this.totalPageViewCount = totalPageViewCount;
	}

}
