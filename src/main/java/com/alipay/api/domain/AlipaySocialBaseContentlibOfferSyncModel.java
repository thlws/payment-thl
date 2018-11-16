package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台offer同步接口
 *
 * @author auto create
 * @since 1.0, 2018-05-17 21:31:50
 */
public class AlipaySocialBaseContentlibOfferSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3621253983891498345L;

	/**
	 * 参数名代表同步到我方的业务方来源值，在内容中台中是唯一标示，对接内容中台的时候，由中台PD告知对方
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 内容中台offer同步，具体的数据内容，是个列表，支持批量修改传递
	 */
	@ApiField("display_app")
	private OfferObject displayApp;

	/**
	 * 标示本次操作具体的行为
	 */
	@ApiField("operate_type")
	private String operateType;

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets display app.
     *
     * @return the display app
     */
    public OfferObject getDisplayApp() {
		return this.displayApp;
	}

    /**
     * Sets display app.
     *
     * @param displayApp the display app
     */
    public void setDisplayApp(OfferObject displayApp) {
		this.displayApp = displayApp;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
