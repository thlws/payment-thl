package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板配置项：跳转至支付宝小程序页面的URL信息模型
 *
 * @author auto create
 * @since 1.0, 2018-08-09 15:45:34
 */
public class TemplateActionMiniAppUrlDTO extends AlipayObject {

	private static final long serialVersionUID = 5822299891788786913L;

	/**
	 * 行动点按钮是否在列表页展示，true 或 false，不填则默认false；
列表页可以配置展示最多2项小程序跳转行动点。
	 */
	@ApiField("display_on_list")
	private String displayOnList;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定小程序页面，不填则默认跳转至对应小程序首页
	 */
	@ApiField("mini_page_param")
	private String miniPageParam;

	/**
	 * query参数，商户自定义传参，填入值将以"query"为参数名提交至指定小程序页面
	 */
	@ApiField("mini_query_param")
	private String miniQueryParam;

    /**
     * Gets display on list.
     *
     * @return the display on list
     */
    public String getDisplayOnList() {
		return this.displayOnList;
	}

    /**
     * Sets display on list.
     *
     * @param displayOnList the display on list
     */
    public void setDisplayOnList(String displayOnList) {
		this.displayOnList = displayOnList;
	}

    /**
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId() {
		return this.miniAppId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

    /**
     * Gets mini page param.
     *
     * @return the mini page param
     */
    public String getMiniPageParam() {
		return this.miniPageParam;
	}

    /**
     * Sets mini page param.
     *
     * @param miniPageParam the mini page param
     */
    public void setMiniPageParam(String miniPageParam) {
		this.miniPageParam = miniPageParam;
	}

    /**
     * Gets mini query param.
     *
     * @return the mini query param
     */
    public String getMiniQueryParam() {
		return this.miniQueryParam;
	}

    /**
     * Sets mini query param.
     *
     * @param miniQueryParam the mini query param
     */
    public void setMiniQueryParam(String miniQueryParam) {
		this.miniQueryParam = miniQueryParam;
	}

}
