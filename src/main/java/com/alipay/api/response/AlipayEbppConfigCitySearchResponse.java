package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.config.city.search response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:14:34
 */
public class AlipayEbppConfigCitySearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783964751597599948L;

	/** 
	 * 接口主要输出参数列表: AreaInfoResult{List{ areaInfo：{province, cityList<String>}} }
	 */
	@ApiListField("area_info_result")
	@ApiField("area_info")
	private List<AreaInfo> areaInfoResult;

    /**
     * Sets area info result.
     *
     * @param areaInfoResult the area info result
     */
    public void setAreaInfoResult(List<AreaInfo> areaInfoResult) {
		this.areaInfoResult = areaInfoResult;
	}

    /**
     * Gets area info result.
     *
     * @return the area info result
     */
    public List<AreaInfo> getAreaInfoResult( ) {
		return this.areaInfoResult;
	}

}
