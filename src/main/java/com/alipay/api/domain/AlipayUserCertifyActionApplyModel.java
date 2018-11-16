package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化认证信息
 *
 * @author auto create
 * @since 1.0, 2018-03-14 14:51:52
 */
public class AlipayUserCertifyActionApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1567323621648521166L;

	/**
	 * 表示申请认证信息的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户和支付宝交互时，用于代表申请认证信息的商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
