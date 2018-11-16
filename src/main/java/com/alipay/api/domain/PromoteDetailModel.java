package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客商品推广汇总数据
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:27
 */
public class PromoteDetailModel extends AlipayObject {

	private static final long serialVersionUID = 2889116667244429439L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 标的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型（目前只支持ITEM）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 推广标的商品信息
	 */
	@ApiField("item_info")
	private PromoteItemModel itemInfo;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

    /**
     * Gets adv id.
     *
     * @return the adv id
     */
    public String getAdvId() {
		return this.advId;
	}

    /**
     * Sets adv id.
     *
     * @param advId the adv id
     */
    public void setAdvId(String advId) {
		this.advId = advId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets item info.
     *
     * @return the item info
     */
    public PromoteItemModel getItemInfo() {
		return this.itemInfo;
	}

    /**
     * Sets item info.
     *
     * @param itemInfo the item info
     */
    public void setItemInfo(PromoteItemModel itemInfo) {
		this.itemInfo = itemInfo;
	}

    /**
     * Gets promote data.
     *
     * @return the promote data
     */
    public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}

    /**
     * Sets promote data.
     *
     * @param promoteData the promote data
     */
    public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
