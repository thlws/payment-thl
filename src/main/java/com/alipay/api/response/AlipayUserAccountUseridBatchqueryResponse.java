package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.userid.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 21:37:53
 */
public class AlipayUserAccountUseridBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3621873898271725869L;

	/** 
	 * 用户列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

    /**
     * Sets user id list.
     *
     * @param userIdList the user id list
     */
    public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

    /**
     * Gets user id list.
     *
     * @return the user id list
     */
    public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
