package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台场景详情信息
 *
 * @author auto create
 * @since 1.0, 2017-10-30 10:40:49
 */
public class SceneDetail extends AlipayObject {

	private static final long serialVersionUID = 5891277842214261487L;

	/**
	 * 场景描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 场景配置的图片
	 */
	@ApiField("scene_image")
	private String sceneImage;

	/**
	 * 小蚂答场景标题
	 */
	@ApiField("title")
	private String title;

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
     * Gets scene id.
     *
     * @return the scene id
     */
    public String getSceneId() {
		return this.sceneId;
	}

    /**
     * Sets scene id.
     *
     * @param sceneId the scene id
     */
    public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

    /**
     * Gets scene image.
     *
     * @return the scene image
     */
    public String getSceneImage() {
		return this.sceneImage;
	}

    /**
     * Sets scene image.
     *
     * @param sceneImage the scene image
     */
    public void setSceneImage(String sceneImage) {
		this.sceneImage = sceneImage;
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
