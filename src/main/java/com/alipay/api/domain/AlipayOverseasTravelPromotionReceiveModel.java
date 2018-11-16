package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游优惠领取
 *
 * @author auto create
 * @since 1.0, 2018-04-17 15:12:47
 */
public class AlipayOverseasTravelPromotionReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 6716341372627247789L;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 发现平台优惠id
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便与外部排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：HAVANA为集团havanaId，ALIPAY为支付宝2088开头用户id
	 */
	@ApiField("user_id_type")
	private String userIdType;

    /**
     * Gets ch info.
     *
     * @return the ch info
     */
    public String getChInfo() {
		return this.chInfo;
	}

    /**
     * Sets ch info.
     *
     * @param chInfo the ch info
     */
    public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

    /**
     * Gets promotion id.
     *
     * @return the promotion id
     */
    public String getPromotionId() {
		return this.promotionId;
	}

    /**
     * Sets promotion id.
     *
     * @param promotionId the promotion id
     */
    public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId() {
		return this.uniqueId;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
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

    /**
     * Gets user id type.
     *
     * @return the user id type
     */
    public String getUserIdType() {
		return this.userIdType;
	}

    /**
     * Sets user id type.
     *
     * @param userIdType the user id type
     */
    public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
