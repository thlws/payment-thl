package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV系统配置查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:00
 */
public class AlipayEcoMycarParkingConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6725713193677493136L;

	/**
	 * 传入参数固定值:alipay.eco.mycar.parking.userpage.query
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 传入参数固定值:interface_page
	 */
	@ApiField("interface_type")
	private String interfaceType;

    /**
     * Gets interface name.
     *
     * @return the interface name
     */
    public String getInterfaceName() {
		return this.interfaceName;
	}

    /**
     * Sets interface name.
     *
     * @param interfaceName the interface name
     */
    public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

    /**
     * Gets interface type.
     *
     * @return the interface type
     */
    public String getInterfaceType() {
		return this.interfaceType;
	}

    /**
     * Sets interface type.
     *
     * @param interfaceType the interface type
     */
    public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

}
