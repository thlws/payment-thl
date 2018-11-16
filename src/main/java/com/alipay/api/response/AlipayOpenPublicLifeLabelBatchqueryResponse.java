package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:53:35
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1221924871638574222L;

	/** 
	 * 标签列表
	 */
	@ApiListField("labels")
	@ApiField("life_label")
	private List<LifeLabel> labels;

    /**
     * Sets labels.
     *
     * @param labels the labels
     */
    public void setLabels(List<LifeLabel> labels) {
		this.labels = labels;
	}

    /**
     * Gets labels.
     *
     * @return the labels
     */
    public List<LifeLabel> getLabels( ) {
		return this.labels;
	}

}
