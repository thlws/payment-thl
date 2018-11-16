package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-06 21:20:00
 */
public class ZolozIdentificationCustomerCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4867572929652182463L;

	/** 
	 * 是否为攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("img_str")
	private String imgStr;

	/** 
	 * 比对结果
	 */
	@ApiField("result")
	private Boolean result;

    /**
     * Sets attack.
     *
     * @param attack the attack
     */
    public void setAttack(Boolean attack) {
		this.attack = attack;
	}

    /**
     * Gets attack.
     *
     * @return the attack
     */
    public Boolean getAttack( ) {
		return this.attack;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

    /**
     * Sets img str.
     *
     * @param imgStr the img str
     */
    public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}

    /**
     * Gets img str.
     *
     * @return the img str
     */
    public String getImgStr( ) {
		return this.imgStr;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(Boolean result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public Boolean getResult( ) {
		return this.result;
	}

}
