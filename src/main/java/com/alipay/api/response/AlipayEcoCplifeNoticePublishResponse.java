package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1343134854273433389L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

    /**
     * Sets notice id.
     *
     * @param noticeId the notice id
     */
    public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

    /**
     * Gets notice id.
     *
     * @return the notice id
     */
    public String getNoticeId( ) {
		return this.noticeId;
	}

}
