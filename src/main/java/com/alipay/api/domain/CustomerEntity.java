package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据资产平台对输数据实验室提供的结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class CustomerEntity extends AlipayObject {

	private static final long serialVersionUID = 8154913838421532325L;

	/**
	 * 实体英文名
	 */
	@ApiField("code")
	private String code;

	/**
	 * 实体描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 实体id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 实体中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * tag列表
	 */
	@ApiListField("tags")
	@ApiField("customer_tag")
	private List<CustomerTag> tags;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
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
     * Gets tags.
     *
     * @return the tags
     */
    public List<CustomerTag> getTags() {
		return this.tags;
	}

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(List<CustomerTag> tags) {
		this.tags = tags;
	}

}
