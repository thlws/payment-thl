package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户会员交易习惯查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:58
 */
public class KoubeiMarketingDataTradeHabbitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1856499872543195881L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 门店列表,门店用逗号分割，最多支持10个门店。
不填时,则为商户维度汇总数据
	 */
	@ApiField("store_ids")
	private String storeIds;

    /**
     * Gets biz date.
     *
     * @return the biz date
     */
    public String getBizDate() {
		return this.bizDate;
	}

    /**
     * Sets biz date.
     *
     * @param bizDate the biz date
     */
    public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

    /**
     * Gets store ids.
     *
     * @return the store ids
     */
    public String getStoreIds() {
		return this.storeIds;
	}

    /**
     * Sets store ids.
     *
     * @param storeIds the store ids
     */
    public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

}
