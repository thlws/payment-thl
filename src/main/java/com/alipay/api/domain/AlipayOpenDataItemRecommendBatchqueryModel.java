package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推荐
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:40:40
 */
public class AlipayOpenDataItemRecommendBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6517459878677872898L;

	/**
	 * 国家地区行政编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 展位ID,支持批量咨询，多个展位用逗号分隔
	 */
	@ApiField("position_ids")
	private String positionIds;

	/**
	 * 用户的支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets area code.
     *
     * @return the area code
     */
    public String getAreaCode() {
		return this.areaCode;
	}

    /**
     * Sets area code.
     *
     * @param areaCode the area code
     */
    public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
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
     * Gets position ids.
     *
     * @return the position ids
     */
    public String getPositionIds() {
		return this.positionIds;
	}

    /**
     * Sets position ids.
     *
     * @param positionIds the position ids
     */
    public void setPositionIds(String positionIds) {
		this.positionIds = positionIds;
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
