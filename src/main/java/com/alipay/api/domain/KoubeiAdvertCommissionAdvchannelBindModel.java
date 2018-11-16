package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加广告的渠道关系接口
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:28
 */
public class KoubeiAdvertCommissionAdvchannelBindModel extends AlipayObject {

	private static final long serialVersionUID = 2286477448515455533L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID列表
	 */
	@ApiListField("channel_id_list")
	@ApiField("string")
	private List<String> channelIdList;

    /**
     * Gets adv id.
     *
     * @return the adv id
     */
    public String getAdvId() {
		return this.advId;
	}

    /**
     * Sets adv id.
     *
     * @param advId the adv id
     */
    public void setAdvId(String advId) {
		this.advId = advId;
	}

    /**
     * Gets channel id list.
     *
     * @return the channel id list
     */
    public List<String> getChannelIdList() {
		return this.channelIdList;
	}

    /**
     * Sets channel id list.
     *
     * @param channelIdList the channel id list
     */
    public void setChannelIdList(List<String> channelIdList) {
		this.channelIdList = channelIdList;
	}

}
