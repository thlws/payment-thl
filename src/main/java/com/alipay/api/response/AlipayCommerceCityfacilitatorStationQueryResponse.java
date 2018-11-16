package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StationDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.station.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayCommerceCityfacilitatorStationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4617971624347164438L;

	/** 
	 * 支持设为起点的站点列表
	 */
	@ApiListField("support_starts")
	@ApiField("station_detail_info")
	private List<StationDetailInfo> supportStarts;

    /**
     * Sets support starts.
     *
     * @param supportStarts the support starts
     */
    public void setSupportStarts(List<StationDetailInfo> supportStarts) {
		this.supportStarts = supportStarts;
	}

    /**
     * Gets support starts.
     *
     * @return the support starts
     */
    public List<StationDetailInfo> getSupportStarts( ) {
		return this.supportStarts;
	}

}
