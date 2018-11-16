package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上报线下服务异常
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:37
 */
public class AlipayOfflineMarketReporterrorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2493457941193969237L;

	/**
	 * 发生错误的时候，当前系统的毫秒数，系统会把当前时间构建成Date对象保存为错误发生时间
	 */
	@ApiField("err_time")
	private Long errTime;

	/**
	 * 如果：type是tableNum  请设置table_num字段作为桌码
	 */
	@ApiField("feature")
	private ReportErrorFeature feature;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 上传类型，通过类型来区分不同错误： value=tableNum 代表扫码点菜
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户的ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets err time.
     *
     * @return the err time
     */
    public Long getErrTime() {
		return this.errTime;
	}

    /**
     * Sets err time.
     *
     * @param errTime the err time
     */
    public void setErrTime(Long errTime) {
		this.errTime = errTime;
	}

    /**
     * Gets feature.
     *
     * @return the feature
     */
    public ReportErrorFeature getFeature() {
		return this.feature;
	}

    /**
     * Sets feature.
     *
     * @param feature the feature
     */
    public void setFeature(ReportErrorFeature feature) {
		this.feature = feature;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
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
