package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约文件列表
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class SignDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4257548932431523935L;

	/**
	 * 待签约数据编号，由外部系统定义，用于数据关联
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 待签约数据名称，支持GBK编码字符
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 代签名数据类型
'DATA'   //数据原文
'FILE'    //文档索引，通过OSS空间交换
'TEMPLATE'   //文档模板
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 当data_type=FILE时，制定文档类型。
'html'  //html格式文档
'pdf'   //pdf格式文档
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * OSS空间中存储的文件Id
	 */
	@ApiField("oss_file_id")
	private String ossFileId;

	/**
	 * 文档预览地址信息
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 文档签章列表，参考FileSignatrue
	 */
	@ApiListField("signature_list")
	@ApiField("file_signature")
	private List<FileSignature> signatureList;

	/**
	 * 文档原文内容，当data_type=DATA时必传。
	 */
	@ApiField("source_data")
	private String sourceData;

    /**
     * Gets data id.
     *
     * @return the data id
     */
    public String getDataId() {
		return this.dataId;
	}

    /**
     * Sets data id.
     *
     * @param dataId the data id
     */
    public void setDataId(String dataId) {
		this.dataId = dataId;
	}

    /**
     * Gets data name.
     *
     * @return the data name
     */
    public String getDataName() {
		return this.dataName;
	}

    /**
     * Sets data name.
     *
     * @param dataName the data name
     */
    public void setDataName(String dataName) {
		this.dataName = dataName;
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
     * Sets data type.
     *
     * @param dataType the data type
     */
    public void setDataType(String dataType) {
		this.dataType = dataType;
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
     * Sets file type.
     *
     * @param fileType the file type
     */
    public void setFileType(String fileType) {
		this.fileType = fileType;
	}

    /**
     * Gets oss file id.
     *
     * @return the oss file id
     */
    public String getOssFileId() {
		return this.ossFileId;
	}

    /**
     * Sets oss file id.
     *
     * @param ossFileId the oss file id
     */
    public void setOssFileId(String ossFileId) {
		this.ossFileId = ossFileId;
	}

    /**
     * Gets preview url.
     *
     * @return the preview url
     */
    public String getPreviewUrl() {
		return this.previewUrl;
	}

    /**
     * Sets preview url.
     *
     * @param previewUrl the preview url
     */
    public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

    /**
     * Gets signature list.
     *
     * @return the signature list
     */
    public List<FileSignature> getSignatureList() {
		return this.signatureList;
	}

    /**
     * Sets signature list.
     *
     * @param signatureList the signature list
     */
    public void setSignatureList(List<FileSignature> signatureList) {
		this.signatureList = signatureList;
	}

    /**
     * Gets source data.
     *
     * @return the source data
     */
    public String getSourceData() {
		return this.sourceData;
	}

    /**
     * Sets source data.
     *
     * @param sourceData the source data
     */
    public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

}
