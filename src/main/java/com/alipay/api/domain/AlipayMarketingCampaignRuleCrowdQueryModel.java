package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人规则详情查询
 *
 * @author auto create
 * @since 1.0, 2016-12-19 15:27:43
 */
public class AlipayMarketingCampaignRuleCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5462973327834624958L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 所要查询的规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

    /**
     * Gets mpid.
     *
     * @return the mpid
     */
    public String getMpid() {
		return this.mpid;
	}

    /**
     * Sets mpid.
     *
     * @param mpid the mpid
     */
    public void setMpid(String mpid) {
		this.mpid = mpid;
	}

    /**
     * Gets ruleid.
     *
     * @return the ruleid
     */
    public String getRuleid() {
		return this.ruleid;
	}

    /**
     * Sets ruleid.
     *
     * @param ruleid the ruleid
     */
    public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

}
