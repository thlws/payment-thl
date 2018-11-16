package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定损宝查询图像定损结果
 *
 * @author auto create
 * @since 1.0, 2018-09-05 22:33:31
 */
public class AlipayInsDataDsbEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6543378113572455291L;

	/**
	 * 定损单号
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 修理厂类型，枚举如下。

4S－4S店
GENERAL－综合修理厂
	 */
	@ApiField("garage_type")
	private String garageType;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

    /**
     * Gets estimate no.
     *
     * @return the estimate no
     */
    public String getEstimateNo() {
		return this.estimateNo;
	}

    /**
     * Sets estimate no.
     *
     * @param estimateNo the estimate no
     */
    public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

    /**
     * Gets frame no.
     *
     * @return the frame no
     */
    public String getFrameNo() {
		return this.frameNo;
	}

    /**
     * Sets frame no.
     *
     * @param frameNo the frame no
     */
    public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

    /**
     * Gets garage type.
     *
     * @return the garage type
     */
    public String getGarageType() {
		return this.garageType;
	}

    /**
     * Sets garage type.
     *
     * @param garageType the garage type
     */
    public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

    /**
     * Gets license no.
     *
     * @return the license no
     */
    public String getLicenseNo() {
		return this.licenseNo;
	}

    /**
     * Sets license no.
     *
     * @param licenseNo the license no
     */
    public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

}
