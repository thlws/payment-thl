package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权的开放表单信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 16:55:38
 */
public class AlipayMarketingCardActivateformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6167727671746821539L;

	/**
	 * 开放表单信息查询业务类型，可选类型如下：
MEMBER_CARD -- 会员卡开卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询用户表单提交信息的请求id，在用户授权表单确认提交后跳转商户页面url时返回此参数。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
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

}
