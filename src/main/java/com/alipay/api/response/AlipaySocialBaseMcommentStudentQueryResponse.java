package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.student.query response.
 *
 * @author auto create
 * @since 1.0, 2016-10-21 15:38:29
 */
public class AlipaySocialBaseMcommentStudentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4664214183523222142L;

	/** 
	 * 大学编码
	 */
	@ApiField("campus_code")
	private String campusCode;

	/** 
	 * 大学名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/** 
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 入学年份
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 毕业时间
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/** 
	 * 省份编码 引用方无需处理
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 外网无需处理此字段
	 */
	@ApiField("province_name")
	private String provinceName;

	/** 
	 * UNKNOWN(0, "未认证"),
    UNDERGRADUATE(1, "在校生"),
    GRADUATED(2, "毕业生"),
    OFFICAL(3, "官方"),    
    UNIVERSITY(4, "学校"),
    NEWBORN(6, "新生"),
    EXPIRATION(7, "认证失效")
	 */
	@ApiField("status_enum")
	private String statusEnum;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets campus code.
     *
     * @param campusCode the campus code
     */
    public void setCampusCode(String campusCode) {
		this.campusCode = campusCode;
	}

    /**
     * Gets campus code.
     *
     * @return the campus code
     */
    public String getCampusCode( ) {
		return this.campusCode;
	}

    /**
     * Sets campus name.
     *
     * @param campusName the campus name
     */
    public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

    /**
     * Gets campus name.
     *
     * @return the campus name
     */
    public String getCampusName( ) {
		return this.campusName;
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
     * Sets graduation time.
     *
     * @param graduationTime the graduation time
     */
    public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}

    /**
     * Gets graduation time.
     *
     * @return the graduation time
     */
    public String getGraduationTime( ) {
		return this.graduationTime;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode( ) {
		return this.provinceCode;
	}

    /**
     * Sets province name.
     *
     * @param provinceName the province name
     */
    public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

    /**
     * Gets province name.
     *
     * @return the province name
     */
    public String getProvinceName( ) {
		return this.provinceName;
	}

    /**
     * Sets status enum.
     *
     * @param statusEnum the status enum
     */
    public void setStatusEnum(String statusEnum) {
		this.statusEnum = statusEnum;
	}

    /**
     * Gets status enum.
     *
     * @return the status enum
     */
    public String getStatusEnum( ) {
		return this.statusEnum;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
