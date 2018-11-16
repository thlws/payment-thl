package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化凤蝶应用时传入的默认数据
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class FengdieActivitySchemaData extends AlipayObject {

	private static final long serialVersionUID = 3133166256472369768L;

	/**
	 * 默认数据的内容，内容格式参考模板开发过程中自动生成的mock数据（与schema文件同名的json文件）。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 指定需要初始化的schema区域，与模板中schema文件路径对应
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
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

}
