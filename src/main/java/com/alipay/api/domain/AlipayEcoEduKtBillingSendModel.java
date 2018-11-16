package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 教育缴费账单发送接口
 *
 * @author auto create
 * @since 1.0, 2018-09-19 11:07:49
 */
public class AlipayEcoEduKtBillingSendModel extends AlipayObject {

	private static final long serialVersionUID = 5594955845382267552L;

	/**
	 * 总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，
如果是非多选项，是要和缴费项的总和相同，多选模式不做验证
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 缴费账单名称
	 */
	@ApiField("charge_bill_title")
	private String chargeBillTitle;

	/**
	 * 缴费详情：输入json格式字符串。Json定义：key填写缴费项名称，value填写缴费项金额，金额保留2位小数
	 */
	@ApiListField("charge_item")
	@ApiField("charge_items")
	private List<ChargeItems> chargeItem;

	/**
	 * 缴费项模式：空或"N"，表示缴费项不可选，
"M"表示缴费项为可选 ，支持单选和多选。
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 孩子名字
	 */
	@ApiField("child_name")
	private String childName;

	/**
	 * 孩子所在班级
	 */
	@ApiField("class_in")
	private String classIn;

	/**
	 * 截止日期是否生效，与gmt_end发布配合使用,N为gmt_end不生效，用户过期后仍可以缴费；Y为gmt_end生效，用户过期后，不能再缴费。
	 */
	@ApiField("end_enable")
	private String endEnable;

	/**
	 * 缴费截止时间，格式"yyyy-MM-dd HH:mm:ss"，日期要大于当前时间。请注意，过期时间不宜设置过短。
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 孩子所在年级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * ISV端的缴费账单编号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * Isv支付宝pid, 支付宝签约后，返回给ISV编号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 学校编码，录入学校接口返回的参数
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学生的学号，只支持字母和数字类型，一般以教育局学号为准，作为学生的唯一标识。此字段与student_identify、家长user_mobile至少选一个
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 学生的身份证号，如果ISV有学生身份证号，则同步身份证号作为学生唯一标识。此字段与student_code、家长user_mobile至少选一个。
大陆身份证必须是18位 ， 其它地区或国家的身份证开头需要加"IC"开头区分并且不超过18位，但查询账单的时候不要带"IC"
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 孩子的家长信息，最多一次输入10个家长，此字段做为识别家长的孩子用，与student_identify、student_code至少选一个
	 */
	@ApiListField("users")
	@ApiField("user_details")
	private List<UserDetails> users;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets charge bill title.
     *
     * @return the charge bill title
     */
    public String getChargeBillTitle() {
		return this.chargeBillTitle;
	}

    /**
     * Sets charge bill title.
     *
     * @param chargeBillTitle the charge bill title
     */
    public void setChargeBillTitle(String chargeBillTitle) {
		this.chargeBillTitle = chargeBillTitle;
	}

    /**
     * Gets charge item.
     *
     * @return the charge item
     */
    public List<ChargeItems> getChargeItem() {
		return this.chargeItem;
	}

    /**
     * Sets charge item.
     *
     * @param chargeItem the charge item
     */
    public void setChargeItem(List<ChargeItems> chargeItem) {
		this.chargeItem = chargeItem;
	}

    /**
     * Gets charge type.
     *
     * @return the charge type
     */
    public String getChargeType() {
		return this.chargeType;
	}

    /**
     * Sets charge type.
     *
     * @param chargeType the charge type
     */
    public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

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
     * Gets class in.
     *
     * @return the class in
     */
    public String getClassIn() {
		return this.classIn;
	}

    /**
     * Sets class in.
     *
     * @param classIn the class in
     */
    public void setClassIn(String classIn) {
		this.classIn = classIn;
	}

    /**
     * Gets end enable.
     *
     * @return the end enable
     */
    public String getEndEnable() {
		return this.endEnable;
	}

    /**
     * Sets end enable.
     *
     * @param endEnable the end enable
     */
    public void setEndEnable(String endEnable) {
		this.endEnable = endEnable;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
		return this.grade;
	}

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
		this.grade = grade;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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
