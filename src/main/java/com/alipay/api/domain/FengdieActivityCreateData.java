package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶创建H5应用的初始化数据
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:17
 */
public class FengdieActivityCreateData extends AlipayObject {

	private static final long serialVersionUID = 8565134886787146587L;

	/**
	 * H5应用的名称，用户自定义，最终用于生成URL。生成URL的规则“域名/p/f/${name}/页面名称.html”
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户自定义，到了该时间后，用户将访问不到该应用
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * H5应用的页面在编辑器中默认展示的数据
	 */
	@ApiListField("page")
	@ApiField("fengdie_activity_create_page_data")
	private List<FengdieActivityCreatePageData> page;

	/**
	 * H5应用标题，用户自定义
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets offline time.
     *
     * @return the offline time
     */
    public String getOfflineTime() {
		return this.offlineTime;
	}

    /**
     * Sets offline time.
     *
     * @param offlineTime the offline time
     */
    public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public List<FengdieActivityCreatePageData> getPage() {
		return this.page;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(List<FengdieActivityCreatePageData> page) {
		this.page = page;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
