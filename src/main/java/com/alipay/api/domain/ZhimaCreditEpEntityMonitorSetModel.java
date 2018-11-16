package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险雷达添加商户联系方式列表接口
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:32:57
 */
public class ZhimaCreditEpEntityMonitorSetModel extends AlipayObject {

	private static final long serialVersionUID = 2791142514933674799L;

	/**
	 * 联系人列表
	 */
	@ApiField("contact_list")
	private String contactList;

	/**
	 * 方案ID
	 */
	@ApiField("solution_id")
	private String solutionId;

    /**
     * Gets contact list.
     *
     * @return the contact list
     */
    public String getContactList() {
		return this.contactList;
	}

    /**
     * Sets contact list.
     *
     * @param contactList the contact list
     */
    public void setContactList(String contactList) {
		this.contactList = contactList;
	}

    /**
     * Gets solution id.
     *
     * @return the solution id
     */
    public String getSolutionId() {
		return this.solutionId;
	}

    /**
     * Sets solution id.
     *
     * @param solutionId the solution id
     */
    public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
