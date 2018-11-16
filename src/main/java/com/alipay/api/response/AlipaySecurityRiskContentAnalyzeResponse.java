package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InfoSecHitDetectItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.analyze response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 10:40:00
 */
public class AlipaySecurityRiskContentAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4434421673252192481L;

	/** 
	 * 内容ID，用于查询异步识别结果时作为查询ID
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/** 
	 * 内容安全同步检测返回的事件id，用于异步获取检测结果
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 命中结果详情
	 */
	@ApiListField("hit_detect_items")
	@ApiField("info_sec_hit_detect_item")
	private List<InfoSecHitDetectItem> hitDetectItems;

	/** 
	 * 是否需要进行异步查询的标志位

need: 需要等待60秒之后进行异步查询
no_need: 不需要，已经同步返回结果
	 */
	@ApiField("need_query")
	private String needQuery;

	/** 
	 * PASSED("数据识别通过，可以在网站上正常显示")

REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")

CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")

DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")

REPLACE("替换部分词为 ***")

WARNING("提示数据，表示内容存在可疑，提示用户操作")

RECOVER("恢复数据，将误判断的内容，恢复回来")
	 */
	@ApiField("result_action")
	private String resultAction;

    /**
     * Sets app scene data id.
     *
     * @param appSceneDataId the app scene data id
     */
    public void setAppSceneDataId(String appSceneDataId) {
		this.appSceneDataId = appSceneDataId;
	}

    /**
     * Gets app scene data id.
     *
     * @return the app scene data id
     */
    public String getAppSceneDataId( ) {
		return this.appSceneDataId;
	}

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(String eventId) {
		this.eventId = eventId;
	}

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId( ) {
		return this.eventId;
	}

    /**
     * Sets hit detect items.
     *
     * @param hitDetectItems the hit detect items
     */
    public void setHitDetectItems(List<InfoSecHitDetectItem> hitDetectItems) {
		this.hitDetectItems = hitDetectItems;
	}

    /**
     * Gets hit detect items.
     *
     * @return the hit detect items
     */
    public List<InfoSecHitDetectItem> getHitDetectItems( ) {
		return this.hitDetectItems;
	}

    /**
     * Sets need query.
     *
     * @param needQuery the need query
     */
    public void setNeedQuery(String needQuery) {
		this.needQuery = needQuery;
	}

    /**
     * Gets need query.
     *
     * @return the need query
     */
    public String getNeedQuery( ) {
		return this.needQuery;
	}

    /**
     * Sets result action.
     *
     * @param resultAction the result action
     */
    public void setResultAction(String resultAction) {
		this.resultAction = resultAction;
	}

    /**
     * Gets result action.
     *
     * @return the result action
     */
    public String getResultAction( ) {
		return this.resultAction;
	}

}
