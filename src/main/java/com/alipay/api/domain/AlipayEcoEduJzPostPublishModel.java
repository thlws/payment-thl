package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 兼职平台贴子发布接口
 *
 * @author auto create
 * @since 1.0, 2016-09-08 17:25:53
 */
public class AlipayEcoEduJzPostPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3647321867222944466L;

	/**
	 * 年龄要求范围
	 */
	@ApiField("age_demand")
	private EduAgeDemand ageDemand;

	/**
	 * 工资/提成信息备注
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 客服联系方式
	 */
	@ApiField("company_contact")
	private String companyContact;

	/**
	 * 商户 Logo
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 职位所属公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系方式 手机座机
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 工作结束的日期
	 */
	@ApiField("date_end")
	private String dateEnd;

	/**
	 * 工作开始的日期
	 */
	@ApiField("date_start")
	private String dateStart;

	/**
	 * 报名截止日期
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 性别要求 0:不限；1:男；2:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 招聘人数
	 */
	@ApiField("hire_number")
	private String hireNumber;

	/**
	 * 有无提成0:没有1:有
	 */
	@ApiField("is_commission")
	private String isCommission;

	/**
	 * 职位描述：工作内容、岗位要求
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 工作类型，0:短期兼职，1:长期兼职，2:周末兼职
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 类型代码：兼职类型
1：传单派发
2：促销导购
3：话务客服
4：礼仪模特
5：家教助教
6：服务员
7：问卷调查
8：审核录入
9：地推拉访
10：其他
11：打包分拣
12：展会协助
13：充场
14：实习生
15：安保
16：送餐员
17：演出
18：翻译
19：校园代理
20：义工
21：食品促销
22：临时工
	 */
	@ApiField("part_time_type")
	private String partTimeType;

	/**
	 * 薪资待遇
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 薪资待遇备注
	 */
	@ApiField("payment_remark")
	private String paymentRemark;

	/**
	 * 结算方式：0日结；1次日结； 2周结；3半月结； 4月结； 5完工结；
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 工资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 薪资单位：元/天；元/周；元/月(与结算方式匹配)
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 兼职服务商职位id
	 */
	@ApiField("service_post_id")
	private String servicePostId;

	/**
	 * 职位供应商信息
	 */
	@ApiField("source_info")
	private EduSourceInfo sourceInfo;

	/**
	 * 职位特殊要求多选项目：
- 普通话熟练；
- 有健康证； 
- 自备正装；
- 携带学生证；
- 沟通能力强；
- 形象好；
- 服从安排；
- 积极主动；
- 认真负责；
- 活泼开朗；
- 吃苦耐劳；
	 */
	@ApiListField("special_demand")
	@ApiField("string")
	private List<String> specialDemand;

	/**
	 * 职位标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 福利，1:包工作餐；2:包住宿；3:交通补助
	 */
	@ApiListField("welfare")
	@ApiField("string")
	private List<String> welfare;

	/**
	 * 工作地点
	 */
	@ApiListField("work_address")
	@ApiField("edu_work_address")
	private List<EduWorkAddress> workAddress;

	/**
	 * 工作时间备注
	 */
	@ApiField("work_time_remark")
	private String workTimeRemark;

	/**
	 * 每天工作时长 <以小时计>
	 */
	@ApiField("working_hours")
	private String workingHours;

    /**
     * Gets age demand.
     *
     * @return the age demand
     */
    public EduAgeDemand getAgeDemand() {
		return this.ageDemand;
	}

    /**
     * Sets age demand.
     *
     * @param ageDemand the age demand
     */
    public void setAgeDemand(EduAgeDemand ageDemand) {
		this.ageDemand = ageDemand;
	}

    /**
     * Gets commission.
     *
     * @return the commission
     */
    public String getCommission() {
		return this.commission;
	}

    /**
     * Sets commission.
     *
     * @param commission the commission
     */
    public void setCommission(String commission) {
		this.commission = commission;
	}

    /**
     * Gets company contact.
     *
     * @return the company contact
     */
    public String getCompanyContact() {
		return this.companyContact;
	}

    /**
     * Sets company contact.
     *
     * @param companyContact the company contact
     */
    public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}

    /**
     * Gets company logo.
     *
     * @return the company logo
     */
    public String getCompanyLogo() {
		return this.companyLogo;
	}

    /**
     * Sets company logo.
     *
     * @param companyLogo the company logo
     */
    public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets contact phone.
     *
     * @return the contact phone
     */
    public String getContactPhone() {
		return this.contactPhone;
	}

    /**
     * Sets contact phone.
     *
     * @param contactPhone the contact phone
     */
    public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

    /**
     * Gets date end.
     *
     * @return the date end
     */
    public String getDateEnd() {
		return this.dateEnd;
	}

    /**
     * Sets date end.
     *
     * @param dateEnd the date end
     */
    public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

    /**
     * Gets date start.
     *
     * @return the date start
     */
    public String getDateStart() {
		return this.dateStart;
	}

    /**
     * Sets date start.
     *
     * @param dateStart the date start
     */
    public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

    /**
     * Gets deadline.
     *
     * @return the deadline
     */
    public String getDeadline() {
		return this.deadline;
	}

    /**
     * Sets deadline.
     *
     * @param deadline the deadline
     */
    public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
		return this.gender;
	}

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
		this.gender = gender;
	}

    /**
     * Gets hire number.
     *
     * @return the hire number
     */
    public String getHireNumber() {
		return this.hireNumber;
	}

    /**
     * Sets hire number.
     *
     * @param hireNumber the hire number
     */
    public void setHireNumber(String hireNumber) {
		this.hireNumber = hireNumber;
	}

    /**
     * Gets is commission.
     *
     * @return the is commission
     */
    public String getIsCommission() {
		return this.isCommission;
	}

    /**
     * Sets is commission.
     *
     * @param isCommission the is commission
     */
    public void setIsCommission(String isCommission) {
		this.isCommission = isCommission;
	}

    /**
     * Gets job desc.
     *
     * @return the job desc
     */
    public String getJobDesc() {
		return this.jobDesc;
	}

    /**
     * Sets job desc.
     *
     * @param jobDesc the job desc
     */
    public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

    /**
     * Gets job type.
     *
     * @return the job type
     */
    public String getJobType() {
		return this.jobType;
	}

    /**
     * Sets job type.
     *
     * @param jobType the job type
     */
    public void setJobType(String jobType) {
		this.jobType = jobType;
	}

    /**
     * Gets part time type.
     *
     * @return the part time type
     */
    public String getPartTimeType() {
		return this.partTimeType;
	}

    /**
     * Sets part time type.
     *
     * @param partTimeType the part time type
     */
    public void setPartTimeType(String partTimeType) {
		this.partTimeType = partTimeType;
	}

    /**
     * Gets payment.
     *
     * @return the payment
     */
    public String getPayment() {
		return this.payment;
	}

    /**
     * Sets payment.
     *
     * @param payment the payment
     */
    public void setPayment(String payment) {
		this.payment = payment;
	}

    /**
     * Gets payment remark.
     *
     * @return the payment remark
     */
    public String getPaymentRemark() {
		return this.paymentRemark;
	}

    /**
     * Sets payment remark.
     *
     * @param paymentRemark the payment remark
     */
    public void setPaymentRemark(String paymentRemark) {
		this.paymentRemark = paymentRemark;
	}

    /**
     * Gets payment type.
     *
     * @return the payment type
     */
    public String getPaymentType() {
		return this.paymentType;
	}

    /**
     * Sets payment type.
     *
     * @param paymentType the payment type
     */
    public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public String getSalary() {
		return this.salary;
	}

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(String salary) {
		this.salary = salary;
	}

    /**
     * Gets salary unit.
     *
     * @return the salary unit
     */
    public String getSalaryUnit() {
		return this.salaryUnit;
	}

    /**
     * Sets salary unit.
     *
     * @param salaryUnit the salary unit
     */
    public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

    /**
     * Gets service post id.
     *
     * @return the service post id
     */
    public String getServicePostId() {
		return this.servicePostId;
	}

    /**
     * Sets service post id.
     *
     * @param servicePostId the service post id
     */
    public void setServicePostId(String servicePostId) {
		this.servicePostId = servicePostId;
	}

    /**
     * Gets source info.
     *
     * @return the source info
     */
    public EduSourceInfo getSourceInfo() {
		return this.sourceInfo;
	}

    /**
     * Sets source info.
     *
     * @param sourceInfo the source info
     */
    public void setSourceInfo(EduSourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}

    /**
     * Gets special demand.
     *
     * @return the special demand
     */
    public List<String> getSpecialDemand() {
		return this.specialDemand;
	}

    /**
     * Sets special demand.
     *
     * @param specialDemand the special demand
     */
    public void setSpecialDemand(List<String> specialDemand) {
		this.specialDemand = specialDemand;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets welfare.
     *
     * @return the welfare
     */
    public List<String> getWelfare() {
		return this.welfare;
	}

    /**
     * Sets welfare.
     *
     * @param welfare the welfare
     */
    public void setWelfare(List<String> welfare) {
		this.welfare = welfare;
	}

    /**
     * Gets work address.
     *
     * @return the work address
     */
    public List<EduWorkAddress> getWorkAddress() {
		return this.workAddress;
	}

    /**
     * Sets work address.
     *
     * @param workAddress the work address
     */
    public void setWorkAddress(List<EduWorkAddress> workAddress) {
		this.workAddress = workAddress;
	}

    /**
     * Gets work time remark.
     *
     * @return the work time remark
     */
    public String getWorkTimeRemark() {
		return this.workTimeRemark;
	}

    /**
     * Sets work time remark.
     *
     * @param workTimeRemark the work time remark
     */
    public void setWorkTimeRemark(String workTimeRemark) {
		this.workTimeRemark = workTimeRemark;
	}

    /**
     * Gets working hours.
     *
     * @return the working hours
     */
    public String getWorkingHours() {
		return this.workingHours;
	}

    /**
     * Sets working hours.
     *
     * @param workingHours the working hours
     */
    public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

}
