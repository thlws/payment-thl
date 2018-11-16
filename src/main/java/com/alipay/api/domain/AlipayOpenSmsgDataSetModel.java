package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * to蚂蚁消息测试-数据重置
 *
 * @author auto create
 * @since 1.0, 2018-03-09 11:03:37
 */
public class AlipayOpenSmsgDataSetModel extends AlipayObject {

	private static final long serialVersionUID = 4337733144935742254L;

	/**
	 * 测试
	 */
	@ApiField("paramone")
	private String paramone;

	/**
	 * 测试参数2
	 */
	@ApiField("paramtwo")
	private String paramtwo;

    /**
     * Gets paramone.
     *
     * @return the paramone
     */
    public String getParamone() {
		return this.paramone;
	}

    /**
     * Sets paramone.
     *
     * @param paramone the paramone
     */
    public void setParamone(String paramone) {
		this.paramone = paramone;
	}

    /**
     * Gets paramtwo.
     *
     * @return the paramtwo
     */
    public String getParamtwo() {
		return this.paramtwo;
	}

    /**
     * Sets paramtwo.
     *
     * @param paramtwo the paramtwo
     */
    public void setParamtwo(String paramtwo) {
		this.paramtwo = paramtwo;
	}

}
