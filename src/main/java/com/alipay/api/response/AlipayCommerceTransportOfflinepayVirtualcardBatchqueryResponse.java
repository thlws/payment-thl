package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayQueryCardModelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.virtualcard.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-05-23 18:15:00
 */
public class AlipayCommerceTransportOfflinepayVirtualcardBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8783285544136364494L;

	/** 
	 * 虚拟卡信息查询结果列表
	 */
	@ApiListField("card_models")
	@ApiField("alipay_query_card_model_result")
	private List<AlipayQueryCardModelResult> cardModels;

	/** 
	 * 错误消息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务错误码
	 */
	@ApiField("sub_error_code")
	private String subErrorCode;

    /**
     * Sets card models.
     *
     * @param cardModels the card models
     */
    public void setCardModels(List<AlipayQueryCardModelResult> cardModels) {
		this.cardModels = cardModels;
	}

    /**
     * Gets card models.
     *
     * @return the card models
     */
    public List<AlipayQueryCardModelResult> getCardModels( ) {
		return this.cardModels;
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

}
