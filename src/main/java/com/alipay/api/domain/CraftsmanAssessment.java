package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人评价详情
 *
 * @author auto create
 * @since 1.0, 2017-10-26 10:35:48
 */
public class CraftsmanAssessment extends AlipayObject {

	private static final long serialVersionUID = 4172716698948892151L;

	/**
	 * 子评分项
	 */
	@ApiListField("sub_assessments")
	@ApiField("craftsman_sub_assessment")
	private List<CraftsmanSubAssessment> subAssessments;

	/**
	 * 单个手艺人的评价总条数。
	 */
	@ApiField("total_no")
	private Long totalNo;

	/**
	 * 单个手艺人的总评分的均分
	 */
	@ApiField("total_score")
	private Long totalScore;

    /**
     * Gets sub assessments.
     *
     * @return the sub assessments
     */
    public List<CraftsmanSubAssessment> getSubAssessments() {
		return this.subAssessments;
	}

    /**
     * Sets sub assessments.
     *
     * @param subAssessments the sub assessments
     */
    public void setSubAssessments(List<CraftsmanSubAssessment> subAssessments) {
		this.subAssessments = subAssessments;
	}

    /**
     * Gets total no.
     *
     * @return the total no
     */
    public Long getTotalNo() {
		return this.totalNo;
	}

    /**
     * Sets total no.
     *
     * @param totalNo the total no
     */
    public void setTotalNo(Long totalNo) {
		this.totalNo = totalNo;
	}

    /**
     * Gets total score.
     *
     * @return the total score
     */
    public Long getTotalScore() {
		return this.totalScore;
	}

    /**
     * Sets total score.
     *
     * @param totalScore the total score
     */
    public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

}
