package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppBillKey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.billkey.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 14:55:00
 */
public class AlipayEbppCommonBillkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7158172526922741238L;

	/** 
	 * 户号列表
	 */
	@ApiListField("bill_key_list")
	@ApiField("ebpp_bill_key")
	private List<EbppBillKey> billKeyList;

    /**
     * Sets bill key list.
     *
     * @param billKeyList the bill key list
     */
    public void setBillKeyList(List<EbppBillKey> billKeyList) {
		this.billKeyList = billKeyList;
	}

    /**
     * Gets bill key list.
     *
     * @return the bill key list
     */
    public List<EbppBillKey> getBillKeyList( ) {
		return this.billKeyList;
	}

}
