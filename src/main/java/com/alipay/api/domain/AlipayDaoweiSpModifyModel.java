package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建或更新服务者信息接口
 *
 * @author auto create
 * @since 1.0, 2017-03-10 16:06:09
 */
public class AlipayDaoweiSpModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4458875353277219758L;

	/**
	 * 服务者的可用时间表。其中Duration和Unit配合使用，例如duration=30，unit=MIN表示将一天分为以30分钟一小段的时间片段。Unit：目前支持MIN（分钟）。Date：YYYY-MM-DD格式。Bitmap：根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用，如果工作日全天可用则每个分段都为1
	 */
	@ApiField("calendar_schedule")
	private CalendarScheduleInfo calendarSchedule;

	/**
	 * 服务者的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 服务者的证件类型（目前只支持身份证号：IDENTITY_CARD）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 服务者的描述，会进行安全审核，请勿传包含敏感信息的昵称，如果审核传含有敏感信息，需修改后重新同步服务者的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 服务者服务列表信息：包括服务者可提供的类目服务和证书信息等，其中license_id是商家服务者证照的唯一标识，用于确定商家的某个服务者的某个证照，仅支持数字、字母和下划线
	 */
	@ApiListField("license_list")
	@ApiField("license_info")
	private List<LicenseInfo> licenseList;

	/**
	 * 服务者的支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 服务者的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 第三方服务者的姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务者昵称，会进行安全审核，请勿传包含敏感信息的昵称，如果审核传含有敏感信息，需修改后重新同步服务者信息
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 商家服务者id，由商家维护的该商家下某个服务者的唯一标识，仅支持数字、字母和下划线的组合
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	/**
	 * 服务者的头像url，只支持https，图片大小限制60K以下。请勿发布涉及黄赌毒以及其他违反国家法律法规的图片，如果有安全问题，将会通知商家修改后重新同步服务者头像
	 */
	@ApiField("photo_url")
	private String photoUrl;

	/**
	 * 服务状态，支持以下状态：
ON（上架）
OFF（下架）
DELETE（删除）
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets calendar schedule.
     *
     * @return the calendar schedule
     */
    public CalendarScheduleInfo getCalendarSchedule() {
		return this.calendarSchedule;
	}

    /**
     * Sets calendar schedule.
     *
     * @param calendarSchedule the calendar schedule
     */
    public void setCalendarSchedule(CalendarScheduleInfo calendarSchedule) {
		this.calendarSchedule = calendarSchedule;
	}

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
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets license list.
     *
     * @return the license list
     */
    public List<LicenseInfo> getLicenseList() {
		return this.licenseList;
	}

    /**
     * Sets license list.
     *
     * @param licenseList the license list
     */
    public void setLicenseList(List<LicenseInfo> licenseList) {
		this.licenseList = licenseList;
	}

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
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
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
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
     * Gets out sp id.
     *
     * @return the out sp id
     */
    public String getOutSpId() {
		return this.outSpId;
	}

    /**
     * Sets out sp id.
     *
     * @param outSpId the out sp id
     */
    public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

    /**
     * Gets photo url.
     *
     * @return the photo url
     */
    public String getPhotoUrl() {
		return this.photoUrl;
	}

    /**
     * Sets photo url.
     *
     * @param photoUrl the photo url
     */
    public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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

}
