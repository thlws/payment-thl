package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.tablecode.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-03 16:38:19
 */
public class KoubeiCateringTablecodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1328128784429839891L;

	/** 
	 * 返回值为shop_code表示只返回了门店码 返回值为table_code表示返回了桌码跟门店码
	 */
	@ApiField("code_flag")
	private String codeFlag;

	/** 
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 桌码
	 */
	@ApiField("table_num")
	private String tableNum;

    /**
     * Sets code flag.
     *
     * @param codeFlag the code flag
     */
    public void setCodeFlag(String codeFlag) {
		this.codeFlag = codeFlag;
	}

    /**
     * Gets code flag.
     *
     * @return the code flag
     */
    public String getCodeFlag( ) {
		return this.codeFlag;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId( ) {
		return this.shopId;
	}

    /**
     * Sets table num.
     *
     * @param tableNum the table num
     */
    public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

    /**
     * Gets table num.
     *
     * @return the table num
     */
    public String getTableNum( ) {
		return this.tableNum;
	}

}
