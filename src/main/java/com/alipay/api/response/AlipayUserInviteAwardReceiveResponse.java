package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.award.receive response.
 *
 * @author auto create
 * @since 1.0, 2018-06-19 16:31:34
 */
public class AlipayUserInviteAwardReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3633223798463582485L;

	/** 
	 * 支付宝老用户手机号绑定的脱敏后的账户名 ，多个账号用英文","分割
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/** 
	 * 业务处理结果码（NEW_ALREADY_AWARD:新用户凭证已发放、
NEW_AWARD_SUCESS：新用户凭证发放成功、OLD_AWARD_SUCCESS：老用户凭证成功、OLD_AWARD_OVER_LIMIT：老用户凭证发放次数超过上限、ACTIVITY_CLOSE：活动已结束、ACTIVITY_PAUSE：活动临时暂停）
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 业务结果码对应的中文描述，见业务结果码描述
	 */
	@ApiField("biz_result_desc")
	private String bizResultDesc;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 用户输入的手机号回传
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户新老属性（NEW：新用户，OLD：老用户）
	 */
	@ApiField("user_attr")
	private String userAttr;

    /**
     * Sets alipay account no.
     *
     * @param alipayAccountNo the alipay account no
     */
    public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}

    /**
     * Gets alipay account no.
     *
     * @return the alipay account no
     */
    public String getAlipayAccountNo( ) {
		return this.alipayAccountNo;
	}

    /**
     * Sets biz result code.
     *
     * @param bizResultCode the biz result code
     */
    public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}

    /**
     * Gets biz result code.
     *
     * @return the biz result code
     */
    public String getBizResultCode( ) {
		return this.bizResultCode;
	}

    /**
     * Sets biz result desc.
     *
     * @param bizResultDesc the biz result desc
     */
    public void setBizResultDesc(String bizResultDesc) {
		this.bizResultDesc = bizResultDesc;
	}

    /**
     * Gets biz result desc.
     *
     * @return the biz result desc
     */
    public String getBizResultDesc( ) {
		return this.bizResultDesc;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile( ) {
		return this.mobile;
	}

    /**
     * Sets user attr.
     *
     * @param userAttr the user attr
     */
    public void setUserAttr(String userAttr) {
		this.userAttr = userAttr;
	}

    /**
     * Gets user attr.
     *
     * @return the user attr
     */
    public String getUserAttr( ) {
		return this.userAttr;
	}

}
