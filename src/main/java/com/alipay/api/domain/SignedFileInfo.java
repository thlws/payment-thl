package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已签名文件信息
 *
 * @author auto create
 * @since 1.0, 2017-08-08 10:42:59
 */
public class SignedFileInfo extends AlipayObject {

	private static final long serialVersionUID = 5762375515764491761L;

	/**
	 * 文档过期时间戳
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 数据名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
pdf //pdf文档
p7 //pkcs7签名文档
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件读取url地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 文档创建时间戳
	 */
	@ApiField("gmt_time")
	private Date gmtTime;

	/**
	 * 签约数据编号，由平台生成
	 */
	@ApiField("inner_data_id")
	private String innerDataId;

	/**
	 * 签约数据编号，由外部系统定义，用于数据关联
	 */
	@ApiField("out_data_id")
	private String outDataId;

	/**
	 * 文档签名结果
	 */
	@ApiField("signed_data")
	private String signedData;

	/**
	 * 资源文件类型
DATA //文件原文
FILE  //文件OSS索引
	 */
	@ApiField("source_type")
	private String sourceType;

    /**
     * Gets expired time.
     *
     * @return the expired time
     */
    public Date getExpiredTime() {
		return this.expiredTime;
	}

    /**
     * Sets expired time.
     *
     * @param expiredTime the expired time
     */
    public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

    /**
     * Gets file name.
     *
     * @return the file name
     */
    public String getFileName() {
		return this.fileName;
	}

    /**
     * Sets file name.
     *
     * @param fileName the file name
     */
    public void setFileName(String fileName) {
		this.fileName = fileName;
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
     * Gets file url.
     *
     * @return the file url
     */
    public String getFileUrl() {
		return this.fileUrl;
	}

    /**
     * Sets file url.
     *
     * @param fileUrl the file url
     */
    public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

    /**
     * Gets gmt time.
     *
     * @return the gmt time
     */
    public Date getGmtTime() {
		return this.gmtTime;
	}

    /**
     * Sets gmt time.
     *
     * @param gmtTime the gmt time
     */
    public void setGmtTime(Date gmtTime) {
		this.gmtTime = gmtTime;
	}

    /**
     * Gets inner data id.
     *
     * @return the inner data id
     */
    public String getInnerDataId() {
		return this.innerDataId;
	}

    /**
     * Sets inner data id.
     *
     * @param innerDataId the inner data id
     */
    public void setInnerDataId(String innerDataId) {
		this.innerDataId = innerDataId;
	}

    /**
     * Gets out data id.
     *
     * @return the out data id
     */
    public String getOutDataId() {
		return this.outDataId;
	}

    /**
     * Sets out data id.
     *
     * @param outDataId the out data id
     */
    public void setOutDataId(String outDataId) {
		this.outDataId = outDataId;
	}

    /**
     * Gets signed data.
     *
     * @return the signed data
     */
    public String getSignedData() {
		return this.signedData;
	}

    /**
     * Sets signed data.
     *
     * @param signedData the signed data
     */
    public void setSignedData(String signedData) {
		this.signedData = signedData;
	}

    /**
     * Gets source type.
     *
     * @return the source type
     */
    public String getSourceType() {
		return this.sourceType;
	}

    /**
     * Sets source type.
     *
     * @param sourceType the source type
     */
    public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
