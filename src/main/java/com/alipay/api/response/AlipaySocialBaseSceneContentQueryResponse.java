package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneContent;
import com.alipay.api.domain.SceneDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.scene.content.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-13 20:49:08
 */
public class AlipaySocialBaseSceneContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1734597431647668241L;

	/** 
	 * 内容中台场景页文章信息
	 */
	@ApiListField("scene_content")
	@ApiField("scene_content")
	private List<SceneContent> sceneContent;

	/** 
	 * 场景详情信息
	 */
	@ApiField("scene_detail")
	private SceneDetail sceneDetail;

	/** 
	 * 更多文章跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

    /**
     * Sets scene content.
     *
     * @param sceneContent the scene content
     */
    public void setSceneContent(List<SceneContent> sceneContent) {
		this.sceneContent = sceneContent;
	}

    /**
     * Gets scene content.
     *
     * @return the scene content
     */
    public List<SceneContent> getSceneContent( ) {
		return this.sceneContent;
	}

    /**
     * Sets scene detail.
     *
     * @param sceneDetail the scene detail
     */
    public void setSceneDetail(SceneDetail sceneDetail) {
		this.sceneDetail = sceneDetail;
	}

    /**
     * Gets scene detail.
     *
     * @return the scene detail
     */
    public SceneDetail getSceneDetail( ) {
		return this.sceneDetail;
	}

    /**
     * Sets scheme.
     *
     * @param scheme the scheme
     */
    public void setScheme(String scheme) {
		this.scheme = scheme;
	}

    /**
     * Gets scheme.
     *
     * @return the scheme
     */
    public String getScheme( ) {
		return this.scheme;
	}

}
