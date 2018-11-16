package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融扩展字段
 *
 * @author auto create
 * @since 1.0, 2018-07-31 10:37:13
 */
public class SceneExtParam extends AlipayObject {

	private static final long serialVersionUID = 5255539457965822294L;

	/**
	 * B流程申请准入原因
	 */
	@ApiField("apply_reason")
	private String applyReason;

	/**
	 * 机构的合约编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 贴息金额，单位：分
	 */
	@ApiField("discountamt")
	private String discountamt;

	/**
	 * 首付款，单位：分
	 */
	@ApiField("firstpayamt")
	private String firstpayamt;

	/**
	 * 利率，xx%格式
	 */
	@ApiField("interestrate")
	private String interestrate;

	/**
	 * 尾款，单位：分
	 */
	@ApiField("lastpayamt")
	private String lastpayamt;

	/**
	 * 月供，单位：分，需要大于等于0
	 */
	@ApiField("monthpayamt")
	private String monthpayamt;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

    /**
     * Gets apply reason.
     *
     * @return the apply reason
     */
    public String getApplyReason() {
		return this.applyReason;
	}

    /**
     * Sets apply reason.
     *
     * @param applyReason the apply reason
     */
    public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

    /**
     * Gets contract no.
     *
     * @return the contract no
     */
    public String getContractNo() {
		return this.contractNo;
	}

    /**
     * Sets contract no.
     *
     * @param contractNo the contract no
     */
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

    /**
     * Gets discountamt.
     *
     * @return the discountamt
     */
    public String getDiscountamt() {
		return this.discountamt;
	}

    /**
     * Sets discountamt.
     *
     * @param discountamt the discountamt
     */
    public void setDiscountamt(String discountamt) {
		this.discountamt = discountamt;
	}

    /**
     * Gets firstpayamt.
     *
     * @return the firstpayamt
     */
    public String getFirstpayamt() {
		return this.firstpayamt;
	}

    /**
     * Sets firstpayamt.
     *
     * @param firstpayamt the firstpayamt
     */
    public void setFirstpayamt(String firstpayamt) {
		this.firstpayamt = firstpayamt;
	}

    /**
     * Gets interestrate.
     *
     * @return the interestrate
     */
    public String getInterestrate() {
		return this.interestrate;
	}

    /**
     * Sets interestrate.
     *
     * @param interestrate the interestrate
     */
    public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}

    /**
     * Gets lastpayamt.
     *
     * @return the lastpayamt
     */
    public String getLastpayamt() {
		return this.lastpayamt;
	}

    /**
     * Sets lastpayamt.
     *
     * @param lastpayamt the lastpayamt
     */
    public void setLastpayamt(String lastpayamt) {
		this.lastpayamt = lastpayamt;
	}

    /**
     * Gets monthpayamt.
     *
     * @return the monthpayamt
     */
    public String getMonthpayamt() {
		return this.monthpayamt;
	}

    /**
     * Sets monthpayamt.
     *
     * @param monthpayamt the monthpayamt
     */
    public void setMonthpayamt(String monthpayamt) {
		this.monthpayamt = monthpayamt;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

}
