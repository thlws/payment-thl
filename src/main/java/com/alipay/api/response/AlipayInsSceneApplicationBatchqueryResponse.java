package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsApplicationQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2016-11-14 11:45:43
 */
public class AlipayInsSceneApplicationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5622856456578929367L;

	/** 
	 * 投保单列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application_query")
	private List<InsApplicationQuery> applications;

    /**
     * Sets applications.
     *
     * @param applications the applications
     */
    public void setApplications(List<InsApplicationQuery> applications) {
		this.applications = applications;
	}

    /**
     * Gets applications.
     *
     * @return the applications
     */
    public List<InsApplicationQuery> getApplications( ) {
		return this.applications;
	}

}
