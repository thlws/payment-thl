package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关系信息
 *
 * @author auto create
 * @since 1.0, 2017-11-29 18:04:35
 */
public class RelationInfo extends AlipayObject {

	private static final long serialVersionUID = 8642836317596291124L;

	/**
	 * 关系新鲜度，如V_CT_RL30D（最近30天有联系）详细描述见产品文档。
	 */
	@ApiField("recency")
	private String recency;

    /**
     * Gets recency.
     *
     * @return the recency
     */
    public String getRecency() {
		return this.recency;
	}

    /**
     * Sets recency.
     *
     * @param recency the recency
     */
    public void setRecency(String recency) {
		this.recency = recency;
	}

}
