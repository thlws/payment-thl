package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险图像定损请求中的图像信息
 *
 * @author auto create
 * @since 1.0, 2017-07-28 15:30:17
 */
public class AlipayInsDataAutodamageRequestImageInfo extends AlipayObject {

	private static final long serialVersionUID = 2363589923934854958L;

	/**
	 * 图像文件名称
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 图像文件在存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

    /**
     * Gets image name.
     *
     * @return the image name
     */
    public String getImageName() {
		return this.imageName;
	}

    /**
     * Sets image name.
     *
     * @param imageName the image name
     */
    public void setImageName(String imageName) {
		this.imageName = imageName;
	}

    /**
     * Gets image path.
     *
     * @return the image path
     */
    public String getImagePath() {
		return this.imagePath;
	}

    /**
     * Sets image path.
     *
     * @param imagePath the image path
     */
    public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
