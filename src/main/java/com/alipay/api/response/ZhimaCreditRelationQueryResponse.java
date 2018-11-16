package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RelationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.relation.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-04 14:11:52
 */
public class ZhimaCreditRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8273664149563158976L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 对关系的具体描述，只有存在关系时才能输出
	 */
	@ApiField("relation_info")
	private RelationInfo relationInfo;

	/** 
	 * 关系强度，具体关系强度code见产品文档
	 */
	@ApiField("relation_rank")
	private String relationRank;

	/** 
	 * 0~100整数，分数越高与输入关系越匹配度越高，如果入参无relation，则该值为0
	 */
	@ApiField("relation_score")
	private Long relationScore;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets relation info.
     *
     * @param relationInfo the relation info
     */
    public void setRelationInfo(RelationInfo relationInfo) {
		this.relationInfo = relationInfo;
	}

    /**
     * Gets relation info.
     *
     * @return the relation info
     */
    public RelationInfo getRelationInfo( ) {
		return this.relationInfo;
	}

    /**
     * Sets relation rank.
     *
     * @param relationRank the relation rank
     */
    public void setRelationRank(String relationRank) {
		this.relationRank = relationRank;
	}

    /**
     * Gets relation rank.
     *
     * @return the relation rank
     */
    public String getRelationRank( ) {
		return this.relationRank;
	}

    /**
     * Sets relation score.
     *
     * @param relationScore the relation score
     */
    public void setRelationScore(Long relationScore) {
		this.relationScore = relationScore;
	}

    /**
     * Gets relation score.
     *
     * @return the relation score
     */
    public Long getRelationScore( ) {
		return this.relationScore;
	}

}
