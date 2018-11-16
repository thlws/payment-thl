package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateUsageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.template.usage.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenMiniTemplateUsageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6875627381213125397L;

	/** 
	 * 小程序appId列表
	 */
	@ApiListField("app_ids")
	@ApiField("string")
	private List<String> appIds;

	/** 
	 * 模板使用信息
	 */
	@ApiListField("template_usage_info_list")
	@ApiField("template_usage_info")
	private List<TemplateUsageInfo> templateUsageInfoList;

    /**
     * Sets app ids.
     *
     * @param appIds the app ids
     */
    public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}

    /**
     * Gets app ids.
     *
     * @return the app ids
     */
    public List<String> getAppIds( ) {
		return this.appIds;
	}

    /**
     * Sets template usage info list.
     *
     * @param templateUsageInfoList the template usage info list
     */
    public void setTemplateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
		this.templateUsageInfoList = templateUsageInfoList;
	}

    /**
     * Gets template usage info list.
     *
     * @return the template usage info list
     */
    public List<TemplateUsageInfo> getTemplateUsageInfoList( ) {
		return this.templateUsageInfoList;
	}

}
