package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.virtualcard.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-30 16:23:55
 */
public class AlipayCommerceTransportOfflinepayVirtualcardSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4673769337674242658L;

	/** 
	 * 用户虚拟卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 卡片跳转地址
	 */
	@ApiField("card_schema")
	private String cardSchema;

	/** 
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 请求失败时的错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 请求失败时返回的子错误码信息
	 */
	@ApiField("sub_error_code")
	private String subErrorCode;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo( ) {
		return this.cardNo;
	}

    /**
     * Sets card schema.
     *
     * @param cardSchema the card schema
     */
    public void setCardSchema(String cardSchema) {
		this.cardSchema = cardSchema;
	}

    /**
     * Gets card schema.
     *
     * @return the card schema
     */
    public String getCardSchema( ) {
		return this.cardSchema;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType( ) {
		return this.cardType;
	}

    /**
     * Sets error message.
     *
     * @param errorMessage the error message
     */
    public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage( ) {
		return this.errorMessage;
	}

    /**
     * Sets sub error code.
     *
     * @param subErrorCode the sub error code
     */
    public void setSubErrorCode(String subErrorCode) {
		this.subErrorCode = subErrorCode;
	}

    /**
     * Gets sub error code.
     *
     * @return the sub error code
     */
    public String getSubErrorCode( ) {
		return this.subErrorCode;
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
