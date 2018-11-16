package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.material.image.download response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 11:37:33
 */
public class AlipayOfflineMaterialImageDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2597535374951476589L;

	/** 
	 * 图片地址列表，按入参id顺序返回，如果某个id转化失败，则用空字符占位
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

    /**
     * Sets image urls.
     *
     * @param imageUrls the image urls
     */
    public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

    /**
     * Gets image urls.
     *
     * @return the image urls
     */
    public List<String> getImageUrls( ) {
		return this.imageUrls;
	}

}
