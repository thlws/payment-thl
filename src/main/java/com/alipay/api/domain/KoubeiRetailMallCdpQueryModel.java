package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈开放页面投放内容查询
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:17
 */
public class KoubeiRetailMallCdpQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3685777168881386129L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

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

}
