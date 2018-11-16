package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区平台房屋信息Mapping关系.
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:09:00
 */
public class CplifeRoomInfoResp extends AlipayObject {

	private static final long serialVersionUID = 4255459628179633493L;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付宝系统房间唯一标示.
	 */
	@ApiField("room_id")
	private String roomId;

    /**
     * Gets out room id.
     *
     * @return the out room id
     */
    public String getOutRoomId() {
		return this.outRoomId;
	}

    /**
     * Sets out room id.
     *
     * @param outRoomId the out room id
     */
    public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

    /**
     * Gets room id.
     *
     * @return the room id
     */
    public String getRoomId() {
		return this.roomId;
	}

    /**
     * Sets room id.
     *
     * @param roomId the room id
     */
    public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
