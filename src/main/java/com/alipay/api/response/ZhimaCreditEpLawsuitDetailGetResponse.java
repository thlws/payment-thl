package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.lawsuit.detail.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditEpLawsuitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6846516366767542571L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业涉诉详情
	 */
	@ApiField("lawsuit_detail")
	private EpInfo lawsuitDetail;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets lawsuit detail.
     *
     * @param lawsuitDetail the lawsuit detail
     */
    public void setLawsuitDetail(EpInfo lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}

    /**
     * Gets lawsuit detail.
     *
     * @return the lawsuit detail
     */
    public EpInfo getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
