package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模板权益信息
 *
 * @author auto create
 * @since 1.0, 2017-08-21 19:55:35
 */
public class TemplateBenefitInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5573298911877246356L;

	/**
	 * 权益描述信息
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 权益描述
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets benefit desc.
     *
     * @return the benefit desc
     */
    public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}

    /**
     * Sets benefit desc.
     *
     * @param benefitDesc the benefit desc
     */
    public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
