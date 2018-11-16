package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶站点页面数据模型
 *
 * @author auto create
 * @since 1.0, 2018-05-23 10:55:46
 */
public class FengdieSitesPageModel extends AlipayObject {

	private static final long serialVersionUID = 2239598347859793353L;

	/**
	 * 站点页面别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 活动页面 schema 数据
	 */
	@ApiListField("schema")
	@ApiField("fengdie_activity_schema_model")
	private List<FengdieActivitySchemaModel> schema;

	/**
	 * H5页面预览图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 页面访问地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets alias.
     *
     * @return the alias
     */
    public String getAlias() {
		return this.alias;
	}

    /**
     * Sets alias.
     *
     * @param alias the alias
     */
    public void setAlias(String alias) {
		this.alias = alias;
	}

    /**
     * Gets schema.
     *
     * @return the schema
     */
    public List<FengdieActivitySchemaModel> getSchema() {
		return this.schema;
	}

    /**
     * Sets schema.
     *
     * @param schema the schema
     */
    public void setSchema(List<FengdieActivitySchemaModel> schema) {
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
