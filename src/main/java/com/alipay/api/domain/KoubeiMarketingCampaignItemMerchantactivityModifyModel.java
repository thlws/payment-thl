package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户修改商品代金券
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:55
 */
public class KoubeiMarketingCampaignItemMerchantactivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5511473142664395512L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部回调地址
	 */
	@ApiField("external_callback_url")
	private String externalCallbackUrl;

	/**
	 * 活动结束日期，只可以延长
格式要求为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 活动商品列表，只可以增加
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 券信息，可修改logo/userIntroductions ，validTimeRangeTo只可延长，validDaysRangeTo只可延长
	 */
	@ApiField("voucher_info")
	private MerchantActivityModifyVoucherInfo voucherInfo;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets external callback url.
     *
     * @return the external callback url
     */
    public String getExternalCallbackUrl() {
		return this.externalCallbackUrl;
	}

    /**
     * Sets external callback url.
     *
     * @param externalCallbackUrl the external callback url
     */
    public void setExternalCallbackUrl(String externalCallbackUrl) {
		this.externalCallbackUrl = externalCallbackUrl;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets voucher info.
     *
     * @return the voucher info
     */
    public MerchantActivityModifyVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}

    /**
     * Sets voucher info.
     *
     * @param voucherInfo the voucher info
     */
    public void setVoucherInfo(MerchantActivityModifyVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
