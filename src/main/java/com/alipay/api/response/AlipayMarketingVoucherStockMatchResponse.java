package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.match response.
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:45:26
 */
public class AlipayMarketingVoucherStockMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4377137159633719532L;

	/** 
	 * 已存在券码列表, 已通过创建接口上传的列表
	 */
	@ApiListField("exist_list")
	@ApiField("string")
	private List<String> existList;

	/** 
	 * 不存券码列表，还未上传过的券码
	 */
	@ApiListField("not_exist_list")
	@ApiField("string")
	private List<String> notExistList;

    /**
     * Sets exist list.
     *
     * @param existList the exist list
     */
    public void setExistList(List<String> existList) {
		this.existList = existList;
	}

    /**
     * Gets exist list.
     *
     * @return the exist list
     */
    public List<String> getExistList( ) {
		return this.existList;
	}

    /**
     * Sets not exist list.
     *
     * @param notExistList the not exist list
     */
    public void setNotExistList(List<String> notExistList) {
		this.notExistList = notExistList;
	}

    /**
     * Gets not exist list.
     *
     * @return the not exist list
     */
    public List<String> getNotExistList( ) {
		return this.notExistList;
	}

}
