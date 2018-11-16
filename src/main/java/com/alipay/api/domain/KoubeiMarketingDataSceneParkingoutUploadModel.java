package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * koubei.marketing.data.scene.parkingout.upload
 *
 * @author auto create
 * @since 1.0, 2018-06-21 17:51:48
 */
public class KoubeiMarketingDataSceneParkingoutUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3781321133383418741L;

	/**
	 * 停车出库场景业务参数
	 */
	@ApiField("biz_info")
	private ParkingOutScene bizInfo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部请求号，确保唯一，用于幂等控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz info.
     *
     * @return the biz info
     */
    public ParkingOutScene getBizInfo() {
		return this.bizInfo;
	}

    /**
     * Sets biz info.
     *
     * @param bizInfo the biz info
     */
    public void setBizInfo(ParkingOutScene bizInfo) {
		this.bizInfo = bizInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
