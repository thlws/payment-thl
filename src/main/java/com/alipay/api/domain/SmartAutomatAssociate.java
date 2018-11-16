package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机合作伙伴信息
 *
 * @author auto create
 * @since 1.0, 2018-06-22 15:45:40
 */
public class SmartAutomatAssociate extends AlipayObject {

	private static final long serialVersionUID = 6477946251321985868L;

	/**
	 * 合作伙伴类型
DISTRIBUTORS:渠道商
	 */
	@ApiField("associate_type")
	private String associateType;

	/**
	 * 合作伙伴的支付宝账号ID
	 */
	@ApiField("associate_user_id")
	private String associateUserId;

    /**
     * Gets associate type.
     *
     * @return the associate type
     */
    public String getAssociateType() {
		return this.associateType;
	}

    /**
     * Sets associate type.
     *
     * @param associateType the associate type
     */
    public void setAssociateType(String associateType) {
		this.associateType = associateType;
	}

    /**
     * Gets associate user id.
     *
     * @return the associate user id
     */
    public String getAssociateUserId() {
		return this.associateUserId;
	}

    /**
     * Sets associate user id.
     *
     * @param associateUserId the associate user id
     */
    public void setAssociateUserId(String associateUserId) {
		this.associateUserId = associateUserId;
	}

}
