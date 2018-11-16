package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险标的
 *
 * @author auto create
 * @since 1.0, 2018-06-28 20:24:40
 */
public class InsObject extends AlipayObject {

	private static final long serialVersionUID = 2646542619347867491L;

	/**
	 * 标的物的标识id
	 */
	@ApiField("insured_object_id")
	private String insuredObjectId;

	/**
	 * 标的信息;标准json 格式
	 */
	@ApiField("insured_object_info")
	private String insuredObjectInfo;

	/**
	 * 标的类型;0:财产所在地;1:其它;2:车;3:资金债务;4:电商订单
	 */
	@ApiField("type")
	private Long type;

    /**
     * Gets insured object id.
     *
     * @return the insured object id
     */
    public String getInsuredObjectId() {
		return this.insuredObjectId;
	}

    /**
     * Sets insured object id.
     *
     * @param insuredObjectId the insured object id
     */
    public void setInsuredObjectId(String insuredObjectId) {
		this.insuredObjectId = insuredObjectId;
	}

    /**
     * Gets insured object info.
     *
     * @return the insured object info
     */
    public String getInsuredObjectInfo() {
		return this.insuredObjectInfo;
	}

    /**
     * Sets insured object info.
     *
     * @param insuredObjectInfo the insured object info
     */
    public void setInsuredObjectInfo(String insuredObjectInfo) {
		this.insuredObjectInfo = insuredObjectInfo;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
		this.type = type;
	}

}
