package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.create response.
 *
 * @author auto create
 * @since 1.0, 2017-04-11 14:04:51
 */
public class KoubeiAdvertCommissionMissionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5317629813921912667L;

	/** 
	 * 分佣任务ID，需要保存，后续任务管理以及任务认领都需要任务ID
1、如果商户创建分佣任务，则出参会返回任务ID
2、如果服务商代创建分佣任务，由于需要审批，因此出参不返回任务ID，而是需要通过任务查询接口（koubei.advert.commission.mission.query）获取
	 */
	@ApiField("mission_id")
	private String missionId;

    /**
     * Sets mission id.
     *
     * @param missionId the mission id
     */
    public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

    /**
     * Gets mission id.
     *
     * @return the mission id
     */
    public String getMissionId( ) {
		return this.missionId;
	}

}
