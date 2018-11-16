package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserDeliverAddress;
import com.alipay.api.domain.AlipayUserPicture;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.share response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayUserInfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 8741251413196577446L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 经营/业务范围（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
证件号码，结合证件类型使用.
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
0:身份证
1:护照
2:军官证
3:士兵证
4:回乡证
5:临时身份证
6:户口簿
7:警官证
8:台胞证
9:营业执照
10:其它证件
11:港澳居民来往内地通行证
12:台湾居民来往大陆通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 学信网返回的学校名称，有可能为空。
	 */
	@ApiField("college_name")
	private String collegeName;

	/** 
	 * 国家码
	 */
	@ApiField("country_code")
	private String countryCode;

	/** 
	 * 学信网返回的学历/学位信息，数据质量一般，请谨慎使用，取值包括：博士研究生、硕士研究生、高升本、专科、博士、硕士、本科、夜大电大函大普通班、专科(高职)、第二学士学位。
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 收货地址列表
	 */
	@ApiListField("deliver_addresses")
	@ApiField("alipay_user_deliver_address")
	private List<AlipayUserDeliverAddress> deliverAddresses;

	/** 
	 * 用户支付宝邮箱登录名
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 入学时间，yyyy-mm-dd格式
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 企业代理人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_expiry_date")
	private String firmAgentPersonCertExpiryDate;

	/** 
	 * 企业代理人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_no")
	private String firmAgentPersonCertNo;

	/** 
	 * 企业代理人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_type")
	private String firmAgentPersonCertType;

	/** 
	 * 企业代理人姓名（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_name")
	private String firmAgentPersonName;

	/** 
	 * 企业法人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_expiry_date")
	private String firmLegalPersonCertExpiryDate;

	/** 
	 * 法人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_no")
	private String firmLegalPersonCertNo;

	/** 
	 * 企业法人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_type")
	private String firmLegalPersonCertType;

	/** 
	 * 企业法人名称（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_name")
	private String firmLegalPersonName;

	/** 
	 * 企业法人证件图片（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_legal_person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmLegalPersonPictures;

	/** 
	 * 企业相关证件图片，包含图片地址（目前需要调用alipay.user.certify.image.fetch转换一下）及类型（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmPictures;

	/** 
	 * 公司类型，包括（用户类型是公司类型时才有此字段）：
CO(公司)
INST(事业单位),
COMM(社会团体),
NGO(民办非企业组织),
STATEORGAN(党政国家机关)
	 */
	@ApiField("firm_type")
	private String firmType;

	/** 
	 * 【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
性别（F：女性；M：男性）。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 预期毕业时间，不保证准确性，yyyy-mm-dd格式。
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/** 
	 * 余额账户是否被冻结。
T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证。
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 营业执照有效期，yyyyMMdd或长期，（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_expiry_date")
	private String licenseExpiryDate;

	/** 
	 * 企业执照号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 支付宝会员等级
	 */
	@ApiField("member_grade")
	private String memberGrade;

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
	 * 组织机构代码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/** 
	 * 个人用户生日。
	 */
	@ApiField("person_birthday")
	private String personBirthday;

	/** 
	 * 证件有效期（用户类型是个人的时候才有此字段）。
	 */
	@ApiField("person_cert_expiry_date")
	private String personCertExpiryDate;

	/** 
	 * 个人证件图片（用户类型是个人的时候才有此字段）。
	 */
	@ApiListField("person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> personPictures;

	/** 
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 职业
	 */
	@ApiField("profession")
	private String profession;

	/** 
	 * 省份名称
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 淘宝id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	/** 
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
若用户是个人用户，则是用户的真实姓名；若是企业用户，则是企业名称。
	 */
	@ApiField("user_name")
	private String userName;

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
	@ApiField("user_type")
	private String userType;

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
     * Sets business scope.
     *
     * @param businessScope the business scope
     */
    public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

    /**
     * Gets business scope.
     *
     * @return the business scope
     */
    public String getBusinessScope( ) {
		return this.businessScope;
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
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType( ) {
		return this.certType;
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
     * Sets college name.
     *
     * @param collegeName the college name
     */
    public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

    /**
     * Gets college name.
     *
     * @return the college name
     */
    public String getCollegeName( ) {
		return this.collegeName;
	}

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     */
    public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode( ) {
		return this.countryCode;
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
     * Sets deliver addresses.
     *
     * @param deliverAddresses the deliver addresses
     */
    public void setDeliverAddresses(List<AlipayUserDeliverAddress> deliverAddresses) {
		this.deliverAddresses = deliverAddresses;
	}

    /**
     * Gets deliver addresses.
     *
     * @return the deliver addresses
     */
    public List<AlipayUserDeliverAddress> getDeliverAddresses( ) {
		return this.deliverAddresses;
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
     * Sets firm agent person cert expiry date.
     *
     * @param firmAgentPersonCertExpiryDate the firm agent person cert expiry date
     */
    public void setFirmAgentPersonCertExpiryDate(String firmAgentPersonCertExpiryDate) {
		this.firmAgentPersonCertExpiryDate = firmAgentPersonCertExpiryDate;
	}

    /**
     * Gets firm agent person cert expiry date.
     *
     * @return the firm agent person cert expiry date
     */
    public String getFirmAgentPersonCertExpiryDate( ) {
		return this.firmAgentPersonCertExpiryDate;
	}

    /**
     * Sets firm agent person cert no.
     *
     * @param firmAgentPersonCertNo the firm agent person cert no
     */
    public void setFirmAgentPersonCertNo(String firmAgentPersonCertNo) {
		this.firmAgentPersonCertNo = firmAgentPersonCertNo;
	}

    /**
     * Gets firm agent person cert no.
     *
     * @return the firm agent person cert no
     */
    public String getFirmAgentPersonCertNo( ) {
		return this.firmAgentPersonCertNo;
	}

    /**
     * Sets firm agent person cert type.
     *
     * @param firmAgentPersonCertType the firm agent person cert type
     */
    public void setFirmAgentPersonCertType(String firmAgentPersonCertType) {
		this.firmAgentPersonCertType = firmAgentPersonCertType;
	}

    /**
     * Gets firm agent person cert type.
     *
     * @return the firm agent person cert type
     */
    public String getFirmAgentPersonCertType( ) {
		return this.firmAgentPersonCertType;
	}

    /**
     * Sets firm agent person name.
     *
     * @param firmAgentPersonName the firm agent person name
     */
    public void setFirmAgentPersonName(String firmAgentPersonName) {
		this.firmAgentPersonName = firmAgentPersonName;
	}

    /**
     * Gets firm agent person name.
     *
     * @return the firm agent person name
     */
    public String getFirmAgentPersonName( ) {
		return this.firmAgentPersonName;
	}

    /**
     * Sets firm legal person cert expiry date.
     *
     * @param firmLegalPersonCertExpiryDate the firm legal person cert expiry date
     */
    public void setFirmLegalPersonCertExpiryDate(String firmLegalPersonCertExpiryDate) {
		this.firmLegalPersonCertExpiryDate = firmLegalPersonCertExpiryDate;
	}

    /**
     * Gets firm legal person cert expiry date.
     *
     * @return the firm legal person cert expiry date
     */
    public String getFirmLegalPersonCertExpiryDate( ) {
		return this.firmLegalPersonCertExpiryDate;
	}

    /**
     * Sets firm legal person cert no.
     *
     * @param firmLegalPersonCertNo the firm legal person cert no
     */
    public void setFirmLegalPersonCertNo(String firmLegalPersonCertNo) {
		this.firmLegalPersonCertNo = firmLegalPersonCertNo;
	}

    /**
     * Gets firm legal person cert no.
     *
     * @return the firm legal person cert no
     */
    public String getFirmLegalPersonCertNo( ) {
		return this.firmLegalPersonCertNo;
	}

    /**
     * Sets firm legal person cert type.
     *
     * @param firmLegalPersonCertType the firm legal person cert type
     */
    public void setFirmLegalPersonCertType(String firmLegalPersonCertType) {
		this.firmLegalPersonCertType = firmLegalPersonCertType;
	}

    /**
     * Gets firm legal person cert type.
     *
     * @return the firm legal person cert type
     */
    public String getFirmLegalPersonCertType( ) {
		return this.firmLegalPersonCertType;
	}

    /**
     * Sets firm legal person name.
     *
     * @param firmLegalPersonName the firm legal person name
     */
    public void setFirmLegalPersonName(String firmLegalPersonName) {
		this.firmLegalPersonName = firmLegalPersonName;
	}

    /**
     * Gets firm legal person name.
     *
     * @return the firm legal person name
     */
    public String getFirmLegalPersonName( ) {
		return this.firmLegalPersonName;
	}

    /**
     * Sets firm legal person pictures.
     *
     * @param firmLegalPersonPictures the firm legal person pictures
     */
    public void setFirmLegalPersonPictures(List<AlipayUserPicture> firmLegalPersonPictures) {
		this.firmLegalPersonPictures = firmLegalPersonPictures;
	}

    /**
     * Gets firm legal person pictures.
     *
     * @return the firm legal person pictures
     */
    public List<AlipayUserPicture> getFirmLegalPersonPictures( ) {
		return this.firmLegalPersonPictures;
	}

    /**
     * Sets firm pictures.
     *
     * @param firmPictures the firm pictures
     */
    public void setFirmPictures(List<AlipayUserPicture> firmPictures) {
		this.firmPictures = firmPictures;
	}

    /**
     * Gets firm pictures.
     *
     * @return the firm pictures
     */
    public List<AlipayUserPicture> getFirmPictures( ) {
		return this.firmPictures;
	}

    /**
     * Sets firm type.
     *
     * @param firmType the firm type
     */
    public void setFirmType(String firmType) {
		this.firmType = firmType;
	}

    /**
     * Gets firm type.
     *
     * @return the firm type
     */
    public String getFirmType( ) {
		return this.firmType;
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
     * Sets license expiry date.
     *
     * @param licenseExpiryDate the license expiry date
     */
    public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

    /**
     * Gets license expiry date.
     *
     * @return the license expiry date
     */
    public String getLicenseExpiryDate( ) {
		return this.licenseExpiryDate;
	}

    /**
     * Sets license no.
     *
     * @param licenseNo the license no
     */
    public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

    /**
     * Gets license no.
     *
     * @return the license no
     */
    public String getLicenseNo( ) {
		return this.licenseNo;
	}

    /**
     * Sets member grade.
     *
     * @param memberGrade the member grade
     */
    public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

    /**
     * Gets member grade.
     *
     * @return the member grade
     */
    public String getMemberGrade( ) {
		return this.memberGrade;
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
     * Sets organization code.
     *
     * @param organizationCode the organization code
     */
    public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

    /**
     * Gets organization code.
     *
     * @return the organization code
     */
    public String getOrganizationCode( ) {
		return this.organizationCode;
	}

    /**
     * Sets person birthday.
     *
     * @param personBirthday the person birthday
     */
    public void setPersonBirthday(String personBirthday) {
		this.personBirthday = personBirthday;
	}

    /**
     * Gets person birthday.
     *
     * @return the person birthday
     */
    public String getPersonBirthday( ) {
		return this.personBirthday;
	}

    /**
     * Sets person cert expiry date.
     *
     * @param personCertExpiryDate the person cert expiry date
     */
    public void setPersonCertExpiryDate(String personCertExpiryDate) {
		this.personCertExpiryDate = personCertExpiryDate;
	}

    /**
     * Gets person cert expiry date.
     *
     * @return the person cert expiry date
     */
    public String getPersonCertExpiryDate( ) {
		return this.personCertExpiryDate;
	}

    /**
     * Sets person pictures.
     *
     * @param personPictures the person pictures
     */
    public void setPersonPictures(List<AlipayUserPicture> personPictures) {
		this.personPictures = personPictures;
	}

    /**
     * Gets person pictures.
     *
     * @return the person pictures
     */
    public List<AlipayUserPicture> getPersonPictures( ) {
		return this.personPictures;
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
     * Sets profession.
     *
     * @param profession the profession
     */
    public void setProfession(String profession) {
		this.profession = profession;
	}

    /**
     * Gets profession.
     *
     * @return the profession
     */
    public String getProfession( ) {
		return this.profession;
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
     * Sets taobao id.
     *
     * @param taobaoId the taobao id
     */
    public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

    /**
     * Gets taobao id.
     *
     * @return the taobao id
     */
    public String getTaobaoId( ) {
		return this.taobaoId;
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
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName( ) {
		return this.userName;
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
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
		this.userType = userType;
	}

    /**
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType( ) {
		return this.userType;
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
