package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发布物业通知公告
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:18:37
 */
public class AlipayEcoCplifeNoticePublishModel extends AlipayObject {

	private static final long serialVersionUID = 3624925414987944727L;

	/**
	 * 待发布通知的目标物业小区ID列表，使用支付宝平台统一的小区ID编码。
	 */
	@ApiListField("community_id_set")
	@ApiField("string")
	private List<String> communityIdSet;

	/**
	 * 待发送的通知内容
	 */
	@ApiField("notice_details")
	private CplifeNoticeDetail noticeDetails;

    /**
     * Gets community id set.
     *
     * @return the community id set
     */
    public List<String> getCommunityIdSet() {
		return this.communityIdSet;
	}

    /**
     * Sets community id set.
     *
     * @param communityIdSet the community id set
     */
    public void setCommunityIdSet(List<String> communityIdSet) {
		this.communityIdSet = communityIdSet;
	}

    /**
     * Gets notice details.
     *
     * @return the notice details
     */
    public CplifeNoticeDetail getNoticeDetails() {
		return this.noticeDetails;
	}

    /**
     * Sets notice details.
     *
     * @param noticeDetails the notice details
     */
    public void setNoticeDetails(CplifeNoticeDetail noticeDetails) {
		this.noticeDetails = noticeDetails;
	}

}
