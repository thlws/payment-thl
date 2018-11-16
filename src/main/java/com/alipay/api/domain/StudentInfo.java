package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生详细信息
 *
 * @author auto create
 * @since 1.0, 2016-02-24 16:54:09
 */
public class StudentInfo extends AlipayObject {

	private static final long serialVersionUID = 1113811583733949981L;

	/**
	 * 学校所在行政区域编码
	 */
	@ApiField("city_no")
	private String cityNo;

	/**
	 * 班级
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 学校名称
	 */
	@ApiField("college_name")
	private String collegeName;

	/**
	 * 学校机构编号
	 */
	@ApiField("college_no")
	private String collegeNo;

	/**
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 院系
	 */
	@ApiField("departments")
	private String departments;

	/**
	 * 入校时间
	 */
	@ApiField("gmt_enrollment")
	private Date gmtEnrollment;

	/**
	 * 毕业时间
	 */
	@ApiField("gmt_graduation")
	private Date gmtGraduation;

	/**
	 * 专业
	 */
	@ApiField("major")
	private String major;

	/**
	 * 学生证号
	 */
	@ApiField("student_id")
	private String studentId;

    /**
     * Gets city no.
     *
     * @return the city no
     */
    public String getCityNo() {
		return this.cityNo;
	}

    /**
     * Sets city no.
     *
     * @param cityNo the city no
     */
    public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

    /**
     * Gets class name.
     *
     * @return the class name
     */
    public String getClassName() {
		return this.className;
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
     * Gets college name.
     *
     * @return the college name
     */
    public String getCollegeName() {
		return this.collegeName;
	}

    /**
     * Sets college name.
     *
     * @param collegeName the college name
     */
    public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

    /**
     * Gets college no.
     *
     * @return the college no
     */
    public String getCollegeNo() {
		return this.collegeNo;
	}

    /**
     * Sets college no.
     *
     * @param collegeNo the college no
     */
    public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}

    /**
     * Gets degree.
     *
     * @return the degree
     */
    public String getDegree() {
		return this.degree;
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
     * Gets departments.
     *
     * @return the departments
     */
    public String getDepartments() {
		return this.departments;
	}

    /**
     * Sets departments.
     *
     * @param departments the departments
     */
    public void setDepartments(String departments) {
		this.departments = departments;
	}

    /**
     * Gets gmt enrollment.
     *
     * @return the gmt enrollment
     */
    public Date getGmtEnrollment() {
		return this.gmtEnrollment;
	}

    /**
     * Sets gmt enrollment.
     *
     * @param gmtEnrollment the gmt enrollment
     */
    public void setGmtEnrollment(Date gmtEnrollment) {
		this.gmtEnrollment = gmtEnrollment;
	}

    /**
     * Gets gmt graduation.
     *
     * @return the gmt graduation
     */
    public Date getGmtGraduation() {
		return this.gmtGraduation;
	}

    /**
     * Sets gmt graduation.
     *
     * @param gmtGraduation the gmt graduation
     */
    public void setGmtGraduation(Date gmtGraduation) {
		this.gmtGraduation = gmtGraduation;
	}

    /**
     * Gets major.
     *
     * @return the major
     */
    public String getMajor() {
		return this.major;
	}

    /**
     * Sets major.
     *
     * @param major the major
     */
    public void setMajor(String major) {
		this.major = major;
	}

    /**
     * Gets student id.
     *
     * @return the student id
     */
    public String getStudentId() {
		return this.studentId;
	}

    /**
     * Sets student id.
     *
     * @param studentId the student id
     */
    public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
