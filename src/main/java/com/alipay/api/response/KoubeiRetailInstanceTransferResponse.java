package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.instance.transfer response.
 *
 * @author auto create
 * @since 1.0, 2017-10-17 22:16:26
 */
public class KoubeiRetailInstanceTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7888446679923994854L;

	/** 
	 * 请求的id信息
	 */
	@ApiListField("instance_id_list")
	@ApiField("string")
	private List<String> instanceIdList;

    /**
     * Sets instance id list.
     *
     * @param instanceIdList the instance id list
     */
    public void setInstanceIdList(List<String> instanceIdList) {
		this.instanceIdList = instanceIdList;
	}

    /**
     * Gets instance id list.
     *
     * @return the instance id list
     */
    public List<String> getInstanceIdList( ) {
		return this.instanceIdList;
	}

}
