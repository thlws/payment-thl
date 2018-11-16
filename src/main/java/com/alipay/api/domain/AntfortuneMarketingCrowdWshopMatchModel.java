package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人群匹配
 *
 * @author auto create
 * @since 1.0, 2017-08-11 17:34:49
 */
public class AntfortuneMarketingCrowdWshopMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4634431819566939954L;

	/**
	 * 财富号机构自建人群id，应用于财富号机构人群匹配。财富号合作机构通过财富号后台创建人群后获得人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 蚂蚁统一会员ID，通过alipay.user.info.share接口获取
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets crowd id.
     *
     * @return the crowd id
     */
    public String getCrowdId() {
		return this.crowdId;
	}

    /**
     * Sets crowd id.
     *
     * @param crowdId the crowd id
     */
    public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
