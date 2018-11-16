package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.existed.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:15
 */
public class KoubeiItemExtitemExistedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8697665489491896565L;

	/** 
	 * 商品库中存在的商品编码
	 */
	@ApiListField("existed_list")
	@ApiField("string")
	private List<String> existedList;

    /**
     * Sets existed list.
     *
     * @param existedList the existed list
     */
    public void setExistedList(List<String> existedList) {
		this.existedList = existedList;
	}

    /**
     * Gets existed list.
     *
     * @return the existed list
     */
    public List<String> getExistedList( ) {
		return this.existedList;
	}

}
