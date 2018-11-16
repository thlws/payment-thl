package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台写请求
 *
 * @author auto create
 * @since 1.0, 2018-02-09 12:02:34
 */
public class AlipayEcoMycarDataExternalSendModel extends AlipayObject {

	private static final long serialVersionUID = 1741958844317837128L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private String isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * send_data
	 */
	@ApiField("send_data")
	private String sendData;

    /**
     * Gets external system name.
     *
     * @return the external system name
     */
    public String getExternalSystemName() {
		return this.externalSystemName;
	}

    /**
     * Sets external system name.
     *
     * @param externalSystemName the external system name
     */
    public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

    /**
     * Gets is transfer uid.
     *
     * @return the is transfer uid
     */
    public String getIsTransferUid() {
		return this.isTransferUid;
	}

    /**
     * Sets is transfer uid.
     *
     * @param isTransferUid the is transfer uid
     */
    public void setIsTransferUid(String isTransferUid) {
		this.isTransferUid = isTransferUid;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets send data.
     *
     * @return the send data
     */
    public String getSendData() {
		return this.sendData;
	}

    /**
     * Sets send data.
     *
     * @param sendData the send data
     */
    public void setSendData(String sendData) {
		this.sendData = sendData;
	}

}
