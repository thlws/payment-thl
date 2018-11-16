package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指标数据模型，包含数据和维度
 * 是一个data数组，可以包含一个或多个请求数据（data）
 *
 * @author auto create
 * @since 1.0, 2017-08-10 16:22:11
 */
public class Datas extends AlipayObject {

	private static final long serialVersionUID = 5724821484447422932L;

	/**
	 * 指标数据区
	 */
	@ApiListField("data")
	@ApiField("data_entry")
	private List<DataEntry> data;

	/**
	 * 数据维度
	 */
	@ApiListField("dimension")
	@ApiField("data_dim")
	private List<DataDim> dimension;

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<DataEntry> getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<DataEntry> data) {
		this.data = data;
	}

    /**
     * Gets dimension.
     *
     * @return the dimension
     */
    public List<DataDim> getDimension() {
		return this.dimension;
	}

    /**
     * Sets dimension.
     *
     * @param dimension the dimension
     */
    public void setDimension(List<DataDim> dimension) {
		this.dimension = dimension;
	}

}
