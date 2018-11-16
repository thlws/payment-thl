package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品信息列表
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:55
 */
public class AlipayItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 8769988686991671885L;

	/**
	 * 外部单品的描述信息（此字段暂时无用）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 外部单品id列表，传入服务商、商户系统中的商品id。
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets goods list.
     *
     * @return the goods list
     */
    public List<String> getGoodsList() {
		return this.goodsList;
	}

    /**
     * Sets goods list.
     *
     * @param goodsList the goods list
     */
    public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

}
