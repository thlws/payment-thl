package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售货机入驻申请
 *
 * @author auto create
 * @since 1.0, 2018-09-10 14:28:42
 */
public class AntMerchantExpandAutomatApplyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6269842651459459578L;

	/**
	 * 自助售卖机合作伙伴信息
	 */
	@ApiField("associate")
	private SmartAutomatAssociate associate;

	/**
	 * 机具发货地址信息
	 */
	@ApiField("delivery_address")
	private SmartAddressInfo deliveryAddress;

	/**
	 * 合作类型 COOPERATION_CONTRACT(新签合约机),COOPERATION_EXCLUSIVE(定制机),COOPERATION_REFORM(改造机),COOPERATION_STOCK(存量智能机),COOPERATION_OTHER(其他)
	 */
	@ApiField("machine_cooperation_type")
	private String machineCooperationType;

	/**
	 * 机具出厂时间
	 */
	@ApiField("machine_delivery_date")
	private Date machineDeliveryDate;

	/**
	 * 机具名称，一般采用厂商名称的简称作为设备名称。8个英文字符或4个中文汉字
	 */
	@ApiField("machine_name")
	private String machineName;

	/**
	 * 机具类型，可取值如下：

AUTOMAT(自助售卖机),
WASHING_MACHINE(洗衣机),
MASSAGE_CHAIR(按摩椅),
AIR_BLOWER(吹风机),
CRANE_MACHINE(娃娃机),
EV_CHARGER(充电桩),
SIMULATION_KTV(模拟KTV),
GAME_MACHINE(游戏机),
JUICER(果汁机),
COFFEE_MACHINE(咖啡机),
WATER_PURIFIER(净水设备),
SMART_CONTAINER(智能货柜),
OPEN_SHELVES(开放式货架),
LOTTERY_MACHINE(彩票机),
SCANFACE_AUTOMAT(扫脸售卖机),
CREDIT_CONTAINER(信用货柜),
SCANFACE_CONTAINER(扫脸货柜),
DRUG_SELLING_MACHINE(售药机),
ROCKING_MACHINE(摇摇车),
TOY_EGG_MACHINE(扭蛋机),
PORTABLE_CHARGER(充电宝),
ICE_CREAM_MACHINE(冰淇淋机),
COCONUT_MILK_MACHINE(椰汁机),
PACKED_LUNCH_MACHINE(盒饭机),
BREAKFAST_MACHINE(早餐机),
TISSUE_MACHINE(纸巾机),
NOODLE_MACHINE(面条机),
PROTOTYPE_MACHINE(派样机),
ADULT_ITEM_MACHINE(成人用品机),
OTHER(其他)
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 商户的支付宝账号ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 运营商类型 ALIPAY_MERCHANT(支付宝商家),DISTRIBUTOR(渠道商),ISV(ISV服务商),OPERATOR_MERCHANT(运营商)
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	/**
	 * 机具点位地址信息
	 */
	@ApiField("point_position")
	private SmartAddressInfo pointPosition;

	/**
	 * 厂商的支付宝账号ID
	 */
	@ApiField("product_user_id")
	private String productUserId;

	/**
	 * 自助售卖机场景信息
	 */
	@ApiField("scene")
	private SmartAutomatScene scene;

	/**
	 * 机具终端ID，由开发者生成，并需保证在开发者端不重复
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 机具交易号，商户在厂商淘宝门店购买的设备需要提供当时订单对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets associate.
     *
     * @return the associate
     */
    public SmartAutomatAssociate getAssociate() {
		return this.associate;
	}

    /**
     * Sets associate.
     *
     * @param associate the associate
     */
    public void setAssociate(SmartAutomatAssociate associate) {
		this.associate = associate;
	}

    /**
     * Gets delivery address.
     *
     * @return the delivery address
     */
    public SmartAddressInfo getDeliveryAddress() {
		return this.deliveryAddress;
	}

    /**
     * Sets delivery address.
     *
     * @param deliveryAddress the delivery address
     */
    public void setDeliveryAddress(SmartAddressInfo deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

    /**
     * Gets machine cooperation type.
     *
     * @return the machine cooperation type
     */
    public String getMachineCooperationType() {
		return this.machineCooperationType;
	}

    /**
     * Sets machine cooperation type.
     *
     * @param machineCooperationType the machine cooperation type
     */
    public void setMachineCooperationType(String machineCooperationType) {
		this.machineCooperationType = machineCooperationType;
	}

    /**
     * Gets machine delivery date.
     *
     * @return the machine delivery date
     */
    public Date getMachineDeliveryDate() {
		return this.machineDeliveryDate;
	}

    /**
     * Sets machine delivery date.
     *
     * @param machineDeliveryDate the machine delivery date
     */
    public void setMachineDeliveryDate(Date machineDeliveryDate) {
		this.machineDeliveryDate = machineDeliveryDate;
	}

    /**
     * Gets machine name.
     *
     * @return the machine name
     */
    public String getMachineName() {
		return this.machineName;
	}

    /**
     * Sets machine name.
     *
     * @param machineName the machine name
     */
    public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

    /**
     * Gets machine type.
     *
     * @return the machine type
     */
    public String getMachineType() {
		return this.machineType;
	}

    /**
     * Sets machine type.
     *
     * @param machineType the machine type
     */
    public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

    /**
     * Gets merchant user id.
     *
     * @return the merchant user id
     */
    public String getMerchantUserId() {
		return this.merchantUserId;
	}

    /**
     * Sets merchant user id.
     *
     * @param merchantUserId the merchant user id
     */
    public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

    /**
     * Gets merchant user type.
     *
     * @return the merchant user type
     */
    public String getMerchantUserType() {
		return this.merchantUserType;
	}

    /**
     * Sets merchant user type.
     *
     * @param merchantUserType the merchant user type
     */
    public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

    /**
     * Gets point position.
     *
     * @return the point position
     */
    public SmartAddressInfo getPointPosition() {
		return this.pointPosition;
	}

    /**
     * Sets point position.
     *
     * @param pointPosition the point position
     */
    public void setPointPosition(SmartAddressInfo pointPosition) {
		this.pointPosition = pointPosition;
	}

    /**
     * Gets product user id.
     *
     * @return the product user id
     */
    public String getProductUserId() {
		return this.productUserId;
	}

    /**
     * Sets product user id.
     *
     * @param productUserId the product user id
     */
    public void setProductUserId(String productUserId) {
		this.productUserId = productUserId;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public SmartAutomatScene getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(SmartAutomatScene scene) {
		this.scene = scene;
	}

    /**
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
		return this.terminalId;
	}

    /**
     * Sets terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
