package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建网商会员
 *
 * @author auto create
 * @since 1.0, 2017-09-25 21:10:11
 */
public class MybankCreditUserRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6427677776292856219L;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 扩展数据（map转换为json字符串）
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 业务场景，7-代表网商贷在开放平台对外开放
	 */
	@ApiField("scene_type")
	private String sceneType;

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
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
