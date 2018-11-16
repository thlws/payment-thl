package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LawsuitPersonRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.record.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditPeLawsuitRecordGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8229126129524479178L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 个人涉诉记录
	 */
	@ApiField("lawsuit_person_record")
	private LawsuitPersonRecord lawsuitPersonRecord;

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
     * Sets lawsuit person record.
     *
     * @param lawsuitPersonRecord the lawsuit person record
     */
    public void setLawsuitPersonRecord(LawsuitPersonRecord lawsuitPersonRecord) {
		this.lawsuitPersonRecord = lawsuitPersonRecord;
	}

    /**
     * Gets lawsuit person record.
     *
     * @return the lawsuit person record
     */
    public LawsuitPersonRecord getLawsuitPersonRecord( ) {
		return this.lawsuitPersonRecord;
	}

}
