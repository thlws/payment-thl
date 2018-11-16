package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户申贷
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:32:50
 */
public class AlipayPcreditLoanApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1769612533488682948L;

	/**
	 * 申贷金额，单位为元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 用户身份证后4位
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户贴息率，0~1的小数
	 */
	@ApiField("ratio")
	private Long ratio;

	/**
	 * 场景码
	 */
	@ApiField("scene")
	private String scene;

    /**
     * Gets apply amt.
     *
     * @return the apply amt
     */
    public String getApplyAmt() {
		return this.applyAmt;
	}

    /**
     * Sets apply amt.
     *
     * @param applyAmt the apply amt
     */
    public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets ratio.
     *
     * @return the ratio
     */
    public Long getRatio() {
		return this.ratio;
	}

    /**
     * Sets ratio.
     *
     * @param ratio the ratio
     */
    public void setRatio(Long ratio) {
		this.ratio = ratio;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

}
