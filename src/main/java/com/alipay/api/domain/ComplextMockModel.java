package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 负责对象mock模型
 *
 * @author auto create
 * @since 1.0, 2016-10-27 16:59:24
 */
public class ComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 8611168638956937641L;

	/**
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/**
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * 208xxx
	 */
	@ApiField("biz_type")
	private String bizType;

    /**
     * Gets biz entity.
     *
     * @return the biz entity
     */
    public SimpleMockModel getBizModel() {
		return this.bizModel;
	}

    /**
     * Sets biz entity.
     *
     * @param bizModel the biz entity
     */
    public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}

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

}
