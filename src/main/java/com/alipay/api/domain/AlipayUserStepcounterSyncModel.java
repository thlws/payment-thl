package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户步数同步接口
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:39:30
 */
public class AlipayUserStepcounterSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8321616499711319134L;

	/**
	 * 年龄数据。是外部商户系统中录入的用户年龄数据
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 卡路里。是商户系统通过用户运动设备(如手环)读取到的用户运动卡路里值
	 */
	@ApiField("calorie")
	private String calorie;

	/**
	 * 步数。商户系统通过用户运动设备(如手环)读取到的用户当日步数值
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 业务方标识。步数来源的唯一标识，每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识
	 */
	@ApiField("data_provider")
	private String dataProvider;

	/**
	 * 运动距离。是外部商户系统从用户设备中读取到的用户步行距离，单位:米
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 身高数据。是外部商户系统中录入的用户身高数据，单位:cm
	 */
	@ApiField("height")
	private String height;

	/**
	 * 位置纬度。是商户系统从用户设备中读取到的用户位置纬度，必须使用wgs84坐标集
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 位置经度。是商户系统从用户客户端设备中读取到的用户位置经度，必须使用wgs84坐标集
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户系统的用户uid。是外部商户系统中的用户唯一id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 步数更新时间。用户步数上报到商户服务端的时间
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 用户时区。外部商户系统从用户运动设备中读取到的设备时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户id。为2088开头id号，需通过alipay.user.userinfo.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 体重数据。是外部商户系统中录入的用户体重数据，单位:kg
	 */
	@ApiField("weight")
	private String weight;

    /**
     * Gets age.
     *
     * @return the age
     */
    public Long getAge() {
		return this.age;
	}

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Long age) {
		this.age = age;
	}

    /**
     * Gets calorie.
     *
     * @return the calorie
     */
    public String getCalorie() {
		return this.calorie;
	}

    /**
     * Sets calorie.
     *
     * @param calorie the calorie
     */
    public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
		return this.count;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets data provider.
     *
     * @return the data provider
     */
    public String getDataProvider() {
		return this.dataProvider;
	}

    /**
     * Sets data provider.
     *
     * @param dataProvider the data provider
     */
    public void setDataProvider(String dataProvider) {
		this.dataProvider = dataProvider;
	}

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public Long getDistance() {
		return this.distance;
	}

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public void setDistance(Long distance) {
		this.distance = distance;
	}

    /**
     * Gets height.
     *
     * @return the height
     */
    public String getHeight() {
		return this.height;
	}

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(String height) {
		this.height = height;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets out user id.
     *
     * @return the out user id
     */
    public String getOutUserId() {
		return this.outUserId;
	}

    /**
     * Sets out user id.
     *
     * @param outUserId the out user id
     */
    public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

    /**
     * Gets time.
     *
     * @return the time
     */
    public Date getTime() {
		return this.time;
	}

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(Date time) {
		this.time = time;
	}

    /**
     * Gets time zone.
     *
     * @return the time zone
     */
    public String getTimeZone() {
		return this.timeZone;
	}

    /**
     * Sets time zone.
     *
     * @param timeZone the time zone
     */
    public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public String getWeight() {
		return this.weight;
	}

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(String weight) {
		this.weight = weight;
	}

}
