package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察数据
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:13
 */
public class AlipayMarketingDataDeerConnectorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8244252963386188355L;

	/**
	 * 活动洞察数据查询标识
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 数据请求的参数，比如活动投放日期、投放渠道等信息
	 */
	@ApiField("params")
	private String params;

    /**
     * Gets connector id.
     *
     * @return the connector id
     */
    public String getConnectorId() {
		return this.connectorId;
	}

    /**
     * Sets connector id.
     *
     * @param connectorId the connector id
     */
    public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

    /**
     * Gets params.
     *
     * @return the params
     */
    public String getParams() {
		return this.params;
	}

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(String params) {
		this.params = params;
	}

}
