package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取推荐商圈商品券接口
 *
 * @author auto create
 * @since 1.0, 2018-07-05 14:11:16
 */
public class KoubeiMarketingDataMallRecommendGetModel extends AlipayObject {

	private static final long serialVersionUID = 7669451222919824822L;

	/**
	 * 获取几条数据，最大值传入50，默认值10
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 获取的数据类型:big_item(商圈商品)、small_item(商圈下门店商品)、big_voucher(商圈券)、small_voucher(商圈下门店券)
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 店铺类目ID
	 */
	@ApiListField("shop_category_ids")
	@ApiField("string")
	private List<String> shopCategoryIds;

	/**
	 * 起始数据下标，默认值0
	 */
	@ApiField("start")
	private Long start;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
		return this.count;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets data type.
     *
     * @return the data type
     */
    public String getDataType() {
		return this.dataType;
	}

    /**
     * Sets data type.
     *
     * @param dataType the data type
     */
    public void setDataType(String dataType) {
		this.dataType = dataType;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public String getDeviceId() {
		return this.deviceId;
	}

    /**
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

    /**
     * Gets shop category ids.
     *
     * @return the shop category ids
     */
    public List<String> getShopCategoryIds() {
		return this.shopCategoryIds;
	}

    /**
     * Sets shop category ids.
     *
     * @param shopCategoryIds the shop category ids
     */
    public void setShopCategoryIds(List<String> shopCategoryIds) {
		this.shopCategoryIds = shopCategoryIds;
	}

    /**
     * Gets start.
     *
     * @return the start
     */
    public Long getStart() {
		return this.start;
	}

    /**
     * Sets start.
     *
     * @param start the start
     */
    public void setStart(Long start) {
		this.start = start;
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
