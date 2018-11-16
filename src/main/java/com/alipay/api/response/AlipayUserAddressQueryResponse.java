package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.address.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-15 15:52:25
 */
public class AlipayUserAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3245111629841916769L;

	/** 
	 * 地址详情
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 收货地址地址码。可能对应市级，也可能对应区级
	 */
	@ApiField("address_code")
	private String addressCode;

	/** 
	 * 收货地址区名
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 收货地址城市名
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 收货地址经纬度
	 */
	@ApiField("coordinate")
	private String coordinate;

	/** 
	 * 是否默认收货地址。T：是，F：否。
	 */
	@ApiField("default_user_address")
	private String defaultUserAddress;

	/** 
	 * 收货人姓名
	 */
	@ApiField("fullname")
	private String fullname;

	/** 
	 * 收货人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 收货地址省名
	 */
	@ApiField("prov")
	private String prov;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
	}

    /**
     * Sets address code.
     *
     * @param addressCode the address code
     */
    public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

    /**
     * Gets address code.
     *
     * @return the address code
     */
    public String getAddressCode( ) {
		return this.addressCode;
	}

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(String area) {
		this.area = area;
	}

    /**
     * Gets area.
     *
     * @return the area
     */
    public String getArea( ) {
		return this.area;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity( ) {
		return this.city;
	}

    /**
     * Sets coordinate.
     *
     * @param coordinate the coordinate
     */
    public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

    /**
     * Gets coordinate.
     *
     * @return the coordinate
     */
    public String getCoordinate( ) {
		return this.coordinate;
	}

    /**
     * Sets default user address.
     *
     * @param defaultUserAddress the default user address
     */
    public void setDefaultUserAddress(String defaultUserAddress) {
		this.defaultUserAddress = defaultUserAddress;
	}

    /**
     * Gets default user address.
     *
     * @return the default user address
     */
    public String getDefaultUserAddress( ) {
		return this.defaultUserAddress;
	}

    /**
     * Sets fullname.
     *
     * @param fullname the fullname
     */
    public void setFullname(String fullname) {
		this.fullname = fullname;
	}

    /**
     * Gets fullname.
     *
     * @return the fullname
     */
    public String getFullname( ) {
		return this.fullname;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile( ) {
		return this.mobile;
	}

    /**
     * Sets prov.
     *
     * @param prov the prov
     */
    public void setProv(String prov) {
		this.prov = prov;
	}

    /**
     * Gets prov.
     *
     * @return the prov
     */
    public String getProv( ) {
		return this.prov;
	}

}
