package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-15 15:49:05
 */
public class AlipaySecurityRiskVerifyidentityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6585465484747237588L;

	/** 
	 * 可用性查询失败错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 核身可用性查询错误描述
	 */
	@ApiField("err_message")
	private String errMessage;

	/** 
	 * 系统是否处理成功，true表示系统成功处理，false表示系统异常，系统处理成功不表示业务成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 不可用产品集合
	 */
	@ApiField("unusable_product_list")
	private String unusableProductList;

	/** 
	 * 可用产品集合
	 */
	@ApiField("usable_product_group")
	private String usableProductGroup;

    /**
     * Sets err code.
     *
     * @param errCode the err code
     */
    public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

    /**
     * Gets err code.
     *
     * @return the err code
     */
    public String getErrCode( ) {
		return this.errCode;
	}

    /**
     * Sets err message.
     *
     * @param errMessage the err message
     */
    public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

    /**
     * Gets err message.
     *
     * @return the err message
     */
    public String getErrMessage( ) {
		return this.errMessage;
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

    /**
     * Sets unusable product list.
     *
     * @param unusableProductList the unusable product list
     */
    public void setUnusableProductList(String unusableProductList) {
		this.unusableProductList = unusableProductList;
	}

    /**
     * Gets unusable product list.
     *
     * @return the unusable product list
     */
    public String getUnusableProductList( ) {
		return this.unusableProductList;
	}

    /**
     * Sets usable product group.
     *
     * @param usableProductGroup the usable product group
     */
    public void setUsableProductGroup(String usableProductGroup) {
		this.usableProductGroup = usableProductGroup;
	}

    /**
     * Gets usable product group.
     *
     * @return the usable product group
     */
    public String getUsableProductGroup( ) {
		return this.usableProductGroup;
	}

}
