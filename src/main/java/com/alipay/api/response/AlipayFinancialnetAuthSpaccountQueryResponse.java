package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-04 15:05:00
 */
public class AlipayFinancialnetAuthSpaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3169771338557268935L;

	/** 
	 * 机构专户信息列表
	 */
	@ApiListField("account_info")
	@ApiField("sp_account_info")
	private List<SpAccountInfo> accountInfo;

	/** 
	 * 调用finauth服务失败时返回的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 调用finauth失败时返回的错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 调用finauth查询机构专户信息是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

    /**
     * Sets account info.
     *
     * @param accountInfo the account info
     */
    public void setAccountInfo(List<SpAccountInfo> accountInfo) {
		this.accountInfo = accountInfo;
	}

    /**
     * Gets account info.
     *
     * @return the account info
     */
    public List<SpAccountInfo> getAccountInfo( ) {
		return this.accountInfo;
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
    public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

    /**
     * Gets is success.
     *
     * @return the is success
     */
    public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
