package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝积分会员权益信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class BenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 7769822125372783829L;

	/**
	 * 权益信息id
	 */
	@ApiField("benefit_info_id")
	private String benefitInfoId;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益中文名称
	 */
	@ApiField("benefit_name_cn")
	private String benefitNameCn;

	/**
	 * 权益类型(会员等级: MemberGrade)
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益发放时间
	 */
	@ApiField("dispatch_dt")
	private Date dispatchDt;

	/**
	 * 权益失效时间
	 */
	@ApiField("end_dt")
	private Date endDt;

	/**
	 * 权益生效时间
	 */
	@ApiField("start_dt")
	private Date startDt;

	/**
	 * 权益当前状态     
* 待生效：WAIT
* 生效：VALID
* 失效：INVALID
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets benefit info id.
     *
     * @return the benefit info id
     */
    public String getBenefitInfoId() {
		return this.benefitInfoId;
	}

    /**
     * Sets benefit info id.
     *
     * @param benefitInfoId the benefit info id
     */
    public void setBenefitInfoId(String benefitInfoId) {
		this.benefitInfoId = benefitInfoId;
	}

    /**
     * Gets benefit name.
     *
     * @return the benefit name
     */
    public String getBenefitName() {
		return this.benefitName;
	}

    /**
     * Sets benefit name.
     *
     * @param benefitName the benefit name
     */
    public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

    /**
     * Gets benefit name cn.
     *
     * @return the benefit name cn
     */
    public String getBenefitNameCn() {
		return this.benefitNameCn;
	}

    /**
     * Sets benefit name cn.
     *
     * @param benefitNameCn the benefit name cn
     */
    public void setBenefitNameCn(String benefitNameCn) {
		this.benefitNameCn = benefitNameCn;
	}

    /**
     * Gets benefit type.
     *
     * @return the benefit type
     */
    public String getBenefitType() {
		return this.benefitType;
	}

    /**
     * Sets benefit type.
     *
     * @param benefitType the benefit type
     */
    public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

    /**
     * Gets dispatch dt.
     *
     * @return the dispatch dt
     */
    public Date getDispatchDt() {
		return this.dispatchDt;
	}

    /**
     * Sets dispatch dt.
     *
     * @param dispatchDt the dispatch dt
     */
    public void setDispatchDt(Date dispatchDt) {
		this.dispatchDt = dispatchDt;
	}

    /**
     * Gets end dt.
     *
     * @return the end dt
     */
    public Date getEndDt() {
		return this.endDt;
	}

    /**
     * Sets end dt.
     *
     * @param endDt the end dt
     */
    public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

    /**
     * Gets start dt.
     *
     * @return the start dt
     */
    public Date getStartDt() {
		return this.startDt;
	}

    /**
     * Sets start dt.
     *
     * @param startDt the start dt
     */
    public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
