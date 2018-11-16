package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞猪内容对接内容撤回接口
 *
 * @author auto create
 * @since 1.0, 2017-12-21 11:12:43
 */
public class AlipayOverseasTravelContentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5131568754772427978L;

	/**
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 修改时间
	 */
	@ApiField("modified_date")
	private Long modifiedDate;

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
     * Gets modified date.
     *
     * @return the modified date
     */
    public Long getModifiedDate() {
		return this.modifiedDate;
	}

    /**
     * Sets modified date.
     *
     * @param modifiedDate the modified date
     */
    public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
