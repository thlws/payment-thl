package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayZdatafrontDatatransferedFileuploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload request
 *
 * @author auto create
 * @since 1.0, 2017-05-02 14:41:11
 */
public class AlipayZdatafrontDatatransferedFileuploadRequest implements AlipayUploadRequest<AlipayZdatafrontDatatransferedFileuploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 合作伙伴上传文件中的各字段,使用英文半角","分隔，file_type为json_data时必选
	 */
	private String columns;

	/** 
	* 二进制字节数组，由文件转出，最大支持50M文件的上传
	 */
	private FileItem file;

	/** 
	* 文件描述信息，非解析数据类型必选
	 */
	private String fileDescription;

	/** 
	* 文件摘要，算法SHA
	 */
	private String fileDigest;

	/** 
	* 描述上传文件的类型
	 */
	private String fileType;

	/** 
	* 上传数据文件的主键字段，注意该pk若出现重复则后入数据会覆盖前面的，file_type为json_data时必选
	 */
	private String primaryKey;

	/** 
	* 上传数据文件包含的记录数，file_type为json_data时必选
	 */
	private Long records;

	/** 
	* 外部公司的数据源标识信息，由联接网络分配
	 */
	private String typeId;

    /**
     * Sets columns.
     *
     * @param columns the columns
     */
    public void setColumns(String columns) {
		this.columns = columns;
	}

    /**
     * Gets columns.
     *
     * @return the columns
     */
    public String getColumns() {
		return this.columns;
	}

    /**
     * Sets file.
     *
     * @param file the file
     */
    public void setFile(FileItem file) {
		this.file = file;
	}

    /**
     * Gets file.
     *
     * @return the file
     */
    public FileItem getFile() {
		return this.file;
	}

    /**
     * Sets file description.
     *
     * @param fileDescription the file description
     */
    public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

    /**
     * Gets file description.
     *
     * @return the file description
     */
    public String getFileDescription() {
		return this.fileDescription;
	}

    /**
     * Sets file digest.
     *
     * @param fileDigest the file digest
     */
    public void setFileDigest(String fileDigest) {
		this.fileDigest = fileDigest;
	}

    /**
     * Gets file digest.
     *
     * @return the file digest
     */
    public String getFileDigest() {
		return this.fileDigest;
	}

    /**
     * Sets file type.
     *
     * @param fileType the file type
     */
    public void setFileType(String fileType) {
		this.fileType = fileType;
	}

    /**
     * Gets file type.
     *
     * @return the file type
     */
    public String getFileType() {
		return this.fileType;
	}

    /**
     * Sets primary key.
     *
     * @param primaryKey the primary key
     */
    public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

    /**
     * Gets primary key.
     *
     * @return the primary key
     */
    public String getPrimaryKey() {
		return this.primaryKey;
	}

    /**
     * Sets records.
     *
     * @param records the records
     */
    public void setRecords(Long records) {
		this.records = records;
	}

    /**
     * Gets records.
     *
     * @return the records
     */
    public Long getRecords() {
		return this.records;
	}

    /**
     * Sets type id.
     *
     * @param typeId the type id
     */
    public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

    /**
     * Gets type id.
     *
     * @return the type id
     */
    public String getTypeId() {
		return this.typeId;
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
		return "alipay.zdatafront.datatransfered.fileupload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("columns", this.columns);
		txtParams.put("file_description", this.fileDescription);
		txtParams.put("file_digest", this.fileDigest);
		txtParams.put("file_type", this.fileType);
		txtParams.put("primary_key", this.primaryKey);
		txtParams.put("records", this.records);
		txtParams.put("type_id", this.typeId);
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
		params.put("file", this.file);
		return params;
	}

	public Class<AlipayZdatafrontDatatransferedFileuploadResponse> getResponseClass() {
		return AlipayZdatafrontDatatransferedFileuploadResponse.class;
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
