package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.SsdataFindataQxOperatorUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ssdata.findata.qx.operator.upload request
 *
 * @author auto create
 * @since 1.0, 2017-10-30 20:08:20
 */
public class SsdataFindataQxOperatorUploadRequest implements AlipayUploadRequest<SsdataFindataQxOperatorUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 上传的文件数据类型,用来描述file_content
	 */
	private String dataType;

	/** 
	* 扩展信息
	 */
	private String extParam;

	/** 
	* 上传文件
	 */
	private FileItem fileContent;

	/** 
	* C端用户身份证
	 */
	private String idCardNo;

	/** 
	* C端用户手机号
	 */
	private String phone;

	/** 
	* C端用户姓名
	 */
	private String userName;

    /**
     * Sets data type.
     *
     * @param dataType the data type
     */
    public void setDataType(String dataType) {
		this.dataType = dataType;
	}

    /**
     * Gets data type.
     *
     * @return the data type
     */
    public String getDataType() {
		return this.dataType;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets file content.
     *
     * @param fileContent the file content
     */
    public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}

    /**
     * Gets file content.
     *
     * @return the file content
     */
    public FileItem getFileContent() {
		return this.fileContent;
	}

    /**
     * Sets id card no.
     *
     * @param idCardNo the id card no
     */
    public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

    /**
     * Gets id card no.
     *
     * @return the id card no
     */
    public String getIdCardNo() {
		return this.idCardNo;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
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
		return "ssdata.findata.qx.operator.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("data_type", this.dataType);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("phone", this.phone);
		txtParams.put("user_name", this.userName);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<SsdataFindataQxOperatorUploadResponse> getResponseClass() {
		return SsdataFindataQxOperatorUploadResponse.class;
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
