package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体实时上传音频流接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5733355345315136235L;

	/**
	 * base64编码的声音数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_c")
	private String extinfoC;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_d")
	private String extinfoD;

	/**
	 * 时间戳
	 */
	@ApiField("labeltime")
	private String labeltime;

	/**
	 * 媒体名称
	 */
	@ApiField("vname")
	private String vname;

	/**
	 * 媒体类型
	 */
	@ApiField("vtype")
	private String vtype;

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets extinfo a.
     *
     * @return the extinfo a
     */
    public String getExtinfoA() {
		return this.extinfoA;
	}

    /**
     * Sets extinfo a.
     *
     * @param extinfoA the extinfo a
     */
    public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}

    /**
     * Gets extinfo b.
     *
     * @return the extinfo b
     */
    public String getExtinfoB() {
		return this.extinfoB;
	}

    /**
     * Sets extinfo b.
     *
     * @param extinfoB the extinfo b
     */
    public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}

    /**
     * Gets extinfo c.
     *
     * @return the extinfo c
     */
    public String getExtinfoC() {
		return this.extinfoC;
	}

    /**
     * Sets extinfo c.
     *
     * @param extinfoC the extinfo c
     */
    public void setExtinfoC(String extinfoC) {
		this.extinfoC = extinfoC;
	}

    /**
     * Gets extinfo d.
     *
     * @return the extinfo d
     */
    public String getExtinfoD() {
		return this.extinfoD;
	}

    /**
     * Sets extinfo d.
     *
     * @param extinfoD the extinfo d
     */
    public void setExtinfoD(String extinfoD) {
		this.extinfoD = extinfoD;
	}

    /**
     * Gets labeltime.
     *
     * @return the labeltime
     */
    public String getLabeltime() {
		return this.labeltime;
	}

    /**
     * Sets labeltime.
     *
     * @param labeltime the labeltime
     */
    public void setLabeltime(String labeltime) {
		this.labeltime = labeltime;
	}

    /**
     * Gets vname.
     *
     * @return the vname
     */
    public String getVname() {
		return this.vname;
	}

    /**
     * Sets vname.
     *
     * @param vname the vname
     */
    public void setVname(String vname) {
		this.vname = vname;
	}

    /**
     * Gets vtype.
     *
     * @return the vtype
     */
    public String getVtype() {
		return this.vtype;
	}

    /**
     * Sets vtype.
     *
     * @param vtype the vtype
     */
    public void setVtype(String vtype) {
		this.vtype = vtype;
	}

}
