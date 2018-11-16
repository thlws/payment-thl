package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡删卡
 *
 * @author auto create
 * @since 1.0, 2018-01-16 19:03:12
 */
public class AlipayMarketingCardDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2842173523363216959L;

	/**
	 * 删卡扩展参数，json格式。
用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
目前支持如下key：
new_card_no：新卡号
donee_user_id：受赠人userId
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户端删卡业务流水号（商户确保流水号唯一性）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 删卡原因
USER_UNBUND：用户解绑（可以重新绑定）
CANCEL：销户（完成销户后，就不能再重新绑定）
PRESENT：转赠（可以重新绑定）
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
BIZ_CARD：支付宝卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets out serial no.
     *
     * @return the out serial no
     */
    public String getOutSerialNo() {
		return this.outSerialNo;
	}

    /**
     * Sets out serial no.
     *
     * @param outSerialNo the out serial no
     */
    public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

    /**
     * Gets reason code.
     *
     * @return the reason code
     */
    public String getReasonCode() {
		return this.reasonCode;
	}

    /**
     * Sets reason code.
     *
     * @param reasonCode the reason code
     */
    public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

    /**
     * Gets target card no.
     *
     * @return the target card no
     */
    public String getTargetCardNo() {
		return this.targetCardNo;
	}

    /**
     * Sets target card no.
     *
     * @param targetCardNo the target card no
     */
    public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

    /**
     * Gets target card no type.
     *
     * @return the target card no type
     */
    public String getTargetCardNoType() {
		return this.targetCardNoType;
	}

    /**
     * Sets target card no type.
     *
     * @param targetCardNoType the target card no type
     */
    public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
