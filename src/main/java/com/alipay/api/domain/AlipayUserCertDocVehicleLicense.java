package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子证件产品行驶证
 *
 * @author auto create
 * @since 1.0, 2017-06-01 16:04:48
 */
public class AlipayUserCertDocVehicleLicense extends AlipayObject {

	private static final long serialVersionUID = 6358935969314649628L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页照片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 品牌型号
	 */
	@ApiField("entity")
	private String model;

	/**
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 号牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 注册日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 车辆识别代号
	 */
	@ApiField("vin")
	private String vin;

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
     * Gets engine no.
     *
     * @return the engine no
     */
    public String getEngineNo() {
		return this.engineNo;
	}

    /**
     * Sets engine no.
     *
     * @param engineNo the engine no
     */
    public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

    /**
     * Gets issue date.
     *
     * @return the issue date
     */
    public String getIssueDate() {
		return this.issueDate;
	}

    /**
     * Sets issue date.
     *
     * @param issueDate the issue date
     */
    public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

    /**
     * Gets entity.
     *
     * @return the entity
     */
    public String getModel() {
		return this.model;
	}

    /**
     * Sets entity.
     *
     * @param model the entity
     */
    public void setModel(String model) {
		this.model = model;
	}

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public String getOwner() {
		return this.owner;
	}

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(String owner) {
		this.owner = owner;
	}

    /**
     * Gets plate no.
     *
     * @return the plate no
     */
    public String getPlateNo() {
		return this.plateNo;
	}

    /**
     * Sets plate no.
     *
     * @param plateNo the plate no
     */
    public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

    /**
     * Gets register date.
     *
     * @return the register date
     */
    public String getRegisterDate() {
		return this.registerDate;
	}

    /**
     * Sets register date.
     *
     * @param registerDate the register date
     */
    public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

    /**
     * Gets vin.
     *
     * @return the vin
     */
    public String getVin() {
		return this.vin;
	}

    /**
     * Sets vin.
     *
     * @param vin the vin
     */
    public void setVin(String vin) {
		this.vin = vin;
	}

}
