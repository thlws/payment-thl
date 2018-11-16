package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExClientRateVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.allclientrate.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-20 21:30:01
 */
public class AlipayAccountExrateAllclientrateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3733756482477645986L;

	/** 
	 * 汇率信息列表
	 */
	@ApiListField("client_rate_list")
	@ApiField("ex_client_rate_v_o")
	private List<ExClientRateVO> clientRateList;

    /**
     * Sets client rate list.
     *
     * @param clientRateList the client rate list
     */
    public void setClientRateList(List<ExClientRateVO> clientRateList) {
		this.clientRateList = clientRateList;
	}

    /**
     * Gets client rate list.
     *
     * @return the client rate list
     */
    public List<ExClientRateVO> getClientRateList( ) {
		return this.clientRateList;
	}

}
