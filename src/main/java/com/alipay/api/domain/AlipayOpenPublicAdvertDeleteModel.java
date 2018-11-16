package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-07 10:29:27
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1421424354777477768L;

	/**
	 * 待删除的广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

    /**
     * Gets advert id.
     *
     * @return the advert id
     */
    public String getAdvertId() {
		return this.advertId;
	}

    /**
     * Sets advert id.
     *
     * @param advertId the advert id
     */
    public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

}
