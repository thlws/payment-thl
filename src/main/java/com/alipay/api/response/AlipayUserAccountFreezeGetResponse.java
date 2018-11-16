package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountFreeze;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.freeze.get response.
 *
 * @author auto create
 * @since 1.0, 2016-08-11 15:48:05
 */
public class AlipayUserAccountFreezeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8493299133135742915L;

	/** 
	 * 冻结金额列表
	 */
	@ApiListField("freeze_items")
	@ApiField("account_freeze")
	private List<AccountFreeze> freezeItems;

	/** 
	 * 冻结总条数
	 */
	@ApiField("total_results")
	private String totalResults;

    /**
     * Sets freeze items.
     *
     * @param freezeItems the freeze items
     */
    public void setFreezeItems(List<AccountFreeze> freezeItems) {
		this.freezeItems = freezeItems;
	}

    /**
     * Gets freeze items.
     *
     * @return the freeze items
     */
    public List<AccountFreeze> getFreezeItems( ) {
		return this.freezeItems;
	}

    /**
     * Sets total results.
     *
     * @param totalResults the total results
     */
    public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

    /**
     * Gets total results.
     *
     * @return the total results
     */
    public String getTotalResults( ) {
		return this.totalResults;
	}

}
