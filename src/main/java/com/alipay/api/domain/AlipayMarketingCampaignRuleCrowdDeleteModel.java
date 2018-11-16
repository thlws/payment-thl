package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除圈人规则
 *
 * @author auto create
 * @since 1.0, 2016-12-12 17:43:21
 */
public class AlipayMarketingCampaignRuleCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5233376318959386497L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 对没有在使用的规则进行删除
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
