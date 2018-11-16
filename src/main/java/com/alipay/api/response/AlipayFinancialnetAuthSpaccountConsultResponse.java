package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-01-17 17:14:08
 */
public class AlipayFinancialnetAuthSpaccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882473191571662334L;

	/** 
	 * 若已开户，则为脱敏后已开户登录号
	 */
	@ApiField("display_opened_account_logon_id")
	private String displayOpenedAccountLogonId;

	/** 
	 * 若调用finsign服务失败，返回错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 调用finsign业务失败时，返回的错误文案
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 若返回true说明调用finsign此服务成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 返回是否已开户，若为true则说明已开户
	 */
	@ApiField("opened_account")
	private Boolean openedAccount;

	/** 
	 * 已开专户的uid
	 */
	@ApiField("opened_account_user_id")
	private String openedAccountUserId;

    /**
     * Sets display opened account logon id.
     *
     * @param displayOpenedAccountLogonId the display opened account logon id
     */
    public void setDisplayOpenedAccountLogonId(String displayOpenedAccountLogonId) {
		this.displayOpenedAccountLogonId = displayOpenedAccountLogonId;
	}

    /**
     * Gets display opened account logon id.
     *
     * @return the display opened account logon id
     */
    public String getDisplayOpenedAccountLogonId( ) {
		return this.displayOpenedAccountLogonId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
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
     * Sets is success.
     *
     * @param isSuccess the is success
     */
    public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

    /**
     * Gets is success.
     *
     * @return the is success
     */
    public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

    /**
     * Sets opened account.
     *
     * @param openedAccount the opened account
     */
    public void setOpenedAccount(Boolean openedAccount) {
		this.openedAccount = openedAccount;
	}

    /**
     * Gets opened account.
     *
     * @return the opened account
     */
    public Boolean getOpenedAccount( ) {
		return this.openedAccount;
	}

    /**
     * Sets opened account user id.
     *
     * @param openedAccountUserId the opened account user id
     */
    public void setOpenedAccountUserId(String openedAccountUserId) {
		this.openedAccountUserId = openedAccountUserId;
	}

    /**
     * Gets opened account user id.
     *
     * @return the opened account user id
     */
    public String getOpenedAccountUserId( ) {
		return this.openedAccountUserId;
	}

}
