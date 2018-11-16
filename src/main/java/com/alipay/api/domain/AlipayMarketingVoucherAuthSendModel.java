package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送资金券
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:27:25
 */
public class AlipayMarketingVoucherAuthSendModel extends AlipayObject {

	private static final long serialVersionUID = 2629798594843657422L;

	/**
	 * 外部业务订单号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 经过用户授权过后的发券码
	 */
	@ApiField("send_code")
	private String sendCode;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

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

    /**
     * Gets send code.
     *
     * @return the send code
     */
    public String getSendCode() {
		return this.sendCode;
	}

    /**
     * Sets send code.
     *
     * @param sendCode the send code
     */
    public void setSendCode(String sendCode) {
		this.sendCode = sendCode;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
