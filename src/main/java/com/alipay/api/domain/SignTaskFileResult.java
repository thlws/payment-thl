package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约任务结果包含文件
 *
 * @author auto create
 * @since 1.0, 2017-08-08 10:42:59
 */
public class SignTaskFileResult extends AlipayObject {

	private static final long serialVersionUID = 3514278233185265845L;

	/**
	 * 业务初始化时传入的流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展参数信息，可根据不同接入方需求定制内容
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 已签名文档列表
	 */
	@ApiListField("signed_file_list")
	@ApiField("signed_file_info")
	private List<SignedFileInfo> signedFileList;

	/**
	 * 签约结果
1）FAIL | 解释：签约失败
2）SUCCESS | 解释：完成
3）PROCESS | 解释：签约中
4）EXPIRED | 解释：任务过期
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约任务编号
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz info.
     *
     * @return the biz info
     */
    public String getBizInfo() {
		return this.bizInfo;
	}

    /**
     * Sets biz info.
     *
     * @param bizInfo the biz info
     */
    public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

    /**
     * Gets signed file list.
     *
     * @return the signed file list
     */
    public List<SignedFileInfo> getSignedFileList() {
		return this.signedFileList;
	}

    /**
     * Sets signed file list.
     *
     * @param signedFileList the signed file list
     */
    public void setSignedFileList(List<SignedFileInfo> signedFileList) {
		this.signedFileList = signedFileList;
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

    /**
     * Gets task id.
     *
     * @return the task id
     */
    public String getTaskId() {
		return this.taskId;
	}

    /**
     * Sets task id.
     *
     * @param taskId the task id
     */
    public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
