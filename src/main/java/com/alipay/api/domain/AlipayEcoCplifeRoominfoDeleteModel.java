package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除物业小区房屋信息
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:18:50
 */
public class AlipayEcoCplifeRoominfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8144481823656825433L;

	/**
	 * 请求批次号，由商户自定义，在商户系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待删除的商户房间列表，一次API调用至多传入200条待删除的房间ID(房间在商户系统的唯一ID标识)
	 */
	@ApiListField("out_room_id_set")
	@ApiField("string")
	private List<String> outRoomIdSet;

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets community id.
     *
     * @return the community id
     */
    public String getCommunityId() {
		return this.communityId;
	}

    /**
     * Sets community id.
     *
     * @param communityId the community id
     */
    public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

    /**
     * Gets out room id set.
     *
     * @return the out room id set
     */
    public List<String> getOutRoomIdSet() {
		return this.outRoomIdSet;
	}

    /**
     * Sets out room id set.
     *
     * @param outRoomIdSet the out room id set
     */
    public void setOutRoomIdSet(List<String> outRoomIdSet) {
		this.outRoomIdSet = outRoomIdSet;
	}

}
