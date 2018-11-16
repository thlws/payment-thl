package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ka服务地址注册
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:15
 */
public class AlipayEcoRenthouseKaServiceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7666482227589737134L;

	/**
	 * 地址-对应在网关注册时候的接口标识
	 */
	@ApiField("address")
	private String address;

	/**
	 * kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	/**
	 * 类型：1:预约看房， 2:确认租约 ，3:拨号记录， 4:支付页面url
	 */
	@ApiField("type")
	private Long type;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets ka code.
     *
     * @return the ka code
     */
    public String getKaCode() {
		return this.kaCode;
	}

    /**
     * Sets ka code.
     *
     * @param kaCode the ka code
     */
    public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
		this.type = type;
	}

}
