package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件资源上传
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:38:56
 */
public class AlipayEcoRenthouseCommonImageUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5525232938919727123L;

	/**
	 * 文件内容字节数组Base64字符串,最大支持上传5M的文件
	 */
	@ApiField("file_base")
	private String fileBase;

	/**
	 * 文件类型
1：图片（支持jpg、png、jpeg、bmp格式） 
2：合同（HTML格式）
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * true|false是否公共读写，私密文件使用否，如电子合同
	 */
	@ApiField("is_public")
	private Boolean isPublic;

    /**
     * Gets file base.
     *
     * @return the file base
     */
    public String getFileBase() {
		return this.fileBase;
	}

    /**
     * Sets file base.
     *
     * @param fileBase the file base
     */
    public void setFileBase(String fileBase) {
		this.fileBase = fileBase;
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
     * Gets is public.
     *
     * @return the is public
     */
    public Boolean getIsPublic() {
		return this.isPublic;
	}

    /**
     * Sets is public.
     *
     * @param isPublic the is public
     */
    public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

}
