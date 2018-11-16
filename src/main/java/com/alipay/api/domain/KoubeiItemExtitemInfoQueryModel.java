package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商品(关联品类，品牌)单个查询
 *
 * @author auto create
 * @since 1.0, 2017-09-27 17:56:42
 */
public class KoubeiItemExtitemInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3792416671249779621L;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public String getGoodsId() {
		return this.goodsId;
	}

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     */
    public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
