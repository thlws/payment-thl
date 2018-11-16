package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.jobstudent.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-08-14 11:05:10
 */
public class AlipayEcoEduCampusJobstudentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4719975422977187292L;

	/** 
	 * 备注问题或异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 备用字段，JSON格式
	 */
	@ApiField("content_var")
	private String contentVar;

	/** 
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 状态码描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 学生入学时间
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 是否毕业（1-已毕业；2-未毕业）
	 */
	@ApiField("is_graduate")
	private Long isGraduate;

	/** 
	 * 学生是否在趣校园平台认证(1-认证；2-未认证)
	 */
	@ApiField("is_student")
	private Long isStudent;

	/** 
	 * 返回code编码;成功返回Success
	 */
	@ApiField("isv_code")
	private String isvCode;

	/** 
	 * 学生所在学校
	 */
	@ApiField("school")
	private String school;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent( ) {
		return this.content;
	}

    /**
     * Sets content var.
     *
     * @param contentVar the content var
     */
    public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

    /**
     * Gets content var.
     *
     * @return the content var
     */
    public String getContentVar( ) {
		return this.contentVar;
	}

    /**
     * Sets degree.
     *
     * @param degree the degree
     */
    public void setDegree(String degree) {
		this.degree = degree;
	}

    /**
     * Gets degree.
     *
     * @return the degree
     */
    public String getDegree( ) {
		return this.degree;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription( ) {
		return this.description;
	}

    /**
     * Sets enrollment time.
     *
     * @param enrollmentTime the enrollment time
     */
    public void setEnrollmentTime(String enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}

    /**
     * Gets enrollment time.
     *
     * @return the enrollment time
     */
    public String getEnrollmentTime( ) {
		return this.enrollmentTime;
	}

    /**
     * Sets is graduate.
     *
     * @param isGraduate the is graduate
     */
    public void setIsGraduate(Long isGraduate) {
		this.isGraduate = isGraduate;
	}

    /**
     * Gets is graduate.
     *
     * @return the is graduate
     */
    public Long getIsGraduate( ) {
		return this.isGraduate;
	}

    /**
     * Sets is student.
     *
     * @param isStudent the is student
     */
    public void setIsStudent(Long isStudent) {
		this.isStudent = isStudent;
	}

    /**
     * Gets is student.
     *
     * @return the is student
     */
    public Long getIsStudent( ) {
		return this.isStudent;
	}

    /**
     * Sets isv code.
     *
     * @param isvCode the isv code
     */
    public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

    /**
     * Gets isv code.
     *
     * @return the isv code
     */
    public String getIsvCode( ) {
		return this.isvCode;
	}

    /**
     * Sets school.
     *
     * @param school the school
     */
    public void setSchool(String school) {
		this.school = school;
	}

    /**
     * Gets school.
     *
     * @return the school
     */
    public String getSchool( ) {
		return this.school;
	}

}
