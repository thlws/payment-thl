package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蓝牙设备信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class BeaconDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 4384626752345411276L;

	/**
	 * 设备类型
	 */
	@ApiField("actiontype")
	private String actiontype;

	/**
	 * 设备是否可用
	 */
	@ApiField("inuse")
	private Boolean inuse;

	/**
	 * 设备说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 蓝牙设备关联的模板信息
	 */
	@ApiField("template")
	private BeaconTemplate template;

	/**
	 * 设备ID
	 */
	@ApiField("uuid")
	private String uuid;

    /**
     * Gets actiontype.
     *
     * @return the actiontype
     */
    public String getActiontype() {
		return this.actiontype;
	}

    /**
     * Sets actiontype.
     *
     * @param actiontype the actiontype
     */
    public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}

    /**
     * Gets inuse.
     *
     * @return the inuse
     */
    public Boolean getInuse() {
		return this.inuse;
	}

    /**
     * Sets inuse.
     *
     * @param inuse the inuse
     */
    public void setInuse(Boolean inuse) {
		this.inuse = inuse;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets sn.
     *
     * @return the sn
     */
    public String getSn() {
		return this.sn;
	}

    /**
     * Sets sn.
     *
     * @param sn the sn
     */
    public void setSn(String sn) {
		this.sn = sn;
	}

    /**
     * Gets template.
     *
     * @return the template
     */
    public BeaconTemplate getTemplate() {
		return this.template;
	}

    /**
     * Sets template.
     *
     * @param template the template
     */
    public void setTemplate(BeaconTemplate template) {
		this.template = template;
	}

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getUuid() {
		return this.uuid;
	}

    /**
     * Sets uuid.
     *
     * @param uuid the uuid
     */
    public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
