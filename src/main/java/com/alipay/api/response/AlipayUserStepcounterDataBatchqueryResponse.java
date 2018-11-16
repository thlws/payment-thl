package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StepcounterDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.stepcounter.data.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:39:54
 */
public class AlipayUserStepcounterDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4629472847862654915L;

	/** 
	 * 查询到的用户日计步信息
	 */
	@ApiListField("step_info")
	@ApiField("stepcounter_data_info")
	private List<StepcounterDataInfo> stepInfo;

    /**
     * Sets step info.
     *
     * @param stepInfo the step info
     */
    public void setStepInfo(List<StepcounterDataInfo> stepInfo) {
		this.stepInfo = stepInfo;
	}

    /**
     * Gets step info.
     *
     * @return the step info
     */
    public List<StepcounterDataInfo> getStepInfo( ) {
		return this.stepInfo;
	}

}
