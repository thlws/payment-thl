package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserCertDocDrivingLicense;
import com.alipay.api.domain.AlipayUserCertDocIDCard;
import com.alipay.api.domain.AlipayUserCertDocPassport;
import com.alipay.api.domain.AlipayUserCertDocVehicleLicense;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.query response.
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:02:44
 */
public class AlipayUserCertdocQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4628668683915639366L;

	/** 
	 * 进行授权的用户本人的驾驶证信息
	 */
	@ApiField("driving_license")
	private AlipayUserCertDocDrivingLicense drivingLicense;

	/** 
	 * 所有驾驶证信息列表
	 */
	@ApiListField("driving_license_list")
	@ApiField("alipay_user_cert_doc_driving_license")
	private List<AlipayUserCertDocDrivingLicense> drivingLicenseList;

	/** 
	 * 进行授权的用户本人的身份证信息
	 */
	@ApiField("identity_card")
	private AlipayUserCertDocIDCard identityCard;

	/** 
	 * 所有身份证信息列表
	 */
	@ApiListField("identity_card_list")
	@ApiField("alipay_user_cert_doc_i_d_card")
	private List<AlipayUserCertDocIDCard> identityCardList;

	/** 
	 * 护照列表
	 */
	@ApiListField("passport_list")
	@ApiField("alipay_user_cert_doc_passport")
	private List<AlipayUserCertDocPassport> passportList;

	/** 
	 * 进行授权的用户本人的行驶证信息列表
	 */
	@ApiListField("self_vehicle_license_list")
	@ApiField("alipay_user_cert_doc_vehicle_license")
	private List<AlipayUserCertDocVehicleLicense> selfVehicleLicenseList;

	/** 
	 * 所有行驶证信息列表
	 */
	@ApiListField("vehicle_license_list")
	@ApiField("alipay_user_cert_doc_vehicle_license")
	private List<AlipayUserCertDocVehicleLicense> vehicleLicenseList;

    /**
     * Sets driving license.
     *
     * @param drivingLicense the driving license
     */
    public void setDrivingLicense(AlipayUserCertDocDrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

    /**
     * Gets driving license.
     *
     * @return the driving license
     */
    public AlipayUserCertDocDrivingLicense getDrivingLicense( ) {
		return this.drivingLicense;
	}

    /**
     * Sets driving license list.
     *
     * @param drivingLicenseList the driving license list
     */
    public void setDrivingLicenseList(List<AlipayUserCertDocDrivingLicense> drivingLicenseList) {
		this.drivingLicenseList = drivingLicenseList;
	}

    /**
     * Gets driving license list.
     *
     * @return the driving license list
     */
    public List<AlipayUserCertDocDrivingLicense> getDrivingLicenseList( ) {
		return this.drivingLicenseList;
	}

    /**
     * Sets identity card.
     *
     * @param identityCard the identity card
     */
    public void setIdentityCard(AlipayUserCertDocIDCard identityCard) {
		this.identityCard = identityCard;
	}

    /**
     * Gets identity card.
     *
     * @return the identity card
     */
    public AlipayUserCertDocIDCard getIdentityCard( ) {
		return this.identityCard;
	}

    /**
     * Sets identity card list.
     *
     * @param identityCardList the identity card list
     */
    public void setIdentityCardList(List<AlipayUserCertDocIDCard> identityCardList) {
		this.identityCardList = identityCardList;
	}

    /**
     * Gets identity card list.
     *
     * @return the identity card list
     */
    public List<AlipayUserCertDocIDCard> getIdentityCardList( ) {
		return this.identityCardList;
	}

    /**
     * Sets passport list.
     *
     * @param passportList the passport list
     */
    public void setPassportList(List<AlipayUserCertDocPassport> passportList) {
		this.passportList = passportList;
	}

    /**
     * Gets passport list.
     *
     * @return the passport list
     */
    public List<AlipayUserCertDocPassport> getPassportList( ) {
		return this.passportList;
	}

    /**
     * Sets self vehicle license list.
     *
     * @param selfVehicleLicenseList the self vehicle license list
     */
    public void setSelfVehicleLicenseList(List<AlipayUserCertDocVehicleLicense> selfVehicleLicenseList) {
		this.selfVehicleLicenseList = selfVehicleLicenseList;
	}

    /**
     * Gets self vehicle license list.
     *
     * @return the self vehicle license list
     */
    public List<AlipayUserCertDocVehicleLicense> getSelfVehicleLicenseList( ) {
		return this.selfVehicleLicenseList;
	}

    /**
     * Sets vehicle license list.
     *
     * @param vehicleLicenseList the vehicle license list
     */
    public void setVehicleLicenseList(List<AlipayUserCertDocVehicleLicense> vehicleLicenseList) {
		this.vehicleLicenseList = vehicleLicenseList;
	}

    /**
     * Gets vehicle license list.
     *
     * @return the vehicle license list
     */
    public List<AlipayUserCertDocVehicleLicense> getVehicleLicenseList( ) {
		return this.vehicleLicenseList;
	}

}
