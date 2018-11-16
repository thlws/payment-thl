package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 唤起凤蝶H5编辑器
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:15:43
 */
public class AlipayMarketingToolFengdieEditorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6666774384841721773L;

	/**
	 * 凤蝶H5应用唯一id，通过alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 在凤蝶编辑器中点击“发布”按钮后，如果发布成功则跳转到该地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public Long getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
		return this.redirectUrl;
	}

    /**
     * Sets redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
