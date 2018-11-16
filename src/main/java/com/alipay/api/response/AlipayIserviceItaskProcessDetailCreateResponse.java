package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendFieldInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.create response.
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:55:00
 */
public class AlipayIserviceItaskProcessDetailCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5719769523117131445L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	/** 
	 * 工单处理状态，枚举值（CREATED，PROCESSING，COMPLETED，CANCELED）
	 */
	@ApiField("alipay_process_status")
	private String alipayProcessStatus;

	/** 
	 * 工单响应扩展信息，业务属性信息都放置在此字段。最多10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

	/** 
	 * 工单信息唯一标识ID，简写为puid。为app_name、process_no和alipay_process_id共同组合而成，供工单推进接口使用。
	 */
	@ApiField("process_unique_id")
	private String processUniqueId;

    /**
     * Sets alipay process id.
     *
     * @param alipayProcessId the alipay process id
     */
    public void setAlipayProcessId(String alipayProcessId) {
		this.alipayProcessId = alipayProcessId;
	}

    /**
     * Gets alipay process id.
     *
     * @return the alipay process id
     */
    public String getAlipayProcessId( ) {
		return this.alipayProcessId;
	}

    /**
     * Sets alipay process status.
     *
     * @param alipayProcessStatus the alipay process status
     */
    public void setAlipayProcessStatus(String alipayProcessStatus) {
		this.alipayProcessStatus = alipayProcessStatus;
	}

    /**
     * Gets alipay process status.
     *
     * @return the alipay process status
     */
    public String getAlipayProcessStatus( ) {
		return this.alipayProcessStatus;
	}

    /**
     * Sets extend field infos.
     *
     * @param extendFieldInfos the extend field infos
     */
    public void setExtendFieldInfos(List<ExtendFieldInfo> extendFieldInfos) {
		this.extendFieldInfos = extendFieldInfos;
	}

    /**
     * Gets extend field infos.
     *
     * @return the extend field infos
     */
    public List<ExtendFieldInfo> getExtendFieldInfos( ) {
		return this.extendFieldInfos;
	}

    /**
     * Sets process unique id.
     *
     * @param processUniqueId the process unique id
     */
    public void setProcessUniqueId(String processUniqueId) {
		this.processUniqueId = processUniqueId;
	}

    /**
     * Gets process unique id.
     *
     * @return the process unique id
     */
    public String getProcessUniqueId( ) {
		return this.processUniqueId;
	}

}
