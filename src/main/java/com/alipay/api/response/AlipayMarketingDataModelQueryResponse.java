package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ModelColumn;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.entity.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:26
 */
public class AlipayMarketingDataModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6351898969919453993L;

	/** 
	 * 模型数据。此为参数列表，输出参数为模型字段及模型结果值; 用于数据实验室算法模型对外输出
alias:列别名。此为模型字段
data:列值。此为模型数值
	 */
	@ApiListField("model_column")
	@ApiField("model_column")
	private List<ModelColumn> modelColumn;

    /**
     * Sets entity column.
     *
     * @param modelColumn the entity column
     */
    public void setModelColumn(List<ModelColumn> modelColumn) {
		this.modelColumn = modelColumn;
	}

    /**
     * Gets entity column.
     *
     * @return the entity column
     */
    public List<ModelColumn> getModelColumn( ) {
		return this.modelColumn;
	}

}
