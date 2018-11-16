package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险理赔案件材料上传确认
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:40
 */
public class AlipayInsSceneClaimAttachmentConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2169273245338431397L;

	/**
	 * 理赔申请报案号，通过理赔申请【alipay.ins.scene.claim.apply】接口的返回字段claim_report_no获取
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 上传的文件名清单列表，即alipay.ins.scene.claim.attachment.upload  接口中的attachment_name  用逗号(,)隔离
	 */
	@ApiListField("upload_files")
	@ApiField("string")
	private List<String> uploadFiles;

    /**
     * Gets claim report no.
     *
     * @return the claim report no
     */
    public String getClaimReportNo() {
		return this.claimReportNo;
	}

    /**
     * Sets claim report no.
     *
     * @param claimReportNo the claim report no
     */
    public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

    /**
     * Gets upload files.
     *
     * @return the upload files
     */
    public List<String> getUploadFiles() {
		return this.uploadFiles;
	}

    /**
     * Sets upload files.
     *
     * @param uploadFiles the upload files
     */
    public void setUploadFiles(List<String> uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

}
