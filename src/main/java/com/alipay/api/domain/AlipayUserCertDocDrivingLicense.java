package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子证件产品-驾驶证
 *
 * @author auto create
 * @since 1.0, 2017-06-01 16:05:07
 */
public class AlipayUserCertDocDrivingLicense extends AlipayObject {

	private static final long serialVersionUID = 4714684191188884827L;

	/**
	 * 准驾车型
	 */
	@ApiField("clazz")
	private String clazz;

	/**
	 * 证号
	 */
	@ApiField("driving_license_no")
	private String drivingLicenseNo;

	/**
	 * base64后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页图片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 档案编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 生效日期
	 */
	@ApiField("valide_date")
	private String valideDate;

    /**
     * Gets clazz.
     *
     * @return the clazz
     */
    public String getClazz() {
		return this.clazz;
	}

    /**
     * Sets clazz.
     *
     * @param clazz the clazz
     */
    public void setClazz(String clazz) {
		this.clazz = clazz;
	}

    /**
     * Gets driving license no.
     *
     * @return the driving license no
     */
    public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}

    /**
     * Sets driving license no.
     *
     * @param drivingLicenseNo the driving license no
     */
    public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

    /**
     * Gets encoded img main.
     *
     * @return the encoded img main
     */
    public String getEncodedImgMain() {
		return this.encodedImgMain;
	}

    /**
     * Sets encoded img main.
     *
     * @param encodedImgMain the encoded img main
     */
    public void setEncodedImgMain(String encodedImgMain) {
		this.encodedImgMain = encodedImgMain;
	}

    /**
     * Gets encoded img vice.
     *
     * @return the encoded img vice
     */
    public String getEncodedImgVice() {
		return this.encodedImgVice;
	}

    /**
     * Sets encoded img vice.
     *
     * @param encodedImgVice the encoded img vice
     */
    public void setEncodedImgVice(String encodedImgVice) {
		this.encodedImgVice = encodedImgVice;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public String getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets file no.
     *
     * @return the file no
     */
    public String getFileNo() {
		return this.fileNo;
	}

    /**
     * Sets file no.
     *
     * @param fileNo the file no
     */
    public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
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
     * Gets valide date.
     *
     * @return the valide date
     */
    public String getValideDate() {
		return this.valideDate;
	}

    /**
     * Sets valide date.
     *
     * @param valideDate the valide date
     */
    public void setValideDate(String valideDate) {
		this.valideDate = valideDate;
	}

}
