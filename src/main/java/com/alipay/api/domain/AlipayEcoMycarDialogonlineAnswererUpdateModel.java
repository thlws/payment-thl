package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改技师信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:41
 */
public class AlipayEcoMycarDialogonlineAnswererUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3222329986172684576L;

	/**
	 * 技师ID
	 */
	@ApiField("answer_id")
	private String answerId;

	/**
	 * 技师状态，0：可用，1：停用
	 */
	@ApiField("answer_status")
	private String answerStatus;

    /**
     * Gets answer id.
     *
     * @return the answer id
     */
    public String getAnswerId() {
		return this.answerId;
	}

    /**
     * Sets answer id.
     *
     * @param answerId the answer id
     */
    public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

    /**
     * Gets answer status.
     *
     * @return the answer status
     */
    public String getAnswerStatus() {
		return this.answerStatus;
	}

    /**
     * Sets answer status.
     *
     * @param answerStatus the answer status
     */
    public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}

}
