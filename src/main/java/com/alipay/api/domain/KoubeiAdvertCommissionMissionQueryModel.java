package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标的分佣查询
 *
 * @author auto create
 * @since 1.0, 2017-04-11 14:05:02
 */
public class KoubeiAdvertCommissionMissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3124839846672978642L;

	/**
	 * 主键ID
	 */
	@ApiListField("identify_list")
	@ApiField("string")
	private List<String> identifyList;

	/**
	 * 主键类型
activity_id：运营活动ID
voucher：商品ID
mission：分佣任务ID
	 */
	@ApiField("identify_type")
	private String identifyType;

    /**
     * Gets identify list.
     *
     * @return the identify list
     */
    public List<String> getIdentifyList() {
		return this.identifyList;
	}

    /**
     * Sets identify list.
     *
     * @param identifyList the identify list
     */
    public void setIdentifyList(List<String> identifyList) {
		this.identifyList = identifyList;
	}

    /**
     * Gets identify type.
     *
     * @return the identify type
     */
    public String getIdentifyType() {
		return this.identifyType;
	}

    /**
     * Sets identify type.
     *
     * @param identifyType the identify type
     */
    public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

}
