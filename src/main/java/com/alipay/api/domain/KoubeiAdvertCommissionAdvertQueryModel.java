package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分佣推广信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-16 10:37:02
 */
public class KoubeiAdvertCommissionAdvertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8516813345977766996L;

	/**
	 * 查询主键列表
identify_type=advert所有值都必须是推广ID
identify_type=mission所有值都必须是分佣任务ID
identify_type=voucher所有值都必须是券ID
	 */
	@ApiListField("identifies")
	@ApiField("string")
	private List<String> identifies;

	/**
	 * 查询主键类型(枚举值key对应于请求对象中查询主键列表的key)
advert-推广
mission-分佣任务
voucher-券
	 */
	@ApiField("identify_type")
	private String identifyType;

    /**
     * Gets identifies.
     *
     * @return the identifies
     */
    public List<String> getIdentifies() {
		return this.identifies;
	}

    /**
     * Sets identifies.
     *
     * @param identifies the identifies
     */
    public void setIdentifies(List<String> identifies) {
		this.identifies = identifies;
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
