package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliverAddress;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userinfo.share response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 19:56:59
 */
public class AlipayUserUserinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 7767292561337627198L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区域编码，暂时不返回值
	 */
	@ApiField("address_code")
	private String addressCode;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 【注意】当is_balance_frozen为“F”时，改字段不会返回.
CTU ---- CTU冻结，允许用户开启
ALIBABA ---- ALIBABA冻结，允许用户开启
SERVER ---- 后台冻结，允许用户开启
USER ----  用户冻结 
CTU_N---- CTU冻结，不允许用户开启
ALIBABA_N ---- ALIBABA冻结，不允许用户开启
SERVER_N ---- 后台冻结，不允许用户开启
UNKNOWN ---- 降级、或查询超时
	 */
	@ApiField("balance_freeze_type")
	private String balanceFreezeType;

	/** 
	 * 用户生日
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 0:身份证
1:护照
2:军官证
3:士兵证
4:回乡证
5:临时身份证
6:户口簿
7:警官证
8:台胞证
9:营业执照
10其它证件
	 */
	@ApiField("cert_type_value")
	private String certTypeValue;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 是否默认收货地址，暂时不返回值
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/** 
	 * 收货人地址列表
	 */
	@ApiListField("deliver_address_list")
	@ApiField("deliver_address")
	private List<DeliverAddress> deliverAddressList;

	/** 
	 * 收货人所在区县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/** 
	 * 收货人所在城市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/** 
	 * 收货人全称
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/** 
	 * 收货地址的联系人移动电话。
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/** 
	 * 收货地址的联系人固定电话。
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/** 
	 * 收货人所在省份
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/** 
	 * 用户支付宝账号绑定的邮箱地址
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 姓氏，取的是realName中的首个字符，对非中文、中文复姓支持较差。
	 */
	@ApiField("family_name")
	private String familyName;

	/** 
	 * 公司名称（用户类型是公司类型时公司名称才有此字段）。
	 */
	@ApiField("firm_name")
	private String firmName;

	/** 
	 * 性别（F：女性；M：男性）
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * T为是银行卡认证，F为非银行卡认证。
	 */
	@ApiField("is_bank_auth")
	private String isBankAuth;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * T：表示A类实名认证；F：表示非A类实名认证
	 */
	@ApiField("is_certify_grade_a")
	private String isCertifyGradeA;

	/** 
	 * T为是身份证认证，F为非身份证认证。
	 */
	@ApiField("is_id_auth")
	private String isIdAuth;

	/** 
	 * T为通过营业执照认证，F为没有通过
	 */
	@ApiField("is_licence_auth")
	private String isLicenceAuth;

	/** 
	 * T为是手机认证，F为非手机认证。
	 */
	@ApiField("is_mobile_auth")
	private String isMobileAuth;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 手机号码。
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 省份名称。
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 用户的真实姓名。
	 */
	@ApiField("real_name")
	private String realName;

	/** 
	 * 生日的月和日，MMdd格式
	 */
	@ApiField("reduced_birthday")
	private String reducedBirthday;

	/** 
	 * 用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户状态（Q/T/B/W）。
Q代表快速注册用户
T代表已认证用户
B代表被冻结账户
W代表已注册，未激活的账户
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 用户类型（1/2）
1代表公司账户2代表个人账户
	 */
	@ApiField("user_type_value")
	private String userTypeValue;

	/** 
	 * 邮政编码。
	 */
	@ApiField("zip")
	private String zip;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
	}

    /**
     * Sets address code.
     *
     * @param addressCode the address code
     */
    public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

    /**
     * Gets address code.
     *
     * @return the address code
     */
    public String getAddressCode( ) {
		return this.addressCode;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(String area) {
		this.area = area;
	}

    /**
     * Gets area.
     *
     * @return the area
     */
    public String getArea( ) {
		return this.area;
	}

    /**
     * Sets avatar.
     *
     * @param avatar the avatar
     */
    public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar( ) {
		return this.avatar;
	}

    /**
     * Sets balance freeze type.
     *
     * @param balanceFreezeType the balance freeze type
     */
    public void setBalanceFreezeType(String balanceFreezeType) {
		this.balanceFreezeType = balanceFreezeType;
	}

    /**
     * Gets balance freeze type.
     *
     * @return the balance freeze type
     */
    public String getBalanceFreezeType( ) {
		return this.balanceFreezeType;
	}

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday( ) {
		return this.birthday;
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
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets cert type value.
     *
     * @param certTypeValue the cert type value
     */
    public void setCertTypeValue(String certTypeValue) {
		this.certTypeValue = certTypeValue;
	}

    /**
     * Gets cert type value.
     *
     * @return the cert type value
     */
    public String getCertTypeValue( ) {
		return this.certTypeValue;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity( ) {
		return this.city;
	}

    /**
     * Sets default deliver address.
     *
     * @param defaultDeliverAddress the default deliver address
     */
    public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}

    /**
     * Gets default deliver address.
     *
     * @return the default deliver address
     */
    public String getDefaultDeliverAddress( ) {
		return this.defaultDeliverAddress;
	}

    /**
     * Sets deliver address list.
     *
     * @param deliverAddressList the deliver address list
     */
    public void setDeliverAddressList(List<DeliverAddress> deliverAddressList) {
		this.deliverAddressList = deliverAddressList;
	}

    /**
     * Gets deliver address list.
     *
     * @return the deliver address list
     */
    public List<DeliverAddress> getDeliverAddressList( ) {
		return this.deliverAddressList;
	}

    /**
     * Sets deliver area.
     *
     * @param deliverArea the deliver area
     */
    public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}

    /**
     * Gets deliver area.
     *
     * @return the deliver area
     */
    public String getDeliverArea( ) {
		return this.deliverArea;
	}

    /**
     * Sets deliver city.
     *
     * @param deliverCity the deliver city
     */
    public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}

    /**
     * Gets deliver city.
     *
     * @return the deliver city
     */
    public String getDeliverCity( ) {
		return this.deliverCity;
	}

    /**
     * Sets deliver fullname.
     *
     * @param deliverFullname the deliver fullname
     */
    public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}

    /**
     * Gets deliver fullname.
     *
     * @return the deliver fullname
     */
    public String getDeliverFullname( ) {
		return this.deliverFullname;
	}

    /**
     * Sets deliver mobile.
     *
     * @param deliverMobile the deliver mobile
     */
    public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}

    /**
     * Gets deliver mobile.
     *
     * @return the deliver mobile
     */
    public String getDeliverMobile( ) {
		return this.deliverMobile;
	}

    /**
     * Sets deliver phone.
     *
     * @param deliverPhone the deliver phone
     */
    public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}

    /**
     * Gets deliver phone.
     *
     * @return the deliver phone
     */
    public String getDeliverPhone( ) {
		return this.deliverPhone;
	}

    /**
     * Sets deliver province.
     *
     * @param deliverProvince the deliver province
     */
    public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
	}

    /**
     * Gets deliver province.
     *
     * @return the deliver province
     */
    public String getDeliverProvince( ) {
		return this.deliverProvince;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail( ) {
		return this.email;
	}

    /**
     * Sets family name.
     *
     * @param familyName the family name
     */
    public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

    /**
     * Gets family name.
     *
     * @return the family name
     */
    public String getFamilyName( ) {
		return this.familyName;
	}

    /**
     * Sets firm name.
     *
     * @param firmName the firm name
     */
    public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

    /**
     * Gets firm name.
     *
     * @return the firm name
     */
    public String getFirmName( ) {
		return this.firmName;
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
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender( ) {
		return this.gender;
	}

    /**
     * Sets is balance frozen.
     *
     * @param isBalanceFrozen the is balance frozen
     */
    public void setIsBalanceFrozen(String isBalanceFrozen) {
		this.isBalanceFrozen = isBalanceFrozen;
	}

    /**
     * Gets is balance frozen.
     *
     * @return the is balance frozen
     */
    public String getIsBalanceFrozen( ) {
		return this.isBalanceFrozen;
	}

    /**
     * Sets is bank auth.
     *
     * @param isBankAuth the is bank auth
     */
    public void setIsBankAuth(String isBankAuth) {
		this.isBankAuth = isBankAuth;
	}

    /**
     * Gets is bank auth.
     *
     * @return the is bank auth
     */
    public String getIsBankAuth( ) {
		return this.isBankAuth;
	}

    /**
     * Sets is certified.
     *
     * @param isCertified the is certified
     */
    public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

    /**
     * Gets is certified.
     *
     * @return the is certified
     */
    public String getIsCertified( ) {
		return this.isCertified;
	}

    /**
     * Sets is certify grade a.
     *
     * @param isCertifyGradeA the is certify grade a
     */
    public void setIsCertifyGradeA(String isCertifyGradeA) {
		this.isCertifyGradeA = isCertifyGradeA;
	}

    /**
     * Gets is certify grade a.
     *
     * @return the is certify grade a
     */
    public String getIsCertifyGradeA( ) {
		return this.isCertifyGradeA;
	}

    /**
     * Sets is id auth.
     *
     * @param isIdAuth the is id auth
     */
    public void setIsIdAuth(String isIdAuth) {
		this.isIdAuth = isIdAuth;
	}

    /**
     * Gets is id auth.
     *
     * @return the is id auth
     */
    public String getIsIdAuth( ) {
		return this.isIdAuth;
	}

    /**
     * Sets is licence auth.
     *
     * @param isLicenceAuth the is licence auth
     */
    public void setIsLicenceAuth(String isLicenceAuth) {
		this.isLicenceAuth = isLicenceAuth;
	}

    /**
     * Gets is licence auth.
     *
     * @return the is licence auth
     */
    public String getIsLicenceAuth( ) {
		return this.isLicenceAuth;
	}

    /**
     * Sets is mobile auth.
     *
     * @param isMobileAuth the is mobile auth
     */
    public void setIsMobileAuth(String isMobileAuth) {
		this.isMobileAuth = isMobileAuth;
	}

    /**
     * Gets is mobile auth.
     *
     * @return the is mobile auth
     */
    public String getIsMobileAuth( ) {
		return this.isMobileAuth;
	}

    /**
     * Sets is student certified.
     *
     * @param isStudentCertified the is student certified
     */
    public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}

    /**
     * Gets is student certified.
     *
     * @return the is student certified
     */
    public String getIsStudentCertified( ) {
		return this.isStudentCertified;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile( ) {
		return this.mobile;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    /**
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName( ) {
		return this.nickName;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone( ) {
		return this.phone;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince( ) {
		return this.province;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

    /**
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName( ) {
		return this.realName;
	}

    /**
     * Sets reduced birthday.
     *
     * @param reducedBirthday the reduced birthday
     */
    public void setReducedBirthday(String reducedBirthday) {
		this.reducedBirthday = reducedBirthday;
	}

    /**
     * Gets reduced birthday.
     *
     * @return the reduced birthday
     */
    public String getReducedBirthday( ) {
		return this.reducedBirthday;
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

    /**
     * Sets user status.
     *
     * @param userStatus the user status
     */
    public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

    /**
     * Gets user status.
     *
     * @return the user status
     */
    public String getUserStatus( ) {
		return this.userStatus;
	}

    /**
     * Sets user type value.
     *
     * @param userTypeValue the user type value
     */
    public void setUserTypeValue(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}

    /**
     * Gets user type value.
     *
     * @return the user type value
     */
    public String getUserTypeValue( ) {
		return this.userTypeValue;
	}

    /**
     * Sets zip.
     *
     * @param zip the zip
     */
    public void setZip(String zip) {
		this.zip = zip;
	}

    /**
     * Gets zip.
     *
     * @return the zip
     */
    public String getZip( ) {
		return this.zip;
	}

}
