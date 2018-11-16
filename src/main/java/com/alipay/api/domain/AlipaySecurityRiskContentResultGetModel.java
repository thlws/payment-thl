package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险识别结果查询接口服务
 *
 * @author auto create
 * @since 1.0, 2018-08-08 10:36:23
 */
public class AlipaySecurityRiskContentResultGetModel extends AlipayObject {

	private static final long serialVersionUID = 6337189517459516668L;

	/**
	 * 应用场景
	 */
	@ApiField("app_scene")
	private String appScene;

	/**
	 * alipay.security.risk.content.analyze （内容风险识别接口服务）中的内容业务ID，用于进行异步识别结果的索引查询
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/**
	 * 内容检测事件id，根据此id查询异步检测结果
	 */
	@ApiField("event_id")
	private String eventId;

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
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId() {
		return this.eventId;
	}

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(String eventId) {
		this.eventId = eventId;
	}

}
