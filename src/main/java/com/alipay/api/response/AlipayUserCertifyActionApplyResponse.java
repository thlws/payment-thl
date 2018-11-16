package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.action.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-03-14 14:51:52
 */
public class AlipayUserCertifyActionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1737933948555185677L;

	/** 
	 * 返回给商户的支付宝业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

}
