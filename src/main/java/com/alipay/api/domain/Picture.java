package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class Picture extends AlipayObject {

	private static final long serialVersionUID = 8395451191298399944L;

	/**
	 * 调用alipay.offline.material.image.upload接口将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

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

}
