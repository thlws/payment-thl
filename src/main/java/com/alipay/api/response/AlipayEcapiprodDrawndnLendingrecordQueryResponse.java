package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LendingRecords;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.lendingrecord.query response.
 *
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:36
 */
public class AlipayEcapiprodDrawndnLendingrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2167329962216811876L;

	/** 
	 * 放款流水
	 */
	@ApiListField("lending_records")
	@ApiField("lending_records")
	private List<LendingRecords> lendingRecords;

	/** 
	 * 代表一次请求的唯一编号，用于追溯问题，多方联调查询问题时，ISV 可以提供该RequestId给网关，网关用来查询本次请求的具体日志
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets lending records.
     *
     * @param lendingRecords the lending records
     */
    public void setLendingRecords(List<LendingRecords> lendingRecords) {
		this.lendingRecords = lendingRecords;
	}

    /**
     * Gets lending records.
     *
     * @return the lending records
     */
    public List<LendingRecords> getLendingRecords( ) {
		return this.lendingRecords;
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
