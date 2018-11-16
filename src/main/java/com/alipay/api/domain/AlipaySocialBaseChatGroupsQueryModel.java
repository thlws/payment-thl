package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询加入的群列表
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:36
 */
public class AlipaySocialBaseChatGroupsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6185411451141653142L;

	/**
	 * 上次接口返回的key，初始传0
	 */
	@ApiField("last_key")
	private Long lastKey;

    /**
     * Gets last key.
     *
     * @return the last key
     */
    public Long getLastKey() {
		return this.lastKey;
	}

    /**
     * Sets last key.
     *
     * @param lastKey the last key
     */
    public void setLastKey(Long lastKey) {
		this.lastKey = lastKey;
	}

}
