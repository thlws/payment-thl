package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:11:27
 */
public class ZhimaCreditPeContractInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4738558613121898195L;

	/**
	 * 活动名称，由芝麻分配
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 电子合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 支付宝ID
	 */
	@ApiField("uid")
	private String uid;

    /**
     * Gets activity name.
     *
     * @return the activity name
     */
    public String getActivityName() {
		return this.activityName;
	}

    /**
     * Sets activity name.
     *
     * @param activityName the activity name
     */
    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
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
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid() {
		return this.uid;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

}
