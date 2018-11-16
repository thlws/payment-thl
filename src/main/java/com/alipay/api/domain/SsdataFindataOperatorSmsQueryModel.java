package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取运营商短信验证码
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:23
 */
public class SsdataFindataOperatorSmsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6226464193483886268L;

	/**
	 * 系统的业务流水号，在调用提交用户信息时得到的biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
