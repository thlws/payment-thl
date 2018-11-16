package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序生成推广二维码接口
 *
 * @author auto create
 * @since 1.0, 2017-12-01 11:34:56
 */
public class AlipayOpenAppQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8675656426198577687L;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 小程序的启动参数，打开小程序的query ，在小程序 onLaunch的方法中获取
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * page/component/component-pages/view/view为小程序中能访问到的页面路径
	 */
	@ApiField("url_param")
	private String urlParam;

    /**
     * Gets describe.
     *
     * @return the describe
     */
    public String getDescribe() {
		return this.describe;
	}

    /**
     * Sets describe.
     *
     * @param describe the describe
     */
    public void setDescribe(String describe) {
		this.describe = describe;
	}

    /**
     * Gets query param.
     *
     * @return the query param
     */
    public String getQueryParam() {
		return this.queryParam;
	}

    /**
     * Sets query param.
     *
     * @param queryParam the query param
     */
    public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

    /**
     * Gets url param.
     *
     * @return the url param
     */
    public String getUrlParam() {
		return this.urlParam;
	}

    /**
     * Sets url param.
     *
     * @param urlParam the url param
     */
    public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
