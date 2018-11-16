package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业数据回流
 *
 * @author auto create
 * @since 1.0, 2017-03-02 09:50:59
 */
public class AlipayEcoMedicalcareCommonDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2172241947443672291L;

	/**
	 * 为了区分相同ISV不同应用的编码，数据来源是类目平台
当data_type为CALLBACK时必填
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 业务主体，data_body根据不同的模板ID传入对应的JSON格式
注意：业务data_body与模板teaplate_id对应，具体实例：
http://medicalcare.oss-cn-hangzhou.aliyuncs.com/prod/data/transfer/[template_id].html
	 */
	@ApiField("data_body")
	private String dataBody;

	/**
	 * 业务数据类型
APP	应用类Card
REMIND	提醒类Card
CALLBACK	 数据回流
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 医疗服务平台提供数据模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID,可以通过获取会员信息产品 获取支付宝用户ID
当data_type为CALLBACK时必填
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets app code.
     *
     * @return the app code
     */
    public String getAppCode() {
		return this.appCode;
	}

    /**
     * Sets app code.
     *
     * @param appCode the app code
     */
    public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

    /**
     * Gets data body.
     *
     * @return the data body
     */
    public String getDataBody() {
		return this.dataBody;
	}

    /**
     * Sets data body.
     *
     * @param dataBody the data body
     */
    public void setDataBody(String dataBody) {
		this.dataBody = dataBody;
	}

    /**
     * Gets data type.
     *
     * @return the data type
     */
    public String getDataType() {
		return this.dataType;
	}

    /**
     * Sets data type.
     *
     * @param dataType the data type
     */
    public void setDataType(String dataType) {
		this.dataType = dataType;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
