package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险识别接口服务-命中结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InfoSecHitDetectItem extends AlipayObject {

	private static final long serialVersionUID = 7119688446323439846L;

	/**
	 * 级别
	 */
	@ApiField("detect_resource_level")
	private String detectResourceLevel;

	/**
	 * RULEORMODEL("RULEORMODEL", "规则或模型"),
		KEYWORDS("KEYWORDS", "关键字检测 "),
		REPEAT_MODEL("REPEAT_MODEL", "防重复模型"),
		REGEX("regex", "正则表达式"),
		URL("url", "URL检测"),
		SEXY_PIC("sexyPic", "黄图检测"),
		SAMPLE_PIC("samplePic", "样图检测"),
		OCR("ocr", "图文识别"),
		PICTURE_FACE("picture_face","图片人脸检测"),
		QRCODE("QRCode", "二维码检测"),
		MDP_MODEL("mdpModel", "mdp检测"),
		ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
	 */
	@ApiField("detect_type_code")
	private String detectTypeCode;

	/**
	 * 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
	 */
	@ApiField("hit_content")
	private String hitContent;

	/**
	 * 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
	 */
	@ApiField("hit_detect_resource")
	private String hitDetectResource;

    /**
     * Gets detect resource level.
     *
     * @return the detect resource level
     */
    public String getDetectResourceLevel() {
		return this.detectResourceLevel;
	}

    /**
     * Sets detect resource level.
     *
     * @param detectResourceLevel the detect resource level
     */
    public void setDetectResourceLevel(String detectResourceLevel) {
		this.detectResourceLevel = detectResourceLevel;
	}

    /**
     * Gets detect type code.
     *
     * @return the detect type code
     */
    public String getDetectTypeCode() {
		return this.detectTypeCode;
	}

    /**
     * Sets detect type code.
     *
     * @param detectTypeCode the detect type code
     */
    public void setDetectTypeCode(String detectTypeCode) {
		this.detectTypeCode = detectTypeCode;
	}

    /**
     * Gets hit content.
     *
     * @return the hit content
     */
    public String getHitContent() {
		return this.hitContent;
	}

    /**
     * Sets hit content.
     *
     * @param hitContent the hit content
     */
    public void setHitContent(String hitContent) {
		this.hitContent = hitContent;
	}

    /**
     * Gets hit detect resource.
     *
     * @return the hit detect resource
     */
    public String getHitDetectResource() {
		return this.hitDetectResource;
	}

    /**
     * Sets hit detect resource.
     *
     * @param hitDetectResource the hit detect resource
     */
    public void setHitDetectResource(String hitDetectResource) {
		this.hitDetectResource = hitDetectResource;
	}

}
