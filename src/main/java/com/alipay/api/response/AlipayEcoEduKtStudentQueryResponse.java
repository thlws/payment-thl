package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.student.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoEduKtStudentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8863342591234145149L;

	/** 
	 * 学生姓名
	 */
	@ApiField("child_name")
	private String childName;

	/** 
	 * 班级名字
	 */
	@ApiField("class_name")
	private String className;

	/** 
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/** 
	 * 学生编号
	 */
	@ApiField("student_code")
	private String studentCode;

	/** 
	 * 学生身份证
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/** 
	 * 家长信息
	 */
	@ApiListField("users")
	@ApiField("user_details")
	private List<UserDetails> users;

    /**
     * Sets child name.
     *
     * @param childName the child name
     */
    public void setChildName(String childName) {
		this.childName = childName;
	}

    /**
     * Gets child name.
     *
     * @return the child name
     */
    public String getChildName( ) {
		return this.childName;
	}

    /**
     * Sets class name.
     *
     * @param className the class name
     */
    public void setClassName(String className) {
		this.className = className;
	}

    /**
     * Gets class name.
     *
     * @return the class name
     */
    public String getClassName( ) {
		return this.className;
	}

    /**
     * Sets school name.
     *
     * @param schoolName the school name
     */
    public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

    /**
     * Gets school name.
     *
     * @return the school name
     */
    public String getSchoolName( ) {
		return this.schoolName;
	}

    /**
     * Sets student code.
     *
     * @param studentCode the student code
     */
    public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

    /**
     * Gets student code.
     *
     * @return the student code
     */
    public String getStudentCode( ) {
		return this.studentCode;
	}

    /**
     * Sets student identify.
     *
     * @param studentIdentify the student identify
     */
    public void setStudentIdentify(String studentIdentify) {
		this.studentIdentify = studentIdentify;
	}

    /**
     * Gets student identify.
     *
     * @return the student identify
     */
    public String getStudentIdentify( ) {
		return this.studentIdentify;
	}

    /**
     * Sets users.
     *
     * @param users the users
     */
    public void setUsers(List<UserDetails> users) {
		this.users = users;
	}

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<UserDetails> getUsers( ) {
		return this.users;
	}

}
