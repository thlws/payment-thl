package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益等级折扣积分模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class BenefitGradePoint extends AlipayObject {

	private static final long serialVersionUID = 7588118753989349294L;

	/**
	 * 蚂蚁会员权益配置的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 蚂蚁会员权益配置在各个用户等级下的折扣积分
	 */
	@ApiListField("grade_points")
	@ApiField("grade_discount_point")
	private List<GradeDiscountPoint> gradePoints;

	/**
	 * 蚂蚁会员权益配置的原始积分
	 */
	@ApiField("original_point")
	private String originalPoint;

	/**
	 * 蚂蚁会员权益的专享等级列表
	 */
	@ApiField("own_grades")
	private String ownGrades;

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets grade points.
     *
     * @return the grade points
     */
    public List<GradeDiscountPoint> getGradePoints() {
		return this.gradePoints;
	}

    /**
     * Sets grade points.
     *
     * @param gradePoints the grade points
     */
    public void setGradePoints(List<GradeDiscountPoint> gradePoints) {
		this.gradePoints = gradePoints;
	}

    /**
     * Gets original point.
     *
     * @return the original point
     */
    public String getOriginalPoint() {
		return this.originalPoint;
	}

    /**
     * Sets original point.
     *
     * @param originalPoint the original point
     */
    public void setOriginalPoint(String originalPoint) {
		this.originalPoint = originalPoint;
	}

    /**
     * Gets own grades.
     *
     * @return the own grades
     */
    public String getOwnGrades() {
		return this.ownGrades;
	}

    /**
     * Sets own grades.
     *
     * @param ownGrades the own grades
     */
    public void setOwnGrades(String ownGrades) {
		this.ownGrades = ownGrades;
	}

}
