package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费学校信息录入接口
 *
 * @author auto create
 * @since 1.0, 2017-08-18 12:27:03
 */
public class AlipayEcoEduKtSchoolinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6468387967373686124L;

	/**
	 * 与浙江网商交易见证平台有交互ISV输入网商交易异步通知回调URL，教育缴费同步账单信息给网商，网商会回调此url，ISV即可获取网商相关的参数，根据教育缴费平台账单发送接口返回的 order_no和网商返回的outer_trade_no来对应账单信息。
	 */
	@ApiField("bank_notify_url")
	private String bankNotifyUrl;

	/**
	 * 与浙江网商交易见证平台有交互的ISV,由交易见证平台分配给合作方业务平台 签约唯一ID ，由网商分配给ISV的渠道参数
	 */
	@ApiField("bank_partner_id")
	private String bankPartnerId;

	/**
	 * 与浙江网商交易见证平台有交互的ISV在创建账户获得的member_id，由网商分配
	 */
	@ApiField("bank_uid")
	private String bankUid;

	/**
	 * 对应集团到卡模式的银行编号.学校与支付宝后台签约时，由学校提交给支付宝的编号
	 */
	@ApiField("bankcard_no")
	private String bankcardNo;

	/**
	 * 城市的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 商家名称，每个接入教育缴费的ISV商家名称，由ISV自己提供
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 注意：本参数从1.3版本开始已经废弃，不再需要传递。

由支付宝提供的给已经签约的isv的编码，业务上一般直接采用isv的支付宝PID。
	 */
	@ApiField("isv_no")
	private String isvNo;

	/**
	 * 此通知地址是为了保持教育缴费平台与ISV商户支付状态一致性。用户支付成功后，支付宝会根据本isv_notify_url，通过POST请求的形式将支付结果作为参数通知到商户系统，ISV商户可以根据返回的参数更新账单状态。
	 */
	@ApiField("isv_notify_url")
	private String isvNotifyUrl;

	/**
	 * ISV联系电话,用于账单详情页面显示
	 */
	@ApiField("isv_phone")
	private String isvPhone;

	/**
	 * 填写已经签约教育缴费的isv的支付宝PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 省份的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 学校的校徽或logo，在学校展示页面作为学校的标识。该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k。
注意：此链接要求公网可以访问，否则无法正常展示。
	 */
	@ApiField("school_icon")
	private String schoolIcon;

	/**
	 * 如果填写了school_icon参数，则此字段不能为空。目前只支持png和jpg两种格式
	 */
	@ApiField("school_icon_type")
	private String schoolIconType;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校用来签约支付宝教育缴费的支付宝PID
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校(机构)标识码（由教育部按照国家标准及编码规则编制，可以在教育局官网查询）
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学校的类型：
1：代表托儿所； 2：代表幼儿园；3：代表小学；4：代表初中；5：代表高中。
如果学校兼有多种属性，可以连写，比如：
45：代表兼有初中部高中部；34：代表兼有小学部初中部
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 与浙江网商交易见证平台有交互的ISV,由网商分配给ISV的渠道参数
	 */
	@ApiField("white_channel_code")
	private String whiteChannelCode;

    /**
     * Gets bank notify url.
     *
     * @return the bank notify url
     */
    public String getBankNotifyUrl() {
		return this.bankNotifyUrl;
	}

    /**
     * Sets bank notify url.
     *
     * @param bankNotifyUrl the bank notify url
     */
    public void setBankNotifyUrl(String bankNotifyUrl) {
		this.bankNotifyUrl = bankNotifyUrl;
	}

    /**
     * Gets bank partner id.
     *
     * @return the bank partner id
     */
    public String getBankPartnerId() {
		return this.bankPartnerId;
	}

    /**
     * Sets bank partner id.
     *
     * @param bankPartnerId the bank partner id
     */
    public void setBankPartnerId(String bankPartnerId) {
		this.bankPartnerId = bankPartnerId;
	}

    /**
     * Gets bank uid.
     *
     * @return the bank uid
     */
    public String getBankUid() {
		return this.bankUid;
	}

    /**
     * Sets bank uid.
     *
     * @param bankUid the bank uid
     */
    public void setBankUid(String bankUid) {
		this.bankUid = bankUid;
	}

    /**
     * Gets bankcard no.
     *
     * @return the bankcard no
     */
    public String getBankcardNo() {
		return this.bankcardNo;
	}

    /**
     * Sets bankcard no.
     *
     * @param bankcardNo the bankcard no
     */
    public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets city name.
     *
     * @return the city name
     */
    public String getCityName() {
		return this.cityName;
	}

    /**
     * Sets city name.
     *
     * @param cityName the city name
     */
    public void setCityName(String cityName) {
		this.cityName = cityName;
	}

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
		return this.districtCode;
	}

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

    /**
     * Gets district name.
     *
     * @return the district name
     */
    public String getDistrictName() {
		return this.districtName;
	}

    /**
     * Sets district name.
     *
     * @param districtName the district name
     */
    public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

    /**
     * Gets isv name.
     *
     * @return the isv name
     */
    public String getIsvName() {
		return this.isvName;
	}

    /**
     * Sets isv name.
     *
     * @param isvName the isv name
     */
    public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

    /**
     * Gets isv no.
     *
     * @return the isv no
     */
    public String getIsvNo() {
		return this.isvNo;
	}

    /**
     * Sets isv no.
     *
     * @param isvNo the isv no
     */
    public void setIsvNo(String isvNo) {
		this.isvNo = isvNo;
	}

    /**
     * Gets isv notify url.
     *
     * @return the isv notify url
     */
    public String getIsvNotifyUrl() {
		return this.isvNotifyUrl;
	}

    /**
     * Sets isv notify url.
     *
     * @param isvNotifyUrl the isv notify url
     */
    public void setIsvNotifyUrl(String isvNotifyUrl) {
		this.isvNotifyUrl = isvNotifyUrl;
	}

    /**
     * Gets isv phone.
     *
     * @return the isv phone
     */
    public String getIsvPhone() {
		return this.isvPhone;
	}

    /**
     * Sets isv phone.
     *
     * @param isvPhone the isv phone
     */
    public void setIsvPhone(String isvPhone) {
		this.isvPhone = isvPhone;
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
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
		return this.provinceName;
	}

    /**
     * Sets province name.
     *
     * @param provinceName the province name
     */
    public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

    /**
     * Gets school icon.
     *
     * @return the school icon
     */
    public String getSchoolIcon() {
		return this.schoolIcon;
	}

    /**
     * Sets school icon.
     *
     * @param schoolIcon the school icon
     */
    public void setSchoolIcon(String schoolIcon) {
		this.schoolIcon = schoolIcon;
	}

    /**
     * Gets school icon type.
     *
     * @return the school icon type
     */
    public String getSchoolIconType() {
		return this.schoolIconType;
	}

    /**
     * Sets school icon type.
     *
     * @param schoolIconType the school icon type
     */
    public void setSchoolIconType(String schoolIconType) {
		this.schoolIconType = schoolIconType;
	}

    /**
     * Gets school name.
     *
     * @return the school name
     */
    public String getSchoolName() {
		return this.schoolName;
	}

    /**
     * Sets school name.
     *
     * @param schoolName the school name
     */
    public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
     * Gets school stdcode.
     *
     * @return the school stdcode
     */
    public String getSchoolStdcode() {
		return this.schoolStdcode;
	}

    /**
     * Sets school stdcode.
     *
     * @param schoolStdcode the school stdcode
     */
    public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

    /**
     * Gets school type.
     *
     * @return the school type
     */
    public String getSchoolType() {
		return this.schoolType;
	}

    /**
     * Sets school type.
     *
     * @param schoolType the school type
     */
    public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

    /**
     * Gets white channel code.
     *
     * @return the white channel code
     */
    public String getWhiteChannelCode() {
		return this.whiteChannelCode;
	}

    /**
     * Sets white channel code.
     *
     * @param whiteChannelCode the white channel code
     */
    public void setWhiteChannelCode(String whiteChannelCode) {
		this.whiteChannelCode = whiteChannelCode;
	}

}
