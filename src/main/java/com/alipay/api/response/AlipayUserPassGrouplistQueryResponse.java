package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassInfoOpenApiModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.grouplist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-02 10:52:11
 */
public class AlipayUserPassGrouplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8894258265677154255L;

	/** 
	 * 券信息列表
	 */
	@ApiListField("pass_info_list")
	@ApiField("pass_info_open_api_model")
	private List<PassInfoOpenApiModel> passInfoList;

    /**
     * Sets pass info list.
     *
     * @param passInfoList the pass info list
     */
    public void setPassInfoList(List<PassInfoOpenApiModel> passInfoList) {
		this.passInfoList = passInfoList;
	}

    /**
     * Gets pass info list.
     *
     * @return the pass info list
     */
    public List<PassInfoOpenApiModel> getPassInfoList( ) {
		return this.passInfoList;
	}

}
