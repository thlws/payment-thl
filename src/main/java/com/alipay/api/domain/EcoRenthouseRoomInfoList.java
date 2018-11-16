package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集中式房间列表
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:37:58
 */
public class EcoRenthouseRoomInfoList extends AlipayObject {

	private static final long serialVersionUID = 2855852461672538669L;

	/**
	 * 房间参与免押金的到期日期YYYY-MM-dd
	 */
	@ApiField("deposit_end_time")
	private Date depositEndTime;

	/**
	 * KA内部存储的房房间ID
	 */
	@ApiField("ka_room_id")
	private String kaRoomId;

	/**
	 * KA内部存储的房源编号
	 */
	@ApiField("room_code")
	private String roomCode;

	/**
	 * KA内部存储的房房间号
	 */
	@ApiField("room_num")
	private String roomNum;

    /**
     * Gets deposit end time.
     *
     * @return the deposit end time
     */
    public Date getDepositEndTime() {
		return this.depositEndTime;
	}

    /**
     * Sets deposit end time.
     *
     * @param depositEndTime the deposit end time
     */
    public void setDepositEndTime(Date depositEndTime) {
		this.depositEndTime = depositEndTime;
	}

    /**
     * Gets ka room id.
     *
     * @return the ka room id
     */
    public String getKaRoomId() {
		return this.kaRoomId;
	}

    /**
     * Sets ka room id.
     *
     * @param kaRoomId the ka room id
     */
    public void setKaRoomId(String kaRoomId) {
		this.kaRoomId = kaRoomId;
	}

    /**
     * Gets room code.
     *
     * @return the room code
     */
    public String getRoomCode() {
		return this.roomCode;
	}

    /**
     * Sets room code.
     *
     * @param roomCode the room code
     */
    public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

    /**
     * Gets room num.
     *
     * @return the room num
     */
    public String getRoomNum() {
		return this.roomNum;
	}

    /**
     * Sets room num.
     *
     * @param roomNum the room num
     */
    public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

}
