package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询学生家长状态接口
 *
 * @author auto create
 * @since 1.0, 2018-06-19 14:50:00
 */
public class AlipayEcoEduKtParentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7331744343151227726L;

	/**
	 * 孩子或学生姓名
	 */
	@ApiField("child_name")
	private String childName;

	/**
	 * Isv的支付宝pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 学校编码，录入学校接口返回的school_no参数
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
	 */
	@ApiField("user_mobile")
	private String userMobile;

    /**
     * Gets child name.
     *
     * @return the child name
     */
    public String getChildName() {
		return this.childName;
	}

    /**
     * Sets child name.
     *
     * @param childName the child name
     */
    public void setChildName(String childName) {
		this.childName = childName;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets school no.
     *
     * @return the school no
     */
    public String getSchoolNo() {
		return this.schoolNo;
	}

    /**
     * Sets school no.
     *
     * @param schoolNo the school no
     */
    public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

    /**
     * Gets school pid.
     *
     * @return the school pid
     */
    public String getSchoolPid() {
		return this.schoolPid;
	}

    /**
     * Sets school pid.
     *
     * @param schoolPid the school pid
     */
    public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

    /**
     * Gets student code.
     *
     * @return the student code
     */
    public String getStudentCode() {
		return this.studentCode;
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
     * Gets student identify.
     *
     * @return the student identify
     */
    public String getStudentIdentify() {
		return this.studentIdentify;
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
     * Gets user mobile.
     *
     * @return the user mobile
     */
    public String getUserMobile() {
		return this.userMobile;
	}

    /**
     * Sets user mobile.
     *
     * @param userMobile the user mobile
     */
    public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
