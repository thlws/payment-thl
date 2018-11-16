package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CplifeRoomDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.roominfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoCplifeRoominfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2856667735581782278L;

	/** 
	 * 符合条件的小区房屋信息列表.
	 */
	@ApiListField("room_info")
	@ApiField("cplife_room_detail")
	private List<CplifeRoomDetail> roomInfo;

	/** 
	 * 该小区下已上传的房间总数
	 */
	@ApiField("total_room_number")
	private Long totalRoomNumber;

    /**
     * Sets room info.
     *
     * @param roomInfo the room info
     */
    public void setRoomInfo(List<CplifeRoomDetail> roomInfo) {
		this.roomInfo = roomInfo;
	}

    /**
     * Gets room info.
     *
     * @return the room info
     */
    public List<CplifeRoomDetail> getRoomInfo( ) {
		return this.roomInfo;
	}

    /**
     * Sets total room number.
     *
     * @param totalRoomNumber the total room number
     */
    public void setTotalRoomNumber(Long totalRoomNumber) {
		this.totalRoomNumber = totalRoomNumber;
	}

    /**
     * Gets total room number.
     *
     * @return the total room number
     */
    public Long getTotalRoomNumber( ) {
		return this.totalRoomNumber;
	}

}
