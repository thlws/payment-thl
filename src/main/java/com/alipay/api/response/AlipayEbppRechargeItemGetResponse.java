package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItermInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.item.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:09:25
 */
public class AlipayEbppRechargeItemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183549956687487251L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 系统返回错误码
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 充值面额状态对象list
	 */
	@ApiListField("iterm_infos")
	@ApiField("iterm_info")
	private List<ItermInfo> itermInfos;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

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
     * Sets iterm infos.
     *
     * @param itermInfos the iterm infos
     */
    public void setItermInfos(List<ItermInfo> itermInfos) {
		this.itermInfos = itermInfos;
	}

    /**
     * Gets iterm infos.
     *
     * @return the iterm infos
     */
    public List<ItermInfo> getItermInfos( ) {
		return this.itermInfos;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
