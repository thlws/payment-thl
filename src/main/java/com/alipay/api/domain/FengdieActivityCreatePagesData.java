package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶创建站点初始化数据
 *
 * @author auto create
 * @since 1.0, 2018-05-17 14:44:09
 */
public class FengdieActivityCreatePagesData extends AlipayObject {

	private static final long serialVersionUID = 3862714579245727437L;

	/**
	 * 指定页面使用的组件，展示顺序和传入的列表顺序一致，一旦使用这个参数，模板中 {% components %} {% endcomponents %} 区域只会显示这里指定的组件
	 */
	@ApiListField("components")
	@ApiField("fengdie_activity_component_model")
	private List<FengdieActivityComponentModel> components;

	/**
	 * 指定模板中页面采用的 schema 数据，默认为 schema 默认数据
	 */
	@ApiListField("page_data")
	@ApiField("fengdie_activity_schema_model")
	private List<FengdieActivitySchemaModel> pageData;

	/**
	 * 模板中页面的路径（相对于项目根目录）
	 */
	@ApiField("page_path")
	private String pagePath;

	/**
	 * 站点标题，默认为“未命名标题”
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets components.
     *
     * @return the components
     */
    public List<FengdieActivityComponentModel> getComponents() {
		return this.components;
	}

    /**
     * Sets components.
     *
     * @param components the components
     */
    public void setComponents(List<FengdieActivityComponentModel> components) {
		this.components = components;
	}

    /**
     * Gets page data.
     *
     * @return the page data
     */
    public List<FengdieActivitySchemaModel> getPageData() {
		return this.pageData;
	}

    /**
     * Sets page data.
     *
     * @param pageData the page data
     */
    public void setPageData(List<FengdieActivitySchemaModel> pageData) {
		this.pageData = pageData;
	}

    /**
     * Gets page path.
     *
     * @return the page path
     */
    public String getPagePath() {
		return this.pagePath;
	}

    /**
     * Sets page path.
     *
     * @param pagePath the page path
     */
    public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
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
