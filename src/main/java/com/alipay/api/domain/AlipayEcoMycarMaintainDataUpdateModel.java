package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保养数据变更通知
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:17
 */
public class AlipayEcoMycarMaintainDataUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4483768447631464191L;

	/**
	 * 门店或者服务的编码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 事件类型(1:上下线 2:服务价格)
	 */
	@ApiField("event_id")
	private Long eventId;

	/**
	 * 来源(1:汽车超人)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 类型(1:门店 2:服务)
	 */
	@ApiField("type_id")
	private String typeId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public Long getEventId() {
		return this.eventId;
	}

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

    /**
     * Gets type id.
     *
     * @return the type id
     */
    public String getTypeId() {
		return this.typeId;
	}

    /**
     * Sets type id.
     *
     * @param typeId the type id
     */
    public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
