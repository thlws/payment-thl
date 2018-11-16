package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemDiagnoseType;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.dishdiagnosetype.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingDataDishdiagnosetypeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6464486259759296597L;

	/** 
	 * 菜品类型list
	 */
	@ApiListField("item_diagnose_type_list")
	@ApiField("item_diagnose_type")
	private List<ItemDiagnoseType> itemDiagnoseTypeList;

    /**
     * Sets item diagnose type list.
     *
     * @param itemDiagnoseTypeList the item diagnose type list
     */
    public void setItemDiagnoseTypeList(List<ItemDiagnoseType> itemDiagnoseTypeList) {
		this.itemDiagnoseTypeList = itemDiagnoseTypeList;
	}

    /**
     * Gets item diagnose type list.
     *
     * @return the item diagnose type list
     */
    public List<ItemDiagnoseType> getItemDiagnoseTypeList( ) {
		return this.itemDiagnoseTypeList;
	}

}
