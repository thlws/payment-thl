package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CraftsmanWorkOutIdOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.work.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiCraftsmanDataWorkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3221358769198963753L;

	/** 
	 * 作品id
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_out_id_open_model")
	private List<CraftsmanWorkOutIdOpenModel> works;

    /**
     * Sets works.
     *
     * @param works the works
     */
    public void setWorks(List<CraftsmanWorkOutIdOpenModel> works) {
		this.works = works;
	}

    /**
     * Gets works.
     *
     * @return the works
     */
    public List<CraftsmanWorkOutIdOpenModel> getWorks( ) {
		return this.works;
	}

}
