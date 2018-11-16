package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundDetailItemAOPModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.funditem.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 15:20:18
 */
public class AlipayUserFunditemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2692157811894366976L;

	/** 
	 * 查询得到的消费记录详细信息（主记录+资金明细列表）
	 */
	@ApiField("fund_detail_item_aopmodel")
	private FundDetailItemAOPModel fundDetailItemAopmodel;

    /**
     * Sets fund detail item aopmodel.
     *
     * @param fundDetailItemAopmodel the fund detail item aopmodel
     */
    public void setFundDetailItemAopmodel(FundDetailItemAOPModel fundDetailItemAopmodel) {
		this.fundDetailItemAopmodel = fundDetailItemAopmodel;
	}

    /**
     * Gets fund detail item aopmodel.
     *
     * @return the fund detail item aopmodel
     */
    public FundDetailItemAOPModel getFundDetailItemAopmodel( ) {
		return this.fundDetailItemAopmodel;
	}

}
