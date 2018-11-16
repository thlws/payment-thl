package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询图像定损结果
 *
 * @author auto create
 * @since 1.0, 2017-11-10 14:37:02
 */
public class AlipayInsDataAutodamageEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3395562854384294864L;

	/**
	 * 保险公司定损单号，同之前调用的“提交车险图像定损请求”接口中的定损单号。
	 */
	@ApiField("estimate_no")
	private String estimateNo;

    /**
     * Gets estimate no.
     *
     * @return the estimate no
     */
    public String getEstimateNo() {
		return this.estimateNo;
	}

    /**
     * Sets estimate no.
     *
     * @param estimateNo the estimate no
     */
    public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

}
