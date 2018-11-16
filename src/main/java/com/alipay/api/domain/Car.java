package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:38
 */
public class Car extends AlipayObject {

	private static final long serialVersionUID = 2492149534858129747L;

	/**
	 * 发动机号
	 */
	@ApiField("car_engine_no")
	private String carEngineNo;

	/**
	 * 车架号
	 */
	@ApiField("car_frame_no")
	private String carFrameNo;

	/**
	 * 品牌型号
	 */
	@ApiField("car_model_code")
	private String carModelCode;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 该车辆数据来源，1 来自 ISV，2来自保险师内部数据
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 初次登记日期
	 */
	@ApiField("first_register_date")
	private String firstRegisterDate;

	/**
	 * 天津地区行驶证地址
	 */
	@ApiField("license_address")
	private String licenseAddress;

	/**
	 * 是否过户车
	 */
	@ApiField("transfer_car")
	private String transferCar;

	/**
	 * 过户日期
	 */
	@ApiField("transfer_date")
	private String transferDate;

	/**
	 * 所有需要报价机构对应的精友码
	 */
	@ApiListField("vehicle_info_list")
	@ApiField("vehicle_info")
	private List<VehicleInfo> vehicleInfoList;

	/**
	 * 天津地区行驶证车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

    /**
     * Gets car engine no.
     *
     * @return the car engine no
     */
    public String getCarEngineNo() {
		return this.carEngineNo;
	}

    /**
     * Sets car engine no.
     *
     * @param carEngineNo the car engine no
     */
    public void setCarEngineNo(String carEngineNo) {
		this.carEngineNo = carEngineNo;
	}

    /**
     * Gets car frame no.
     *
     * @return the car frame no
     */
    public String getCarFrameNo() {
		return this.carFrameNo;
	}

    /**
     * Sets car frame no.
     *
     * @param carFrameNo the car frame no
     */
    public void setCarFrameNo(String carFrameNo) {
		this.carFrameNo = carFrameNo;
	}

    /**
     * Gets car entity code.
     *
     * @return the car entity code
     */
    public String getCarModelCode() {
		return this.carModelCode;
	}

    /**
     * Sets car entity code.
     *
     * @param carModelCode the car entity code
     */
    public void setCarModelCode(String carModelCode) {
		this.carModelCode = carModelCode;
	}

    /**
     * Gets car no.
     *
     * @return the car no
     */
    public String getCarNo() {
		return this.carNo;
	}

    /**
     * Sets car no.
     *
     * @param carNo the car no
     */
    public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

    /**
     * Gets data source.
     *
     * @return the data source
     */
    public String getDataSource() {
		return this.dataSource;
	}

    /**
     * Sets data source.
     *
     * @param dataSource the data source
     */
    public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

    /**
     * Gets first register date.
     *
     * @return the first register date
     */
    public String getFirstRegisterDate() {
		return this.firstRegisterDate;
	}

    /**
     * Sets first register date.
     *
     * @param firstRegisterDate the first register date
     */
    public void setFirstRegisterDate(String firstRegisterDate) {
		this.firstRegisterDate = firstRegisterDate;
	}

    /**
     * Gets license address.
     *
     * @return the license address
     */
    public String getLicenseAddress() {
		return this.licenseAddress;
	}

    /**
     * Sets license address.
     *
     * @param licenseAddress the license address
     */
    public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}

    /**
     * Gets transfer car.
     *
     * @return the transfer car
     */
    public String getTransferCar() {
		return this.transferCar;
	}

    /**
     * Sets transfer car.
     *
     * @param transferCar the transfer car
     */
    public void setTransferCar(String transferCar) {
		this.transferCar = transferCar;
	}

    /**
     * Gets transfer date.
     *
     * @return the transfer date
     */
    public String getTransferDate() {
		return this.transferDate;
	}

    /**
     * Sets transfer date.
     *
     * @param transferDate the transfer date
     */
    public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

    /**
     * Gets vehicle info list.
     *
     * @return the vehicle info list
     */
    public List<VehicleInfo> getVehicleInfoList() {
		return this.vehicleInfoList;
	}

    /**
     * Sets vehicle info list.
     *
     * @param vehicleInfoList the vehicle info list
     */
    public void setVehicleInfoList(List<VehicleInfo> vehicleInfoList) {
		this.vehicleInfoList = vehicleInfoList;
	}

    /**
     * Gets vehicle type.
     *
     * @return the vehicle type
     */
    public String getVehicleType() {
		return this.vehicleType;
	}

    /**
     * Sets vehicle type.
     *
     * @param vehicleType the vehicle type
     */
    public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
