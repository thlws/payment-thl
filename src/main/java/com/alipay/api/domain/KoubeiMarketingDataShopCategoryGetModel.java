package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商圈店铺分类
 *
 * @author auto create
 * @since 1.0, 2018-07-04 21:31:07
 */
public class KoubeiMarketingDataShopCategoryGetModel extends AlipayObject {

	private static final long serialVersionUID = 5687677382273739569L;

	/**
	 * 该参数标识需要返回几个分类，多余的分类将会放于other字段中，最大值传入50，默认值10
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

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

}
