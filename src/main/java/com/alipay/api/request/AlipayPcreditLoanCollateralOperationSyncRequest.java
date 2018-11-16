package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPcreditLoanCollateralOperationSyncResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.pcredit.loan.collateral.operation.sync request
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:46:08
 */
public class AlipayPcreditLoanCollateralOperationSyncRequest implements AlipayUploadRequest<AlipayPcreditLoanCollateralOperationSyncResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务流水号，即用户授信申请的单号，每次授信申请由借呗平台生成的唯一编号，通知估值时给到机构
	 */
	private String applyNo;

	/** 
	* 上传附件的二进制流，最大限10M，以下操作类型时必填写：
UPLOAD_REC：上传抵押回执照片
UPLOAD_REG：上传抵押登记证照片
	 */
	private FileItem attachment;

	/** 
	* JSON格式的业务扩展信息，具体操作和机构约定具体的扩展信息
	 */
	private String bizExtInfo;

	/** 
	* 操作备注，备注信息越详实越好
	 */
	private String memo;

	/** 
	* 操作时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	private String operatedTime;

	/** 
	* 操作类型，目前对押品约定的操作有：
PLEDGED：已入押
UNPLEDGED：已出押；
DISPOSING：处置中；
DISPOSED：已处置；
VERIFIED：已核实；
REJECTED：核实拒绝；
UPLOAD_REC：上传抵押回执（receipt）照片
UPLOAD_REG：上传抵押登记证（registration certificate）照片
	 */
	private String operatedType;

	/** 
	* 操作人姓名
	 */
	private String operator;

	/** 
	* 机构请求流水号，请求的幂等字段，作为业务幂等性控制
	 */
	private String outRequestNo;

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo() {
		return this.applyNo;
	}

    /**
     * Sets attachment.
     *
     * @param attachment the attachment
     */
    public void setAttachment(FileItem attachment) {
		this.attachment = attachment;
	}

    /**
     * Gets attachment.
     *
     * @return the attachment
     */
    public FileItem getAttachment() {
		return this.attachment;
	}

    /**
     * Sets biz ext info.
     *
     * @param bizExtInfo the biz ext info
     */
    public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}

    /**
     * Gets biz ext info.
     *
     * @return the biz ext info
     */
    public String getBizExtInfo() {
		return this.bizExtInfo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets operated time.
     *
     * @param operatedTime the operated time
     */
    public void setOperatedTime(String operatedTime) {
		this.operatedTime = operatedTime;
	}

    /**
     * Gets operated time.
     *
     * @return the operated time
     */
    public String getOperatedTime() {
		return this.operatedTime;
	}

    /**
     * Sets operated type.
     *
     * @param operatedType the operated type
     */
    public void setOperatedType(String operatedType) {
		this.operatedType = operatedType;
	}

    /**
     * Gets operated type.
     *
     * @return the operated type
     */
    public String getOperatedType() {
		return this.operatedType;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
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
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.pcredit.loan.collateral.operation.sync";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apply_no", this.applyNo);
		txtParams.put("biz_ext_info", this.bizExtInfo);
		txtParams.put("memo", this.memo);
		txtParams.put("operated_time", this.operatedTime);
		txtParams.put("operated_type", this.operatedType);
		txtParams.put("operator", this.operator);
		txtParams.put("out_request_no", this.outRequestNo);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("attachment", this.attachment);
		return params;
	}

	public Class<AlipayPcreditLoanCollateralOperationSyncResponse> getResponseClass() {
		return AlipayPcreditLoanCollateralOperationSyncResponse.class;
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
