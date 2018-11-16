package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约生效策略模型
 *
 * @author auto create
 * @since 1.0, 2018-07-13 14:09:58
 */
public class ValidStrategy extends AlipayObject {

	private static final long serialVersionUID = 6612735248137989979L;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_invalid")
	private Date gmtInvalid;

	/**
	 * 签约时间
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/**
	 * 生效日期
	 */
	@ApiField("gmt_valid")
	private Date gmtValid;

	/**
	 * 失效方式：
01:到期失效
02:通知失效
03:截止日期失效
	 */
	@ApiField("invalid_type")
	private String invalidType;

	/**
	 * 生效类型：
01:立即生效
02:通知生效
03:预约生效
04:倒签生效
	 */
	@ApiField("valid_type")
	private String validType;

    /**
     * Gets gmt invalid.
     *
     * @return the gmt invalid
     */
    public Date getGmtInvalid() {
		return this.gmtInvalid;
	}

    /**
     * Sets gmt invalid.
     *
     * @param gmtInvalid the gmt invalid
     */
    public void setGmtInvalid(Date gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

    /**
     * Gets gmt sign.
     *
     * @return the gmt sign
     */
    public Date getGmtSign() {
		return this.gmtSign;
	}

    /**
     * Sets gmt sign.
     *
     * @param gmtSign the gmt sign
     */
    public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}

    /**
     * Gets gmt valid.
     *
     * @return the gmt valid
     */
    public Date getGmtValid() {
		return this.gmtValid;
	}

    /**
     * Sets gmt valid.
     *
     * @param gmtValid the gmt valid
     */
    public void setGmtValid(Date gmtValid) {
		this.gmtValid = gmtValid;
	}

    /**
     * Gets invalid type.
     *
     * @return the invalid type
     */
    public String getInvalidType() {
		return this.invalidType;
	}

    /**
     * Sets invalid type.
     *
     * @param invalidType the invalid type
     */
    public void setInvalidType(String invalidType) {
		this.invalidType = invalidType;
	}

    /**
     * Gets valid type.
     *
     * @return the valid type
     */
    public String getValidType() {
		return this.validType;
	}

    /**
     * Sets valid type.
     *
     * @param validType the valid type
     */
    public void setValidType(String validType) {
		this.validType = validType;
	}

}
