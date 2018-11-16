package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取主站zid
 *
 * @author auto create
 * @since 1.0, 2018-03-13 17:10:17
 */
public class ZolozIdentificationZolozidGetModel extends AlipayObject {

	private static final long serialVersionUID = 5411279849864435591L;

	/**
	 * get region
	 */
	@ApiField("action")
	private String action;

	/**
	 * bizId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展字段
	 */
	@ApiField("extern_params")
	private String externParams;

	/**
	 * json字符串
	 */
	@ApiField("zcif_params")
	private String zcifParams;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets extern params.
     *
     * @return the extern params
     */
    public String getExternParams() {
		return this.externParams;
	}

    /**
     * Sets extern params.
     *
     * @param externParams the extern params
     */
    public void setExternParams(String externParams) {
		this.externParams = externParams;
	}

    /**
     * Gets zcif params.
     *
     * @return the zcif params
     */
    public String getZcifParams() {
		return this.zcifParams;
	}

    /**
     * Sets zcif params.
     *
     * @param zcifParams the zcif params
     */
    public void setZcifParams(String zcifParams) {
		this.zcifParams = zcifParams;
	}

}
