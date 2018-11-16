package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CaterItemListInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.itemlist.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-25 10:25:18
 */
public class KoubeiCateringItemlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5645577819477679319L;

	/** 
	 * 商品摘要信息列表
	 */
	@ApiListField("item_list")
	@ApiField("cater_item_list_info")
	private List<CaterItemListInfo> itemList;

	/** 
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 当前可查询商品总条目数
	 */
	@ApiField("total_amount")
	private Long totalAmount;

    /**
     * Sets item list.
     *
     * @param itemList the item list
     */
    public void setItemList(List<CaterItemListInfo> itemList) {
		this.itemList = itemList;
	}

    /**
     * Gets item list.
     *
     * @return the item list
     */
    public List<CaterItemListInfo> getItemList( ) {
		return this.itemList;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public Long getTotalAmount( ) {
		return this.totalAmount;
	}

}
