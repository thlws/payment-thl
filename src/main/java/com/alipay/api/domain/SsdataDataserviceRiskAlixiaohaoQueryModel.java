package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里通信小号信息
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:38:27
 */
public class SsdataDataserviceRiskAlixiaohaoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2683943171835451114L;

	/**
	 * 电话号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
