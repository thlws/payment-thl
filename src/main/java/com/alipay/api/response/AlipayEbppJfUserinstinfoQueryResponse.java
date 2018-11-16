package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppUserChargeInstInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.userinstinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-24 19:35:00
 */
public class AlipayEbppJfUserinstinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7113294251914869956L;

	/** 
	 * 机构信息列表
	 */
	@ApiListField("user_charge_inst_info_list")
	@ApiField("ebpp_user_charge_inst_info")
	private List<EbppUserChargeInstInfo> userChargeInstInfoList;

    /**
     * Sets user charge inst info list.
     *
     * @param userChargeInstInfoList the user charge inst info list
     */
    public void setUserChargeInstInfoList(List<EbppUserChargeInstInfo> userChargeInstInfoList) {
		this.userChargeInstInfoList = userChargeInstInfoList;
	}

    /**
     * Gets user charge inst info list.
     *
     * @return the user charge inst info list
     */
    public List<EbppUserChargeInstInfo> getUserChargeInstInfoList( ) {
		return this.userChargeInstInfoList;
	}

}
