package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公租房申请进度同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:09
 */
public class AlipayEcoRenthousePublicrentApplyscheduleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2661813724649729964L;

	/**
	 * 申请单进度列表
	 */
	@ApiListField("apply_schedule_list")
	@ApiField("eco_apply_schedule")
	private List<EcoApplySchedule> applyScheduleList;

	/**
	 * 证件号-身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 租客用户Id
	 */
	@ApiField("rent_id")
	private String rentId;

    /**
     * Gets apply schedule list.
     *
     * @return the apply schedule list
     */
    public List<EcoApplySchedule> getApplyScheduleList() {
		return this.applyScheduleList;
	}

    /**
     * Sets apply schedule list.
     *
     * @param applyScheduleList the apply schedule list
     */
    public void setApplyScheduleList(List<EcoApplySchedule> applyScheduleList) {
		this.applyScheduleList = applyScheduleList;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets rent id.
     *
     * @return the rent id
     */
    public String getRentId() {
		return this.rentId;
	}

    /**
     * Sets rent id.
     *
     * @param rentId the rent id
     */
    public void setRentId(String rentId) {
		this.rentId = rentId;
	}

}
