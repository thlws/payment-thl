package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑返回数据安全信息
 *
 * @author auto create
 * @since 1.0, 2018-06-20 11:16:26
 */
public class DataSecCheckResult extends AlipayObject {

	private static final long serialVersionUID = 2864833994135476525L;

	/**
	 * 口碑校验时间
	 */
	@ApiField("check_date")
	private String checkDate;

	/**
	 * 保证传入唯一，用于标识唯一文本或图片
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据返回状态 PASSED--数据识别通过，DELETE--删除，SYNCNOTICE--异步通知，RETRY--需要重试
	 */
	@ApiField("data_status")
	private String dataStatus;

    /**
     * Gets check date.
     *
     * @return the check date
     */
    public String getCheckDate() {
		return this.checkDate;
	}

    /**
     * Sets check date.
     *
     * @param checkDate the check date
     */
    public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

    /**
     * Gets data id.
     *
     * @return the data id
     */
    public String getDataId() {
		return this.dataId;
	}

    /**
     * Sets data id.
     *
     * @param dataId the data id
     */
    public void setDataId(String dataId) {
		this.dataId = dataId;
	}

    /**
     * Gets data status.
     *
     * @return the data status
     */
    public String getDataStatus() {
		return this.dataStatus;
	}

    /**
     * Sets data status.
     *
     * @param dataStatus the data status
     */
    public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

}
