package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学生信息更新
 *
 * @author auto create
 * @since 1.0, 2017-11-06 11:46:27
 */
public class AlipayEcoEduKtStudentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2514786782619186524L;

	/**
	 * 修改后的学生姓名
本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
	 */
	@ApiField("child_name")
	private String childName;

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
	 * 区分ISV操作，“D”表示删除，“U”表示更新，区分大小写。
如果为U，则学生名字，学号，身份证至少填写一项
	 */
	@ApiField("status")
	private String status;

	/**
	 * 修改后的学号
本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 修改后的身份证号码
本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 支付宝-中小学-教育缴费生成的学生唯一编号
	 */
	@ApiField("student_no")
	private String studentNo;

	/**
	 * 孩子的家长信息，最多一次输入20个家长。如果输入的家长信息不存在，则该改学生增加家长信息
本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
	 */
	@ApiListField("users")
	@ApiField("user_details")
	private List<UserDetails> users;

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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<UserDetails> getUsers() {
		return this.users;
	}

    /**
     * Sets users.
     *
     * @param users the users
     */
    public void setUsers(List<UserDetails> users) {
		this.users = users;
	}

}
