package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherRec;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.shoppingmallrec.voucher.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:24
 */
public class AlipayDataDataserviceShoppingmallrecVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8675117763979135481L;

	/** 
	 * 本次推荐的id, 开发者埋点需带入此参数
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 本次请求的全局唯一标识, 支持英文字母和数字, 由开发者自行定义,和入参request_id一致
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 商场券的推荐列表
	 */
	@ApiListField("voucher_recommend_list")
	@ApiField("voucher_rec")
	private List<VoucherRec> voucherRecommendList;

    /**
     * Sets recommend id.
     *
     * @param recommendId the recommend id
     */
    public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}

    /**
     * Gets recommend id.
     *
     * @return the recommend id
     */
    public String getRecommendId( ) {
		return this.recommendId;
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
     * Sets voucher recommend list.
     *
     * @param voucherRecommendList the voucher recommend list
     */
    public void setVoucherRecommendList(List<VoucherRec> voucherRecommendList) {
		this.voucherRecommendList = voucherRecommendList;
	}

    /**
     * Gets voucher recommend list.
     *
     * @return the voucher recommend list
     */
    public List<VoucherRec> getVoucherRecommendList( ) {
		return this.voucherRecommendList;
	}

}
