package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情-商家介绍数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class IntroductionInfo extends AlipayObject {

	private static final long serialVersionUID = 7442252553991112899L;

	/**
	 * 商品详情-商家介绍图片地址列表
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 商品详情-商家介绍标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets image urls.
     *
     * @return the image urls
     */
    public List<String> getImageUrls() {
		return this.imageUrls;
	}

    /**
     * Sets image urls.
     *
     * @param imageUrls the image urls
     */
    public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
