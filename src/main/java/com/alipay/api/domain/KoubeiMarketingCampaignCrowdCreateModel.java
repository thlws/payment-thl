package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组创建接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:29
 */
public class KoubeiMarketingCampaignCrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2243847959526634671L;

	/**
	 * 圈人的条件
op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
value:标签值
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * 人群组的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Gets conditions.
     *
     * @return the conditions
     */
    public String getConditions() {
		return this.conditions;
	}

    /**
     * Sets conditions.
     *
     * @param conditions the conditions
     */
    public void setConditions(String conditions) {
		this.conditions = conditions;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
