package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AiOcrTableRow;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.tables.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:10:00
 */
public class AlipayIserviceCognitiveOcrTablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136628369282924319L;

	/** 
	 * true：识别成功
false: 识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 表格内容
	 */
	@ApiListField("tables")
	@ApiField("ai_ocr_table_row")
	private List<AiOcrTableRow> tables;

	/** 
	 * 服务请求唯一标示id
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

    /**
     * Sets tables.
     *
     * @param tables the tables
     */
    public void setTables(List<AiOcrTableRow> tables) {
		this.tables = tables;
	}

    /**
     * Gets tables.
     *
     * @return the tables
     */
    public List<AiOcrTableRow> getTables( ) {
		return this.tables;
	}

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId( ) {
		return this.traceId;
	}

}
