package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基于模板上传版本
 *
 * @author auto create
 * @since 1.0, 2018-07-23 14:11:03
 */
public class AlipayOpenMiniVersionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4344182222987179387L;

	/**
	 * 小程序版本号，版本号必须满足 x.y.z, 且均为数字
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 模板的配置参数
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板版本号，版本号必须满足 x.y.z, 且均为数字
	 */
	@ApiField("template_version")
	private String templateVersion;

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets ext.
     *
     * @return the ext
     */
    public String getExt() {
		return this.ext;
	}

    /**
     * Sets ext.
     *
     * @param ext the ext
     */
    public void setExt(String ext) {
		this.ext = ext;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template version.
     *
     * @return the template version
     */
    public String getTemplateVersion() {
		return this.templateVersion;
	}

    /**
     * Sets template version.
     *
     * @param templateVersion the template version
     */
    public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
