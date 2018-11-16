package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneMarketingContentGroup;
import com.alipay.api.domain.SceneMarketingHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.scene.travel.get response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:19:01
 */
public class KoubeiMarketingDataSceneTravelGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1594191317658616287L;

	/** 
	 * 场景营销内容分组场景营
	 */
	@ApiListField("content")
	@ApiField("scene_marketing_content_group")
	private List<SceneMarketingContentGroup> content;

	/** 
	 * 场景营销头部信息
	 */
	@ApiField("header")
	private SceneMarketingHeader header;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(List<SceneMarketingContentGroup> content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public List<SceneMarketingContentGroup> getContent( ) {
		return this.content;
	}

    /**
     * Sets header.
     *
     * @param header the header
     */
    public void setHeader(SceneMarketingHeader header) {
		this.header = header;
	}

    /**
     * Gets header.
     *
     * @return the header
     */
    public SceneMarketingHeader getHeader( ) {
		return this.header;
	}

}
