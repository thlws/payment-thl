package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主在线问答技师回复
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:34
 */
public class AlipayEcoMycarDialogonlineAnswerPushModel extends AlipayObject {

	private static final long serialVersionUID = 3113999419719541859L;

	/**
	 * 回复内容
	 */
	@ApiField("answer_content")
	private String answerContent;

	/**
	 * 技师ID
	 */
	@ApiField("answer_id")
	private String answerId;

	/**
	 * 技师头像
	 */
	@ApiField("answer_logo")
	private String answerLogo;

	/**
	 * 技师昵称
	 */
	@ApiField("answer_name")
	private String answerName;

	/**
	 * 回复图片
	 */
	@ApiField("answer_pic")
	private String answerPic;

	/**
	 * 回复时间
	 */
	@ApiField("answer_time")
	private String answerTime;

	/**
	 * 1：问题回复， 2：对话回复
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 内容类型，1：文本， 2：图片
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 问题ID
	 */
	@ApiField("question_id")
	private String questionId;

    /**
     * Gets answer content.
     *
     * @return the answer content
     */
    public String getAnswerContent() {
		return this.answerContent;
	}

    /**
     * Sets answer content.
     *
     * @param answerContent the answer content
     */
    public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

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
     * Gets answer logo.
     *
     * @return the answer logo
     */
    public String getAnswerLogo() {
		return this.answerLogo;
	}

    /**
     * Sets answer logo.
     *
     * @param answerLogo the answer logo
     */
    public void setAnswerLogo(String answerLogo) {
		this.answerLogo = answerLogo;
	}

    /**
     * Gets answer name.
     *
     * @return the answer name
     */
    public String getAnswerName() {
		return this.answerName;
	}

    /**
     * Sets answer name.
     *
     * @param answerName the answer name
     */
    public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

    /**
     * Gets answer pic.
     *
     * @return the answer pic
     */
    public String getAnswerPic() {
		return this.answerPic;
	}

    /**
     * Sets answer pic.
     *
     * @param answerPic the answer pic
     */
    public void setAnswerPic(String answerPic) {
		this.answerPic = answerPic;
	}

    /**
     * Gets answer time.
     *
     * @return the answer time
     */
    public String getAnswerTime() {
		return this.answerTime;
	}

    /**
     * Sets answer time.
     *
     * @param answerTime the answer time
     */
    public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

    /**
     * Gets answer type.
     *
     * @return the answer type
     */
    public String getAnswerType() {
		return this.answerType;
	}

    /**
     * Sets answer type.
     *
     * @param answerType the answer type
     */
    public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

    /**
     * Gets content type.
     *
     * @return the content type
     */
    public String getContentType() {
		return this.contentType;
	}

    /**
     * Sets content type.
     *
     * @param contentType the content type
     */
    public void setContentType(String contentType) {
		this.contentType = contentType;
	}

    /**
     * Gets question id.
     *
     * @return the question id
     */
    public String getQuestionId() {
		return this.questionId;
	}

    /**
     * Sets question id.
     *
     * @param questionId the question id
     */
    public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

}
