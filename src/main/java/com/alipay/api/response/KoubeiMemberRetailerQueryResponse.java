package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Retailer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.retailer.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-12 10:59:05
 */
public class KoubeiMemberRetailerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6627566845517789463L;

	/** 
	 * 零售商信息列表
	 */
	@ApiListField("retailer_list")
	@ApiField("retailer")
	private List<Retailer> retailerList;

    /**
     * Sets retailer list.
     *
     * @param retailerList the retailer list
     */
    public void setRetailerList(List<Retailer> retailerList) {
		this.retailerList = retailerList;
	}

    /**
     * Gets retailer list.
     *
     * @return the retailer list
     */
    public List<Retailer> getRetailerList( ) {
		return this.retailerList;
	}

}
