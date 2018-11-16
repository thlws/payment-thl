package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.contract.get response.
 *
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:32
 */
public class AlipayEcapiprodDrawndnContractGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1721896534225526711L;

	/** 
	 * 合同的内容文本	String	合同的内容文本，为HTML格式
	 */
	@ApiField("contract_content")
	private String contractContent;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets contract content.
     *
     * @param contractContent the contract content
     */
    public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

    /**
     * Gets contract content.
     *
     * @return the contract content
     */
    public String getContractContent( ) {
		return this.contractContent;
	}

    /**
     * Sets contract no.
     *
     * @param contractNo the contract no
     */
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

    /**
     * Gets contract no.
     *
     * @return the contract no
     */
    public String getContractNo( ) {
		return this.contractNo;
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

}
