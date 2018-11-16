package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吃饭更好
 *
 * @author auto create
 * @since 1.0, 2018-01-18 15:24:45
 */
public class AlipayCommerceAirXfgDsgModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4611834418573354648L;

	/**
	 * 用户年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 用户名
	 */
	@ApiField("nam")
	private String nam;

	/**
	 * 男
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 1
	 */
	@ApiField("xbw")
	private String xbw;

    /**
     * Gets age.
     *
     * @return the age
     */
    public String getAge() {
		return this.age;
	}

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(String age) {
		this.age = age;
	}

    /**
     * Gets nam.
     *
     * @return the nam
     */
    public String getNam() {
		return this.nam;
	}

    /**
     * Sets nam.
     *
     * @param nam the nam
     */
    public void setNam(String nam) {
		this.nam = nam;
	}

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
		return this.sex;
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
     * Gets xbw.
     *
     * @return the xbw
     */
    public String getXbw() {
		return this.xbw;
	}

    /**
     * Sets xbw.
     *
     * @param xbw the xbw
     */
    public void setXbw(String xbw) {
		this.xbw = xbw;
	}

}
