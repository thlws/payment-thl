package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，开发者自定义信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CodeInfo extends AlipayObject {

	private static final long serialVersionUID = 5682251313341546484L;

	/**
	 * 跳转URL，扫码关注服务窗后会直接跳转到此URL
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 场景信息
	 */
	@ApiField("scene")
	private Scene scene;

    /**
     * Gets goto url.
     *
     * @return the goto url
     */
    public String getGotoUrl() {
		return this.gotoUrl;
	}

    /**
     * Sets goto url.
     *
     * @param gotoUrl the goto url
     */
    public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public Scene getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(Scene scene) {
		this.scene = scene;
	}

}
