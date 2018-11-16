package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用回调接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:42:08
 */
public class AlipayInsAutoAutoinsprodCommonConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6798853561993185266L;

	/**
	 * 业务内容
具体内容按照业务类型对应的key值传输
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务场景码
AUTO_GET_CAR_MODEL_LIST	获取车型列表
AUTO_GET_COMPANY_LIST_IN_SERVICE	获取可报价机构列表
AUTO_ SEND_MOBILE_MSG_FOR_BEIJING	发送北京验证码请求
AUTO_VERIFY_MOBILE_MSG_FOR_BEIJING	验证北京验证码请求
AUTO_GET_DELIVER_GROUP	获取保单配送地区分组
AUTO_GET_CHECK_CODE_BEFORE_PAY	下单之前获取中保信验证码
AUTO_ VERIFY_CHECK_CODE_BEFORE_PAY_FOR	下单之前验证中保信验证码
	 */
	@ApiField("biz_type")
	private String bizType;

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

}
