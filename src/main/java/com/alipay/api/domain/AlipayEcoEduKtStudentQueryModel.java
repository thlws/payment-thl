package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息查询
 *
 * @author auto create
 * @since 1.0, 2017-08-14 11:04:54
 */
public class AlipayEcoEduKtStudentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8351197273816162576L;

	/**
	 * 已经签约教育缴费的isv的支付宝PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 学校编号，调用alipay.eco.edu.kt.schoolinfo.modify接口录入学校信息时，接口返回的编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校用来签约支付宝教育缴费的支付宝PID
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 通过alipay.eco.edu.kt.billing.send发送教育缴费账单时，支付宝返回这个student_no,如果支付宝系统中还没有这个学生，则会根据学生的属性，创建一个全局唯一的学生缴费账号并返回。
	 */
	@ApiField("student_no")
	private String studentNo;

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
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
     * Gets student no.
     *
     * @return the student no
     */
    public String getStudentNo() {
		return this.studentNo;
	}

    /**
     * Sets student no.
     *
     * @param studentNo the student no
     */
    public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
