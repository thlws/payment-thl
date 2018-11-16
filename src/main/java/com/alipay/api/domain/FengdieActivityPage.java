package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用中的页面
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class FengdieActivityPage extends AlipayObject {

	private static final long serialVersionUID = 2525197398892883731L;

	/**
	 * H5页面唯一id，创建H5应用时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * H5页面名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * H5页面schema数据
	 */
	@ApiListField("schema")
	@ApiField("fengdie_activity_schema_data")
	private List<FengdieActivitySchemaData> schema;

	/**
	 * H5页面预览图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * H5页面中文标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * H5页面访问地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

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
     * Gets schema.
     *
     * @return the schema
     */
    public List<FengdieActivitySchemaData> getSchema() {
		return this.schema;
	}

    /**
     * Sets schema.
     *
     * @param schema the schema
     */
    public void setSchema(List<FengdieActivitySchemaData> schema) {
		this.schema = schema;
	}

    /**
     * Gets snapshot.
     *
     * @return the snapshot
     */
    public String getSnapshot() {
		return this.snapshot;
	}

    /**
     * Sets snapshot.
     *
     * @param snapshot the snapshot
     */
    public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
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

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}
