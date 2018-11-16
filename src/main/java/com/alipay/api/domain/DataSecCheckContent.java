package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑数据安全内容校验主体信息
 *
 * @author auto create
 * @since 1.0, 2018-06-20 11:16:30
 */
public class DataSecCheckContent extends AlipayObject {

	private static final long serialVersionUID = 6161679663562557582L;

	/**
	 * 文本或图片对应的请求唯一值，用于标识文本或图片内容
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据来源类型:TEXT--文本，IMAGE--图片
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 待校验的文本数据(如果包含富文本，请一起传入)
	 */
	@ApiField("text")
	private String text;

	/**
	 * 待校验图片对应地址
	 */
	@ApiListField("urls")
	@ApiField("string")
	private List<String> urls;

    /**
     * Gets data id.
     *
     * @return the data id
     */
    public String getDataId() {
		return this.dataId;
	}

    /**
     * Sets data id.
     *
     * @param dataId the data id
     */
    public void setDataId(String dataId) {
		this.dataId = dataId;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
	}

    /**
     * Gets urls.
     *
     * @return the urls
     */
    public List<String> getUrls() {
		return this.urls;
	}

    /**
     * Sets urls.
     *
     * @param urls the urls
     */
    public void setUrls(List<String> urls) {
		this.urls = urls;
	}

}
