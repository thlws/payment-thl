package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约PID查询
 *
 * @author auto create
 * @since 1.0, 2017-07-25 16:18:09
 */
public class AlipayMarketingUserulePidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7229581746872735577L;

	/**
	 * 合作伙伴ID，传入ID比如与当前APPID所属合作伙伴ID一致，否则会报权限不足
	 */
	@ApiField("pid")
	private String pid;

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

}
