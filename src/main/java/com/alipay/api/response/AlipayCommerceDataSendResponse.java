package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DataSendBusinessResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.send response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 09:50:45
 */
public class AlipayCommerceDataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4261314736541766688L;

	/** 
	 * data_send_business_result:数据发送业务处理结果信息
	 */
	@ApiField("data_send_business_result")
	private DataSendBusinessResult dataSendBusinessResult;

    /**
     * Sets data send business result.
     *
     * @param dataSendBusinessResult the data send business result
     */
    public void setDataSendBusinessResult(DataSendBusinessResult dataSendBusinessResult) {
		this.dataSendBusinessResult = dataSendBusinessResult;
	}

    /**
     * Gets data send business result.
     *
     * @return the data send business result
     */
    public DataSendBusinessResult getDataSendBusinessResult( ) {
		return this.dataSendBusinessResult;
	}

}
