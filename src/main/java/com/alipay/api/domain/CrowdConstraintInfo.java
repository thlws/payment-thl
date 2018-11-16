package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人限制信息
 *
 * @author auto create
 * @since 1.0, 2017-11-15 22:41:45
 */
public class CrowdConstraintInfo extends AlipayObject {

	private static final long serialVersionUID = 7597495493477637613L;

	/**
	 * 圈人的条件
op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
value:标签值
	 */
	@ApiField("crowd_condition")
	private String crowdCondition;

	/**
	 * 圈人名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 圈人约束，取值（NEWCOMER：新客人群；OFFLINE：离线人群），OFFLINE离线人群，需要传递crowd_condition圈人条件，使用方案参考crowd_condition使用说明
	 */
	@ApiField("crowd_restriction")
	private String crowdRestriction;

    /**
     * Gets crowd condition.
     *
     * @return the crowd condition
     */
    public String getCrowdCondition() {
		return this.crowdCondition;
	}

    /**
     * Sets crowd condition.
     *
     * @param crowdCondition the crowd condition
     */
    public void setCrowdCondition(String crowdCondition) {
		this.crowdCondition = crowdCondition;
	}

    /**
     * Gets crowd name.
     *
     * @return the crowd name
     */
    public String getCrowdName() {
		return this.crowdName;
	}

    /**
     * Sets crowd name.
     *
     * @param crowdName the crowd name
     */
    public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

    /**
     * Gets crowd restriction.
     *
     * @return the crowd restriction
     */
    public String getCrowdRestriction() {
		return this.crowdRestriction;
	}

    /**
     * Sets crowd restriction.
     *
     * @param crowdRestriction the crowd restriction
     */
    public void setCrowdRestriction(String crowdRestriction) {
		this.crowdRestriction = crowdRestriction;
	}

}
