package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Advert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-04-11 15:10:00
 */
public class AlipayOpenPublicAdvertBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629696888134282634L;

	/** 
	 * 广告位list ,目前只有一个广告位
	 */
	@ApiListField("advert_list")
	@ApiField("advert")
	private List<Advert> advertList;

    /**
     * Sets advert list.
     *
     * @param advertList the advert list
     */
    public void setAdvertList(List<Advert> advertList) {
		this.advertList = advertList;
	}

    /**
     * Gets advert list.
     *
     * @return the advert list
     */
    public List<Advert> getAdvertList( ) {
		return this.advertList;
	}

}
