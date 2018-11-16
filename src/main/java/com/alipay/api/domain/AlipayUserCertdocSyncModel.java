package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员电子证件信息保存
 *
 * @author auto create
 * @since 1.0, 2017-11-23 17:08:26
 */
public class AlipayUserCertdocSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6128361888834685624L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IDENTITY_CARD:身份证;
DRIVING_LICENSE:驾驶证;
VEHICLE_LICENSE:行驶证;
SOCIAL_SECURITY_CARD:社会保障卡;
PASSPORT:护照;
DEGREE_CERTIFICATE:学位证;
HK_MACAU_LAISSEZ_PASSER:港澳通行证;
PROPRETY_OWNERSHIP_CERTIFICATE:房产证;
REAL_ESTATE_WARRANTS:不动产证;
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证件其余信息,以json string形式传入。具体每一个k/v规则参照具体证件规则。举例驾驶证extInfo规则：
字段名字(key):drivingLicenseNo,字段含义:证号,字段类型:STRING,是否可空:否;
字段名字(key):sex,字段含义:性别,字段类型:STRING,是否可空:是,值非空时约束:选择,具体约束:男,女,;
字段名字(key):nationality,字段含义:国籍,字段类型:STRING,是否可空:是;
字段名字(key):address,字段含义:住址,字段类型:STRING,是否可空:是;
字段名字(key):dateOfBirth,字段含义:出生日期,字段类型:DATE,是否可空:是;
字段名字(key):dateOfFirstIssue,字段含义:初次领证日期,字段类型:DATE,是否可空:是;
字段名字(key):clazz,字段含义:准驾车型,字段类型:STRING,是否可空:是,值非空时约束:正则表达式,具体约束:^[a-z_A-Z_0-9]*$;
字段名字(key):fileNo,字段含义:档案编号,字段类型:STRING,是否可空:是,值非空时约束:正则表达式,具体约束:^[0-9]{12}$;
字段名字(key):issuingAuthority,字段含义:签发机关,字段类型:STRING,是否可空:是;
字段名字(key):valideDate,字段含义:生效日期,字段类型:DATE,是否可空:是,值非空时约束:正则表达式,具体约束:^\d{4}-\d{2}-\d{2}$;
字段名字(key):expireDate,字段含义:失效日期,字段类型:DATE,是否可空:是,值非空时约束:正则表达式,具体约束:^\d{4}-\d{2}-\d{2}$;
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 证件主体用户姓名。证件类型+证件号+证件姓名需要唯一。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 证件图片集合
	 */
	@ApiListField("pic_list")
	@ApiField("open_cert_pic")
	private List<OpenCertPic> picList;

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
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
     * Gets pic list.
     *
     * @return the pic list
     */
    public List<OpenCertPic> getPicList() {
		return this.picList;
	}

    /**
     * Sets pic list.
     *
     * @param picList the pic list
     */
    public void setPicList(List<OpenCertPic> picList) {
		this.picList = picList;
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
