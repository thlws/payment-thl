package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RelationCombinedVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.combined.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-12 18:20:28
 */
public class AlipaySocialBaseRelationCombinedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3175463476437513164L;

	/** 
	 * 复合关系数据
	 */
	@ApiListField("relation_combined_list")
	@ApiField("relation_combined_v_o")
	private List<RelationCombinedVO> relationCombinedList;

    /**
     * Sets relation combined list.
     *
     * @param relationCombinedList the relation combined list
     */
    public void setRelationCombinedList(List<RelationCombinedVO> relationCombinedList) {
		this.relationCombinedList = relationCombinedList;
	}

    /**
     * Gets relation combined list.
     *
     * @return the relation combined list
     */
    public List<RelationCombinedVO> getRelationCombinedList( ) {
		return this.relationCombinedList;
	}

}
