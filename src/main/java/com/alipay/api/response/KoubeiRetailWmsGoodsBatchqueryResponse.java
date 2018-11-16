package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.goods.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:42
 */
public class KoubeiRetailWmsGoodsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2894524812865461486L;

	/** 
	 * 货品信息
	 */
	@ApiListField("goods")
	@ApiField("goods_v_o")
	private List<GoodsVO> goods;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(List<GoodsVO> goods) {
		this.goods = goods;
	}

    /**
     * Gets goods.
     *
     * @return the goods
     */
    public List<GoodsVO> getGoods( ) {
		return this.goods;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public String getTotalCount( ) {
		return this.totalCount;
	}

}
