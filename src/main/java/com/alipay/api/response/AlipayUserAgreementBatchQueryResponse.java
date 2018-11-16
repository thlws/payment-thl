package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiSignQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.batch.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 16:52:20
 */
public class AlipayUserAgreementBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8557443852626153146L;

	/** 
	 * 用户签约协议列表
	 */
	@ApiListField("usage_agreement_info_list")
	@ApiField("open_api_sign_query_response")
	private List<OpenApiSignQueryResponse> usageAgreementInfoList;

    /**
     * Sets usage agreement info list.
     *
     * @param usageAgreementInfoList the usage agreement info list
     */
    public void setUsageAgreementInfoList(List<OpenApiSignQueryResponse> usageAgreementInfoList) {
		this.usageAgreementInfoList = usageAgreementInfoList;
	}

    /**
     * Gets usage agreement info list.
     *
     * @return the usage agreement info list
     */
    public List<OpenApiSignQueryResponse> getUsageAgreementInfoList( ) {
		return this.usageAgreementInfoList;
	}

}
