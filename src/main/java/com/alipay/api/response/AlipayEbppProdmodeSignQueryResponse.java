package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignResultValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.sign.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:54:55
 */
public class AlipayEbppProdmodeSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1383296599861491388L;

	/** 
	 * 返回签约信息数据对象，主要包含:产品编码、产品版本、生效时间、到期时间等
	 */
	@ApiListField("data_list")
	@ApiField("sign_result_value")
	private List<SignResultValue> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<SignResultValue> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<SignResultValue> getDataList( ) {
		return this.dataList;
	}

}
