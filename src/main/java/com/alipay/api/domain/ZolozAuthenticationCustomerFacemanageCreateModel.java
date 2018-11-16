package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热脸入库
 *
 * @author auto create
 * @since 1.0, 2018-07-27 17:30:29
 */
public class ZolozAuthenticationCustomerFacemanageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4659486656956655857L;

	/**
	 * 地域编码
	 */
	@ApiField("areacode")
	private String areacode;

	/**
	 * 人脸产品能力
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务量规模
	 */
	@ApiField("bizscale")
	private String bizscale;

	/**
	 * 商户品牌
	 */
	@ApiField("brandcode")
	private String brandcode;

	/**
	 * 商户机具唯一编码，关键参数
	 */
	@ApiField("devicenum")
	private String devicenum;

	/**
	 * 拓展参数
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * 入库类型
IDCARD:身份证
ALIPAY_USER:支付宝用户id,
ALIPAY_TEL:手机号入库
CUSTOMER:自定义
	 */
	@ApiField("facetype")
	private String facetype;

	/**
	 * 入库用户信息
	 */
	@ApiField("faceval")
	private String faceval;

	/**
	 * 分组5
	 */
	@ApiField("group")
	private String group;

	/**
	 * 门店编码
	 */
	@ApiField("storecode")
	private String storecode;

	/**
	 * 有效期天数，如7天、30天、365天
	 */
	@ApiField("validtimes")
	private String validtimes;

    /**
     * Gets areacode.
     *
     * @return the areacode
     */
    public String getAreacode() {
		return this.areacode;
	}

    /**
     * Sets areacode.
     *
     * @param areacode the areacode
     */
    public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets bizscale.
     *
     * @return the bizscale
     */
    public String getBizscale() {
		return this.bizscale;
	}

    /**
     * Sets bizscale.
     *
     * @param bizscale the bizscale
     */
    public void setBizscale(String bizscale) {
		this.bizscale = bizscale;
	}

    /**
     * Gets brandcode.
     *
     * @return the brandcode
     */
    public String getBrandcode() {
		return this.brandcode;
	}

    /**
     * Sets brandcode.
     *
     * @param brandcode the brandcode
     */
    public void setBrandcode(String brandcode) {
		this.brandcode = brandcode;
	}

    /**
     * Gets devicenum.
     *
     * @return the devicenum
     */
    public String getDevicenum() {
		return this.devicenum;
	}

    /**
     * Sets devicenum.
     *
     * @param devicenum the devicenum
     */
    public void setDevicenum(String devicenum) {
		this.devicenum = devicenum;
	}

    /**
     * Gets extinfo.
     *
     * @return the extinfo
     */
    public String getExtinfo() {
		return this.extinfo;
	}

    /**
     * Sets extinfo.
     *
     * @param extinfo the extinfo
     */
    public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}

    /**
     * Gets facetype.
     *
     * @return the facetype
     */
    public String getFacetype() {
		return this.facetype;
	}

    /**
     * Sets facetype.
     *
     * @param facetype the facetype
     */
    public void setFacetype(String facetype) {
		this.facetype = facetype;
	}

    /**
     * Gets faceval.
     *
     * @return the faceval
     */
    public String getFaceval() {
		return this.faceval;
	}

    /**
     * Sets faceval.
     *
     * @param faceval the faceval
     */
    public void setFaceval(String faceval) {
		this.faceval = faceval;
	}

    /**
     * Gets group.
     *
     * @return the group
     */
    public String getGroup() {
		return this.group;
	}

    /**
     * Sets group.
     *
     * @param group the group
     */
    public void setGroup(String group) {
		this.group = group;
	}

    /**
     * Gets storecode.
     *
     * @return the storecode
     */
    public String getStorecode() {
		return this.storecode;
	}

    /**
     * Sets storecode.
     *
     * @param storecode the storecode
     */
    public void setStorecode(String storecode) {
		this.storecode = storecode;
	}

    /**
     * Gets validtimes.
     *
     * @return the validtimes
     */
    public String getValidtimes() {
		return this.validtimes;
	}

    /**
     * Sets validtimes.
     *
     * @param validtimes the validtimes
     */
    public void setValidtimes(String validtimes) {
		this.validtimes = validtimes;
	}

}
