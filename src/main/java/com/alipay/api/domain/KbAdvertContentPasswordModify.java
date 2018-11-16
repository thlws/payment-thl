package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建口令红包模型
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:46
 */
public class KbAdvertContentPasswordModify extends AlipayObject {

	private static final long serialVersionUID = 2274184735192184968L;

	/**
	 * 口令红包背景图的django ID
	 */
	@ApiField("background_img_id")
	private String backgroundImgId;

	/**
	 * 口令红包品牌名称（品牌名称不能超过20位）
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 红包口令（口令不能超过20位，口令只能是中文、英文、数字组合,不能纯数字）
	 */
	@ApiField("password")
	private String password;

	/**
	 * 口令红包券LOGO的django ID
	 */
	@ApiField("voucher_logo_id")
	private String voucherLogoId;

    /**
     * Gets background img id.
     *
     * @return the background img id
     */
    public String getBackgroundImgId() {
		return this.backgroundImgId;
	}

    /**
     * Sets background img id.
     *
     * @param backgroundImgId the background img id
     */
    public void setBackgroundImgId(String backgroundImgId) {
		this.backgroundImgId = backgroundImgId;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
		return this.password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
		this.password = password;
	}

    /**
     * Gets voucher logo id.
     *
     * @return the voucher logo id
     */
    public String getVoucherLogoId() {
		return this.voucherLogoId;
	}

    /**
     * Sets voucher logo id.
     *
     * @param voucherLogoId the voucher logo id
     */
    public void setVoucherLogoId(String voucherLogoId) {
		this.voucherLogoId = voucherLogoId;
	}

}
