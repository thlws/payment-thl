package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈主页地址创建修改接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:14
 */
public class KoubeiShopMallPageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8869299981124129854L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商圈访问地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

	/**
	 * 废弃！，务传。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

    /**
     * Gets mall url.
     *
     * @return the mall url
     */
    public String getMallUrl() {
		return this.mallUrl;
	}

    /**
     * Sets mall url.
     *
     * @param mallUrl the mall url
     */
    public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}

    /**
     * Gets out biz id.
     *
     * @return the out biz id
     */
    public String getOutBizId() {
		return this.outBizId;
	}

    /**
     * Sets out biz id.
     *
     * @param outBizId the out biz id
     */
    public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
