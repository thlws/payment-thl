package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客推广日期维度汇总数据模型
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:10
 */
public class PromoteDateModel extends AlipayObject {

	private static final long serialVersionUID = 3348994121381854664L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets promote data.
     *
     * @return the promote data
     */
    public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}

    /**
     * Sets promote data.
     *
     * @param promoteData the promote data
     */
    public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
