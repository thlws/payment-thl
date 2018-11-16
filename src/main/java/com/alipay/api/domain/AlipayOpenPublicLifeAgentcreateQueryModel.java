package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv代创建生活号申请状态查询接口
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:16:11
 */
public class AlipayOpenPublicLifeAgentcreateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4744215211863211434L;

	/**
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
