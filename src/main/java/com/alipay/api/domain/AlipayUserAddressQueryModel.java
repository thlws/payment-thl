package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据addressId获取用户详细地址信息
 *
 * @author auto create
 * @since 1.0, 2018-05-15 15:52:25
 */
public class AlipayUserAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6187888981131486267L;

	/**
	 * 用户地址唯一ID。通过调用小程序开放api(my.chooseAddress)获取。
	 */
	@ApiField("address_id")
	private String addressId;

    /**
     * Gets address id.
     *
     * @return the address id
     */
    public String getAddressId() {
		return this.addressId;
	}

    /**
     * Sets address id.
     *
     * @param addressId the address id
     */
    public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
