package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发券接口
 *
 * @author auto create
 * @since 1.0, 2018-06-20 18:11:01
 */
public class AlipayMarketingVoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 7682763966499147989L;

	/**
	 * 券金额。浮点数，格式为#.00，单位是元。红包发放时填写，其它情形不能填
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝登录ID，手机或邮箱 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 发券备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务订单号，用于幂等控制，相同template_id和out_biz_no认为是同一次业务
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 淘宝昵称 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
	 */
	@ApiField("taobao_nick")
	private String taobaoNick;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

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
     * Gets taobao nick.
     *
     * @return the taobao nick
     */
    public String getTaobaoNick() {
		return this.taobaoNick;
	}

    /**
     * Sets taobao nick.
     *
     * @param taobaoNick the taobao nick
     */
    public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
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
