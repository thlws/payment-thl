package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔报案信息修改
 *
 * @author auto create
 * @since 1.0, 2017-09-19 10:00:01
 */
public class AlipayInsSceneClaimReportModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3157562177817145627L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 理赔报案的属性字段，标准JSON格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 申请理赔的报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

    /**
     * Gets accident address.
     *
     * @return the accident address
     */
    public String getAccidentAddress() {
		return this.accidentAddress;
	}

    /**
     * Sets accident address.
     *
     * @param accidentAddress the accident address
     */
    public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

    /**
     * Gets accident desc.
     *
     * @return the accident desc
     */
    public String getAccidentDesc() {
		return this.accidentDesc;
	}

    /**
     * Sets accident desc.
     *
     * @param accidentDesc the accident desc
     */
    public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

    /**
     * Gets accident time.
     *
     * @return the accident time
     */
    public Date getAccidentTime() {
		return this.accidentTime;
	}

    /**
     * Sets accident time.
     *
     * @param accidentTime the accident time
     */
    public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets claim report no.
     *
     * @return the claim report no
     */
    public String getClaimReportNo() {
		return this.claimReportNo;
	}

    /**
     * Sets claim report no.
     *
     * @param claimReportNo the claim report no
     */
    public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

}
