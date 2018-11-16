package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2017-10-30 11:50:27
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4212377333247471661L;

	/**
	 * 会员卡开卡表单提交后回调地址。
1.该地址不可带参数，如需回传参数，可设置out_string入参。
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，需开通生活号并绑定会员卡。生活号快速接入详见：https://doc.open.alipay.com/docs/doc.htm?treeId=193&articleId=105933&docType=1
	 */
	@ApiField("follow_app_id")
	private String followAppId;

	/**
	 * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
	 */
	@ApiField("out_string")
	private String outString;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Gets callback.
     *
     * @return the callback
     */
    public String getCallback() {
		return this.callback;
	}

    /**
     * Sets callback.
     *
     * @param callback the callback
     */
    public void setCallback(String callback) {
		this.callback = callback;
	}

    /**
     * Gets follow app id.
     *
     * @return the follow app id
     */
    public String getFollowAppId() {
		return this.followAppId;
	}

    /**
     * Sets follow app id.
     *
     * @param followAppId the follow app id
     */
    public void setFollowAppId(String followAppId) {
		this.followAppId = followAppId;
	}

    /**
     * Gets out string.
     *
     * @return the out string
     */
    public String getOutString() {
		return this.outString;
	}

    /**
     * Sets out string.
     *
     * @param outString the out string
     */
    public void setOutString(String outString) {
		this.outString = outString;
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
