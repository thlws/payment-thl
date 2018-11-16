package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询商品编码对应的商品是否存在
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiItemExtitemExistedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5774693118483685698L;

	/**
	 * 商品编码列表, 商品编码数量不超过100条。
	 */
	@ApiListField("code_list")
	@ApiField("string")
	private List<String> codeList;

    /**
     * Gets code list.
     *
     * @return the code list
     */
    public List<String> getCodeList() {
		return this.codeList;
	}

    /**
     * Sets code list.
     *
     * @param codeList the code list
     */
    public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

}
