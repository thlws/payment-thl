package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业医院挂号通知接口
 *
 * @author auto create
 * @since 1.0, 2016-10-12 10:09:59
 */
public class AlipayEcoMedicalcareHosRegnotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1482922294367642995L;

	/**
	 * 业务类型:
挂号成功：REG_SUCCESS
挂号取销：REG_CANCEL
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 撤销说明
	 */
	@ApiField("cancel_desc")
	private String cancelDesc;

	/**
	 * 取消原因
备注:业务类型是
REG_CANCEL，不可空
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 科室信息
	 */
	@ApiField("dept_info")
	private MedicalHospitalDeptInfo deptInfo;

	/**
	 * 医生信息
	 */
	@ApiField("doctor_info")
	private MedicalHospitalDoctorInfo doctorInfo;

	/**
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 医院信息
	 */
	@ApiField("hos_info")
	private MedicalHospitalInfo hosInfo;

	/**
	 * 排队号
	 */
	@ApiField("line_no")
	private Long lineNo;

	/**
	 * 通知日期,如果不传通知时间，逻辑由支付宝内部消化判断 
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 操作类型：
明确定义数据是创建还是更新
创建并更新CREATE_UPDATE
删除DELETE
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 订单详情链接
链接开头为https或http
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 患者证件号码
获取方式通过支付宝钱包用户信息共享接口中获取证件号或者手工输入证件号
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 证件类型
01	身份证
02	护照
03	军官证
04	士兵证
05	户口本
06	警官证
07	台湾居民来往大陆通行证（简称“台胞证”）
08	港澳居民来往内地通行证（简称“回乡证”）
09	临时身份证
10	港澳通行证
11	营业执照
12	外国人居留证
13	香港身份证
14	武警证
15	组织机构代码证
16	行政机关
17	社会团体
18	军队
19	武警
20	下属机构(具有主管单位批文号)
21	基金会
99	其它
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 重新预约医生链接
链接开头为https或http
备注:如biz_type的值为REG_CANCEL则不可空
	 */
	@ApiField("reg_link")
	private String regLink;

	/**
	 * 第三方唯一序列号（可以是订单号确保唯一）
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 就诊日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("treat_date")
	private Date treatDate;

	/**
	 * 就诊显示日期json格式：
类型：
时间区间类型：range
中文显示类型：cn
备注：
1.range类型HH:mm-HH:mm 中间中横线隔开
{"range":"09:00-10:00"}
2.cn类型
上午  1
下午  2
晚上  3
{"cn":"1"}
	 */
	@ApiField("treat_date_ext")
	private String treatDateExt;

	/**
	 * 支付宝用户Id，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
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
     * Gets cancel desc.
     *
     * @return the cancel desc
     */
    public String getCancelDesc() {
		return this.cancelDesc;
	}

    /**
     * Sets cancel desc.
     *
     * @param cancelDesc the cancel desc
     */
    public void setCancelDesc(String cancelDesc) {
		this.cancelDesc = cancelDesc;
	}

    /**
     * Gets cancel reason.
     *
     * @return the cancel reason
     */
    public String getCancelReason() {
		return this.cancelReason;
	}

    /**
     * Sets cancel reason.
     *
     * @param cancelReason the cancel reason
     */
    public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

    /**
     * Gets dept info.
     *
     * @return the dept info
     */
    public MedicalHospitalDeptInfo getDeptInfo() {
		return this.deptInfo;
	}

    /**
     * Sets dept info.
     *
     * @param deptInfo the dept info
     */
    public void setDeptInfo(MedicalHospitalDeptInfo deptInfo) {
		this.deptInfo = deptInfo;
	}

    /**
     * Gets doctor info.
     *
     * @return the doctor info
     */
    public MedicalHospitalDoctorInfo getDoctorInfo() {
		return this.doctorInfo;
	}

    /**
     * Sets doctor info.
     *
     * @param doctorInfo the doctor info
     */
    public void setDoctorInfo(MedicalHospitalDoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets hos info.
     *
     * @return the hos info
     */
    public MedicalHospitalInfo getHosInfo() {
		return this.hosInfo;
	}

    /**
     * Sets hos info.
     *
     * @param hosInfo the hos info
     */
    public void setHosInfo(MedicalHospitalInfo hosInfo) {
		this.hosInfo = hosInfo;
	}

    /**
     * Gets line no.
     *
     * @return the line no
     */
    public Long getLineNo() {
		return this.lineNo;
	}

    /**
     * Sets line no.
     *
     * @param lineNo the line no
     */
    public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}

    /**
     * Gets notify time.
     *
     * @return the notify time
     */
    public Date getNotifyTime() {
		return this.notifyTime;
	}

    /**
     * Sets notify time.
     *
     * @param notifyTime the notify time
     */
    public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

    /**
     * Gets operate.
     *
     * @return the operate
     */
    public String getOperate() {
		return this.operate;
	}

    /**
     * Sets operate.
     *
     * @param operate the operate
     */
    public void setOperate(String operate) {
		this.operate = operate;
	}

    /**
     * Gets order link.
     *
     * @return the order link
     */
    public String getOrderLink() {
		return this.orderLink;
	}

    /**
     * Sets order link.
     *
     * @param orderLink the order link
     */
    public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
	}

    /**
     * Gets patient card no.
     *
     * @return the patient card no
     */
    public String getPatientCardNo() {
		return this.patientCardNo;
	}

    /**
     * Sets patient card no.
     *
     * @param patientCardNo the patient card no
     */
    public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

    /**
     * Gets patient card type.
     *
     * @return the patient card type
     */
    public String getPatientCardType() {
		return this.patientCardType;
	}

    /**
     * Sets patient card type.
     *
     * @param patientCardType the patient card type
     */
    public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

    /**
     * Gets patient name.
     *
     * @return the patient name
     */
    public String getPatientName() {
		return this.patientName;
	}

    /**
     * Sets patient name.
     *
     * @param patientName the patient name
     */
    public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

    /**
     * Gets reg link.
     *
     * @return the reg link
     */
    public String getRegLink() {
		return this.regLink;
	}

    /**
     * Sets reg link.
     *
     * @param regLink the reg link
     */
    public void setRegLink(String regLink) {
		this.regLink = regLink;
	}

    /**
     * Gets third no.
     *
     * @return the third no
     */
    public String getThirdNo() {
		return this.thirdNo;
	}

    /**
     * Sets third no.
     *
     * @param thirdNo the third no
     */
    public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

    /**
     * Gets treat date.
     *
     * @return the treat date
     */
    public Date getTreatDate() {
		return this.treatDate;
	}

    /**
     * Sets treat date.
     *
     * @param treatDate the treat date
     */
    public void setTreatDate(Date treatDate) {
		this.treatDate = treatDate;
	}

    /**
     * Gets treat date ext.
     *
     * @return the treat date ext
     */
    public String getTreatDateExt() {
		return this.treatDateExt;
	}

    /**
     * Sets treat date ext.
     *
     * @param treatDateExt the treat date ext
     */
    public void setTreatDateExt(String treatDateExt) {
		this.treatDateExt = treatDateExt;
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
