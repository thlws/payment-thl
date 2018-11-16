package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.userblacklist.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-04 17:13:07
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833553321618963751L;

	/** 
	 * 黑名单用户ID
	 */
	@ApiListField("black_list")
	@ApiField("string")
	private List<String> blackList;

    /**
     * Sets black list.
     *
     * @param blackList the black list
     */
    public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

    /**
     * Gets black list.
     *
     * @return the black list
     */
    public List<String> getBlackList( ) {
		return this.blackList;
	}

}
