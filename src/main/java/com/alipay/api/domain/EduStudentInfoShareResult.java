package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学生信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EduStudentInfoShareResult extends AlipayObject {

	private static final long serialVersionUID = 7448949562378419481L;

	/**
	 * 教育分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 学生详细信息
	 */
	@ApiListField("student_infos")
	@ApiField("student_info")
	private List<StudentInfo> studentInfos;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets student infos.
     *
     * @return the student infos
     */
    public List<StudentInfo> getStudentInfos() {
		return this.studentInfos;
	}

    /**
     * Sets student infos.
     *
     * @param studentInfos the student infos
     */
    public void setStudentInfos(List<StudentInfo> studentInfos) {
		this.studentInfos = studentInfos;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
