package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连商户文件上传
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:47:16
 */
public class AntMerchantExpandIndirectAttachmentUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8684586362753631571L;

	/**
	 * 商户附件信息
	 */
	@ApiListField("attachment_info")
	@ApiField("attachment_info")
	private List<AttachmentInfo> attachmentInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

    /**
     * Gets attachment info.
     *
     * @return the attachment info
     */
    public List<AttachmentInfo> getAttachmentInfo() {
		return this.attachmentInfo;
	}

    /**
     * Sets attachment info.
     *
     * @param attachmentInfo the attachment info
     */
    public void setAttachmentInfo(List<AttachmentInfo> attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
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
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId() {
		return this.subMerchantId;
	}

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
