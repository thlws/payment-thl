package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 描述结算信息，json格式。
 *
 * @author auto create
 * @since 1.0, 2018-07-16 12:29:53
 */
public class SettleInfo extends AlipayObject {

	private static final long serialVersionUID = 8162373931236827853L;

	/**
	 * 结算详细信息，json数组，目前只支持一条。
	 */
	@ApiListField("settle_detail_infos")
	@ApiField("settle_detail_info")
	private List<SettleDetailInfo> settleDetailInfos;

    /**
     * Gets settle detail infos.
     *
     * @return the settle detail infos
     */
    public List<SettleDetailInfo> getSettleDetailInfos() {
		return this.settleDetailInfos;
	}

    /**
     * Sets settle detail infos.
     *
     * @param settleDetailInfos the settle detail infos
     */
    public void setSettleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
		this.settleDetailInfos = settleDetailInfos;
	}

}
