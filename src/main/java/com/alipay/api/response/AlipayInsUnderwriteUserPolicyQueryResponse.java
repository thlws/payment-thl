package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsPolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.user.policy.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-18 13:53:50
 */
public class AlipayInsUnderwriteUserPolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3492539975115442421L;

	/** 
	 * 查询到的用户拥有的保单列表，含所有查询状态对应的保单，排序规则按照，保险保障开始时间倒序
	 */
	@ApiListField("policys")
	@ApiField("ins_policy")
	private List<InsPolicy> policys;

	/** 
	 * 结果的总条数
	 */
	@ApiField("total")
	private Long total;

    /**
     * Sets policys.
     *
     * @param policys the policys
     */
    public void setPolicys(List<InsPolicy> policys) {
		this.policys = policys;
	}

    /**
     * Gets policys.
     *
     * @return the policys
     */
    public List<InsPolicy> getPolicys( ) {
		return this.policys;
	}

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Long total) {
		this.total = total;
	}

    /**
     * Gets total.
     *
     * @return the total
     */
    public Long getTotal( ) {
		return this.total;
	}

}
