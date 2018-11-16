package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.contract.batchinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:15:00
 */
public class ZhimaCreditPeContractBatchinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152628812483833527L;

	/** 
	 * 本批次记录条数
	 */
	@ApiField("batch_record")
	private Long batchRecord;

	/** 
	 * 记录数据，通过gzip压缩
	 */
	@ApiField("data_content")
	private String dataContent;

	/** 
	 * 数据MD5签名
	 */
	@ApiField("md_5_sign")
	private String md5Sign;

	/** 
	 * 下一个查询批次号
	 */
	@ApiField("next_batch_index")
	private Long nextBatchIndex;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_record")
	private Long totalRecord;

	/** 
	 * 查询事务号，包含时间戳因素，只会返回在这个事务号之前创建的相关合约
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Sets batch record.
     *
     * @param batchRecord the batch record
     */
    public void setBatchRecord(Long batchRecord) {
		this.batchRecord = batchRecord;
	}

    /**
     * Gets batch record.
     *
     * @return the batch record
     */
    public Long getBatchRecord( ) {
		return this.batchRecord;
	}

    /**
     * Sets data content.
     *
     * @param dataContent the data content
     */
    public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

    /**
     * Gets data content.
     *
     * @return the data content
     */
    public String getDataContent( ) {
		return this.dataContent;
	}

    /**
     * Sets md 5 sign.
     *
     * @param md5Sign the md 5 sign
     */
    public void setMd5Sign(String md5Sign) {
		this.md5Sign = md5Sign;
	}

    /**
     * Gets md 5 sign.
     *
     * @return the md 5 sign
     */
    public String getMd5Sign( ) {
		return this.md5Sign;
	}

    /**
     * Sets next batch index.
     *
     * @param nextBatchIndex the next batch index
     */
    public void setNextBatchIndex(Long nextBatchIndex) {
		this.nextBatchIndex = nextBatchIndex;
	}

    /**
     * Gets next batch index.
     *
     * @return the next batch index
     */
    public Long getNextBatchIndex( ) {
		return this.nextBatchIndex;
	}

    /**
     * Sets total record.
     *
     * @param totalRecord the total record
     */
    public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}

    /**
     * Gets total record.
     *
     * @return the total record
     */
    public Long getTotalRecord( ) {
		return this.totalRecord;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId( ) {
		return this.transactionId;
	}

}
