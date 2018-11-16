package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendFieldInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-28 17:15:00
 */
public class AlipayIserviceItaskProcessDetailModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2243935825655873614L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	/** 
	 * 工单处理状态，枚举（CREATED，PROCESSING，COMPLETED，CANCELED）
	 */
	@ApiField("alipay_process_status")
	private String alipayProcessStatus;

	/** 
	 * 外部工单业务扩展字段，业务属性信息都放置在此字段。最多10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

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

}
