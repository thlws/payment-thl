package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InputFieldModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.config.product.search response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:11:05
 */
public class AlipayEbppConfigProductSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7353821898292878445L;

	/** 
	 * 出账机构简称例如杭州电力的简称为HZELECTRIC
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 销账机构英文简称
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/** 
	 * 错误码，查询失败的返回码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息描述，如参数不合法
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 输入域模型列表inputFieldList
	 */
	@ApiListField("input_field_list")
	@ApiField("input_field_model")
	private List<InputFieldModel> inputFieldList;

	/** 
	 * 是否成功，true或者false
	 */
	@ApiField("is_success")
	private String isSuccess;

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst( ) {
		return this.chargeInst;
	}

    /**
     * Sets chargeoff inst.
     *
     * @param chargeoffInst the chargeoff inst
     */
    public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

    /**
     * Gets chargeoff inst.
     *
     * @return the chargeoff inst
     */
    public String getChargeoffInst( ) {
		return this.chargeoffInst;
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
     * Sets input field list.
     *
     * @param inputFieldList the input field list
     */
    public void setInputFieldList(List<InputFieldModel> inputFieldList) {
		this.inputFieldList = inputFieldList;
	}

    /**
     * Gets input field list.
     *
     * @return the input field list
     */
    public List<InputFieldModel> getInputFieldList( ) {
		return this.inputFieldList;
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
