package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppBillAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.bill.add request
 *
 * @author auto create
 * @since 1.0, 2018-08-01 17:06:55
 */
public class AlipayEbppBillAddRequest implements AlipayRequest<AlipayEbppBillAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 外部订单号
	 */
	private String bankBillNo;

	/** 
	* 账单的账期，例如201203表示2012年3月的账单。
	 */
	private String billDate;

	/** 
	* 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	private String billKey;

	/** 
	* 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	private String chargeInst;

	/** 
	* 扩展属性
	 */
	private String extendField;

	/** 
	* 输出机构的业务流水号，需要保证唯一性
	 */
	private String merchantOrderNo;

	/** 
	* 用户的手机号
	 */
	private String mobile;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* 拥有该账单的用户姓名
	 */
	private String ownerName;

	/** 
	* 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	private String payAmount;

	/** 
	* 账单的服务费。
	 */
	private String serviceAmount;

	/** 
	* 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	private String subOrderType;

	/** 
	* 交通违章地点，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficLocation;

	/** 
	* 违章行为，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficRegulations;

    /**
     * Sets bank bill no.
     *
     * @param bankBillNo the bank bill no
     */
    public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}

    /**
     * Gets bank bill no.
     *
     * @return the bank bill no
     */
    public String getBankBillNo() {
		return this.bankBillNo;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

    /**
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate() {
		return this.billDate;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo() {
		return this.merchantOrderNo;
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
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

    /**
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount() {
		return this.serviceAmount;
	}

    /**
     * Sets sub order type.
     *
     * @param subOrderType the sub order type
     */
    public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

    /**
     * Gets sub order type.
     *
     * @return the sub order type
     */
    public String getSubOrderType() {
		return this.subOrderType;
	}

    /**
     * Sets traffic location.
     *
     * @param trafficLocation the traffic location
     */
    public void setTrafficLocation(String trafficLocation) {
		this.trafficLocation = trafficLocation;
	}

    /**
     * Gets traffic location.
     *
     * @return the traffic location
     */
    public String getTrafficLocation() {
		return this.trafficLocation;
	}

    /**
     * Sets traffic regulations.
     *
     * @param trafficRegulations the traffic regulations
     */
    public void setTrafficRegulations(String trafficRegulations) {
		this.trafficRegulations = trafficRegulations;
	}

    /**
     * Gets traffic regulations.
     *
     * @return the traffic regulations
     */
    public String getTrafficRegulations() {
		return this.trafficRegulations;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.ebpp.bill.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bank_bill_no", this.bankBillNo);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("mobile", this.mobile);
		txtParams.put("order_type", this.orderType);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("service_amount", this.serviceAmount);
		txtParams.put("sub_order_type", this.subOrderType);
		txtParams.put("traffic_location", this.trafficLocation);
		txtParams.put("traffic_regulations", this.trafficRegulations);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

    /**
     * Put other text param.
     *
     * @param key   the key
     * @param value the value
     */
    public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayEbppBillAddResponse> getResponseClass() {
		return AlipayEbppBillAddResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
