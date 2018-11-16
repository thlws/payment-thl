package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * To蚂蚁消息测试数据同步
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:08:24
 */
public class AlipayOpenAppSmsgDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4455259388415155462L;

	/**
	 * 10
	 */
	@ApiField("data_one")
	private String dataOne;

	/**
	 * abc
	 */
	@ApiField("data_two")
	private String dataTwo;

    /**
     * Gets data one.
     *
     * @return the data one
     */
    public String getDataOne() {
		return this.dataOne;
	}

    /**
     * Sets data one.
     *
     * @param dataOne the data one
     */
    public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

    /**
     * Gets data two.
     *
     * @return the data two
     */
    public String getDataTwo() {
		return this.dataTwo;
	}

    /**
     * Sets data two.
     *
     * @param dataTwo the data two
     */
    public void setDataTwo(String dataTwo) {
		this.dataTwo = dataTwo;
	}

}
