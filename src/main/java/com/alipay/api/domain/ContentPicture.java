package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容图片
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ContentPicture extends AlipayObject {

	private static final long serialVersionUID = 2775111915739976113L;

	/**
	 * 调用alipay.offline.material.image.upload，将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * "DISH"："菜品"，"ENVIRONMENT"："环境"，"SHOPHEAD"："门头照"，"OTHER"："其他"
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
		return this.location;
	}

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
		this.location = location;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
