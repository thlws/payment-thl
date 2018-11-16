package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 老版本复杂对象模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OldComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 2745885715476276162L;

	/**
	 * biz_num
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * biz_type
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 简单model
	 */
	@ApiField("simple_mock_model")
	private SimpleMockModel simpleMockModel;

    /**
     * Gets biz num.
     *
     * @return the biz num
     */
    public Long getBizNum() {
		return this.bizNum;
	}

    /**
     * Sets biz num.
     *
     * @param bizNum the biz num
     */
    public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets simple mock entity.
     *
     * @return the simple mock entity
     */
    public SimpleMockModel getSimpleMockModel() {
		return this.simpleMockModel;
	}

    /**
     * Sets simple mock entity.
     *
     * @param simpleMockModel the simple mock entity
     */
    public void setSimpleMockModel(SimpleMockModel simpleMockModel) {
		this.simpleMockModel = simpleMockModel;
	}

}
