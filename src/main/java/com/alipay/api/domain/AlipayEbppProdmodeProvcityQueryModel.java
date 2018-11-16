package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询省市地区接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:41
 */
public class AlipayEbppProdmodeProvcityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4163492968851736371L;

	/**
	 * 省市编号
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 查询类型，queryType=1,查询省下面的市信息
	 */
	@ApiField("query_type")
	private String queryType;

    /**
     * Gets adcode.
     *
     * @return the adcode
     */
    public String getAdcode() {
		return this.adcode;
	}

    /**
     * Sets adcode.
     *
     * @param adcode the adcode
     */
    public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

    /**
     * Gets query type.
     *
     * @return the query type
     */
    public String getQueryType() {
		return this.queryType;
	}

    /**
     * Sets query type.
     *
     * @param queryType the query type
     */
    public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
