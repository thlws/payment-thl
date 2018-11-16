package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

import java.util.List;

/***
 * 拉取用户信息(需scope为 snsapi_userinfo) Response POJO
 * @author Hanley Tang | hanley@hanley.cn
 * @version 1.0
 */
public class UserInfoResponse {

	private String openid         ;
	private String nickname       ;
	private String sex            ;
	private String province       ;
	private String city           ;
	private String country        ;
	private String headimgurl     ;
	private String unionid        ;
	private List<String> privilege;//用户特权信息，json数组，如微信沃卡用户为（chinaunicom）

	private long errcode		   ;
	private String errmsg			;
	private String desc;

	/**
	 * Gets errcode.
	 *
	 * @return the errcode
	 */
	public long getErrcode() {
		return errcode;
	}

	/**
	 * Sets errcode.
	 *
	 * @param errcode the errcode
	 */
	public void setErrcode(long errcode) {
		this.errcode = errcode;
	}

	/**
	 * Gets errmsg.
	 *
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * Sets errmsg.
	 *
	 * @param errmsg the errmsg
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * Gets desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets desc.
	 *
	 * @param desc the desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}

	/**
	 * Instantiates a new User info response.
	 */
	public UserInfoResponse(){}

	/**
	 * Gets openid.
	 *
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * Gets nickname.
	 *
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Gets sex.
	 *
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Gets province.
	 *
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Gets city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Gets headimgurl.
	 *
	 * @return the headimgurl
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}

	/**
	 * Gets unionid.
	 *
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}

	/**
	 * Gets privilege.
	 *
	 * @return the privilege
	 */
	public List<String> getPrivilege() {
		return privilege;
	}

	/**
	 * Sets openid.
	 *
	 * @param openid the openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * Sets nickname.
	 *
	 * @param nickname the nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Sets sex.
	 *
	 * @param sex the sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * Sets city.
	 *
	 * @param city the city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets country.
	 *
	 * @param country the country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Sets headimgurl.
	 *
	 * @param headimgurl the headimgurl
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	/**
	 * Sets unionid.
	 *
	 * @param unionid the unionid
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	/**
	 * Sets privilege.
	 *
	 * @param privilege the privilege
	 */
	public void setPrivilege(List<String> privilege) {
		this.privilege = privilege;
	}
	
	
	
}
