package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约文件签章描述信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class FileSignature extends AlipayObject {

	private static final long serialVersionUID = 3421822677989559757L;

	/**
	 * 签约主体证件号，关联principal对象
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 图章id/图章模板id
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 签章位置描述
	 */
	@ApiField("seal_position")
	private SealPosition sealPosition;

	/**
	 * 电子图章类型
1 : 图章模板自动合成
2 : 托管图章编号
	 */
	@ApiField("seal_type")
	private Long sealType;

	/**
	 * 签约原因描述，可展示在PDF签名区
	 */
	@ApiField("sign_reason")
	private String signReason;

	/**
	 * 电子签章类型 
1:仅数字证书文档签名
2:仅图章
3:数字证书文档签名，加盖图章
	 */
	@ApiField("signature_type")
	private Long signatureType;

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets seal id.
     *
     * @return the seal id
     */
    public String getSealId() {
		return this.sealId;
	}

    /**
     * Sets seal id.
     *
     * @param sealId the seal id
     */
    public void setSealId(String sealId) {
		this.sealId = sealId;
	}

    /**
     * Gets seal position.
     *
     * @return the seal position
     */
    public SealPosition getSealPosition() {
		return this.sealPosition;
	}

    /**
     * Sets seal position.
     *
     * @param sealPosition the seal position
     */
    public void setSealPosition(SealPosition sealPosition) {
		this.sealPosition = sealPosition;
	}

    /**
     * Gets seal type.
     *
     * @return the seal type
     */
    public Long getSealType() {
		return this.sealType;
	}

    /**
     * Sets seal type.
     *
     * @param sealType the seal type
     */
    public void setSealType(Long sealType) {
		this.sealType = sealType;
	}

    /**
     * Gets sign reason.
     *
     * @return the sign reason
     */
    public String getSignReason() {
		return this.signReason;
	}

    /**
     * Sets sign reason.
     *
     * @param signReason the sign reason
     */
    public void setSignReason(String signReason) {
		this.signReason = signReason;
	}

    /**
     * Gets signature type.
     *
     * @return the signature type
     */
    public Long getSignatureType() {
		return this.signatureType;
	}

    /**
     * Sets signature type.
     *
     * @param signatureType the signature type
     */
    public void setSignatureType(Long signatureType) {
		this.signatureType = signatureType;
	}

}
