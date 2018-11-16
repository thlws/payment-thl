package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重新设置绑定商家会员号
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:26:40
 */
public class AlipayOpenPublicAccountResetModel extends AlipayObject {

	private static final long serialVersionUID = 7866369899366792726L;

	/**
	 * 需要重置的协议号，商户会员在支付宝服务窗账号中的唯一标识
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 要绑定的商户会员的真实姓名，最长10个汉字
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 备注信息，开发者可以通过该字段纪录其他的额外信息
	 */
	@ApiField("remark")
	private String remark;

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets bind account no.
     *
     * @return the bind account no
     */
    public String getBindAccountNo() {
		return this.bindAccountNo;
	}

    /**
     * Sets bind account no.
     *
     * @param bindAccountNo the bind account no
     */
    public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
		return this.displayName;
	}

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

    /**
     * Gets from user id.
     *
     * @return the from user id
     */
    public String getFromUserId() {
		return this.fromUserId;
	}

    /**
     * Sets from user id.
     *
     * @param fromUserId the from user id
     */
    public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

    /**
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName() {
		return this.realName;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

}
