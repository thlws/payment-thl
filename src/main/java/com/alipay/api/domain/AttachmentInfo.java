package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户附件信息
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:47:16
 */
public class AttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 3154146784429235213L;

	/**
	 * 支付宝返回的图片在文件存储平台的标识
	 */
	@ApiField("atta_url")
	private String attaUrl;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件类型,PROMO_PIC:营销物料照
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets atta url.
     *
     * @return the atta url
     */
    public String getAttaUrl() {
		return this.attaUrl;
	}

    /**
     * Sets atta url.
     *
     * @param attaUrl the atta url
     */
    public void setAttaUrl(String attaUrl) {
		this.attaUrl = attaUrl;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
