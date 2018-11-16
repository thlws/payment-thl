package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益等级折扣积分
 *
 * @author auto create
 * @since 1.0, 2016-07-06 15:04:00
 */
public class GradeDiscountPoint extends AlipayObject {

	private static final long serialVersionUID = 5675146263365116883L;

	/**
	 * 蚂蚁会员权益配置的ID
	 */
	@ApiField("benefit_id")
	private Long benefitId;

	/**
	 * 各个等级的等级折扣后的积分
	 */
	@ApiField("discount_point")
	private String discountPoint;

	/**
	 * 蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public Long getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(Long benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets discount point.
     *
     * @return the discount point
     */
    public String getDiscountPoint() {
		return this.discountPoint;
	}

    /**
     * Sets discount point.
     *
     * @param discountPoint the discount point
     */
    public void setDiscountPoint(String discountPoint) {
		this.discountPoint = discountPoint;
	}

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
		return this.grade;
	}

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
		this.grade = grade;
	}

}
