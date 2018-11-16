package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArrangementVORes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.arrangement.common.query response.
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:43
 */
public class AntProdpaasArrangementCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2381197159954674754L;

	/** 
	 * 合约信息标准VO，一条合约一个记录
	 */
	@ApiListField("arrangements")
	@ApiField("arrangement_v_o_res")
	private List<ArrangementVORes> arrangements;

    /**
     * Sets arrangements.
     *
     * @param arrangements the arrangements
     */
    public void setArrangements(List<ArrangementVORes> arrangements) {
		this.arrangements = arrangements;
	}

    /**
     * Gets arrangements.
     *
     * @return the arrangements
     */
    public List<ArrangementVORes> getArrangements( ) {
		return this.arrangements;
	}

}
