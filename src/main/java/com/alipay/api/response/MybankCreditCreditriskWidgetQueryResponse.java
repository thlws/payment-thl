package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.widget.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-07 11:52:45
 */
public class MybankCreditCreditriskWidgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3133868243723889469L;

	/** 
	 * widget json数据
	 */
	@ApiField("widgetjson")
	private String widgetjson;

    /**
     * Sets widgetjson.
     *
     * @param widgetjson the widgetjson
     */
    public void setWidgetjson(String widgetjson) {
		this.widgetjson = widgetjson;
	}

    /**
     * Gets widgetjson.
     *
     * @return the widgetjson
     */
    public String getWidgetjson( ) {
		return this.widgetjson;
	}

}
