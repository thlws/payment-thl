package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryInstBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:13:40
 */
public class AlipayEbppBillSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1568452885464711131L;

	/** 
	 * 已经缓存的的key
	 */
	@ApiField("cachekey")
	private String cachekey;

	/** 
	 * 实时查询欠费单返回对象
	 */
	@ApiListField("inst_bill_info_list")
	@ApiField("query_inst_bill_info")
	private List<QueryInstBillInfo> instBillInfoList;

    /**
     * Sets cachekey.
     *
     * @param cachekey the cachekey
     */
    public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}

    /**
     * Gets cachekey.
     *
     * @return the cachekey
     */
    public String getCachekey( ) {
		return this.cachekey;
	}

    /**
     * Sets inst bill info list.
     *
     * @param instBillInfoList the inst bill info list
     */
    public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}

    /**
     * Gets inst bill info list.
     *
     * @return the inst bill info list
     */
    public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}
