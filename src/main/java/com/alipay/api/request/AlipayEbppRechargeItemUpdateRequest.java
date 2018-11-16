package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppRechargeItemUpdateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.recharge.item.update request
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:07:42
 */
public class AlipayEbppRechargeItemUpdateRequest implements AlipayRequest<AlipayEbppRechargeItemUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 测试
	 */
	private String cardNo;

	/** 
	* 是否销售
	 */
	private String isForSale;

	/** 
	* 货架id
	 */
	private String itemCode;

	/** 
	* 商品类型
	 */
	private String itemCodeType;

	/** 
	* 业务类型
	 */
	private String orderType;

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets is for sale.
     *
     * @param isForSale the is for sale
     */
    public void setIsForSale(String isForSale) {
		this.isForSale = isForSale;
	}

    /**
     * Gets is for sale.
     *
     * @return the is for sale
     */
    public String getIsForSale() {
		return this.isForSale;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode() {
		return this.itemCode;
	}

    /**
     * Sets item code type.
     *
     * @param itemCodeType the item code type
     */
    public void setItemCodeType(String itemCodeType) {
		this.itemCodeType = itemCodeType;
	}

    /**
     * Gets item code type.
     *
     * @return the item code type
     */
    public String getItemCodeType() {
		return this.itemCodeType;
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
		return "alipay.ebpp.recharge.item.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("card_no", this.cardNo);
		txtParams.put("is_for_sale", this.isForSale);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("item_code_type", this.itemCodeType);
		txtParams.put("order_type", this.orderType);
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

	public Class<AlipayEbppRechargeItemUpdateResponse> getResponseClass() {
		return AlipayEbppRechargeItemUpdateResponse.class;
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
