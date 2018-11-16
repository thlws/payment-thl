package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客户申请中采集的数据
 *
 * @author auto create
 * @since 1.0, 2017-09-19 14:04:30
 */
public class MybankCreditLoanapplyDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2825419388835466231L;

	/**
	 * 对应业务类型相关的单号。若业务类型为1的话，则该值为申贷接口返回的sub_apply_no 子申请单号。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 什么业务场景相关的数据，比方说1为个人申贷相关的数据。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询的数据类型。是查外访预约单还是个人征信报告还是企业征信报告还是其他。
	 */
	@ApiField("category")
	private String category;

	/**
	 * 查询数据的版本号。若biz_type为1的话，该版本号在申贷查询的接口里会返回
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 查询的对象的唯一标识。个人客户一般为身份证号码或者支付宝ID，公司客户为工商注册号。全局唯一，用来唯一标识一个对象。如果身份证号包含字母，则字母必须大写。必填项。客户身份证号码可以从网商银行发送给机构的授信申请消息中获取，也可以是客户在机构注册时登记的信息。
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 查询的对象的名字，查个人征信就是这个人的名字，查企业征信就是企业名
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户的身份类型，由具体的合作场景决定。当个人客户以身份证为标识时是PERSON，企业是COMPAY ,一笔贷款维度的为LOAN
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Gets data version.
     *
     * @return the data version
     */
    public String getDataVersion() {
		return this.dataVersion;
	}

    /**
     * Sets data version.
     *
     * @param dataVersion the data version
     */
    public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

    /**
     * Gets entity code.
     *
     * @return the entity code
     */
    public String getEntityCode() {
		return this.entityCode;
	}

    /**
     * Sets entity code.
     *
     * @param entityCode the entity code
     */
    public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
		return this.entityName;
	}

    /**
     * Sets entity name.
     *
     * @param entityName the entity name
     */
    public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
		return this.entityType;
	}

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

}
