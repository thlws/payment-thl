package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容风险识别接口服务
 *
 * @author auto create
 * @since 1.0, 2018-08-08 10:35:50
 */
public class AlipaySecurityRiskContentAnalyzeModel extends AlipayObject {

	private static final long serialVersionUID = 2827984713835184234L;

	/**
	 * 内容的发表账户号，用于将需要检测的内容（文本、链接、图片、音视频）等和账户进行关联
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户类型：

用户： 0
商户： 1
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 应用主场景
	 */
	@ApiField("app_main_scene")
	private String appMainScene;

	/**
	 * 应用主场景主体ID
	 */
	@ApiField("app_main_scene_id")
	private String appMainSceneId;

	/**
	 * 应用名称，用于区分内容的应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用场景
	 */
	@ApiField("app_scene")
	private String appScene;

	/**
	 * 业务ID，例如发帖的帖子ID
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/**
	 * 进行识别的音频地址列表
	 */
	@ApiListField("audio_urls")
	@ApiField("string")
	private List<String> audioUrls;

	/**
	 * 进行识别的链接地址列表
	 */
	@ApiListField("link_urls")
	@ApiField("string")
	private List<String> linkUrls;

	/**
	 * 进行识别的图片地址列表
	 */
	@ApiListField("picture_urls")
	@ApiField("string")
	private List<String> pictureUrls;

	/**
	 * 发布时间
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 进行识别的视频地址列表
	 */
	@ApiListField("video_urls")
	@ApiField("string")
	private List<String> videoUrls;

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public String getAccountId() {
		return this.accountId;
	}

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

    /**
     * Gets account type.
     *
     * @return the account type
     */
    public String getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets app main scene.
     *
     * @return the app main scene
     */
    public String getAppMainScene() {
		return this.appMainScene;
	}

    /**
     * Sets app main scene.
     *
     * @param appMainScene the app main scene
     */
    public void setAppMainScene(String appMainScene) {
		this.appMainScene = appMainScene;
	}

    /**
     * Gets app main scene id.
     *
     * @return the app main scene id
     */
    public String getAppMainSceneId() {
		return this.appMainSceneId;
	}

    /**
     * Sets app main scene id.
     *
     * @param appMainSceneId the app main scene id
     */
    public void setAppMainSceneId(String appMainSceneId) {
		this.appMainSceneId = appMainSceneId;
	}

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets app scene.
     *
     * @return the app scene
     */
    public String getAppScene() {
		return this.appScene;
	}

    /**
     * Sets app scene.
     *
     * @param appScene the app scene
     */
    public void setAppScene(String appScene) {
		this.appScene = appScene;
	}

    /**
     * Gets app scene data id.
     *
     * @return the app scene data id
     */
    public String getAppSceneDataId() {
		return this.appSceneDataId;
	}

    /**
     * Sets app scene data id.
     *
     * @param appSceneDataId the app scene data id
     */
    public void setAppSceneDataId(String appSceneDataId) {
		this.appSceneDataId = appSceneDataId;
	}

    /**
     * Gets audio urls.
     *
     * @return the audio urls
     */
    public List<String> getAudioUrls() {
		return this.audioUrls;
	}

    /**
     * Sets audio urls.
     *
     * @param audioUrls the audio urls
     */
    public void setAudioUrls(List<String> audioUrls) {
		this.audioUrls = audioUrls;
	}

    /**
     * Gets link urls.
     *
     * @return the link urls
     */
    public List<String> getLinkUrls() {
		return this.linkUrls;
	}

    /**
     * Sets link urls.
     *
     * @param linkUrls the link urls
     */
    public void setLinkUrls(List<String> linkUrls) {
		this.linkUrls = linkUrls;
	}

    /**
     * Gets picture urls.
     *
     * @return the picture urls
     */
    public List<String> getPictureUrls() {
		return this.pictureUrls;
	}

    /**
     * Sets picture urls.
     *
     * @param pictureUrls the picture urls
     */
    public void setPictureUrls(List<String> pictureUrls) {
		this.pictureUrls = pictureUrls;
	}

    /**
     * Gets publish date.
     *
     * @return the publish date
     */
    public Date getPublishDate() {
		return this.publishDate;
	}

    /**
     * Sets publish date.
     *
     * @param publishDate the publish date
     */
    public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
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
     * Gets video urls.
     *
     * @return the video urls
     */
    public List<String> getVideoUrls() {
		return this.videoUrls;
	}

    /**
     * Sets video urls.
     *
     * @param videoUrls the video urls
     */
    public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

}
