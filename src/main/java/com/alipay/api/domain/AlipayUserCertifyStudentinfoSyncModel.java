package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步学生认证数据
 *
 * @author auto create
 * @since 1.0, 2018-06-27 15:36:09
 */
public class AlipayUserCertifyStudentinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6158694843957977457L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 教育层次
	 */
	@ApiField("education_level")
	private String educationLevel;

	/**
	 * 入学日期
	 */
	@ApiField("entry_date")
	private String entryDate;

	/**
	 * 预期毕业日期
	 */
	@ApiField("graduation_date")
	private String graduationDate;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets education level.
     *
     * @return the education level
     */
    public String getEducationLevel() {
		return this.educationLevel;
	}

    /**
     * Sets education level.
     *
     * @param educationLevel the education level
     */
    public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

    /**
     * Gets entry date.
     *
     * @return the entry date
     */
    public String getEntryDate() {
		return this.entryDate;
	}

    /**
     * Sets entry date.
     *
     * @param entryDate the entry date
     */
    public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

    /**
     * Gets graduation date.
     *
     * @return the graduation date
     */
    public String getGraduationDate() {
		return this.graduationDate;
	}

    /**
     * Sets graduation date.
     *
     * @param graduationDate the graduation date
     */
    public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets school name.
     *
     * @return the school name
     */
    public String getSchoolName() {
		return this.schoolName;
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
