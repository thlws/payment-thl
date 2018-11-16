package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.search.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:52:55
 */
public class KoubeiMerchantOperatorSearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3511844297411713932L;

	/** 
	 * 根据不同条件查询返回的口碑商家中心操作员列表
	 */
	@ApiListField("operator_list")
	@ApiField("operator_base_info")
	private List<OperatorBaseInfo> operatorList;

	/** 
	 * 操作员列表查询结果总数
	 */
	@ApiField("total")
	private Long total;

    /**
     * Sets operator list.
     *
     * @param operatorList the operator list
     */
    public void setOperatorList(List<OperatorBaseInfo> operatorList) {
		this.operatorList = operatorList;
	}

    /**
     * Gets operator list.
     *
     * @return the operator list
     */
    public List<OperatorBaseInfo> getOperatorList( ) {
		return this.operatorList;
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
