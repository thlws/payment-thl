package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv回流pos订单数据
 *
 * @author auto create
 * @since 1.0, 2018-03-08 10:35:41
 */
public class PosOrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6699881753479767363L;

	/**
	 * 设备数量
	 */
	@ApiField("device_amount")
	private Long deviceAmount;

	/**
	 * 数据回流ISV名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 数据回流ISV_PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 订单绑定设备信息列表
	 */
	@ApiListField("machine_infos")
	@ApiField("pos_order_device_info_v_o")
	private List<PosOrderDeviceInfoVO> machineInfos;

	/**
	 * 商户手机号
	 */
	@ApiField("merchant_mobile")
	private String merchantMobile;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 购买pos机订单总价格，单位元，精确到小数点后2位
	 */
	@ApiField("order_amt")
	private String orderAmt;

	/**
	 * 购买pos机设备订单来源，分为线下和线上,枚举值为: 线上(ONLINE),线下(OFFLINE)
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 购买pos机设备订单编号：线上来源订单为订单编号，线下来源订单为合同编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 销售人员id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 销售人员名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 淘宝账号
	 */
	@ApiField("taobao_login_id")
	private String taobaoLoginId;

    /**
     * Gets device amount.
     *
     * @return the device amount
     */
    public Long getDeviceAmount() {
		return this.deviceAmount;
	}

    /**
     * Sets device amount.
     *
     * @param deviceAmount the device amount
     */
    public void setDeviceAmount(Long deviceAmount) {
		this.deviceAmount = deviceAmount;
	}

    /**
     * Gets isv name.
     *
     * @return the isv name
     */
    public String getIsvName() {
		return this.isvName;
	}

    /**
     * Sets isv name.
     *
     * @param isvName the isv name
     */
    public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

    /**
     * Gets machine infos.
     *
     * @return the machine infos
     */
    public List<PosOrderDeviceInfoVO> getMachineInfos() {
		return this.machineInfos;
	}

    /**
     * Sets machine infos.
     *
     * @param machineInfos the machine infos
     */
    public void setMachineInfos(List<PosOrderDeviceInfoVO> machineInfos) {
		this.machineInfos = machineInfos;
	}

    /**
     * Gets merchant mobile.
     *
     * @return the merchant mobile
     */
    public String getMerchantMobile() {
		return this.merchantMobile;
	}

    /**
     * Sets merchant mobile.
     *
     * @param merchantMobile the merchant mobile
     */
    public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName() {
		return this.merchantName;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets order amt.
     *
     * @return the order amt
     */
    public String getOrderAmt() {
		return this.orderAmt;
	}

    /**
     * Sets order amt.
     *
     * @param orderAmt the order amt
     */
    public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}

    /**
     * Gets order channel.
     *
     * @return the order channel
     */
    public String getOrderChannel() {
		return this.orderChannel;
	}

    /**
     * Sets order channel.
     *
     * @param orderChannel the order channel
     */
    public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller name.
     *
     * @return the seller name
     */
    public String getSellerName() {
		return this.sellerName;
	}

    /**
     * Sets seller name.
     *
     * @param sellerName the seller name
     */
    public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

    /**
     * Gets taobao login id.
     *
     * @return the taobao login id
     */
    public String getTaobaoLoginId() {
		return this.taobaoLoginId;
	}

    /**
     * Sets taobao login id.
     *
     * @param taobaoLoginId the taobao login id
     */
    public void setTaobaoLoginId(String taobaoLoginId) {
		this.taobaoLoginId = taobaoLoginId;
	}

}
