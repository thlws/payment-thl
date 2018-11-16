package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishDictionary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:46:01
 */
public class KoubeiCateringDishDictionaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5465294214249619676L;

	/** 
	 * 返回的字典数据列表
	 */
	@ApiListField("kb_dish_dictionary_list")
	@ApiField("kbdish_dictionary")
	private List<KbdishDictionary> kbDishDictionaryList;

    /**
     * Sets kb dish dictionary list.
     *
     * @param kbDishDictionaryList the kb dish dictionary list
     */
    public void setKbDishDictionaryList(List<KbdishDictionary> kbDishDictionaryList) {
		this.kbDishDictionaryList = kbDishDictionaryList;
	}

    /**
     * Gets kb dish dictionary list.
     *
     * @return the kb dish dictionary list
     */
    public List<KbdishDictionary> getKbDishDictionaryList( ) {
		return this.kbDishDictionaryList;
	}

}
