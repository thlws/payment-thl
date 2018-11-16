package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.code.create response.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:34:41
 */
public class AlipayMobileCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2871997897432586661L;

	/** 
	 * 业务关联的id，如订单号,userId
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/** 
	 * 业务类型，类型产品名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 码值状态，
init:初始
normal:正常
pause:暂停
stop:停止
	 */
	@ApiField("code_status")
	private String codeStatus;

	/** 
	 * 发码接口传入的扩展参数，业务自定义,码平台不用理解。
	 */
	@ApiField("context_str")
	private String contextStr;

	/** 
	 * 动态生成图片地址
	 */
	@ApiField("dynamic_img_url")
	private String dynamicImgUrl;

	/** 
	 * 编码失效时间(yyyy-MM-dd hh:mm:ss)
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 如果是true，则扫一扫下发跳转地址直接取自BizLinkedId
否则，从路由信息里取跳转地址
	 */
	@ApiField("is_direct")
	private String isDirect;

	/** 
	 * 备注信息字段
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 业务用到的码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 原始码值
	 */
	@ApiField("qr_token")
	private String qrToken;

	/** 
	 * 发码来源，业务自定义
	 */
	@ApiField("source_id")
	private String sourceId;

	/** 
	 * 编码启动时间（yyy-MM-dd hh:mm:ss），为空表示立即启用
	 */
	@ApiField("start_date")
	private Date startDate;

	/** 
	 * 发码请求中带的支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets biz linked id.
     *
     * @param bizLinkedId the biz linked id
     */
    public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

    /**
     * Gets biz linked id.
     *
     * @return the biz linked id
     */
    public String getBizLinkedId( ) {
		return this.bizLinkedId;
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
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets code status.
     *
     * @param codeStatus the code status
     */
    public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

    /**
     * Gets code status.
     *
     * @return the code status
     */
    public String getCodeStatus( ) {
		return this.codeStatus;
	}

    /**
     * Sets context str.
     *
     * @param contextStr the context str
     */
    public void setContextStr(String contextStr) {
		this.contextStr = contextStr;
	}

    /**
     * Gets context str.
     *
     * @return the context str
     */
    public String getContextStr( ) {
		return this.contextStr;
	}

    /**
     * Sets dynamic img url.
     *
     * @param dynamicImgUrl the dynamic img url
     */
    public void setDynamicImgUrl(String dynamicImgUrl) {
		this.dynamicImgUrl = dynamicImgUrl;
	}

    /**
     * Gets dynamic img url.
     *
     * @return the dynamic img url
     */
    public String getDynamicImgUrl( ) {
		return this.dynamicImgUrl;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public String getExpireDate( ) {
		return this.expireDate;
	}

    /**
     * Sets is direct.
     *
     * @param isDirect the is direct
     */
    public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}

    /**
     * Gets is direct.
     *
     * @return the is direct
     */
    public String getIsDirect( ) {
		return this.isDirect;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
	}

    /**
     * Sets qr code.
     *
     * @param qrCode the qr code
     */
    public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

    /**
     * Gets qr code.
     *
     * @return the qr code
     */
    public String getQrCode( ) {
		return this.qrCode;
	}

    /**
     * Sets qr token.
     *
     * @param qrToken the qr token
     */
    public void setQrToken(String qrToken) {
		this.qrToken = qrToken;
	}

    /**
     * Gets qr token.
     *
     * @return the qr token
     */
    public String getQrToken( ) {
		return this.qrToken;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId( ) {
		return this.sourceId;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate( ) {
		return this.startDate;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
