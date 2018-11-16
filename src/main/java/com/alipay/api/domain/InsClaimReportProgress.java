package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔报案进度
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:48:09
 */
public class InsClaimReportProgress extends AlipayObject {

	private static final long serialVersionUID = 8666521496637398697L;

	/**
	 * 案件更新内容
	 */
	@ApiField("progress_update_content")
	private String progressUpdateContent;

	/**
	 * 案件更新进度时间
	 */
	@ApiField("progress_update_time")
	private Date progressUpdateTime;

	/**
	 * 进度状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets progress update content.
     *
     * @return the progress update content
     */
    public String getProgressUpdateContent() {
		return this.progressUpdateContent;
	}

    /**
     * Sets progress update content.
     *
     * @param progressUpdateContent the progress update content
     */
    public void setProgressUpdateContent(String progressUpdateContent) {
		this.progressUpdateContent = progressUpdateContent;
	}

    /**
     * Gets progress update time.
     *
     * @return the progress update time
     */
    public Date getProgressUpdateTime() {
		return this.progressUpdateTime;
	}

    /**
     * Sets progress update time.
     *
     * @param progressUpdateTime the progress update time
     */
    public void setProgressUpdateTime(Date progressUpdateTime) {
		this.progressUpdateTime = progressUpdateTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
